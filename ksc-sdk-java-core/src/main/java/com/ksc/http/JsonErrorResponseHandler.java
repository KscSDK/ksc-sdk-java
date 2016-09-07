/*
 * Copyright 2015-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ksc.http;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.KscServiceException;
import com.ksc.KscServiceException.ErrorType;
import com.ksc.annotation.SdkInternalApi;
import com.ksc.internal.http.JsonErrorCodeParser;
import com.ksc.internal.http.JsonErrorMessageParser;
import com.ksc.transform.JsonErrorUnmarshaller;
import com.ksc.util.IOUtils;

@SdkInternalApi
public class JsonErrorResponseHandler implements HttpResponseHandler<KscServiceException> {

	private static final Log LOG = LogFactory.getLog(JsonErrorResponseHandler.class);

	private final List<JsonErrorUnmarshaller> unmarshallers;
	private final JsonErrorCodeParser errorCodeParser;
	private final JsonErrorMessageParser errorMessageParser;
	private final JsonFactory jsonFactory;

	public JsonErrorResponseHandler(List<JsonErrorUnmarshaller> errorUnmarshallers, JsonErrorCodeParser errorCodeParser,
			JsonErrorMessageParser errorMessageParser, JsonFactory jsonFactory) {
		this.unmarshallers = errorUnmarshallers;
		this.errorCodeParser = errorCodeParser;
		this.errorMessageParser = errorMessageParser;
		this.jsonFactory = jsonFactory;
	}

	@Override
	public boolean needsConnectionLeftOpen() {
		return false;
	}

	@Override
	public KscServiceException handle(HttpResponse response) throws Exception {
		JsonContent jsonContent = JsonContent.createJsonContent(response, jsonFactory);
		JsonNode errorNode = jsonContent.jsonNode.get("Error");
		// String errorCode =
		// errorCodeParser.parseErrorCode(response.getHeaders(),
		// jsonContent.jsonNode);
		KscServiceException ase = new KscServiceException("Unable to parse HTTP response content,not Error");
		if (errorNode == null) {
			return ase;
		}

		JsonNode errorCodeNode = errorNode.get("Code");
		if (errorCodeNode != null) {
			ase.setErrorCode(errorCodeNode.asText());
		}
		// Jackson has special-casing for 'message' values when deserializing
		// Throwables, but sometimes the service passes the error message in
		// other JSON fields - handle it here.
		ase.setErrorMessage(errorMessageParser.parseErrorMessage(errorNode));

		ase.setServiceName(response.getRequest().getServiceName());
		ase.setStatusCode(response.getStatusCode());
		ase.setErrorType(getErrorTypeFromStatusCode(response.getStatusCode()));
		ase.setRawResponse(jsonContent.rawContent);
		// String requestId = getRequestIdFromHeaders(response.getHeaders());
		JsonNode requestIdNode = jsonContent.jsonNode.get("RequestId");
		if (requestIdNode != null) {
			ase.setRequestId(requestIdNode.asText());
		}
		
		JsonNode errorType = errorNode.get("Type");
		if (errorType == null) {
			ase.setErrorType(ErrorType.Unknown);
		} else if (errorType.asText().equalsIgnoreCase("Receiver")) {
			ase.setErrorType(ErrorType.Service);
		} else if (errorType.asText().equalsIgnoreCase("Sender")) {
			ase.setErrorType(ErrorType.Client);
		}
		return ase;
	}

	/**
	 * Create an AmazonServiceException using the chain of unmarshallers. This
	 * method will never return null, it will always return a valid
	 * AmazonServiceException
	 *
	 * @param errorCode
	 *            Error code to find an appropriate unmarshaller
	 * @param jsonContent
	 *            JsonContent of HTTP response
	 * @return AmazonServiceException
	 */
	private KscServiceException createException(String errorCode, JsonContent jsonContent) {
		if (!jsonContent.isJsonValid()) {
			return new KscServiceException("Unable to parse HTTP response content");
		}
		KscServiceException ase = unmarshallException(errorCode, jsonContent);
		if (ase == null) {
			ase = new KscServiceException("Unable to unmarshall exception response with the unmarshallers provided");
		}
		return ase;
	}

	private KscServiceException unmarshallException(String errorCode, JsonContent jsonContent) {
		for (JsonErrorUnmarshaller unmarshaller : unmarshallers) {
			if (unmarshaller.matchErrorCode(errorCode)) {
				try {
					return unmarshaller.unmarshall(jsonContent.jsonNode);
				} catch (Exception e) {
					LOG.info("Unable to unmarshall exception content", e);
					return null;
				}
			}
		}
		return null;
	}

	private ErrorType getErrorTypeFromStatusCode(int statusCode) {
		return statusCode < 500 ? ErrorType.Client : ErrorType.Service;
	}

	private String getRequestIdFromHeaders(Map<String, String> headers) {
		for (Entry<String, String> headerEntry : headers.entrySet()) {
			if (headerEntry.getKey().equalsIgnoreCase(X_KSC_REQUEST_ID_HEADER)) {
				return headerEntry.getValue();
			}
		}
		return null;
	}

	/**
	 * Simple struct like class to hold both the raw json string content and
	 * it's parsed JsonNode
	 */
	private static class JsonContent {

		public final byte[] rawContent;
		public final JsonNode jsonNode;
		@SuppressWarnings("unused")
		private final ObjectMapper mapper;

		/**
		 * Static factory method to create a JsonContent object from the
		 * contents of the HttpResponse provided
		 */
		public static JsonContent createJsonContent(HttpResponse httpResponse, JsonFactory jsonFactory) {
			byte[] rawJsonContent = null;
			try {
				if (httpResponse.getContent() != null) {
					rawJsonContent = IOUtils.toByteArray(httpResponse.getContent());
				}
			} catch (Exception e) {
				LOG.info("Unable to read HTTP response content", e);
			}
			return new JsonContent(rawJsonContent,
					new ObjectMapper(jsonFactory).configure(JsonParser.Feature.ALLOW_COMMENTS, true));

		}

		private JsonContent(byte[] rawJsonContent, ObjectMapper mapper) {
			this.rawContent = rawJsonContent;
			this.jsonNode = parseJsonContent(rawJsonContent, mapper);
			this.mapper = mapper;
		}

		private static JsonNode parseJsonContent(byte[] rawJsonContent, ObjectMapper mapper) {
			if (rawJsonContent == null) {
				return null;
			}
			try {
				return mapper.readTree(rawJsonContent);
			} catch (Exception e) {
				LOG.info("Unable to parse HTTP response content", e);
				return null;
			}
		}

		public boolean isJsonValid() {
			return jsonNode != null;
		}
	}
}

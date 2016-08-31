/*
 *
 * Copyright (c) 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.ksc.protocol.json;

import java.util.ArrayList;
import java.util.List;

import com.ksc.KscServiceException;
import com.ksc.KscWebServiceResponse;
import com.ksc.annotation.SdkProtectedApi;
import com.ksc.annotation.ThreadSafe;
import com.ksc.http.HttpResponseHandler;
import com.ksc.transform.JsonErrorUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Factory to generate the various JSON protocol handlers and generators
 * depending on the wire protocol to be used for communicating with the KSC
 * service.
 */
@ThreadSafe
@SdkProtectedApi
public class SdkJsonProtocolFactory {

	private final JsonClientMetadata metadata;

	private final List<JsonErrorUnmarshaller> errorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();

	public SdkJsonProtocolFactory(JsonClientMetadata metadata) {
		this.metadata = metadata;
		createErrorUnmarshallers();
	}

	/**
	 * Returns the {@link SdkJsonGenerator} to be used for marshalling the
	 * request.
	 */
	public StructuredJsonGenerator createGenerator() {
		return getSdkFactory().createWriter(metadata.getProtocolVersion());
	}

	/**
	 * Returns the response handler to be used for handling a successfull
	 * response.
	 * 
	 * @param operationMetadata
	 *            Additional context information about an operation to create
	 *            the appropriate response handler.
	 */
	public <T> HttpResponseHandler<KscWebServiceResponse<T>> createResponseHandler(
			JsonOperationMetadata operationMetadata,
			Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
		return getSdkFactory().createResponseHandler(operationMetadata,
				responseUnmarshaller);
	}

	/**
	 * Returns the error response handler for handling a error response.
	 */
	public HttpResponseHandler<KscServiceException> createErrorResponseHandler(
			JsonErrorResponseMetadata errorResponsMetadata) {
		return getSdkFactory().createErrorResponseHandler(errorUnmarshallers,
				errorResponsMetadata.getCustomErrorCodeFieldName());
	}

	private void createErrorUnmarshallers() {
		for (JsonErrorShapeMetadata errorMetadata : metadata
				.getErrorShapeMetadata()) {
			errorUnmarshallers.add(new JsonErrorUnmarshaller(errorMetadata
					.getModeledClass(), errorMetadata.getErrorCode()));

		}
		errorUnmarshallers.add(JsonErrorUnmarshaller.DEFAULT_UNMARSHALLER);
	}

	/**
	 * @return Instance of {@link SdkStructuredJsonFactory} to use in creating
	 *         handlers.
	 */
	private SdkStructuredJsonFactory getSdkFactory() {
		return SdkStructuredPlainJsonFactory.SDK_JSON_FACTORY;
	}
}

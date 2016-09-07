/*
 * Copyright 2011-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.protocol.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.ksc.http.JsonErrorResponseHandler;
import com.ksc.http.JsonResponseHandler;
import com.ksc.internal.http.JsonErrorCodeParser;
import com.ksc.internal.http.JsonErrorMessageParser;
import com.ksc.transform.JsonErrorUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.util.List;
import java.util.Map;

/**
 * Generic implementation of a structured JSON factory that is pluggable for different variants of
 * JSON. See {@link SdkStructuredPlainJsonFactory#SDK_JSON_FACTORY}
 */
public abstract class SdkStructuredJsonFactoryImpl implements SdkStructuredJsonFactory {

    private final String contentTypePrefix;
    private final JsonFactory jsonFactory;
    private final Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> unmarshallers;

    public SdkStructuredJsonFactoryImpl(String contentTypePrefix, JsonFactory jsonFactory,
                                        Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> unmarshallers) {
        this.contentTypePrefix = contentTypePrefix;
        this.jsonFactory = jsonFactory;
        this.unmarshallers = unmarshallers;
    }

    @Override
    public StructuredJsonGenerator createWriter(final String protocolVersion) {

        return createWriter(jsonFactory, contentTypePrefix + protocolVersion);
    }

    protected abstract StructuredJsonGenerator createWriter(JsonFactory jsonFactory,
                                                            String contentType);

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public <T> JsonResponseHandler<T> createResponseHandler(JsonOperationMetadata operationMetadata,
                                                            Unmarshaller<T, JsonUnmarshallerContext> responseUnmarshaller) {
        return new JsonResponseHandler(responseUnmarshaller, unmarshallers, jsonFactory,
                                       operationMetadata.isHasStreamingSuccessResponse(),
                                       operationMetadata.isPayloadJson());
    }

    @Override
    public JsonErrorResponseHandler createErrorResponseHandler(
            final List<JsonErrorUnmarshaller> errorUnmarshallers, String customErrorCodeFieldName) {
        return new JsonErrorResponseHandler(errorUnmarshallers,
                                            getErrorCodeParser(customErrorCodeFieldName),
                                            JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                                            jsonFactory);
    }

    private JsonErrorCodeParser getErrorCodeParser(String customErrorCodeFieldName) {
        return new JsonErrorCodeParser(customErrorCodeFieldName);
    }
}

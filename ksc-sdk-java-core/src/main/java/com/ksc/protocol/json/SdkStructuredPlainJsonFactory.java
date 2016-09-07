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

import com.fasterxml.jackson.core.JsonFactory;
import com.ksc.annotation.SdkInternalApi;
import com.ksc.annotation.SdkTestInternalApi;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.BigDecimalJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.BigIntegerJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.ByteJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.CharacterJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.ShortJsonUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller;
import com.ksc.util.ImmutableMapParameter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Map;

/**
 * Creates generators and protocol handlers for plain text JSON wire format.
 */
@SdkInternalApi
public class SdkStructuredPlainJsonFactory {

    /**
     * Recommended to share JsonFactory instances per http://wiki.fasterxml
     * .com/JacksonBestPracticesPerformance
     */
    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    private static final String CONTENT_TYPE_JSON_PREFIX = "application/x-amz-json-";

    @SdkTestInternalApi
    public static final Map<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>> JSON_SCALAR_UNMARSHALLERS = new ImmutableMapParameter.Builder<Class<?>, Unmarshaller<?, JsonUnmarshallerContext>>()
            .put(String.class, StringJsonUnmarshaller.getInstance())
            .put(Double.class, DoubleJsonUnmarshaller.getInstance())
            .put(Integer.class, IntegerJsonUnmarshaller.getInstance())
            .put(BigInteger.class, BigIntegerJsonUnmarshaller.getInstance())
            .put(BigDecimal.class, BigDecimalJsonUnmarshaller.getInstance())
            .put(Boolean.class, BooleanJsonUnmarshaller.getInstance())
            .put(Float.class, FloatJsonUnmarshaller.getInstance())
            .put(Long.class, LongJsonUnmarshaller.getInstance())
            .put(Byte.class, ByteJsonUnmarshaller.getInstance())
            .put(Date.class, DateJsonUnmarshaller.getInstance())
            .put(ByteBuffer.class, ByteBufferJsonUnmarshaller.getInstance())
            .put(Character.class, CharacterJsonUnmarshaller.getInstance())
            .put(Short.class, ShortJsonUnmarshaller.getInstance()).build();

    public static final SdkStructuredJsonFactory SDK_JSON_FACTORY = new SdkStructuredJsonFactoryImpl(
            CONTENT_TYPE_JSON_PREFIX, JSON_FACTORY, JSON_SCALAR_UNMARSHALLERS) {
        @Override
        protected StructuredJsonGenerator createWriter(JsonFactory jsonFactory,
                                                       String contentType) {
            return new SdkJsonGenerator(jsonFactory, contentType);
        }
    };

}

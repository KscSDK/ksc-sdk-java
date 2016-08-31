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

import com.ksc.annotation.NotThreadSafe;
import com.ksc.annotation.SdkProtectedApi;

/**
 * Contains various metadata needed to create an appropriate {@link com.ksc.http.JsonErrorResponseHandler}
 * for the client.
 */
@NotThreadSafe
@SdkProtectedApi
public class JsonErrorResponseMetadata {

    /**
     * Custom error code field name in exceptional responses. Currently only used by glacier. If not
     * set the default error code parser will be used.
     */
    private String customErrorCodeFieldName;

    public String getCustomErrorCodeFieldName() {
        return customErrorCodeFieldName;
    }

    public JsonErrorResponseMetadata withCustomErrorCodeFieldName(String errorCodeFieldName) {
        this.customErrorCodeFieldName = errorCodeFieldName;
        return this;
    }
}

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
 * Contains various information needed to create a {@link com.ksc.http.JsonResponseHandler}
 * for the client.
 */
@NotThreadSafe
@SdkProtectedApi
public class JsonOperationMetadata {

    private boolean hasStreamingSuccessResponse;
    private boolean isPayloadJson;

    public boolean isHasStreamingSuccessResponse() {
        return hasStreamingSuccessResponse;
    }

    public JsonOperationMetadata withHasStreamingSuccessResponse(
            boolean hasStreamingSuccessResponse) {
        this.hasStreamingSuccessResponse = hasStreamingSuccessResponse;
        return this;
    }

    public boolean isPayloadJson() {
        return isPayloadJson;
    }

    public JsonOperationMetadata withPayloadJson(boolean payloadJson) {
        isPayloadJson = payloadJson;
        return this;
    }
}

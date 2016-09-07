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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ksc.annotation.NotThreadSafe;
import com.ksc.annotation.SdkProtectedApi;

/**
 * Wrapper object to provide additional metadata about a client and protocol to {@link
 * SdkJsonProtocolFactory}
 */
@NotThreadSafe
@SdkProtectedApi
public class JsonClientMetadata {

    private final List<JsonErrorShapeMetadata> errorsMetadata = new ArrayList<JsonErrorShapeMetadata>();

    private String protocolVersion;
    
    private boolean supportsCbor;
    
    public JsonClientMetadata addErrorMetadata(JsonErrorShapeMetadata errorShapeMetadata) {
        this.errorsMetadata.add(errorShapeMetadata);
        return this;
    }

    public JsonClientMetadata addAllErrorMetadata(JsonErrorShapeMetadata... errorShapeMetadata) {
        Collections.addAll(errorsMetadata, errorShapeMetadata);
        return this;
    }

    public List<JsonErrorShapeMetadata> getErrorShapeMetadata() {
        return errorsMetadata;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public JsonClientMetadata withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    public boolean isSupportsCbor() {
        return supportsCbor;
    }

    public JsonClientMetadata withSupportsCbor(boolean supportsCbor) {
        this.supportsCbor = supportsCbor;
        return this;
    }
    
}

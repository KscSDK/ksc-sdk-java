/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.ksc.adapters.types;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.ksc.KscClientException;
import com.ksc.annotation.SdkProtectedApi;
import com.ksc.util.StringInputStream;

@SdkProtectedApi
public class StringToInputStreamAdapter implements TypeAdapter<String, InputStream> {

    @Override
    public InputStream adapt(String source) {
        if (source == null) {
            return null;
        }
        try {
            return new StringInputStream(source);
        } catch (UnsupportedEncodingException e) {
            throw new KscClientException(e);
        }
    }
}

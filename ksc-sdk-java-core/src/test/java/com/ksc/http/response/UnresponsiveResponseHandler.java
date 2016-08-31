/*
 * Copyright 2015-2016 ksyun.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.ksc.http.response;

import com.ksc.KscWebServiceResponse;
import com.ksc.http.HttpResponse;
import com.ksc.http.HttpResponseHandler;

/**
 * Error Response Handler implementation that hangs forever
 */
public class UnresponsiveResponseHandler implements HttpResponseHandler<KscWebServiceResponse<Object>> {

    @Override
    public KscWebServiceResponse<Object> handle(HttpResponse response) throws Exception {
        Thread.sleep(Long.MAX_VALUE);
        return null;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return false;
    }
}
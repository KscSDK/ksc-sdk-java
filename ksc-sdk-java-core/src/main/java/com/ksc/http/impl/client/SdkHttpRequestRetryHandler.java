/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights Reserved.
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
package com.ksc.http.impl.client;

import java.io.IOException;

import org.apache.http.annotation.ThreadSafe;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

@ThreadSafe
public class SdkHttpRequestRetryHandler extends DefaultHttpRequestRetryHandler {
    public static final SdkHttpRequestRetryHandler Singleton = new SdkHttpRequestRetryHandler();
    private SdkHttpRequestRetryHandler() {}

    @Override public boolean retryRequest(
            final IOException exception,
            int executionCount,
            final HttpContext context) {
        boolean retry = super.retryRequest(exception, executionCount, context);
        if (retry) {
            KscRequestMetrics awsRequestMetrics = (KscRequestMetrics) context
                    .getAttribute(KscRequestMetrics.class.getSimpleName());
            if (awsRequestMetrics != null) {
                awsRequestMetrics.incrementCounter(Field.HttpClientRetryCount);
            }
        }
        return retry;
    }
}

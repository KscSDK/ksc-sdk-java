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
package com.ksc.http.timers.request;

/**
 * Dummy implementation of {@link HttpRequestAbortTaskTracker} used when the timer is disabled for a
 * request
 */
public class NoOpHttpRequestAbortTaskTracker implements HttpRequestAbortTaskTracker {

    public static final NoOpHttpRequestAbortTaskTracker INSTANCE = new NoOpHttpRequestAbortTaskTracker();

    // Singleton
    private NoOpHttpRequestAbortTaskTracker() {
    }

    @Override
    public boolean httpRequestAborted() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void cancelTask() {
    }

}

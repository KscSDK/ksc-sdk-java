/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 */

package com.ksc.http.timers.client;

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createMockGetRequest;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createRawHttpClientSpy;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static com.ksc.http.timers.TimeoutTestConstants.CLIENT_EXECUTION_TIMEOUT;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.protocol.HttpContext;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ksc.AbortedException;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.HttpMethodName;
import com.ksc.http.MockServerTestBase;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.http.request.EmptyHttpRequest;
import com.ksc.http.server.MockServer;
import com.ksc.internal.SdkBufferedInputStream;

/**
 *
 */
// TODOFIX
public class AbortedExceptionClientExecutionTimerTest extends
        MockServerTestBase {

    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Override
    protected MockServer buildMockServer() {
        return new MockServer(
                MockServer.DummyResponseServerBehavior.build(200, "Hi",
                        "Dummy response"));
    }

    @Ignore
    @Test(timeout= TEST_TIMEOUT, expected = AbortedException.class)
    public void
    clientExecutionTimeoutEnabled_aborted_exception_occurs_timeout_not_expired()
            throws Exception {
        ClientConfiguration config = new ClientConfiguration()
                .withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withMaxErrorRetry(0);
        ConnectionManagerAwareHttpClient rawHttpClient =
                createRawHttpClientSpy(config);

        doThrow(new AbortedException()).when(rawHttpClient).execute(any
                (HttpRequestBase.class), any(HttpContext.class));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        execute(httpClient, createMockGetRequest());
    }

    @Ignore
    @Test(timeout= TEST_TIMEOUT, expected = ClientExecutionTimeoutException.class)
    public void
    clientExecutionTimeoutEnabled_aborted_exception_occurs_timeout_expired()
            throws Exception {
        ClientConfiguration config = new ClientConfiguration()
                .withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withMaxErrorRetry(0);
        ConnectionManagerAwareHttpClient rawHttpClient =
                createRawHttpClientSpy(config);

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        execute(httpClient, new EmptyHttpRequest(server.getEndpoint(),
                HttpMethodName.PUT, new SdkBufferedInputStream(new InputStream() {
            @Override
            public int read() throws IOException {
                return 1;
            }
        })));
    }
}

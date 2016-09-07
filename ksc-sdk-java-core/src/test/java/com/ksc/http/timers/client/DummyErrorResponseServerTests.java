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
package com.ksc.http.timers.client;

import static com.ksc.http.timers.TimeoutTestConstants.CLIENT_EXECUTION_TIMEOUT;
import static com.ksc.http.timers.TimeoutTestConstants.SLOW_REQUEST_HANDLER_TIMEOUT;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.handlers.RequestHandler2;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.MockServerTestBase;
import com.ksc.http.request.RequestHandlerTestUtils;
import com.ksc.http.request.SlowRequestHandler;
import com.ksc.http.response.NullErrorResponseHandler;
import com.ksc.http.response.NullResponseHandler;
import com.ksc.http.response.UnresponsiveErrorResponseHandler;
import com.ksc.http.server.MockServer;

/**
 * Tests that use a server that returns a predetermined error response within the timeout limit
 */
public class DummyErrorResponseServerTests extends MockServerTestBase {

    private static final int STATUS_CODE = 500;
    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Override
    protected MockServer buildMockServer() {
        return new MockServer(
                MockServer.DummyResponseServerBehavior.build(STATUS_CODE, "Internal Server Failure", "Dummy response"));
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = ClientExecutionTimeoutException.class)
    public void clientExecutionTimeoutEnabled_SlowErrorResponseHandler_ThrowsClientExecutionTimeoutException()
            throws Exception {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT));

        httpClient.execute(newGetRequest(), new NullResponseHandler(), new UnresponsiveErrorResponseHandler(),
                new ExecutionContext());
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = ClientExecutionTimeoutException.class)
    public void clientExecutionTimeoutEnabled_SlowAfterErrorRequestHandler_ThrowsClientExecutionTimeoutException()
            throws Exception {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT));

        List<RequestHandler2> requestHandlers = RequestHandlerTestUtils.buildRequestHandlerList(
                new SlowRequestHandler().withAfterErrorWaitInSeconds(SLOW_REQUEST_HANDLER_TIMEOUT));

        httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                new ExecutionContext(requestHandlers, false, null));
    }

}

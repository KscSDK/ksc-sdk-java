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

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.interruptCurrentThreadAfterDelay;
import static com.ksc.http.timers.TimeoutTestConstants.CLIENT_EXECUTION_TIMEOUT;
import static com.ksc.http.timers.TimeoutTestConstants.SLOW_REQUEST_HANDLER_TIMEOUT;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.apache.http.pool.ConnPoolControl;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.handlers.RequestHandler2;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.MockServerTestBase;
import com.ksc.http.apache.client.impl.ApacheHttpClientFactory;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.http.apache.client.impl.SdkHttpClient;
import com.ksc.http.request.RequestHandlerTestUtils;
import com.ksc.http.request.SlowRequestHandler;
import com.ksc.http.response.DummyResponseHandler;
import com.ksc.http.response.NullErrorResponseHandler;
import com.ksc.http.response.UnresponsiveResponseHandler;
import com.ksc.http.server.MockServer;
import com.ksc.http.settings.HttpClientSettings;
import com.ksc.http.timers.client.ClientExecutionTimeoutException;

public class DummySuccessfulResponseServerTests extends MockServerTestBase {

    private static final int STATUS_CODE = 200;

    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Override
    protected MockServer buildMockServer() {
        return new MockServer(MockServer.DummyResponseServerBehavior.build(STATUS_CODE, "OK", "Hi"));
    }

    @Test(timeout = TEST_TIMEOUT, expected = ClientExecutionTimeoutException.class)
    public void clientExecutionTimeoutEnabled_SlowResponseHandler_ThrowsClientExecutionTimeoutException()
            throws Exception {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT));

        httpClient.execute(newGetRequest(), new UnresponsiveResponseHandler(), new NullErrorResponseHandler(),
                new ExecutionContext());
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = ClientExecutionTimeoutException.class)
    public void clientExecutionTimeoutEnabled_SlowAfterResponseRequestHandler_ThrowsClientExecutionTimeoutException()
            throws Exception {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT));

        List<RequestHandler2> requestHandlers = RequestHandlerTestUtils.buildRequestHandlerList(
                new SlowRequestHandler().withAfterResponseWaitInSeconds(SLOW_REQUEST_HANDLER_TIMEOUT));

        httpClient.execute(newGetRequest(), new DummyResponseHandler(), new NullErrorResponseHandler(),
                new ExecutionContext(requestHandlers, false, null));
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = ClientExecutionTimeoutException.class)
    public void clientExecutionTimeoutEnabled_SlowBeforeRequestRequestHandler_ThrowsClientExecutionTimeoutException()
            throws Exception {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT));

        List<RequestHandler2> requestHandlers = RequestHandlerTestUtils.buildRequestHandlerList(
                new SlowRequestHandler().withBeforeRequestWaitInSeconds(SLOW_REQUEST_HANDLER_TIMEOUT));

        httpClient.execute(newGetRequest(), new DummyResponseHandler(), new NullErrorResponseHandler(),
                new ExecutionContext(requestHandlers, false, null));
    }

    /**
     * Tests that a streaming operation has it's request properly cleaned up if the client is interrupted after the
     * response is received.
     *
     * @see TT0070103230
     */
    @Test
    public void clientInterruptedDuringResponseHandlers_DoesNotLeakConnection() throws IOException {
        ClientConfiguration config = new ClientConfiguration();
        ConnectionManagerAwareHttpClient rawHttpClient = new ApacheHttpClientFactory().create(HttpClientSettings.adapt(config));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        interruptCurrentThreadAfterDelay(1000);
        List<RequestHandler2> requestHandlers = RequestHandlerTestUtils
                .buildRequestHandlerList(new SlowRequestHandler().withAfterResponseWaitInSeconds(10));
        try {
            httpClient.execute(newGetRequest(), new DummyResponseHandler().leaveConnectionOpen(),
                    new NullErrorResponseHandler(), new ExecutionContext(requestHandlers, false, null));
            fail("Expected exception");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(InterruptedException.class));
        }

        int leasedConnections = ((ConnPoolControl<?>) ((SdkHttpClient)rawHttpClient).getHttpClientConnectionManager()).getTotalStats().getLeased();
        assertEquals(0, leasedConnections);
    }

}

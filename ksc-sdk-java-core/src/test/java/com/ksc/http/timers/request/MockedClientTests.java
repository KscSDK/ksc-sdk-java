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
package com.ksc.http.timers.request;

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertCanceledTasksRemoved;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertCoreThreadsShutDownAfterBeingIdle;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertResponseIsBuffered;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertResponseWasNotBuffered;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertTimerNeverTriggered;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createHttpHeadResponseProxy;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createHttpResponseProxySpy;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createMockGetRequest;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createMockHeadRequest;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.createRawHttpClientSpy;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.protocol.HttpContext;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.http.response.HttpResponseProxy;
import com.ksc.http.response.NullErrorResponseHandler;
import com.ksc.http.response.NullResponseHandler;

/**
 * These tests don't actually start up a mock server. They use a partially mocked Apache HTTP client
 * to return the desired response
 */
public class MockedClientTests {

    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Test
    public void requestTimeoutEnabled_RequestCompletesWithinTimeout_TaskCanceledAndEntityBuffered() throws Exception {
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(5 * 1000).withMaxErrorRetry(0);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, createMockGetRequest());
            fail("Exception expected");
        } catch (KscClientException e) {
            NullResponseHandler.assertIsUnmarshallingException(e);
        }

        assertResponseIsBuffered(responseProxy);
        ScheduledThreadPoolExecutor requestTimerExecutor = httpClient.getHttpRequestTimer().getExecutor();
        assertTimerNeverTriggered(requestTimerExecutor);
        assertCanceledTasksRemoved(requestTimerExecutor);
        // Core threads should be spun up on demand. Since only one task was submitted only one
        // thread should exist
        assertEquals(1, requestTimerExecutor.getPoolSize());
        assertCoreThreadsShutDownAfterBeingIdle(requestTimerExecutor);
    }

    /**
     * Response to HEAD requests don't have an entity so we shouldn't try to wrap the response in a
     * {@link BufferedHttpEntity}.
     */
    @Test
    public void requestTimeoutEnabled_HeadRequestCompletesWithinTimeout_EntityNotBuffered() throws Exception {
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(5 * 1000).withMaxErrorRetry(0);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpHeadResponseProxy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpHead.class), any(HttpContext.class));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, createMockHeadRequest());
            fail("Exception expected");
        } catch (KscClientException e) {
            NullResponseHandler.assertIsUnmarshallingException(e);
        }

        assertNull(responseProxy.getEntity());
    }

    @Test
    public void requestTimeoutDisabled_RequestCompletesWithinTimeout_EntityNotBuffered() throws Exception {
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(0);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, createMockGetRequest());
            fail("Exception expected");
        } catch (KscClientException e) {
        }

        assertResponseWasNotBuffered(responseProxy);
    }

    @Test
    public void requestTimeoutEnabled_RequestCompletesWithinTimeout_EntityNotBufferedForStreamedResponse()
            throws Exception {
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(5 * 1000);
        ConnectionManagerAwareHttpClient rawHttpClient = createRawHttpClientSpy(config);

        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        try {
            httpClient.execute(createMockGetRequest(), new NullResponseHandler() {
                @Override
                public boolean needsConnectionLeftOpen() {
                    // Streaming operation
                    return true;
                }
            }, new NullErrorResponseHandler(), new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
        }

        assertResponseWasNotBuffered(responseProxy);
    }

}
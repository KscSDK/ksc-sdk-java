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

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertRequestTimerExecutorNotCreated;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static com.ksc.http.timers.TimeoutTestConstants.PRECISION_MULTIPLIER;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.net.SocketTimeoutException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

import com.ksc.KscClientException;
import com.ksc.KscWebServiceRequest;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.UnresponsiveMockServerTestBase;
import com.ksc.http.exception.HttpRequestTimeoutException;
import com.ksc.http.request.EmptyHttpRequest;

/**
 * Tests requiring an unresponsive server, that is a server that accepts a connection but doesn't
 * write any data to the response
 */
public class UnresponsiveServerTests extends UnresponsiveMockServerTestBase {

    private static final int REQUEST_TIMEOUT = 5 * 1000;
    private static final int LONGER_SOCKET_TIMEOUT = REQUEST_TIMEOUT * PRECISION_MULTIPLIER;
    private static final int SHORTER_SOCKET_TIMEOUT = REQUEST_TIMEOUT / PRECISION_MULTIPLIER;

    private static class EmptyAmazonWebServiceRequest extends KscWebServiceRequest {
    }

    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = TestTimedOutException.class)
    public void requestTimeoutDisabled_ConnectionClosedBySocketTimeout_NoThreadsCreated() {
        final int socketTimeout = 1000;
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withSocketTimeout(socketTimeout).withRequestTimeout(0).withMaxErrorRetry(0));

        try {
            execute(httpClient, newGetRequest());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
            assertRequestTimerExecutorNotCreated(httpClient.getHttpRequestTimer());
        }
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void requestTimeoutSetInRequestObject_WithLongerSocketTimeout_ThrowsRequestTimeoutException() {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withSocketTimeout(LONGER_SOCKET_TIMEOUT).withMaxErrorRetry(0));

        try {
            EmptyHttpRequest request = newGetRequest();
            request.setOriginalRequest(new EmptyAmazonWebServiceRequest().withSdkRequestTimeout(REQUEST_TIMEOUT));
            execute(httpClient, request);
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(HttpRequestTimeoutException.class));
        }
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void requestTimeoutSetInRequestObject_WithShorterSocketTimeout_ThrowsRequestTimeoutException() {
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withSocketTimeout(SHORTER_SOCKET_TIMEOUT).withMaxErrorRetry(0));

        try {
            EmptyHttpRequest request = newGetRequest();
            request.setOriginalRequest(new EmptyAmazonWebServiceRequest().withSdkRequestTimeout(REQUEST_TIMEOUT));
            execute(httpClient, request);
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
        }
    }
    
    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = TestTimedOutException.class)
    public void requestTimeoutSetInRequestObject_TakesPrecedenceOverClientConfiguration() {
        // Client configuration is set arbitrarily high so that the test will timeout if the
        // client configuration is incorrectly honored over the request config
        httpClient = new KSCHttpClient(new ClientConfiguration().withSocketTimeout(LONGER_SOCKET_TIMEOUT)
                .withRequestTimeout(REQUEST_TIMEOUT * 1000).withMaxErrorRetry(0));

        try {
            EmptyHttpRequest request = newGetRequest();
            request.setOriginalRequest(new EmptyAmazonWebServiceRequest().withSdkRequestTimeout(REQUEST_TIMEOUT));
            execute(httpClient, request);
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(HttpRequestTimeoutException.class));
        }
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT, expected = TestTimedOutException.class)
    public void requestTimeoutDisabledInRequestObject_TakesPrecedenceOverClientConfiguration() {
        final int socketTimeout = REQUEST_TIMEOUT;
        // Client configuration is set arbitrarily low so that the request will be aborted if
        // the client configuration is incorrectly honored over the request config
        httpClient = new KSCHttpClient(
                new ClientConfiguration().withSocketTimeout(socketTimeout).withRequestTimeout(1).withMaxErrorRetry(0));

        try {
            EmptyHttpRequest request = newGetRequest();
            request.setOriginalRequest(new EmptyAmazonWebServiceRequest().withSdkRequestTimeout(0));
            execute(httpClient, request);
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
        }
    }

}
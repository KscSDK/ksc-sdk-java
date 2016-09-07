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

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertClientExecutionTimerExecutorNotCreated;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfTasksTriggered;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.interruptCurrentThreadAfterDelay;
import static com.ksc.http.timers.TimeoutTestConstants.CLIENT_EXECUTION_TIMEOUT;
import static com.ksc.http.timers.TimeoutTestConstants.PRECISION_MULTIPLIER;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.SocketTimeoutException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.UnresponsiveMockServerTestBase;
import com.ksc.http.exception.HttpRequestTimeoutException;
import com.ksc.http.response.NullErrorResponseHandler;
import com.ksc.http.response.NullResponseHandler;
import com.ksc.retry.FixedTimeBackoffStrategy;
import com.ksc.retry.PredefinedRetryPolicies;
import com.ksc.retry.RetryPolicy;

public class UnresponsiveServerTests extends UnresponsiveMockServerTestBase {

    private static final int LONGER_SOCKET_TIMEOUT = CLIENT_EXECUTION_TIMEOUT * PRECISION_MULTIPLIER;
    private static final int SHORTER_SOCKET_TIMEOUT = CLIENT_EXECUTION_TIMEOUT / PRECISION_MULTIPLIER;
    private static final int LONGER_REQUEST_TIMEOUT = CLIENT_EXECUTION_TIMEOUT * PRECISION_MULTIPLIER;
    private static final int SHORTER_REQUEST_TIMEOUT = CLIENT_EXECUTION_TIMEOUT / PRECISION_MULTIPLIER;

    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutDisabled_SocketTimeoutExceptionIsThrown_NoThreadsCreated() {
        httpClient = new KSCHttpClient(new ClientConfiguration().withSocketTimeout(1 * 1000).withMaxErrorRetry(0));

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
            assertClientExecutionTimerExecutorNotCreated(httpClient.getClientExecutionTimer());
        }
    }

    /**
     * The client execution timer uses interrupts to abort the client but if another thread
     * interrupts the current thread for another reason we don't want to squash the
     * {@link InterruptedException}. We should set the thread's interrupted status and throw the
     * exception back out (we can't throw the actual {@link InterruptedException} because it's
     * checked)
     */
    @Test(timeout = TEST_TIMEOUT)
    public void interruptCausedBySomethingOtherThanTimer_PropagatesInterruptToCaller() {
        final int socketTimeoutInMillis = 100;
        httpClient = new KSCHttpClient(new ClientConfiguration().withSocketTimeout(socketTimeoutInMillis)
                .withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withRetryPolicy(new RetryPolicy(PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION,
                        new FixedTimeBackoffStrategy(CLIENT_EXECUTION_TIMEOUT), 1, false)));

        // We make sure the first connection has failed due to the socket timeout before
        // interrupting so we know that we are sleeping per the backoff strategy. Apache HTTP
        // client doesn't seem to honor interrupts reliably but Thread.sleep does
        interruptCurrentThreadAfterDelay(socketTimeoutInMillis * 2);

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertTrue(Thread.currentThread().isInterrupted());
            assertThat(e.getCause(), instanceOf(InterruptedException.class));
        }
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithLongerSocketTimeout_ThrowsClientExecutionTimeoutException()
            throws IOException {
        httpClient = new KSCHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withSocketTimeout(LONGER_SOCKET_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e, instanceOf(ClientExecutionTimeoutException.class));
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 1);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterSocketTimeout_ThrowsSocketTimeoutException()
            throws IOException {
        httpClient = new KSCHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withSocketTimeout(SHORTER_SOCKET_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 0);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterClientExecutionTimeout_ThrowsClientExecutionTimeoutException()
            throws IOException {
        httpClient = new KSCHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withRequestTimeout(LONGER_REQUEST_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e, instanceOf(ClientExecutionTimeoutException.class));
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 1);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 0);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterRequestTimeout_ThrowsHttpRequestTimeoutException()
            throws IOException {
        httpClient = new KSCHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withRequestTimeout(SHORTER_REQUEST_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e.getCause(), instanceOf(HttpRequestTimeoutException.class));
            // Completed tasks means the client execution was aborted by the timer
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 0);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 1);
        }
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterRequestTimeoutAndRetry_ThrowsClientExecutionTimeoutException()
            throws IOException {
        final int clientExecutionTimeout = 1500;
        final int requestTimeout = 1000;
        final int backoffTime = 300;
        httpClient = new KSCHttpClient(new ClientConfiguration().withClientExecutionTimeout(clientExecutionTimeout)
                .withRequestTimeout(requestTimeout)
                .withRetryPolicy(new RetryPolicy(PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION,
                        new FixedTimeBackoffStrategy(backoffTime), Integer.MAX_VALUE, false)));

        try {
            httpClient.execute(newGetRequest(), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());
            fail("Exception expected");
        } catch (KscClientException e) {
            assertThat(e, instanceOf(ClientExecutionTimeoutException.class));
            // Completed tasks means the client execution was aborted by the timer
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 1);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 1);
        }
    }
}

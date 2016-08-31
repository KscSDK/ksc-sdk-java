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

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfRetries;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfTasksTriggered;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ksc.KscServiceException;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.MockServerTestBase;
import com.ksc.http.apache.client.impl.ApacheHttpClientFactory;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.http.client.HttpClientFactory;
import com.ksc.http.server.MockServer;
import com.ksc.http.settings.HttpClientSettings;

/**
 * Tests that use a server that returns a predetermined response within the timeout limit
 */
public class DummyResponseServerTests extends MockServerTestBase {

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
    @Test(timeout = TEST_TIMEOUT)
    public void requestTimeoutEnabled_ServerRespondsWithRetryableError_RetriesUpToLimitThenThrowsServerException()
            throws IOException {
        int maxRetries = 2;
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(25 * 1000)
                .withClientExecutionTimeout(25 * 1000).withMaxErrorRetry(maxRetries);
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        ConnectionManagerAwareHttpClient rawHttpClient = spy(httpClientFactory.create(HttpClientSettings.adapt(config)));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, newGetRequest());
            fail("Exception expected");
        } catch (KscServiceException e) {
            assertEquals(e.getStatusCode(), STATUS_CODE);
            int expectedNumberOfRequests = 1 + maxRetries;
            assertNumberOfRetries(rawHttpClient, expectedNumberOfRequests);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 0);
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 0);
        }
    }

}
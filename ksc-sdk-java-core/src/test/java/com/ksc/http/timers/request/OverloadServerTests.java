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

import com.ksc.KscClientException;
import com.ksc.ClientConfiguration;
import com.ksc.TestPreConditions;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.OverloadedMockServerTestBase;
import com.ksc.http.apache.client.impl.ApacheHttpClientFactory;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.http.client.HttpClientFactory;
import com.ksc.http.exception.HttpRequestTimeoutException;
import com.ksc.http.server.MockServer;
import com.ksc.http.server.MockServer.ServerBehavior;
import com.ksc.http.settings.HttpClientSettings;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfRetries;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfTasksTriggered;
import static com.ksc.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;

/**
 * Tests requiring an Overloaded server, that is a server that responds but can't close the connection in a timely
 * fashion
 */
// TODO rename to overloaded
public class OverloadServerTests extends OverloadedMockServerTestBase {

    private KSCHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Override
    protected MockServer buildMockServer() {
        return MockServer.createMockServer(ServerBehavior.OVERLOADED);
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void requestTimeoutEnabled_HonorsRetryPolicy() throws IOException {
        int maxRetries = 2;
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(1 * 1000)
                .withMaxErrorRetry(maxRetries);
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        ConnectionManagerAwareHttpClient rawHttpClient = spy(httpClientFactory.create(HttpClientSettings.adapt(config)));

        httpClient = new KSCHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, newGetRequest());
            fail("Exception expected");
        } catch (KscClientException e) {
            /* the expected exception and number of requests. */
            assertThat(e.getCause(), instanceOf(HttpRequestTimeoutException.class));
            int expectedNumberOfRequests = 1 + maxRetries;
            assertNumberOfRetries(rawHttpClient, expectedNumberOfRequests);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), expectedNumberOfRequests);
        }
    }

}
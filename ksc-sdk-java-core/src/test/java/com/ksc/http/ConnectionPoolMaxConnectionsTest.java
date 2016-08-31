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
package com.ksc.http;

import com.ksc.KscClientException;
import com.ksc.ClientConfiguration;
import com.ksc.Request;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpMethodName;
import com.ksc.http.request.EmptyHttpRequest;
import com.ksc.http.response.EmptyAWSResponseHandler;
import com.ksc.http.response.NullErrorResponseHandler;
import com.ksc.http.response.NullResponseHandler;
import com.ksc.http.server.MockServer;

import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConnectionPoolMaxConnectionsTest {

    private static MockServer server;

    @BeforeClass
    public static void setup() {
        server = MockServer.createMockServer(MockServer.ServerBehavior.OVERLOADED);
        server.startServer();
    }

    @AfterClass
    public static void tearDown() {
        if (server != null) {
            server.stopServer();
        }
    }

    @Test(timeout = 60 * 1000)
    public void leasing_a_new_connection_fails_with_connection_pool_timeout()
            throws Exception {

        String localhostEndpoint = "http://localhost:" + server.getPort();

        KSCHttpClient httpClient = new KSCHttpClient(
                new ClientConfiguration()
                        .withMaxConnections(1)
                        .withConnectionTimeout(100)
                        .withMaxErrorRetry(0));

        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);

        // Block the first connection in the pool with this request.
        httpClient.execute(request, new EmptyAWSResponseHandler(), new
                NullErrorResponseHandler(), new ExecutionContext());

        try {
            // A new connection will be leased here which would fail in
            // ConnectionPoolTimeoutException.
            httpClient.execute(request, new NullResponseHandler(), new NullErrorResponseHandler(), new ExecutionContext());
            Assert.fail("Connection pool timeout exception is expected!");
        } catch (KscClientException e) {
            Assert.assertTrue(e.getCause() instanceof ConnectionPoolTimeoutException);
        }
    }
}

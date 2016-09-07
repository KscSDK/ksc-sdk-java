
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

import static org.junit.Assert.fail;

import org.apache.http.conn.ConnectTimeoutException;
import org.junit.Assert;
import org.junit.Test;

import com.ksc.KscClientException;
import com.ksc.ClientConfiguration;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpMethodName;
import com.ksc.http.request.EmptyHttpRequest;
import com.ksc.http.response.NullErrorResponseHandler;
import com.ksc.http.response.NullResponseHandler;

/**
 * This test is to verify that the apache-httpclient library has fixed the bug where socket timeout configuration is
 * incorrectly ignored during SSL handshake. This test is expected to hang (and fail after the junit timeout) if run
 * against the problematic httpclient version (e.g. 4.3).
 *
 * @link https://issues.apache.org/jira/browse/HTTPCLIENT-1478
 */
public class KscHttpClientSslHandshakeTimeoutTest extends UnresponsiveMockServerTestBase {

    private static final int CLIENT_SOCKET_TO = 1 * 1000;

    @Test(timeout = 60 * 1000)
    public void testSslHandshakeTimeout() {
        KSCHttpClient httpClient = new KSCHttpClient(new ClientConfiguration()
                .withSocketTimeout(CLIENT_SOCKET_TO).withMaxErrorRetry(0));

        System.out.println("Sending request to localhost...");

        try {
            httpClient.execute(new EmptyHttpRequest(server.getHttpsEndpoint(),
                    HttpMethodName.GET), new NullResponseHandler(), new NullErrorResponseHandler(),
                    new ExecutionContext());

            fail("Client-side socket read timeout is expected!");

        } catch (KscClientException e) {
            /**
             * Http client catches the SocketTimeoutException and throws a
             * ConnectTimeoutException.
             * {@link org.apache.http.impl.conn.DefaultHttpClientConnectionOperator#connect(ManagedHttpClientConnection, HttpHost, InetSocketAddress, int, SocketConfig, HttpContext)}
             */
            Assert.assertTrue(e.getCause() instanceof ConnectTimeoutException);

            ConnectTimeoutException cte = (ConnectTimeoutException) e.getCause();
            Assert.assertThat(cte.getMessage(), org.hamcrest.Matchers
                    .containsString("Read timed out"));
        }
    }
}

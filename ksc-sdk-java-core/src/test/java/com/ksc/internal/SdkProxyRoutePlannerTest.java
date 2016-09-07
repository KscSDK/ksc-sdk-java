/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.ksc.internal;

import static com.ksc.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.ksc.ClientConfiguration;
import com.ksc.http.apache.client.impl.ApacheHttpClientFactory;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.http.client.HttpClientFactory;
import com.ksc.http.settings.HttpClientSettings;
import com.ksc.http.timers.client.DummySuccessfulResponseServerTests;

/**
 * This class starts a mock proxy server, and once a request is sent to this mock proxy server,
 * a 200 OK will be returned. We'll take advantage of this returned status code to test whether
 * a request to the given fake service host is passed through the proxy or not.
 */
public class SdkProxyRoutePlannerTest extends DummySuccessfulResponseServerTests {

    private static final String FOO_FAKE_SERVICE_HOST_PREFIX = UUID.randomUUID().toString();
    private static final String FOO_FAKE_SERVICE_HOST = FOO_FAKE_SERVICE_HOST_PREFIX + ".com";
    private static final String BAR_FAKE_SERVICE_HOST = UUID.randomUUID().toString() + ".com";
    private static final String BAZ_FAKE_SERVICE_HOST = UUID.randomUUID().toString() + ".com";

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void nonProxyHostsNull_fakeHost() {
        mockSuccessfullRequest(null, FOO_FAKE_SERVICE_HOST);
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void nonProxyHostEmpty_fakeHost() {
        mockSuccessfullRequest("", FOO_FAKE_SERVICE_HOST);
    }

//    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsNotNull_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfullRequest(FOO_FAKE_SERVICE_HOST, FOO_FAKE_SERVICE_HOST);
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void nonProxyHostsNotNull_fakeHostDoesNotMatch() {
        mockSuccessfullRequest(FOO_FAKE_SERVICE_HOST, BAR_FAKE_SERVICE_HOST);
    }

//    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsWithWildcardPrefix_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfullRequest("*.com", FOO_FAKE_SERVICE_HOST);
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void nonProxyHostsWithWildcardPrefix_fakeHostDoesNotMatch() {
        mockSuccessfullRequest("*.org", BAR_FAKE_SERVICE_HOST);
    }

//    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsWithWildcardSuffix_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfullRequest(FOO_FAKE_SERVICE_HOST_PREFIX + ".*", FOO_FAKE_SERVICE_HOST);
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void nonProxyHostsWithWildcardSuffix_fakeHostDoesNotMatch() {
        mockSuccessfullRequest(FOO_FAKE_SERVICE_HOST_PREFIX + ".*", BAR_FAKE_SERVICE_HOST);
    }

//    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsWithOrSign_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfullRequest(FOO_FAKE_SERVICE_HOST + "|" + BAR_FAKE_SERVICE_HOST, FOO_FAKE_SERVICE_HOST);
    }

    @Ignore
    @Test(timeout = TEST_TIMEOUT)
    public void nonProxyHostsWithOrSign_fakeHostDoesNotMatch() {
        mockSuccessfullRequest(FOO_FAKE_SERVICE_HOST + "|" + BAZ_FAKE_SERVICE_HOST, BAR_FAKE_SERVICE_HOST);
    }

    // Create a HttpClient with the proxy set up to the local mock server.
    private HttpClient createHttpClient(String nonProxyHosts) {
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        ClientConfiguration config = new ClientConfiguration()
                .withProxyHost("localhost").withProxyPort(server.getPort())
                .withNonProxyHosts(nonProxyHosts);
        return httpClientFactory.create(HttpClientSettings.adapt(config));
    }

    /**
     * The fakeHost doesn't match the nonProxyHosts pattern, so that requests to this fakeHost
     * will pass through the proxy and return successfully.
     */
    private void mockSuccessfullRequest(String nonProxyHosts, String fakeHost) {
        HttpClient client = createHttpClient(nonProxyHosts);
        HttpUriRequest uriRequest = new HttpGet("http://" + fakeHost);
        try {
            HttpResponse response = client.execute(uriRequest);
            Assert.assertEquals(200, response.getStatusLine().getStatusCode());
        } catch (Exception e) {
            fail("Exception is not expected!");
        }
    }

    /**
     * The fakeHost does match the nonProxyHosts pattern, so that requests to this fakeHost
     * will bypass the proxy and throw an UnknownHostException.
     */
    private void mockUnsuccessfullRequest(String nonProxyHosts, String fakeHost)
            throws Exception {
        HttpClient client = createHttpClient(nonProxyHosts);
        HttpUriRequest uriRequest = new HttpGet("http://" + fakeHost);
        client.execute(uriRequest);
        fail("UnknownHostException is expected!");
    }
}

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
package com.ksc.http;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.findAll;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.ksc.http.KSCHttpClient.HEADER_SDK_TRANSACTION_ID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import com.ksc.KscServiceException;
import com.ksc.ClientConfiguration;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.ExecutionContext;
import com.ksc.http.response.DummyResponseHandler;

import utils.http.WireMockTestBase;

public class SdkTransactionIdInHeaderTest extends WireMockTestBase {

    private static final String RESOURCE_PATH = "/transaction-id/";

    @Test
    public void retriedRequest_HasSameTransactionIdForAllRetries() throws Exception {
        stubFor(get(urlEqualTo(RESOURCE_PATH)).willReturn(aResponse().withStatus(500)));
        executeRequest();
        assertTransactionIdIsUnchangedAcrossRetries();
    }

    private void assertTransactionIdIsUnchangedAcrossRetries() {
        String previousTransactionId = null;
        for (LoggedRequest request : findAll(getRequestedFor(urlEqualTo(RESOURCE_PATH)))) {
            final String currentTransactionId = request.getHeader(HEADER_SDK_TRANSACTION_ID);
            // Transaction ID should always be set
            assertNotNull(currentTransactionId);
            // Transaction ID should be the same across retries
            if (previousTransactionId != null) {
                assertEquals(previousTransactionId, currentTransactionId);
            }
            previousTransactionId = currentTransactionId;
        }
    }

    private void executeRequest() throws Exception {
        KSCHttpClient httpClient = new KSCHttpClient(new ClientConfiguration());
        try {
            httpClient.execute(newGetRequest(RESOURCE_PATH), new DummyResponseHandler(), stubErrorHandler(),
                    new ExecutionContext());
            fail("Expected exception");
        } catch (KscServiceException expected) {
        }
    }

}

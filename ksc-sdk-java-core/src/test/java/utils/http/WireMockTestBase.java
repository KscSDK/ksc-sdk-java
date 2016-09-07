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
package utils.http;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.URI;

import org.junit.Rule;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.ksc.KscServiceException;
import com.ksc.DefaultRequest;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.http.HttpResponse;
import com.ksc.http.HttpResponseHandler;
import com.ksc.http.JsonErrorResponseHandler;

/**
 * Base class for tests that use a WireMock server
 */
public abstract class WireMockTestBase {

    @Rule
    public WireMockRule mockServer = new WireMockRule(0);

    protected Request<?> newGetRequest(String resourcePath) {
        Request<?> request = new DefaultRequest<String>("mock");
        request.setEndpoint(URI.create("http://localhost:" + mockServer.port() + resourcePath));
        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }

    protected HttpResponseHandler<KscServiceException> stubErrorHandler() throws Exception {
        HttpResponseHandler<KscServiceException> errorHandler = mock(JsonErrorResponseHandler.class);
        when(errorHandler.handle(any(HttpResponse.class))).thenReturn(mockException());
        return errorHandler;
    }

    private KscServiceException mockException() {
        KscServiceException exception = new KscServiceException("Dummy error response");
        exception.setStatusCode(500);
        return exception;
    }
}
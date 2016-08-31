/*
 * Copyright 2010-2016 ksyun.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://ksyun.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.ksc.retry;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.junit.Assert;

import com.ksc.KscClientException;
import com.ksc.KscServiceException;
import com.ksc.KscWebServiceRequest;
import com.ksc.ClientConfiguration;
import com.ksc.DefaultRequest;
import com.ksc.Request;
import com.ksc.http.KSCHttpClient;
import com.ksc.http.HttpResponseHandler;
import com.ksc.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.ksc.retry.RetryPolicy;
import com.ksc.util.StringInputStream;

/** Some utility class and method for testing RetryCondition */
@SuppressWarnings("deprecation")
public class RetryPolicyTestBase {
    
    protected static ClientConfiguration clientConfiguration = new ClientConfiguration();
    protected static KSCHttpClient testedClient = new KSCHttpClient(clientConfiguration);
    protected static final KscWebServiceRequest originalRequest = new TestAmazonWebServiceRequest();
    protected static final HttpResponseHandler<KscServiceException> errorResponseHandler = new TestHttpResponseHandler();
 
    /**
     * The retry condition and back-off strategy implementations that record all
     * the context data passed into shouldRetry and calculateSleepTime methods.
     */
    protected static ContextDataCollectionRetryCondition retryCondition;
    protected static ContextDataCollectionBackoffStrategy backoffStrategy;
    
    public static void injectMockHttpClient(KSCHttpClient amazonHttpClient, ConnectionManagerAwareHttpClient mockHttpClient) {
        try {
            Field f = KSCHttpClient.class.getDeclaredField("httpClient");
            f.setAccessible(true);
            f.set(amazonHttpClient, mockHttpClient);
        } catch (Exception e) {
            Assert.fail("Cannot inject the mock HttpClient object. " + e.getMessage());
        }
    }
    
    @SuppressWarnings("rawtypes")
    public static Request<?> getSampleRequestWithRepeatableContent(KscWebServiceRequest amazonWebServiceRequest) {
        DefaultRequest<?> request = new DefaultRequest(
                amazonWebServiceRequest, "api");
        request.setEndpoint(URI.create("http://api.ksyun.com"));
        // StringInputStream#markSupported() returns true
        try {
            request.setContent(new StringInputStream("Some content that could be read for multiple times."));
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Unable to set up the request content");
        }
        return request;
    }
    
    @SuppressWarnings("rawtypes")
    public static Request<?> getSampleRequestWithNonRepeatableContent(KscWebServiceRequest amazonWebServiceRequest) {
        DefaultRequest<?> request = new DefaultRequest(
                amazonWebServiceRequest, "non-existent-service");
        request.setEndpoint(URI.create("http://non-existent-service.amazonaws.com"));
        // NonRepeatableInputStream#markSupported() returns false
        request.setContent(new NonRepeatableInputStream("Some content that could only be read once."));
        return request;
    }
    
    public static class ContextDataCollectionRetryCondition extends
            ContextDataCollection implements RetryPolicy.RetryCondition {
        
        @Override
        public boolean shouldRetry(KscWebServiceRequest originalRequest,
                                   KscClientException exception,
                                   int retriesAttempted) {
            collect(originalRequest, exception, retriesAttempted);
            return true;
        }
    }
    
    public static class ContextDataCollectionBackoffStrategy extends
            ContextDataCollection implements RetryPolicy.BackoffStrategy {

        @Override
        public long delayBeforeNextRetry(KscWebServiceRequest originalRequest,
                                         KscClientException exception,
                                         int retriesAttempted) {
            collect(originalRequest, exception, retriesAttempted);
            return 0; // immediately retry to speed-up the test
        }
    }
    
    private static class ContextDataCollection {
        
        public List<KscWebServiceRequest> failedRequests = new LinkedList<KscWebServiceRequest>();
        public List<KscClientException> exceptions = new LinkedList<KscClientException>();
        public List<Integer> retriesAttemptedValues = new LinkedList<Integer>();
        
        public void collect(KscWebServiceRequest originalRequest,
                KscClientException exception, int retriesAttempted) {
            failedRequests.add(originalRequest);
            exceptions.add(exception);
            retriesAttemptedValues.add(retriesAttempted);
        }
    }
    
    /** Verifies the RetryCondition has collected the expected context information. */
    public static void verifyExpectedContextData(ContextDataCollection contextDataCollection,
                                                 KscWebServiceRequest failedRequest,
                                                 KscClientException expectedException,
                                                 int expectedRetries) {
        
        Assert.assertEquals(expectedRetries, contextDataCollection.failedRequests.size());
        Assert.assertEquals(expectedRetries, contextDataCollection.exceptions.size());
        Assert.assertEquals(expectedRetries, contextDataCollection.retriesAttemptedValues.size());
        
        if (expectedRetries > 0 ) {
            if (failedRequest != null) {
                // It should keep getting the same original request instance
                for (KscWebServiceRequest seenRequest : contextDataCollection.failedRequests) {
                    Assert.assertTrue("seeRequest=" + seenRequest
                            + ", failedRequest=" + failedRequest,
                            seenRequest == failedRequest);
                }
            }
            
            // Verify the exceptions
            if (expectedException instanceof KscServiceException) {
                // It should get service exceptions with the expected error and status code
                KscServiceException ase = (KscServiceException)expectedException;
                for (KscClientException seenException : contextDataCollection.exceptions) {
                    Assert.assertTrue(seenException instanceof KscServiceException);
                    Assert.assertEquals(ase.getErrorCode(), ((KscServiceException)seenException).getErrorCode());
                    Assert.assertEquals(ase.getStatusCode(), ((KscServiceException)seenException).getStatusCode());
                }
            } else if (expectedException != null) {
                // Client exceptions should have the same expected cause (the same
                // throwable instance from the mock HttpClient).
                Throwable expectedCause = expectedException.getCause();
                for (KscClientException seenException : contextDataCollection.exceptions) {
                    Assert.assertTrue(expectedCause == seenException.getCause());
                }
            }
            
            // It should get "retriesAttempted" values starting from 0
            int expectedRetriesAttempted = 0;
            for (int seenRetriesAttempted : contextDataCollection.retriesAttemptedValues) {
                Assert.assertEquals(expectedRetriesAttempted++, seenRetriesAttempted);
            }
        }
        
    }
    
    public static class TestAmazonWebServiceRequest extends KscWebServiceRequest {}
    
    /**
     * An error response handler implementation that simply
     *   - keeps the status code
     *   - sets the error code by the status text (which comes from the reason phrase in the low-level response)
     */
    public static class TestHttpResponseHandler implements HttpResponseHandler<KscServiceException> {

        @Override
        public KscServiceException handle(
                com.ksc.http.HttpResponse response) throws Exception {
            KscServiceException ase = new KscServiceException("Fake service exception.");
            ase.setStatusCode(response.getStatusCode());
            ase.setErrorCode(response.getStatusText());
            return ase;
        }

        @Override
        public boolean needsConnectionLeftOpen() {
            return false;
        }
    }
    /**
     * A mock HttpClient implementation that does nothing but throws the
     * specified IOException or RuntimeException upon any call on execute(...)
     * method.
     */
    public static class ThrowingExceptionHttpClient extends MockHttpClient {

        private final Throwable t;
        
        /**
         * @param t An IOException or RuntimeException object.
         */
        public ThrowingExceptionHttpClient(Throwable t) {
            this.t = t;
        }
        
        @Override
        public HttpResponse execute(HttpUriRequest request) throws IOException,
                ClientProtocolException {
            if (t instanceof IOException) {
                throw (IOException)t;
            } else if (t instanceof RuntimeException){
                throw (RuntimeException)t;
            } else {
                Assert.fail("The expected throwable should be either an IOException or RuntimeException.");
                return null;
            }
        }
        
    }
    
    /**
     * A mock HttpClient implementation that does nothing but directly returns a
     * BasicHttpResponse object with the specified status code upon any call on
     * execute(...) method.
     */
    public static class ReturnServiceErrorHttpClient extends MockHttpClient {

        private final int statusCode;
        private final String reasonPhrase;
        
        /**
         * @param statusCode The status code to be included in the error response.
         */
        public ReturnServiceErrorHttpClient(int statusCode, String reasonPhrase) {
            this.statusCode = statusCode;
            this.reasonPhrase = reasonPhrase;
        }
        
        @Override
        public HttpResponse execute(HttpUriRequest request) throws IOException,
                ClientProtocolException {
            return new BasicHttpResponse(new BasicStatusLine(
                    HttpVersion.HTTP_1_1,
                    statusCode,
                    reasonPhrase));
        }
        
    }
    
    /** A base abstract class for fake HttpClient implementations */
    public static abstract class MockHttpClient implements ConnectionManagerAwareHttpClient {

        @Override
        public abstract HttpResponse execute(HttpUriRequest request) throws IOException,
                ClientProtocolException;
        
        @Override
        public HttpResponse execute(HttpUriRequest request, HttpContext context)
                throws IOException, ClientProtocolException {
            return execute(request);
        }
        
        /*
         * Unsupported operations.
         * These operations are not used by AmazonHttpClient
         */
        
        @Override
        public HttpParams getParams() { return null; }

        @Override
        public ClientConnectionManager getConnectionManager() { return null; }

        @Override
        public HttpResponse execute(HttpHost target, HttpRequest request)
                throws IOException, ClientProtocolException { return null; }

        @Override
        public HttpResponse execute(HttpHost target, HttpRequest request,
                HttpContext context) throws IOException,
                ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpUriRequest request,
                ResponseHandler<? extends T> responseHandler)
                throws IOException, ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpUriRequest request,
                ResponseHandler<? extends T> responseHandler,
                HttpContext context) throws IOException,
                ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpHost target, HttpRequest request,
                ResponseHandler<? extends T> responseHandler)
                throws IOException, ClientProtocolException { return null; }

        @Override
        public <T> T execute(HttpHost target, HttpRequest request,
                ResponseHandler<? extends T> responseHandler,
                HttpContext context) throws IOException,
                ClientProtocolException { return null; }

        @Override
        public HttpClientConnectionManager getHttpClientConnectionManager() {
            return null;
        }
    }
    
}

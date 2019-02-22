package com.ksc.krds.transform;

import com.ksc.auth.AWSCredentials;
import org.apache.http.annotation.NotThreadSafe;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@NotThreadSafe
public class RequestMessage<T> {
    private String requestId;

    private Map<String, String> headers = new HashMap<String, String>();

    private URI endpoint;

    private String resourcePath;

    private Map<String, Object> queryParameters = new HashMap<String, Object>();

    private AWSCredentials credentials;

    private HttpMethodName httpMethod;

    private InputStream content;

    private int contentLength;
    private Integer maxRetryTimes =null;

    public AWSCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(AWSCredentials credentials) {
        this.credentials = credentials;
    }

    public Map<String, Object> getQueryParameters() {
        return queryParameters;
    }

    public void setQueryParameters(Map<String, Object> queryParameters) {
        this.queryParameters.clear();
        this.queryParameters.putAll(queryParameters);
    }

    public void addQueryParameter(String key, Object value) {
        this.queryParameters.put(key, value);
    }

    public void addHeader(String name, String value) {
        headers.put(name, value);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers.clear();
        this.headers.putAll(headers);
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public HttpMethodName getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethodName httpMethod) {
        this.httpMethod = httpMethod;
    }

    public URI getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    public InputStream getContent() {
        return content;
    }

    public void setContent(InputStream content) {
        this.content = content;
    }

    public void setContent(String content) {
        byte[] bytes = content.getBytes();
        this.content = new ByteArrayInputStream(bytes);
        this.contentLength = bytes.length;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }
}

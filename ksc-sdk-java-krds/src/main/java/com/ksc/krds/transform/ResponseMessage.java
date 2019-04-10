package com.ksc.krds.transform;

import java.util.HashMap;
import java.util.Map;

public class ResponseMessage<T> {

    private Map<String, String> headers;

    private T content;

    private String requestId;

    public ResponseMessage() {
        headers = new HashMap<String, String>();
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers.clear();
        this.headers.putAll(headers);
    }

    public void addHeader(String name, String value) {
        this.headers.put(name, value);
    }

    public Map<String, String> getHeader() {
        return headers;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}

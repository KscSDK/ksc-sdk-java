package com.ksc.krds.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RdsResponse<T> {

    @JsonProperty(value = "RequestId")
    private String requestId;
    @JsonProperty(value = "Data")
    private T data;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

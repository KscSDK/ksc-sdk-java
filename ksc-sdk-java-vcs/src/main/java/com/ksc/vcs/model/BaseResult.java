package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class BaseResult implements Serializable, Cloneable {

    @JsonIgnore
    private int statusCode;

    @JsonIgnore
    private String requestId;

    @JsonIgnore
    private String code;

    @JsonIgnore
    private String message;

    /**
     *
     */
    @JsonIgnore
    private static final long serialVersionUID = -4328184880338725666L;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "{}";
        try {
            jsonString = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
        }
        return jsonString;
    }

}

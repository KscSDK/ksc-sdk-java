package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class ModifyInstanceTypeResp {
    private List<Instance> Instances;


    private String RequestId;
    private String Message;
    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public List<Instance> getInstances() {
        return Instances;
    }

    public void setInstances(List<Instance> instances) {
        Instances = instances;
    }
}

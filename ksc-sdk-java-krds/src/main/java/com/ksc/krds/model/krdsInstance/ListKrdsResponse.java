package com.ksc.krds.model.krdsInstance;

import java.util.List;


public class ListKrdsResponse {
    Data Data = new Data();
    private String RequestId;

    public ListKrdsResponse.Data getData() {
        return Data;
    }

    public void setData(ListKrdsResponse.Data data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public class Data{
        List<Instance> Instances;

        public List<Instance> getInstances() {
            return Instances;
        }

        public void setInstances(List<Instance> instances) {
            Instances = instances;
        }
    }
}

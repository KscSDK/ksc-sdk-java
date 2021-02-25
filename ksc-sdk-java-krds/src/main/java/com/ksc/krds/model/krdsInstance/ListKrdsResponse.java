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
        private Integer TotalCount;
        private Integer MaxRecords;
        private Integer Marker;

        public Integer getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(Integer totalCount) {
            TotalCount = totalCount;
        }

        public Integer getMaxRecords() {
            return MaxRecords;
        }

        public void setMaxRecords(Integer maxRecords) {
            MaxRecords = maxRecords;
        }

        public Integer getMarker() {
            return Marker;
        }

        public void setMarker(Integer marker) {
            Marker = marker;
        }

        public List<Instance> getInstances() {
            return Instances;
        }

        public void setInstances(List<Instance> instances) {
            Instances = instances;
        }
    }
}

package com.ksc.krds.model.krdsInstance;

import com.ksc.util.NumberUtils;

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
            return TotalCount == null ? 0 : TotalCount;
        }

        public void setTotalCount(Integer totalCount) {
            TotalCount = totalCount;
        }

        public Integer getMaxRecords() {
            return MaxRecords == null ? 0 : MaxRecords;
        }

        public void setMaxRecords(Integer maxRecords) {
            MaxRecords = maxRecords;
        }

        public Integer getMarker() {
            return Marker == null ? 0 : Marker;
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

    public ListKrdsResponse() {
    }

    public ListKrdsResponse(DescribeInstanceResponse response, String requestId) {
        setRequestId(requestId);
        fillData(response);
    }

    private void fillData(DescribeInstanceResponse response) {
        ListKrdsResponse.Data data = this.getData();
        data.setInstances(response.getInstances());
        data.setMarker(response.getMarker());
        data.setMaxRecords(response.getMaxRecords());
        data.setTotalCount(response.getTotalCount());
    }

}

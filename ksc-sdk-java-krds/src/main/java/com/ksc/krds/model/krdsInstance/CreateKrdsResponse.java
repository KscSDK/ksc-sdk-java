package com.ksc.krds.model.krdsInstance;

import java.util.ArrayList;
import java.util.List;

public class CreateKrdsResponse {
    Data Data = new Data();
    private String RequestId;

    public CreateKrdsResponse.Data getData() {
        return Data;
    }

    public void setData(CreateKrdsResponse.Data data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public class Data{
        Instance DBInstance;

        private List<RetInstance> Instances = new ArrayList<RetInstance>();
        private Integer TotalCount;
        private Integer MaxRecords;
        private Integer Marker;
        public List<RetInstance> getInstances() {
            return Instances;
        }

        public void setInstances(List<RetInstance> instances) {
            Instances = instances;
        }

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


        public Instance getDBInstance() {
            return DBInstance;
        }

        public void setDBInstance(Instance DBInstance) {
            this.DBInstance = DBInstance;
        }
    }
}

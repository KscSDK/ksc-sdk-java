package com.ksc.krds.model.krdsInstance;

import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.transform.BaseData;

import java.util.List;

public class InstanceResponse extends KrdsResponse {

    private Data data;

    public InstanceResponse() {
        this.data = new Data();
    }

    public BaseData getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data extends BaseData {
        private List<Instance> Instances;
        private Instance DBInstance;

        private Integer TotalCount;
        private Integer MaxRecords;
        private Integer Marker;

        public List<Instance> getInstances() {
            return Instances;
        }

        public void setInstances(List<Instance> instances) {
            Instances = instances;
        }

        public Instance getDBInstance() {
            return DBInstance;
        }

        public void setDBInstance(Instance DBInstance) {
            this.DBInstance = DBInstance;
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
    }
}

package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class ListDBInstanceResponse {

    private List<RetInstance> Instances;
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
}

package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class InstancesResponse {

    private List<RetInstance> Instances;
//    private Integer TotalCount;
//    private Integer MaxRecords;
//    private Integer Marker;
//    private RetInstance DBInstance;

    public List<RetInstance> getInstances() {
        return Instances;
    }

    public void setInstances(List<RetInstance> instances) {
        Instances = instances;
    }
}

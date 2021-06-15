package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class InstancesResponse {

    private List<RetInstance> Instances;

    public List<RetInstance> getInstances() {
        return Instances;
    }

    public void setInstances(List<RetInstance> instances) {
        Instances = instances;
    }
}

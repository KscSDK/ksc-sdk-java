package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class OverrideDBInstanceResponse {

    private List<Instance> Instances;

    public List<Instance> getInstances() {
        return Instances;
    }

    public void setInstances(List<Instance> instances) {
        Instances = instances;
    }
}

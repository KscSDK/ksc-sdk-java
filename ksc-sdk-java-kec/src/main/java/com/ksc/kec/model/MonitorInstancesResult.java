package com.ksc.kec.model;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of MonitorInstances.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class MonitorInstancesResult implements Serializable, Cloneable {

    private static final long serialVersionUID = -2087918803488627510L;

    private String RequestId;

    private SdkInternalList<Instance> InstancesSet;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public SdkInternalList<Instance> getInstancesSet() {
        return InstancesSet;
    }

    public void setInstancesSet(SdkInternalList<Instance> instancesSet) {
        InstancesSet = instancesSet;
    }

    public MonitorInstancesResult withInstancesSet(Instance... instances) {
        if (this.InstancesSet == null) {
            this.InstancesSet = new SdkInternalList<Instance>();
        }
        for (Instance instance : instances) {
            this.InstancesSet.add(instance);
        }
        return this;
    }


}

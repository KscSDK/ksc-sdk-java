package com.ksc.kec.model;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of RunInstances.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class RunInstancesResult implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = 8740240775077779232L;
    private String RequestId;

    private com.ksc.internal.SdkInternalList<Instance> InstancesSet;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public com.ksc.internal.SdkInternalList<Instance> getInstancesSet() {
        return InstancesSet;
    }

    public void setInstancesSet(com.ksc.internal.SdkInternalList<Instance> instancesSet) {
        InstancesSet = instancesSet;
    }

    public RunInstancesResult withInstancesSet(Instance... instances) {
        if (this.InstancesSet == null) {
            this.InstancesSet = new SdkInternalList<Instance>();
        }
        for (Instance instance : instances) {
            this.InstancesSet.add(instance);
        }
        return this;
    }


}

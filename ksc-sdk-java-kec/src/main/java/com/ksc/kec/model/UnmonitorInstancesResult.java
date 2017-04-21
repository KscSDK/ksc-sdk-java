package com.ksc.kec.model;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of StartInstances.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class UnmonitorInstancesResult implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = 8740240775077779232L;
    private String RequestId;
    /**
     * <p>
     * Information about one or more Elastic IP addresses.
     * </p>
     */
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

    public UnmonitorInstancesResult withInstancesSet(Instance... instances) {
        if (this.InstancesSet == null) {
            this.InstancesSet = new SdkInternalList<Instance>();
        }
        for (Instance instance : instances) {
            this.InstancesSet.add(instance);
        }
        return this;
    }


}

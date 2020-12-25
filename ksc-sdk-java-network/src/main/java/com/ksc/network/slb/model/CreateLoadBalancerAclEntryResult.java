package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateLoadBalancerAclEntry.
 * </p>
 */
@Data
public class CreateLoadBalancerAclEntryResult implements Serializable, Cloneable {

    private String RequestId;
    private LoadBalancerAclEntry LoadBalancerAclEntry;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateLoadBalancerAclEntryResult that = (CreateLoadBalancerAclEntryResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (LoadBalancerAclEntry != null ? !LoadBalancerAclEntry.equals(that.LoadBalancerAclEntry) : that.LoadBalancerAclEntry != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (LoadBalancerAclEntry != null ? LoadBalancerAclEntry.hashCode() : 0);
        return result;
    }


    @Override
    public CreateLoadBalancerAclEntryResult clone() {
        try {
            return (CreateLoadBalancerAclEntryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
    * Contains the output of DescribeLoadBalancerAcls.
    * </p>
 */
@Data
public class DescribeLoadBalancerAclsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<LoadBalancerAcl> LoadBalancerAclSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

    DescribeLoadBalancerAclsResult that = (DescribeLoadBalancerAclsResult) o;
    if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
    if (LoadBalancerAclSet != null ? !LoadBalancerAclSet.equals(that.LoadBalancerAclSet) : that.LoadBalancerAclSet != null) return false;
    return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
    result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
    result = 31 * result + (LoadBalancerAclSet != null ? LoadBalancerAclSet.hashCode() : 0);
        return result;
    }

    public void addLoadBalancerAclSet(LoadBalancerAcl... loadBalancerAcls) {
		if (this.LoadBalancerAclSet == null) {
			this.LoadBalancerAclSet = new SdkInternalList<LoadBalancerAcl>();
		}
		for (LoadBalancerAcl loadBalancerAcl : loadBalancerAcls) {
			this.LoadBalancerAclSet.add(loadBalancerAcl);
		}
	}


    @Override
    public DescribeLoadBalancerAclsResult clone() {
        try {
            return (DescribeLoadBalancerAclsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

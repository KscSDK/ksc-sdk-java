package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyLoadBalancerAclRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyLoadBalancerAcl.
 * </p>
 */
@Data
public class ModifyLoadBalancerAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyLoadBalancerAclRequest> {

    /**
     * LoadBalancerAcl的ID
     */
    private String loadBalancerAclId;
    /**
     * LoadBalancerAcl的名称
     */
    private String loadBalancerAclName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyLoadBalancerAclRequest that = (ModifyLoadBalancerAclRequest) o;
        if (loadBalancerAclId != null ? !loadBalancerAclId.equals(that.loadBalancerAclId) : that.loadBalancerAclId != null)
            return false;
        if (loadBalancerAclName != null ? !loadBalancerAclName.equals(that.loadBalancerAclName) : that.loadBalancerAclName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (loadBalancerAclId != null ? loadBalancerAclId.hashCode() : 0);
        result = 31 * result + (loadBalancerAclName != null ? loadBalancerAclName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyLoadBalancerAclRequest> getDryRunRequest() {
        Request<ModifyLoadBalancerAclRequest> request = new ModifyLoadBalancerAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyLoadBalancerAclRequest clone() {
        return (ModifyLoadBalancerAclRequest) super.clone();
    }
}


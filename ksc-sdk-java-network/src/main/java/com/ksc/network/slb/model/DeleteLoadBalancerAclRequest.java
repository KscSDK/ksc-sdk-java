package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteLoadBalancerAclRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteLoadBalancerAcl.
 * </p>
 */
@Data
public class DeleteLoadBalancerAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteLoadBalancerAclRequest> {

    /**
     * LoadBalancerAcl的ID
     */
    private String loadBalancerAclId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteLoadBalancerAclRequest that = (DeleteLoadBalancerAclRequest) o;
        if (loadBalancerAclId != null ? !loadBalancerAclId.equals(that.loadBalancerAclId) : that.loadBalancerAclId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (loadBalancerAclId != null ? loadBalancerAclId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteLoadBalancerAclRequest> getDryRunRequest() {
        Request<DeleteLoadBalancerAclRequest> request = new DeleteLoadBalancerAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteLoadBalancerAclRequest clone() {
        return (DeleteLoadBalancerAclRequest) super.clone();
    }
}


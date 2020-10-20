package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteLoadBalancerAclEntryRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteLoadBalancerAclEntry.
 * </p>
 */
@Data
public class DeleteLoadBalancerAclEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteLoadBalancerAclEntryRequest> {

    /**
     * LoadBalancerAcl的ID
     */
    private String loadBalancerAclId;
    /**
     * ACL规则ID
     */
    private String loadBalancerAclEntryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteLoadBalancerAclEntryRequest that = (DeleteLoadBalancerAclEntryRequest) o;
        if (loadBalancerAclId != null ? !loadBalancerAclId.equals(that.loadBalancerAclId) : that.loadBalancerAclId != null)
            return false;
        if (loadBalancerAclEntryId != null ? !loadBalancerAclEntryId.equals(that.loadBalancerAclEntryId) : that.loadBalancerAclEntryId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (loadBalancerAclId != null ? loadBalancerAclId.hashCode() : 0);
        result = 31 * result + (loadBalancerAclEntryId != null ? loadBalancerAclEntryId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteLoadBalancerAclEntryRequest> getDryRunRequest() {
        Request<DeleteLoadBalancerAclEntryRequest> request = new DeleteLoadBalancerAclEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteLoadBalancerAclEntryRequest clone() {
        return (DeleteLoadBalancerAclEntryRequest) super.clone();
    }
}


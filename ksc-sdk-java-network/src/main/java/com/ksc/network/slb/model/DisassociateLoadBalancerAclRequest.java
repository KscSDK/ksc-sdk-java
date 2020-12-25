package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DisassociateLoadBalancerAclRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DisassociateLoadBalancerAcl.
 * </p>
 */
@Data
public class DisassociateLoadBalancerAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateLoadBalancerAclRequest> {

    /**
     * 监听器的ID
     */
    private String listenerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DisassociateLoadBalancerAclRequest that = (DisassociateLoadBalancerAclRequest) o;
        if (listenerId != null ? !listenerId.equals(that.listenerId) : that.listenerId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (listenerId != null ? listenerId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DisassociateLoadBalancerAclRequest> getDryRunRequest() {
        Request<DisassociateLoadBalancerAclRequest> request = new DisassociateLoadBalancerAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DisassociateLoadBalancerAclRequest clone() {
        return (DisassociateLoadBalancerAclRequest) super.clone();
    }
}


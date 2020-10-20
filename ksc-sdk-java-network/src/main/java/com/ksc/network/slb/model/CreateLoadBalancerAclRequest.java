package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateLoadBalancerAclRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateLoadBalancerAcl.
 * </p>
 */
@Data
public class CreateLoadBalancerAclRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateLoadBalancerAclRequest> {

    /**
     * IP版本
     */
    private String ipVersion;
    /**
     * LoadBalancerAcl的名称
     */
    private String loadBalancerAclName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateLoadBalancerAclRequest that = (CreateLoadBalancerAclRequest) o;
        if (ipVersion != null ? !ipVersion.equals(that.ipVersion) : that.ipVersion != null)
            return false;
        if (loadBalancerAclName != null ? !loadBalancerAclName.equals(that.loadBalancerAclName) : that.loadBalancerAclName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (ipVersion != null ? ipVersion.hashCode() : 0);
        result = 31 * result + (loadBalancerAclName != null ? loadBalancerAclName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateLoadBalancerAclRequest> getDryRunRequest() {
        Request<CreateLoadBalancerAclRequest> request = new CreateLoadBalancerAclRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateLoadBalancerAclRequest clone() {
        return (CreateLoadBalancerAclRequest) super.clone();
    }
}


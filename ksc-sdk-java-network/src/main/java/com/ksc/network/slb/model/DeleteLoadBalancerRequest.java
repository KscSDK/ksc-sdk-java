package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteLoadBalancerRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/24.
 */
public class DeleteLoadBalancerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteLoadBalancerRequest> {

    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteLoadBalancerRequest request = (DeleteLoadBalancerRequest) o;

        return LoadBalancerId != null ? LoadBalancerId.equals(request.LoadBalancerId) : request.LoadBalancerId == null;
    }

    @Override
    public int hashCode() {
        return LoadBalancerId != null ? LoadBalancerId.hashCode() : 0;
    }

    @Override
    public DeleteLoadBalancerRequest clone() {
        return (DeleteLoadBalancerRequest) super.clone();
    }

    @Override
    public Request<DeleteLoadBalancerRequest> getDryRunRequest() {
        Request<DeleteLoadBalancerRequest> request = new DeleteLoadBalancerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

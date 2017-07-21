package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyLoadBalancerRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/25.
 */
public class ModifyLoadBalancerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyLoadBalancerRequest> {

    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;

    /**
     * 负载均衡的名称
     */
    private String LoadBalancerName;

    /**
     * 负载均衡的状态
     */
    private String LoadBalancerState;

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    public String getLoadBalancerName() {
        return LoadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        LoadBalancerName = loadBalancerName;
    }

    public String getLoadBalancerState() {
        return LoadBalancerState;
    }

    public void setLoadBalancerState(String loadBalancerState) {
        LoadBalancerState = loadBalancerState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyLoadBalancerRequest that = (ModifyLoadBalancerRequest) o;

        if (!LoadBalancerId.equals(that.LoadBalancerId)) return false;
        if (!LoadBalancerName.equals(that.LoadBalancerName)) return false;
        return LoadBalancerState.equals(that.LoadBalancerState);
    }

    @Override
    public int hashCode() {
        int result = LoadBalancerId.hashCode();
        result = 31 * result + LoadBalancerName.hashCode();
        result = 31 * result + LoadBalancerState.hashCode();
        return result;
    }

    @Override
    public ModifyLoadBalancerRequest clone() {
        return (ModifyLoadBalancerRequest) super.clone();
    }

    @Override
    public Request<ModifyLoadBalancerRequest> getDryRunRequest() {
        Request<ModifyLoadBalancerRequest> request = new ModifyLoadBalancerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

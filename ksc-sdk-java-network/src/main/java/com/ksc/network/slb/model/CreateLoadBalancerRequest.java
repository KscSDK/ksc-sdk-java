package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateLoadBalancerRequestMarshaller;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/21.
 */
public class CreateLoadBalancerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateLoadBalancerRequest>{

    /**
     * Vpc的ID
     */
    private String VpcId;

    /**
     * 负载均衡的名称
     */
    private String LoadBalancerName;

    /**
     * 负载均衡类型，公网（public）是支持公网的负载均衡、私网（internal）是VPC内部的负载均衡
     */
    private String Type;

    /**
     * 子网的ID，Internal类型的SLB必须要指定endpoint子网, Public 类型SLB不需指定该参数。
     */
    private String SubnetId;

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getLoadBalancerName() {
        return LoadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        LoadBalancerName = loadBalancerName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateLoadBalancerRequest that = (CreateLoadBalancerRequest) o;

        if (!VpcId.equals(that.VpcId)) return false;
        if (!LoadBalancerName.equals(that.LoadBalancerName)) return false;
        if (!Type.equals(that.Type)) return false;
        return SubnetId.equals(that.SubnetId);
    }

    @Override
    public int hashCode() {
        int result = VpcId.hashCode();
        result = 31 * result + LoadBalancerName.hashCode();
        result = 31 * result + Type.hashCode();
        result = 31 * result + SubnetId.hashCode();
        return result;
    }

    @Override
    public CreateLoadBalancerRequest clone() { return (CreateLoadBalancerRequest) super.clone(); }

    @Override
    public Request<CreateLoadBalancerRequest> getDryRunRequest() {
        Request<CreateLoadBalancerRequest> request = new CreateLoadBalancerRequestMarshaller()
                .marshall(this);
        request.addParameter("DruRun", Boolean.toString(true));
        return request;
    }
}

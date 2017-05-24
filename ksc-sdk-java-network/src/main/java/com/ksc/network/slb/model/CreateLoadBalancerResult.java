package com.ksc.network.slb.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/21.
 */
@ToString
public class CreateLoadBalancerResult implements Serializable, Cloneable {

    /**
     * 负载均衡创建时间
     */
    private String CreateTime;

    /**
     * Vpc的ID
     */
    private String VpcId;

    /**
     * 负载均衡的名称
     */
    private String LoadBalancerName;

    /**
     * 请求ID
     */
    private String RequestId;

    /**
     * 负载均衡类型，公网（public）是支持公网的负载均衡、私网（internal）是VPC内部的负载均衡
     */
    private String Type;

    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

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

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getLoadBalancerId() {
        return LoadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        LoadBalancerId = loadBalancerId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateLoadBalancerResult that = (CreateLoadBalancerResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (!LoadBalancerName.equals(that.LoadBalancerName)) return false;
        if (!RequestId.equals(that.RequestId)) return false;
        if (Type != null ? !Type.equals(that.Type) : that.Type != null) return false;
        return LoadBalancerId.equals(that.LoadBalancerId);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + LoadBalancerName.hashCode();
        result = 31 * result + RequestId.hashCode();
        result = 31 * result + (Type != null ? Type.hashCode() : 0);
        result = 31 * result + LoadBalancerId.hashCode();
        return result;
    }

    @Override
    public CreateLoadBalancerResult clone() {
        try {
            return (CreateLoadBalancerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

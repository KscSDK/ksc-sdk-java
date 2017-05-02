package com.ksc.network.slb.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/26.
 */
@ToString
public class ModifyLoadBalancerResult implements Serializable, Cloneable {

    /**
     * 请求ID
     */
    private String RequestId;

    /**
     * 负载均衡创建时间
     */
    private String CreateTime;

    /**
     * Vpc的ID
     */
    private String VpcId;

    /**
     * 负载均衡的状态，开启（start ）、关闭（stop）
     */
    private String LoadBalancerState;

    /**
     * 负载均衡的名称
     */
    private String LoadBalancerName;

    /**
     * 负载均衡类型，公网（public）是支持公网的负载均衡、私网（internal）是VPC内部的负载均衡
     */
    private String Type;

    /**
     * 负载均衡的ID
     */
    private String LoadBalancerId;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

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

    public String getLoadBalancerState() {
        return LoadBalancerState;
    }

    public void setLoadBalancerState(String loadBalancerState) {
        LoadBalancerState = loadBalancerState;
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

        ModifyLoadBalancerResult that = (ModifyLoadBalancerResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CreateTime != null ? !CreateTime.equals(that.CreateTime) : that.CreateTime != null) return false;
        if (VpcId != null ? !VpcId.equals(that.VpcId) : that.VpcId != null) return false;
        if (LoadBalancerState != null ? !LoadBalancerState.equals(that.LoadBalancerState) : that.LoadBalancerState != null)
            return false;
        if (LoadBalancerName != null ? !LoadBalancerName.equals(that.LoadBalancerName) : that.LoadBalancerName != null)
            return false;
        if (Type != null ? !Type.equals(that.Type) : that.Type != null) return false;
        return LoadBalancerId != null ? LoadBalancerId.equals(that.LoadBalancerId) : that.LoadBalancerId == null;
    }

    @Override
    public int hashCode() {
        int result = RequestId != null ? RequestId.hashCode() : 0;
        result = 31 * result + (CreateTime != null ? CreateTime.hashCode() : 0);
        result = 31 * result + (VpcId != null ? VpcId.hashCode() : 0);
        result = 31 * result + (LoadBalancerState != null ? LoadBalancerState.hashCode() : 0);
        result = 31 * result + (LoadBalancerName != null ? LoadBalancerName.hashCode() : 0);
        result = 31 * result + (Type != null ? Type.hashCode() : 0);
        result = 31 * result + (LoadBalancerId != null ? LoadBalancerId.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyLoadBalancerResult clone() {
        try {
            return (ModifyLoadBalancerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

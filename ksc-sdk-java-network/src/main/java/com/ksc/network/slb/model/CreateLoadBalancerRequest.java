package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateLoadBalancerRequestMarshaller;
import lombok.*;

import java.io.Serializable;

/**
 * Created by LIUHONGMING on 2017/4/21.
 */
@Getter
@Setter
@ToString
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

    /**
     * 项目的ID
     */
    private String ProjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateLoadBalancerRequest that = (CreateLoadBalancerRequest) o;

        if (VpcId != null ? !VpcId.equals(that.VpcId) : that.VpcId != null) return false;
        if (LoadBalancerName != null ? !LoadBalancerName.equals(that.LoadBalancerName) : that.LoadBalancerName != null)
            return false;
        if (Type != null ? !Type.equals(that.Type) : that.Type != null) return false;
        if (SubnetId != null ? !SubnetId.equals(that.SubnetId) : that.SubnetId != null) return false;
        return ProjectId != null ? ProjectId.equals(that.ProjectId) : that.ProjectId == null;
    }

    @Override
    public int hashCode() {
        int result = VpcId != null ? VpcId.hashCode() : 0;
        result = 31 * result + (LoadBalancerName != null ? LoadBalancerName.hashCode() : 0);
        result = 31 * result + (Type != null ? Type.hashCode() : 0);
        result = 31 * result + (SubnetId != null ? SubnetId.hashCode() : 0);
        result = 31 * result + (ProjectId != null ? ProjectId.hashCode() : 0);
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

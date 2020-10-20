package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateLoadBalancerAclEntryRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateLoadBalancerAclEntry.
 * </p>
 */
@Data
public class CreateLoadBalancerAclEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateLoadBalancerAclEntryRequest> {

    /**
     * LoadBalancerAcl的ID
     */
    private String loadBalancerAclId;
    /**
     * LoadBalancerAcl规则的网段
     */
    private String cidrBlock;
    /**
     * LoadBalancerAcl规则优先级，1-32766，数字越小优先级越高，优先级不可重复
     */
    private Integer ruleNumber;
    /**
     * LoadBalancerAcl规则行为，allow为允许，deny为拒绝
     */
    private String ruleAction;
    /**
     * 协议，IP代表所有协议
     */
    private String protocol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateLoadBalancerAclEntryRequest that = (CreateLoadBalancerAclEntryRequest) o;
        if (loadBalancerAclId != null ? !loadBalancerAclId.equals(that.loadBalancerAclId) : that.loadBalancerAclId != null)
            return false;
        if (cidrBlock != null ? !cidrBlock.equals(that.cidrBlock) : that.cidrBlock != null)
            return false;
        if (ruleNumber != null ? !ruleNumber.equals(that.ruleNumber) : that.ruleNumber != null)
            return false;
        if (ruleAction != null ? !ruleAction.equals(that.ruleAction) : that.ruleAction != null)
            return false;
        if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (loadBalancerAclId != null ? loadBalancerAclId.hashCode() : 0);
        result = 31 * result + (cidrBlock != null ? cidrBlock.hashCode() : 0);
        result = 31 * result + (ruleNumber != null ? ruleNumber.hashCode() : 0);
        result = 31 * result + (ruleAction != null ? ruleAction.hashCode() : 0);
        result = 31 * result + (protocol != null ? protocol.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateLoadBalancerAclEntryRequest> getDryRunRequest() {
        Request<CreateLoadBalancerAclEntryRequest> request = new CreateLoadBalancerAclEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateLoadBalancerAclEntryRequest clone() {
        return (CreateLoadBalancerAclEntryRequest) super.clone();
    }
}


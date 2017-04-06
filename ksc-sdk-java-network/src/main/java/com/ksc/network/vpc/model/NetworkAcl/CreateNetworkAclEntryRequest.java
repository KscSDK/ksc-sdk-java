package com.ksc.network.vpc.model.NetworkAcl;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.NetworkAcl.CreateNetworkAclEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.AuthorizeSecurityGroupEntryRequestMarshaller;

/**
 * <p>
 * Contains the parameters for AuthorizeSecurityGroupEntry.
 * </p>
 */
public class CreateNetworkAclEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateNetworkAclEntryRequest> {


    /**
     * ACL规则的描述
     */
    private String Description;

    /**
     * NetworkAcl的ID
     */
    private String NetworkAclId;
    
    /**
     * NetworkAcl规则的网段
     */
    private String CidrBlock;

	/**
	 * NetworkAcl规则优先级，1-32766，数字越小优先级越高，优先级不可重复
	 */
	private Integer RuleNumber;
    
    /**
     * NetworkAcl规则方向，in为入站规则，out为出站规则
     */
    private String Direction;

	/**
	 * NetworkAcl规则行为，allow为允许，deny为拒绝
	 */
	private String RuleAction;
    
    /**
     * 协议，IP代表所有协议
     */
    private String Protocol;
    
    /**
     * ICMP协议，ICMP代码，只有协议为ICMP类型，才必填。
     */
    private Integer IcmpType;
    
    /**
     * ICMP协议，ICMP类型，只有协议为ICMP类型，才必填
     */
    private Integer IcmpCode;
    
    /**
     * TCP或UDP协议的端口规则起始端口，只有协议为TCP\UDP类型，才必填。范围0=65535。
     */
    private Integer PortRangeFrom;
    
    /**
     * TCP或UDP协议的端口规则起始端口，只有协议为TCP\UDP类型，才必填。范围0=65535。
     */
    private Integer PortRangeTo;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    public String getCidrBlock() {
        return CidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        CidrBlock = cidrBlock;
    }

    public Integer getRuleNumber() {
        return RuleNumber;
    }

    public void setRuleNumber(Integer ruleNumber) {
        RuleNumber = ruleNumber;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public String getRuleAction() {
        return RuleAction;
    }

    public void setRuleAction(String ruleAction) {
        RuleAction = ruleAction;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String protocol) {
        Protocol = protocol;
    }

    public Integer getIcmpType() {
        return IcmpType;
    }

    public void setIcmpType(Integer icmpType) {
        IcmpType = icmpType;
    }

    public Integer getIcmpCode() {
        return IcmpCode;
    }

    public void setIcmpCode(Integer icmpCode) {
        IcmpCode = icmpCode;
    }

    public Integer getPortRangeFrom() {
        return PortRangeFrom;
    }

    public void setPortRangeFrom(Integer portRangeFrom) {
        PortRangeFrom = portRangeFrom;
    }

    public Integer getPortRangeTo() {
        return PortRangeTo;
    }

    public void setPortRangeTo(Integer portRangeTo) {
        PortRangeTo = portRangeTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateNetworkAclEntryRequest that = (CreateNetworkAclEntryRequest) o;

        if (!Description.equals(that.Description)) return false;
        if (!NetworkAclId.equals(that.NetworkAclId)) return false;
        if (!CidrBlock.equals(that.CidrBlock)) return false;
        if (!RuleNumber.equals(that.RuleNumber)) return false;
        if (!Direction.equals(that.Direction)) return false;
        if (!RuleAction.equals(that.RuleAction)) return false;
        if (!Protocol.equals(that.Protocol)) return false;
        if (!IcmpType.equals(that.IcmpType)) return false;
        if (!IcmpCode.equals(that.IcmpCode)) return false;
        if (!PortRangeFrom.equals(that.PortRangeFrom)) return false;
        return PortRangeTo.equals(that.PortRangeTo);
    }

    @Override
    public int hashCode() {
        int result = Description.hashCode();
        result = 31 * result + NetworkAclId.hashCode();
        result = 31 * result + CidrBlock.hashCode();
        result = 31 * result + RuleNumber.hashCode();
        result = 31 * result + Direction.hashCode();
        result = 31 * result + RuleAction.hashCode();
        result = 31 * result + Protocol.hashCode();
        result = 31 * result + IcmpType.hashCode();
        result = 31 * result + IcmpCode.hashCode();
        result = 31 * result + PortRangeFrom.hashCode();
        result = 31 * result + PortRangeTo.hashCode();
        return result;
    }

    @Override
    public CreateNetworkAclEntryRequest clone() {
        return (CreateNetworkAclEntryRequest) super.clone();
    }
	
    @Override
    public Request<CreateNetworkAclEntryRequest> getDryRunRequest() {
        Request<CreateNetworkAclEntryRequest> request = new CreateNetworkAclEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}
package com.ksc.network.vpc.model.SecurityGroups;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.SecurityGroups.AuthorizeSecurityGroupEntryRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AuthorizeSecurityGroupEntry.
 * </p>
 */
public class AuthorizeSecurityGroupEntryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AuthorizeSecurityGroupEntryRequest> {

    /**
     * 安全组规则的描述
     */
    private String Description;

    /**
     * 安全组的ID
     */
    private String SecurityGroupId;
    
    /**
     * 安全组规则的网段
     */
    private String CidrBlock;
    
    /**
     * 安全组规则方向，in为入站规则，out为出站规则
     */
    private String Direction;
    
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

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getCidrBlock() {
		return CidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		CidrBlock = cidrBlock;
	}

	public String getDirection() {
		return Direction;
	}

	public void setDirection(String direction) {
		Direction = direction;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((CidrBlock == null) ? 0 : CidrBlock.hashCode());
		result = prime * result
				+ ((Description == null) ? 0 : Description.hashCode());
		result = prime * result
				+ ((Direction == null) ? 0 : Direction.hashCode());
		result = prime * result
				+ ((IcmpCode == null) ? 0 : IcmpCode.hashCode());
		result = prime * result
				+ ((IcmpType == null) ? 0 : IcmpType.hashCode());
		result = prime * result
				+ ((PortRangeFrom == null) ? 0 : PortRangeFrom.hashCode());
		result = prime * result
				+ ((PortRangeTo == null) ? 0 : PortRangeTo.hashCode());
		result = prime * result
				+ ((Protocol == null) ? 0 : Protocol.hashCode());
		result = prime * result
				+ ((SecurityGroupId == null) ? 0 : SecurityGroupId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorizeSecurityGroupEntryRequest other = (AuthorizeSecurityGroupEntryRequest) obj;
		if (CidrBlock == null) {
			if (other.CidrBlock != null)
				return false;
		} else if (!CidrBlock.equals(other.CidrBlock))
			return false;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (Direction == null) {
			if (other.Direction != null)
				return false;
		} else if (!Direction.equals(other.Direction))
			return false;
		if (IcmpCode == null) {
			if (other.IcmpCode != null)
				return false;
		} else if (!IcmpCode.equals(other.IcmpCode))
			return false;
		if (IcmpType == null) {
			if (other.IcmpType != null)
				return false;
		} else if (!IcmpType.equals(other.IcmpType))
			return false;
		if (PortRangeFrom == null) {
			if (other.PortRangeFrom != null)
				return false;
		} else if (!PortRangeFrom.equals(other.PortRangeFrom))
			return false;
		if (PortRangeTo == null) {
			if (other.PortRangeTo != null)
				return false;
		} else if (!PortRangeTo.equals(other.PortRangeTo))
			return false;
		if (Protocol == null) {
			if (other.Protocol != null)
				return false;
		} else if (!Protocol.equals(other.Protocol))
			return false;
		if (SecurityGroupId == null) {
			if (other.SecurityGroupId != null)
				return false;
		} else if (!SecurityGroupId.equals(other.SecurityGroupId))
			return false;
		return true;
	}

	@Override
    public AuthorizeSecurityGroupEntryRequest clone() {
        return (AuthorizeSecurityGroupEntryRequest) super.clone();
    }
	
    @Override
    public Request<AuthorizeSecurityGroupEntryRequest> getDryRunRequest() {
        Request<AuthorizeSecurityGroupEntryRequest> request = new AuthorizeSecurityGroupEntryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }



}
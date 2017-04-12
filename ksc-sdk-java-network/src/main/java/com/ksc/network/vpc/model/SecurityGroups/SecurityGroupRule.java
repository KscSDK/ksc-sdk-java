package com.ksc.network.vpc.model.SecurityGroups;

import lombok.ToString;

@ToString
public class SecurityGroupRule {
	private String Description;

	private String SecurityGroupId;

	private String SecurityGroupEntryId;

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
	 * ICMP协议，ICMP类型，只有协议为ICMP类型，才不可缺省。标准ICMP类型和代码。
	 */
	private Integer IcmpType;
	/**
	 * ICMP协议，ICMP代码，只有协议为ICMP类型，才不可缺省。标准ICMP类型和代码。
	 */
	private Integer IcmpCode;
	
	private Integer PortRangeFrom;

	private Integer PortRangeTo;

	public String getSecurityGroupEntryId() {
		return SecurityGroupEntryId;
	}

	public void setSecurityGroupEntryId(String securityGroupEntryId) {
		SecurityGroupEntryId = securityGroupEntryId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecurityGroupRule that = (SecurityGroupRule) o;

        if (!Description.equals(that.Description)) return false;
        if (!SecurityGroupId.equals(that.SecurityGroupId)) return false;
        if (!SecurityGroupEntryId.equals(that.SecurityGroupEntryId)) return false;
        if (!CidrBlock.equals(that.CidrBlock)) return false;
        if (!Direction.equals(that.Direction)) return false;
        if (!Protocol.equals(that.Protocol)) return false;
        if (!IcmpType.equals(that.IcmpType)) return false;
        if (!IcmpCode.equals(that.IcmpCode)) return false;
        if (!PortRangeFrom.equals(that.PortRangeFrom)) return false;
        return PortRangeTo.equals(that.PortRangeTo);
    }

    @Override
    public int hashCode() {
        int result = Description.hashCode();
        result = 31 * result + SecurityGroupId.hashCode();
        result = 31 * result + SecurityGroupEntryId.hashCode();
        result = 31 * result + CidrBlock.hashCode();
        result = 31 * result + Direction.hashCode();
        result = 31 * result + Protocol.hashCode();
        result = 31 * result + IcmpType.hashCode();
        result = 31 * result + IcmpCode.hashCode();
        result = 31 * result + PortRangeFrom.hashCode();
        result = 31 * result + PortRangeTo.hashCode();
        return result;
    }
}

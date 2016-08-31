package com.ksc.network.vpc.model;

import lombok.ToString;

@ToString
public class SecurityGroupRule {
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
}

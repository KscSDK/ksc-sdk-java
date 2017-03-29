package com.ksc.network.vpc.model.NetworkAcl;

import lombok.ToString;

@ToString
public class NetworkAclEntry {
	private String Description;
	
	private String NetworkAclId;
	
	private String NetworkAclEntryId;
	
	private String CidrBlock;

	private Integer RuleNumber;

	private String Direction;

	private String RuleAction;

	private String Protocol;

	private Integer IcmpType;

	private Integer IcmpCode;

	private Integer PortRangeFrom;

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

	public String getNetworkAclEntryId() {
		return NetworkAclEntryId;
	}

	public void setNetworkAclEntryId(String networkAclEntryId) {
		NetworkAclEntryId = networkAclEntryId;
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
	
}

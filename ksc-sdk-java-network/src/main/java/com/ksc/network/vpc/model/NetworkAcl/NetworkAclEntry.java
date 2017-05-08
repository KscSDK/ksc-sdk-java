package com.ksc.network.vpc.model.NetworkAcl;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class NetworkAclEntry {
	/**
	 * ACL规则的备注
	 */
	private String Description;
	/**
	 * ACL的ID
	 */
	private String NetworkAclId;
	/**
	 * ACL规则ID
	 */
	private String NetworkAclEntryId;
	/**
	 * NetworkAcl规则的网段
	 */
	private String CidrBlock;
	/**
	 * NetworkAcl规则优先级，1-32766，数字越小优先级越高
	 */
	private Integer RuleNumber;
	/**
	 * NetworkAcl规则方向，入站规则（in），出站规则(out)
	 */
	private String Direction;
	/**
	 * NetworkAcl规则行为，接受(allow)，拒绝(deny)
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
	 * ICMP协议，ICMP类型，只有协议为ICMP类型，才必填。
	 */
	private Integer IcmpCode;
	/**
	 * TCP或UDP协议的端口规则起始端口，只有协议为TCP\UDP类型，才必填。范围1-65535。
	 */
	private Integer PortRangeFrom;
	/**
	 * TCP或UDP协议的端口规则结束端口，只有协议为TCP\UDP类型，才必填。范围1-65535。
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

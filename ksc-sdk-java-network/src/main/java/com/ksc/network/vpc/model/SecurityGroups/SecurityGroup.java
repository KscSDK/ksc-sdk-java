package com.ksc.network.vpc.model.SecurityGroups;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class SecurityGroup {
	/**
	 * 安全组的ID
	 */
	private String SecurityGroupId;
	/**
	 * 安全组的名称
	 */
	private String SecurityGroupName;
	/**
	 * 安全组的类型
	 */
	private String SecurityGroupType;
	/**
	 * Vpc的ID
	 */
	private String VpcId;
	/**
	 * 安全组创建时间
	 */
	private String CreateTime;
	/**
	 * 安全组规则的信息
	 */
	private com.ksc.internal.SdkInternalList<SecurityGroupRule> SecurityGroupEntrySet;

	public String getSecurityGroupId() {
		return SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getSecurityGroupName() {
		return SecurityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}

	public String getSecurityGroupType() {
		return SecurityGroupType;
	}

	public void setSecurityGroupType(String securityGroupType) {
		SecurityGroupType = securityGroupType;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public com.ksc.internal.SdkInternalList<SecurityGroupRule> getSecurityGroupEntrySet() {
		return SecurityGroupEntrySet;
	}

	public void setSecurityGroupEntrySet(com.ksc.internal.SdkInternalList<SecurityGroupRule> securityGroupEntrySet) {
		SecurityGroupEntrySet = securityGroupEntrySet;
	}

	public void addSecurityGroupEntrySet(SecurityGroupRule... groupRules) {
		if (SecurityGroupEntrySet == null) {
			SecurityGroupEntrySet = new com.ksc.internal.SdkInternalList<SecurityGroupRule>();
		}
		for (SecurityGroupRule groupRule : groupRules) {
			SecurityGroupEntrySet.add(groupRule);
		}
	}

}

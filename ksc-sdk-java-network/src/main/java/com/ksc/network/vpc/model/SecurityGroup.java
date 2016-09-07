package com.ksc.network.vpc.model;

import lombok.ToString;

@ToString
public class SecurityGroup {

	private String SecurityGroupId;

	private String SecurityGroupName;

	private String SecurityGroupType;

	private String VpcId;

	private String CreateTime;

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

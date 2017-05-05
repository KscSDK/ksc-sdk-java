package com.ksc.network.vpc.model.NetworkInterface;

import lombok.ToString;

@ToString
public class GroupIdentifier {
	private String SecurityGroupId;
	
	private String SecurityGroupName;

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
}

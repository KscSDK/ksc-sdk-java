package com.ksc.network.vpc.model.NetworkInterface;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class GroupIdentifier {
    /**
     * 安全组的ID
     */
    private String SecurityGroupId;
    /**
     * 安全组的名称
     */
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

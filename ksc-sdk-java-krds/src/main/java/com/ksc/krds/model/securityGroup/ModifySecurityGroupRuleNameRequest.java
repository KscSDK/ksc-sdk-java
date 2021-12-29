package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class ModifySecurityGroupRuleNameRequest extends BaseRequest<ModifySecurityGroupRuleNameRequest> {

    private String SecurityGroupId;
    private Integer SecurityGroupRuleId;
    private String SecurityGroupRuleName;

    public Integer getSecurityGroupRuleId() {
        return SecurityGroupRuleId;
    }

    public void setSecurityGroupRuleId(Integer securityGroupRuleId) {
        SecurityGroupRuleId = securityGroupRuleId;
    }

    public String getSecurityGroupRuleName() {
        return SecurityGroupRuleName;
    }

    public void setSecurityGroupRuleName(String securityGroupRuleName) {
        SecurityGroupRuleName = securityGroupRuleName;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

}

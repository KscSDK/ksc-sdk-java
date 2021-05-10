package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class ModifySecurityGroupRuleNameRequest extends BaseRequest<ModifySecurityGroupRuleNameRequest> {

    private String SecurityGroupRuleId;

    private String SecurityGroupRuleName;

    public String getSecurityGroupRuleId() {
        return SecurityGroupRuleId;
    }

    public void setSecurityGroupRuleId(String securityGroupRuleId) {
        SecurityGroupRuleId = securityGroupRuleId;
    }

    public String getSecurityGroupRuleName() {
        return SecurityGroupRuleName;
    }

    public void setSecurityGroupRuleName(String securityGroupRuleName) {
        SecurityGroupRuleName = securityGroupRuleName;
    }
}

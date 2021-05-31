package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class ModifySecurityGroupRuleRequest extends BaseRequest<ModifySecurityGroupRuleRequest> {

    private String SecurityGroupRuleAction;

    private String SecurityGroupId;

    private List<CreateSecurityGroupRequest.SecurityGroupRule> SecurityGroupRule;

    public String getSecurityGroupRuleAction() {
        return SecurityGroupRuleAction;
    }

    public void setSecurityGroupRuleAction(String securityGroupRuleAction) {
        SecurityGroupRuleAction = securityGroupRuleAction;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public List<CreateSecurityGroupRequest.SecurityGroupRule> getSecurityGroupRule() {
        return SecurityGroupRule;
    }

    public void setSecurityGroupRule(List<CreateSecurityGroupRequest.SecurityGroupRule> securityGroupRule) {
        SecurityGroupRule = securityGroupRule;
    }
}

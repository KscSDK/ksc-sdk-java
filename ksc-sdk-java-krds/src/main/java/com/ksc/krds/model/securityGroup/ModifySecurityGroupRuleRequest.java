package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class ModifySecurityGroupRuleRequest extends BaseRequest<ModifySecurityGroupRuleRequest> {

    private String SecurityGroupRuleAction;

    private String SecurityGroupId;

    private List<DescribeSecurityGroupResponse.SecurityGroupRule> SecurityGroupRule;

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

    public List<DescribeSecurityGroupResponse.SecurityGroupRule> getSecurityGroupRule() {
        return SecurityGroupRule;
    }

    public void setSecurityGroupRule(List<DescribeSecurityGroupResponse.SecurityGroupRule> securityGroupRule) {
        SecurityGroupRule = securityGroupRule;
    }
}

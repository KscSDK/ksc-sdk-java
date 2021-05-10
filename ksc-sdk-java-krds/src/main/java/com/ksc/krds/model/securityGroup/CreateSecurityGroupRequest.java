package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class CreateSecurityGroupRequest extends BaseRequest<CreateSecurityGroupRequest> {

    private String SecurityGroupName;
    private String SecurityGroupDescription;
    private List<SecurityGroupRule> SecurityGroupRule;
    private List<String> DBInstanceIdentifier;
    private String Type;
    private String SecurityGroupId;


    public static class SecurityGroupRule {
        private String SecurityGroupRuleProtocol;
        private String SecurityGroupRuleName;

        public String getSecurityGroupRuleProtocol() {
            return SecurityGroupRuleProtocol;
        }

        public void setSecurityGroupRuleProtocol(String securityGroupRuleProtocol) {
            SecurityGroupRuleProtocol = securityGroupRuleProtocol;
        }

        public String getSecurityGroupRuleName() {
            return SecurityGroupRuleName;
        }

        public void setSecurityGroupRuleName(String securityGroupRuleName) {
            SecurityGroupRuleName = securityGroupRuleName;
        }
    }

    public String getSecurityGroupName() {
        return SecurityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        SecurityGroupName = securityGroupName;
    }

    public String getSecurityGroupDescription() {
        return SecurityGroupDescription;
    }

    public void setSecurityGroupDescription(String securityGroupDescription) {
        SecurityGroupDescription = securityGroupDescription;
    }

    public List<CreateSecurityGroupRequest.SecurityGroupRule> getSecurityGroupRule() {
        return SecurityGroupRule;
    }

    public void setSecurityGroupRule(List<CreateSecurityGroupRequest.SecurityGroupRule> securityGroupRule) {
        SecurityGroupRule = securityGroupRule;
    }

    public List<String> getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(List<String> DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }
}

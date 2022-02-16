package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class CreateSecurityGroupRequest extends BaseRequest<CreateSecurityGroupRequest> {

    private String SecurityGroupName;
    private String SecurityGroupDescription;
    private List<SecurityGroupRule> SecurityGroupRule;
    private List<String> DBInstanceIdentifier;
    private String SecurityGroupType;
    
    //for clone security group
    private String SecurityGroupId;

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }


    public static class SecurityGroupRule {

        private String SecurityGroupRuleName;
        private String SecurityGroupRuleCidr;

        //use for modifySecurityGroupRule
        private String SecurityGroupRuleId;

        public String getSecurityGroupRuleId() {
            return SecurityGroupRuleId;
        }

        public void setSecurityGroupRuleId(String securityGroupRuleId) {
            SecurityGroupRuleId = securityGroupRuleId;
        }

        public String getSecurityGroupRuleCidr() {
            return SecurityGroupRuleCidr;
        }

        public void setSecurityGroupRuleCidr(String securityGroupRuleCidr) {
            SecurityGroupRuleCidr = securityGroupRuleCidr;
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

    public String getSecurityGroupType() {
        return SecurityGroupType;
    }

    public void setSecurityGroupType(String securityGroupType) {
        SecurityGroupType = securityGroupType;
    }
}

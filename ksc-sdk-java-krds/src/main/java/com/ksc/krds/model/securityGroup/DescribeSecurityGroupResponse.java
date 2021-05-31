package com.ksc.krds.model.securityGroup;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.InstanceBrief;
import com.ksc.krds.transform.BaseData;

import java.util.ArrayList;
import java.util.List;


public class DescribeSecurityGroupResponse extends KrdsResponse {

    private Data Data = new Data();

    public DescribeSecurityGroupResponse.Data getData() {
        return Data;
    }

    public void setData(DescribeSecurityGroupResponse.Data data) {
        Data = data;
    }

    public class Data extends BaseData {
        private List<SecurityGroup> SecurityGroups = new ArrayList<SecurityGroup>();

        public List<SecurityGroup> getSecurityGroups() {
            return SecurityGroups;
        }

        public void setSecurityGroups(List<SecurityGroup> securityGroups) {
            SecurityGroups = securityGroups;
        }
    }

    public class SecurityGroupRule {
        private String SecurityGroupRuleId;
        private String SecurityGroupRuleName;
        private String SecurityGroupRuleProtocol;
        private String Created;

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

        public String getSecurityGroupRuleProtocol() {
            return SecurityGroupRuleProtocol;
        }

        public void setSecurityGroupRuleProtocol(String securityGroupRuleProtocol) {
            SecurityGroupRuleProtocol = securityGroupRuleProtocol;
        }

        public String getCreated() {
            return Created;
        }

        public void setCreated(String created) {
            Created = created;
        }
    }

    public class SecurityGroup {
        private String SecurityGroupId;
        private String SecurityGroupName;
        private String SecurityGroupDescription;
        private String Created;
        private List<InstanceBrief> Instances = new ArrayList<InstanceBrief>();
        private List<SecurityGroupRule> SecurityGroupRules = new ArrayList<SecurityGroupRule>();

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

        public String getSecurityGroupDescription() {
            return SecurityGroupDescription;
        }

        public void setSecurityGroupDescription(String securityGroupDescription) {
            SecurityGroupDescription = securityGroupDescription;
        }

        public String getCreated() {
            return Created;
        }

        public void setCreated(String created) {
            Created = created;
        }

        public List<InstanceBrief> getInstances() {
            return Instances;
        }

        public void setInstances(List<InstanceBrief> instances) {
            Instances = instances;
        }

        public List<SecurityGroupRule> getSecurityGroupRules() {
            return SecurityGroupRules;
        }

        public void setSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
            SecurityGroupRules = securityGroupRules;
        }

        public String toString(){
            ObjectMapper objectMapper=new ObjectMapper();
            try {
                return  objectMapper.writeValueAsString(this);
            } catch (JsonProcessingException e){
                return null;
            }
        }
    }

}

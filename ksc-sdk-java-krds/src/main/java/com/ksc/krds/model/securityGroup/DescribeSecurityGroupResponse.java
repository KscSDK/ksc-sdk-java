package com.ksc.krds.model.securityGroup;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.krds.model.krdsInstance.InstanceBrief;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DescribeSecurityGroupResponse {

    private Data Data = new Data();
    private String RequestId;

    @Getter
    @Setter
    public class Data {
        private List<SecurityGroup> SecurityGroups = new ArrayList<>();
    }

    @Getter
    @Setter
    public class SecurityGroupRule {
        private String SecurityGroupRuleId;
        private String SecurityGroupRuleName;
        private String SecurityGroupRuleProtocol;
        private String Created;
    }

    @Getter
    @Setter
    public class SecurityGroup {
        private String SecurityGroupId;
        private String SecurityGroupName;
        private String SecurityGroupDescription;
        private String Created;
        private List<InstanceBrief> Instances = new ArrayList<>();
        private List<SecurityGroupRule> SecurityGroupRules = new ArrayList<>();
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

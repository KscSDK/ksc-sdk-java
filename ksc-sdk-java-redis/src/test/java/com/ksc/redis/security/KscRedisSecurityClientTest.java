package com.ksc.redis.security;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisSecurityClient;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.*;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class KscRedisSecurityClientTest {
    private static final Logger log = Logger.getLogger(KscRedisSecurityClientTest.class);
    KscRedisSecurityClient kscRedisSecurityClient;

    @Before
    public void setup() {
        kscRedisSecurityClient = new KscRedisSecurityClient(new BasicAWSCredentials("ak", "sk=="), "az");
        kscRedisSecurityClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void setRedisSecurityRules(){
        SetRedisSecurityRulesRequest setRedisSecurityRulesRequest = new SetRedisSecurityRulesRequest();
        setRedisSecurityRulesRequest.setCacheId("cacheId");
        setRedisSecurityRulesRequest.setSecurityRules(Arrays.asList(new String[]{"0.0.0.0/32"}));
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.setRedisSecurityRules(setRedisSecurityRulesRequest)));
    }

    @Test
    public void listRedisSecurityRules(){
        ListRedisSecurityRulesRequest listRedisSecurityRulesRequest = new ListRedisSecurityRulesRequest();
        listRedisSecurityRulesRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.listRedisSecurityRules(listRedisSecurityRulesRequest)));
    }

    @Test
    public void deleteRedisSecurityRule(){
        DeleteRedisSecurityRuleRequest deleteRedisSecurityRuleRequest = new DeleteRedisSecurityRuleRequest();
        deleteRedisSecurityRuleRequest.setCacheId("cacheId");
        deleteRedisSecurityRuleRequest.setSecurityRuleId("1");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.deleteRedisSecurityRule(deleteRedisSecurityRuleRequest)));
    }

    @Test
    public void createRedisSecurityGroup(){
        CreateRedisSecurityGroupRequest createRedisSecurityGroupRequest = new CreateRedisSecurityGroupRequest();
        createRedisSecurityGroupRequest.setDescription("1111");
        createRedisSecurityGroupRequest.setName("1111");
        createRedisSecurityGroupRequest.setSecurityGroupRules(Arrays.asList(new String[]{"0.0.0.0/32"}));
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.createRedisSecurityGroup(createRedisSecurityGroupRequest)));
    }

    @Test
    public void deleteRedisSecurityGroup(){
        DeleteRedisSecurityGroupRequest deleteRedisSecurityGroupRequest = new DeleteRedisSecurityGroupRequest();
        deleteRedisSecurityGroupRequest.setCacheSecurityGroupId("1");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.deleteRedisSecurityGroup(deleteRedisSecurityGroupRequest)));
    }

    @Test
    public void setRedisSecurityGroup(){
        SetRedisSecurityGroupRequest setRedisSecurityGroupRequest = new SetRedisSecurityGroupRequest();
        setRedisSecurityGroupRequest.setCacheId("cacheId");
        setRedisSecurityGroupRequest.setCacheSecurityGroupId("1");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.setRedisSecurityGroup(setRedisSecurityGroupRequest)));
    }

    @Test
    public void modifyRedisSecurityGroup(){
        ModifyRedisSecurityGroupRequest modifyRedisSecurityGroupRequest = new ModifyRedisSecurityGroupRequest();
        modifyRedisSecurityGroupRequest.setCacheSecurityGroupId("1");
        modifyRedisSecurityGroupRequest.setDescription("test");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.modifyRedisSecurityGroup(modifyRedisSecurityGroupRequest)));
    }

    @Test
    public void deleteRedisSecurityGroupRule(){
        DeleteRedisSecurityGroupRuleRequest deleteRedisSecurityGroupRuleRequest = new DeleteRedisSecurityGroupRuleRequest();
        deleteRedisSecurityGroupRuleRequest.setCacheSecurityGroupId("groupId");
        deleteRedisSecurityGroupRuleRequest.setSecurityRuleId("ruleId");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.deleteRedisSecurityGroupRule(deleteRedisSecurityGroupRuleRequest)));
    }

    @Test
    public void listRedisSecurityGroups(){
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.listRedisSecurityGroups(new ListRedisSecurityGroupsRequest())));
    }
}

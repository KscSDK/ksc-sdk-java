package com.ksc.redis.security;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisSecurityClient;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.AllocateSecurityGroupRequest;
import com.ksc.redis.model.security.CloneSecurityGroupRequest;
import com.ksc.redis.model.security.CreateSecurityGroupRequest;
import com.ksc.redis.model.security.CreateSecurityGroupRuleRequest;
import com.ksc.redis.model.security.DeallocateSecurityGroupRequest;
import com.ksc.redis.model.security.DeleteSecurityGroupRequest;
import com.ksc.redis.model.security.DeleteSecurityGroupRuleRequest;
import com.ksc.redis.model.security.DescribeSecurityGroupRequest;
import com.ksc.redis.model.security.DescribeSecurityGroupsRequest;
import com.ksc.redis.model.security.ModifySecurityGroupRequest;
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
        kscRedisSecurityClient = new KscRedisSecurityClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscRedisSecurityClient.setRegion(RegionUtils.getRegion("region"));
    }
    @Test
    public void createSecurityGroup() {
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setName("testSecSdk");
        request.setDescription("testSecSdk");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.createSecurityGroup(request)));
    }

    @Test
    public void cloneSecurityGroup() {
        CloneSecurityGroupRequest request = new CloneSecurityGroupRequest();
        request.setSrcSecurityGroupId("b88c99c3-0554-43a4-bdf7-42b07c2fe830");
        request.setName("libai_test");
        request.setDescription("libai测试");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.cloneSecurityGroup(request)));
    }

    @Test
    public void deleteSecurityGroup() {
        DeleteSecurityGroupRequest request = new DeleteSecurityGroupRequest();
        request.setSecurityGroupId(Arrays.asList("securityGroupId"));
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.deleteSecurityGroup(request)));
    }

    @Test
    public void modifySecurityGroup() {
        ModifySecurityGroupRequest request = new ModifySecurityGroupRequest();
        request.setSecurityGroupId("b88c99c3-0554-43a4-bdf7-42b07c2fe830");
        request.setName("libai_test");
        request.setDescription("libai测试");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.modifySecurityGroup(request)));
    }

    @Test
    public void describeSecurityGroups() {
        DescribeSecurityGroupsRequest request = new DescribeSecurityGroupsRequest();
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.describeSecurityGroups(request)));
    }

    @Test
    public void describeSecurityGroup() {
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        request.setSecurityGroupId("securityGroupId");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.describeSecurityGroup(request)));
    }

    @Test
    public void allocateSecurityGroup() {
        AllocateSecurityGroupRequest request = new AllocateSecurityGroupRequest();
        request.setCacheId(Arrays.asList("cacheId"));
        request.setSecurityGroupId(Arrays.asList("securityGroupId"));
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.allocateSecurityGroup(request)));
    }

    @Test
    public void deallocateSecurityGroup() {
        DeallocateSecurityGroupRequest request = new DeallocateSecurityGroupRequest();
        request.setCacheId(Arrays.asList("cacheId"));
        request.setSecurityGroupId("securityGroupId");
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.deallocateSecurityGroup(request)));
    }

    @Test
    public void createSecurityGroupRule() {
        CreateSecurityGroupRuleRequest request = new CreateSecurityGroupRuleRequest();
        request.setSecurityGroupId("securityGroupId");
        request.setCidrs(Arrays.asList("172.10.1.0/16", "173.10.1.0/16"));
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.createSecurityGroupRule(request)));
    }

    @Test
    public void deleteSecurityGroupRule() {
        DeleteSecurityGroupRuleRequest request = new DeleteSecurityGroupRuleRequest();
        request.setSecurityGroupId("securityGroupId");
        request.setSecurityGroupRuleId(Arrays.asList("securityGroupRuleId"));
        log.debug(RedisResponseConversion.toJson(kscRedisSecurityClient.deleteSecurityGroupRule(request)));
    }
}

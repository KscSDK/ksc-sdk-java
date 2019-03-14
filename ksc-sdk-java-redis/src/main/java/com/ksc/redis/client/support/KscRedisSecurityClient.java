package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.security.*;
import com.ksc.redis.transform.security.*;

public class KscRedisSecurityClient extends KscRedisClient {
    public KscRedisSecurityClient() {
        super();
    }

    public KscRedisSecurityClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscRedisSecurityClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscRedisSecurityClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscRedisSecurityClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public RedisResponse setRedisSecurityRules(SetRedisSecurityRulesRequest setRedisSecurityRulesRequest) {
        return doAction(new SetRedisSecurityRulesMarshaller().marshall(super.beforeMarshalling(setRedisSecurityRulesRequest)),
                new SetRedisSecurityRulesUnmarshaller()).getKscResponse();
    }

    public RedisResponse<ListRedisSecurityRulesResponse[]> listRedisSecurityRules(ListRedisSecurityRulesRequest listRedisSecurityRulesRequest) {
        return doAction(new ListRedisSecurityRulesMarshaller().marshall(super.beforeMarshalling(listRedisSecurityRulesRequest)),
                new ListRedisSecurityRulesUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteRedisSecurityRule(DeleteRedisSecurityRuleRequest deleteRedisSecurityRuleRequest) {
        return doAction(new DeleteRedisSecurityRuleMarshaller().marshall(super.beforeMarshalling(deleteRedisSecurityRuleRequest)),
                new DeleteRedisSecurityRuleUnmarshaller()).getKscResponse();
    }

    public RedisResponse<CreateRedisSecurityGroupResponse> createRedisSecurityGroup(CreateRedisSecurityGroupRequest createRedisSecurityGroupRequest) {
        return doAction(new CreateRedisSecurityGroupMarshaller().marshall(super.beforeMarshalling(createRedisSecurityGroupRequest)),
                new CreateRedisSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteRedisSecurityGroup(DeleteRedisSecurityGroupRequest deleteRedisSecurityGroupRequest) {
        return doAction(new DeleteRedisSecurityGroupMarshaller().marshall(super.beforeMarshalling(deleteRedisSecurityGroupRequest)),
                new DeleteRedisSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse setRedisSecurityGroup(SetRedisSecurityGroupRequest setRedisSecurityGroupRequest) {
        return doAction(new SetRedisSecurityGroupMarshaller().marshall(super.beforeMarshalling(setRedisSecurityGroupRequest)),
                new SetRedisSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse modifyRedisSecurityGroup(ModifyRedisSecurityGroupRequest modifyRedisSecurityGroupRequest) {
        return doAction(new ModifyRedisSecurityGroupMarshaller().marshall(super.beforeMarshalling(modifyRedisSecurityGroupRequest)),
                new ModifyRedisSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteRedisSecurityGroupRule(DeleteRedisSecurityGroupRuleRequest deleteRedisSecurityGroupRuleRequest) {
        return doAction(new DeleteRedisSecurityGroupRuleMarshaller().marshall(super.beforeMarshalling(deleteRedisSecurityGroupRuleRequest)),
                new DeleteRedisSecurityGroupRuleUnmarshaller()).getKscResponse();
    }

    public RedisResponse<ListRedisSecurityGroupsResponse> listRedisSecurityGroups(ListRedisSecurityGroupsRequest listRedisSecurityGroupsRequest) {
        return doAction(new ListRedisSecurityGroupsMarshaller().marshall(super.beforeMarshalling(listRedisSecurityGroupsRequest)),
                new ListRedisSecurityGroupsUnmarshaller()).getKscResponse();
    }
}

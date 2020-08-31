package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.security.AllocateSecurityGroupRequest;
import com.ksc.redis.model.security.AllocateSecurityGroupResponse;
import com.ksc.redis.model.security.CloneSecurityGroupRequest;
import com.ksc.redis.model.security.CreateSecurityGroupRequest;
import com.ksc.redis.model.security.CreateSecurityGroupResponse;
import com.ksc.redis.model.security.CreateSecurityGroupRuleRequest;
import com.ksc.redis.model.security.DeallocateSecurityGroupRequest;
import com.ksc.redis.model.security.DeleteSecurityGroupRequest;
import com.ksc.redis.model.security.DeleteSecurityGroupResponse;
import com.ksc.redis.model.security.DeleteSecurityGroupRuleRequest;
import com.ksc.redis.model.security.DescribeSecurityGroupRequest;
import com.ksc.redis.model.security.DescribeSecurityGroupResponse;
import com.ksc.redis.model.security.DescribeSecurityGroupsRequest;
import com.ksc.redis.model.security.DescribeSecurityGroupsResponse;
import com.ksc.redis.model.security.ModifySecurityGroupRequest;
import com.ksc.redis.transform.security.AllocateSecurityGroupMarshaller;
import com.ksc.redis.transform.security.AllocateSecurityGroupUnmarshaller;
import com.ksc.redis.transform.security.CloneSecurityGroupMarshaller;
import com.ksc.redis.transform.security.CloneSecurityGroupUnmarshaller;
import com.ksc.redis.transform.security.CreateSecurityGroupMarshaller;
import com.ksc.redis.transform.security.CreateSecurityGroupRuleMarshaller;
import com.ksc.redis.transform.security.CreateSecurityGroupRuleUnmarshaller;
import com.ksc.redis.transform.security.CreateSecurityGroupUnmarshaller;
import com.ksc.redis.transform.security.DeallocateSecurityGroupMarshaller;
import com.ksc.redis.transform.security.DeallocateSecurityGroupUnmarshaller;
import com.ksc.redis.transform.security.DeleteSecurityGroupMarshaller;
import com.ksc.redis.transform.security.DeleteSecurityGroupRuleMarshaller;
import com.ksc.redis.transform.security.DeleteSecurityGroupRuleUnmarshaller;
import com.ksc.redis.transform.security.DeleteSecurityGroupUnmarshaller;
import com.ksc.redis.transform.security.DescribeSecurityGroupMarshaller;
import com.ksc.redis.transform.security.DescribeSecurityGroupUnmarshaller;
import com.ksc.redis.transform.security.DescribeSecurityGroupsMarshaller;
import com.ksc.redis.transform.security.DescribeSecurityGroupsUnmarshaller;
import com.ksc.redis.transform.security.ModifySecurityGroupMarshaller;
import com.ksc.redis.transform.security.ModifySecurityGroupUnmarshaller;

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

    public RedisResponse<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request) {
        return doAction(new CreateSecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new CreateSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse<CreateSecurityGroupResponse> cloneSecurityGroup(CloneSecurityGroupRequest request) {
        return doAction(new CloneSecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new CloneSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse<DeleteSecurityGroupResponse[]> deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return doAction(new DeleteSecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new DeleteSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse modifySecurityGroup(ModifySecurityGroupRequest request) {
        return doAction(new ModifySecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new ModifySecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        return doAction(new DescribeSecurityGroupsMarshaller().marshall(super.beforeMarshalling(request)),
                new DescribeSecurityGroupsUnmarshaller()).getKscResponse();
    }

    public RedisResponse<DescribeSecurityGroupResponse> describeSecurityGroup(DescribeSecurityGroupRequest request) {
        return doAction(new DescribeSecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new DescribeSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse<AllocateSecurityGroupResponse[]> allocateSecurityGroup(AllocateSecurityGroupRequest request) {
        return doAction(new AllocateSecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new AllocateSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse<AllocateSecurityGroupResponse[]> deallocateSecurityGroup(DeallocateSecurityGroupRequest request) {
        return doAction(new DeallocateSecurityGroupMarshaller().marshall(super.beforeMarshalling(request)),
                new DeallocateSecurityGroupUnmarshaller()).getKscResponse();
    }

    public RedisResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return doAction(new CreateSecurityGroupRuleMarshaller().marshall(super.beforeMarshalling(request)),
                new CreateSecurityGroupRuleUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return doAction(new DeleteSecurityGroupRuleMarshaller().marshall(super.beforeMarshalling(request)),
                new DeleteSecurityGroupRuleUnmarshaller()).getKscResponse();
    }
}

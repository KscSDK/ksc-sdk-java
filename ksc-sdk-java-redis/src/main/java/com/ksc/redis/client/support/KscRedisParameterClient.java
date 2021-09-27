package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.parameter.*;
import com.ksc.redis.transform.parameter.*;
import lombok.SneakyThrows;

public class KscRedisParameterClient extends KscRedisClient {
    public KscRedisParameterClient() {
        super();
    }

    public KscRedisParameterClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscRedisParameterClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscRedisParameterClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscRedisParameterClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public RedisResponse<ListRedisParametersResponse[]> listRedisParameters(ListRedisParametersRequest listRedisParametersRequest) {
        return doAction(new ListRedisParametersMarshaller().marshall(super.beforeMarshalling(listRedisParametersRequest)),
                new ListRedisParametersUnmarshaller()).getKscResponse();
    }

    public RedisResponse setRedisParameters(SetRedisParametersRequest setRedisParametersRequest) {
        return doAction(new SetRedisParametersMarshaller().marshall(super.beforeMarshalling(setRedisParametersRequest)),
                new SetRedisParametersUnmarshaller()).getKscResponse();
    }
    /*
     *参数组列表
    */
    public RedisResponse<DescribeCacheParameterGroupsResponse> DescribeCacheParameterGroups(DescribeCacheParameterGroupsRequest req) {
        return doAction(new DescribeCacheParameterGroupsMarshaller().marshall(super.beforeMarshalling(req)),
                new DescribeCacheParameterGroupsUnmarshaller()).getKscResponse();
    }
    /*
    *参数组修改
    */

    @SneakyThrows
    public RedisResponse<ModifyCacheParameterGroupResponse> ModifyCacheParameterGroup(ModifyCacheParameterGroupRequest req)  {
        return doAction(new ModifyCacheParameterGroupMarshaller().marshall(super.beforeMarshalling(req)),
                new ModifyCacheParameterGroupUnmarshaller()).getKscResponse();
    }


}

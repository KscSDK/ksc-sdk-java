package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.instance.*;
import com.ksc.redis.transform.instance.*;

public class KscRedisInstanceClient extends KscRedisClient {
    public KscRedisInstanceClient() {
        super();
    }

    public KscRedisInstanceClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscRedisInstanceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscRedisInstanceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscRedisInstanceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }

    public RedisResponse<CreateRedisResponse> createRedis(CreateRedisRequest createRedisRequest) {
        return doAction(new CreateRedisMarshaller().marshall(super.beforeMarshalling(createRedisRequest)),
                new CreateRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteRedis(DeleteRedisRequest deleteRedisRequest) {
        return doAction(new DeleteRedisMarshaller().marshall(super.beforeMarshalling(deleteRedisRequest)),
                new DeleteRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse resizeRedis(ResizeRedisRequest resizeRedisRequest) {
        return doAction(new ResizeRedisMarshaller().marshall(super.beforeMarshalling(resizeRedisRequest)),
                new ResizeRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse<ListRedisResponse> listRedis(ListRedisRequest listRedisRequest) {
        return doAction(new ListRedisMarshaller().marshall(super.beforeMarshalling(listRedisRequest)),
                new ListRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse<DescribeRedisResponse> describeRedis(DescribeRedisRequest describeRedisRequest) {
        return doAction(new DescribeRedisMarshaller().marshall(super.beforeMarshalling(describeRedisRequest)),
                new DescribeRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse flushRedis(FlushRedisRequest flushRedisRequest) {
        return doAction(new FlushRedisMarshaller().marshall(super.beforeMarshalling(flushRedisRequest)),
                new FlushRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse renameRedis(RenameRedisRequest renameRedisRequest) {
        return doAction(new RenameRedisMarshaller().marshall(super.beforeMarshalling(renameRedisRequest)),
                new RenameRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse createReadOnlyRedis(CreateReadOnlyRedisRequest createReadOnlyRedisRequest) {
        return doAction(new CreateReadOnlyRedisMarshaller().marshall(super.beforeMarshalling(createReadOnlyRedisRequest)),
                new CreateReadOnlyRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse deleteReadOnlyRedis(DeleteReadOnlyRedisRequest deleteReadOnlyRedisRequest) {
        return doAction(new DeleteReadOnlyRedisMarshaller().marshall(super.beforeMarshalling(deleteReadOnlyRedisRequest)),
                new DeleteReadOnlyRedisUnmarshaller()).getKscResponse();
    }

    public RedisResponse<ListReadOnlyRedisResponse[]> listReadOnlyRedis(ListReadOnlyRedisRequest listReadOnlyRedisRequest) {
        return doAction(new ListReadOnlyRedisMarshaller().marshall(super.beforeMarshalling(listReadOnlyRedisRequest)),
                new ListReadOnlyRedisUnmarshaller()).getKscResponse();
    }
}

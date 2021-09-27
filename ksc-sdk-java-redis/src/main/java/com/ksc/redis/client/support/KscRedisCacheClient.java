package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.redis.model.cache.AnalyzeHotKeysRequest;
import com.ksc.redis.model.cache.DescribeHotKeysRequest;
import com.ksc.redis.model.cache.DescribeHotKeysResponse;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsRequest;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsResponse;
import com.ksc.redis.transform.backup.ExportSnapshotMarshaller;
import com.ksc.redis.transform.backup.ExportSnapshotUnmarshaller;
import com.ksc.redis.transform.cache.AnalyzeHotKeysMarshaller;
import com.ksc.redis.transform.cache.AnalyzeHotKeysUnmarshaller;
import com.ksc.redis.transform.cache.DescribeHotKeysMarshaller;
import com.ksc.redis.transform.cache.DescribeHotKeysUnmarshaller;
import com.ksc.redis.transform.parameter.DescribeCacheParameterGroupsMarshaller;
import com.ksc.redis.transform.parameter.DescribeCacheParameterGroupsUnmarshaller;
import lombok.SneakyThrows;

/***
 * @ClassName: KscRedisCacheClient
 * @Description:TODO
 * @version : V1.0
 */
public class KscRedisCacheClient extends KscRedisClient {
    public KscRedisCacheClient() {
        super();
    }

    public KscRedisCacheClient(AWSCredentials awsCredentials, String az) {
        super(awsCredentials, az);
    }

    public KscRedisCacheClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentials, clientConfiguration, az);
    }

    public KscRedisCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        super(awsCredentialsProvider, clientConfiguration, az);
    }

    public KscRedisCacheClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(awsCredentialsProvider, clientConfiguration, requestMetricCollector, az);
    }
    /*
    *  缓存服务热键分析
    */
    @SneakyThrows
    public RedisResponse AnalyzeHotKeys(AnalyzeHotKeysRequest req) {
        return doAction(new AnalyzeHotKeysMarshaller().marshall(super.beforeMarshalling(req)), new AnalyzeHotKeysUnmarshaller()).getKscResponse();
    }
    /*
     *  缓存服务热键分析列表
     */
    @SneakyThrows
    public RedisResponse<DescribeHotKeysResponse> DescribeHotKeys(DescribeHotKeysRequest req) {
        return doAction(new DescribeHotKeysMarshaller().marshall(super.beforeMarshalling(req)),
                new DescribeHotKeysUnmarshaller()).getKscResponse();
    }




}

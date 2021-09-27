package com.ksc.redis.client.support;

import com.ksc.ClientConfiguration;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;

import com.ksc.metrics.RequestMetricCollector;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.redis.model.instance.*;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsRequest;
import com.ksc.redis.transform.backup.ExportSnapshotMarshaller;
import com.ksc.redis.transform.backup.ExportSnapshotUnmarshaller;
import com.ksc.redis.transform.instance.*;
import com.ksc.redis.transform.parameter.DescribeCacheParameterGroupsUnmarshaller;
import lombok.SneakyThrows;

import java.util.List;

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

    public RedisResponse<StatisticDBInstancesResponse> statisticDBInstances(StatisticDBInstancesRequest req) {
        return doAction(new StatisticDBInstancesMarshaller().marshall(super.beforeMarshalling(req)), new StatisticDBInstancesUnmarshaller()).getKscResponse();
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest req) {
        return doAction(new DescribeRegionsMarshaller().marshall(super.beforeMarshalling(req)),
                new DescribeRegionsUnmarshaller()).getKscResponse();
    }

    public DescribeAvailabilityZonesResponse describeAvailabilityZones(DescribeAvailabilityZonesRequest req) {
        return doAction(new DescribeAvailabilityZonesMarshaller().marshall(super.beforeMarshalling(req)),
                new DescribeAvailabilityZonesUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务外网绑定
    */
    public RedisResponse<AllocateEipRequest> AllocateEip(AllocateEipRequest req) {
        return doAction(new AllocateEipMarshaller().marshall(super.beforeMarshalling(req)),
                new AllocateEipUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务外网解绑
     */
    public RedisResponse<DescribeCacheParameterGroupsRequest> DeallocateEip(DeallocateEipRequest req) {
        return doAction(new DeallocateEipMarshaller().marshall(super.beforeMarshalling(req)),
                new DescribeCacheParameterGroupsUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务开启直连
     */
    @SneakyThrows
    public RedisResponse OpenDirectAccessToCluster(DirectAccessToClusterRequest req) {
        return doAction(new OpenDirectAccessToClusterMarshaller().marshall(super.beforeMarshalling(req)),
                new OpenDirectAccessToClusterUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务关闭直连
     */
    @SneakyThrows
    public RedisResponse CloseDirectAccessToCluster(DirectAccessToClusterRequest req) {
        return doAction(new CloseDirectAccessToClusterMarshaller().marshall(super.beforeMarshalling(req)),
                new CloseDirectAccessToClusterUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务锁定
     */
    @SneakyThrows
    public RedisResponse LockCacheCluster(CacheClusterRequest req) {
        return doAction(new LockCacheClusterMarshaller().marshall(super.beforeMarshalling(req)),
                new LockCacheClusterUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务解锁
     */
    @SneakyThrows
    public RedisResponse UnlockCacheCluster(CacheClusterRequest req) {
        return doAction(new UnlockCacheClusterMarshaller().marshall(super.beforeMarshalling(req)),
                new UnlockCacheClusterUnmarshaller()).getKscResponse();
    }
    /*
     *缓存服务详情(指定节点类型)
     */
    public RedisResponse<List<DescribeCacheByRoleResponse>> DescribeCacheByRole(ListRedisRequest request) {
        return doAction(new DescribeCacheByRoleMarshaller().marshall(super.beforeMarshalling(request)),
                new DescribeCacheByRoleUnmarshaller()).getKscResponse();
    }




}

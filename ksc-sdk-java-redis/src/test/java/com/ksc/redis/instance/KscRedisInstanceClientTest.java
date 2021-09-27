package com.ksc.redis.instance;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisInstanceClient;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.*;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class KscRedisInstanceClientTest {
    private static final Logger log = Logger.getLogger(KscRedisInstanceClientTest.class);
    KscRedisInstanceClient kscRedisInstanceClient;

    @Before
    public void setup() {
        kscRedisInstanceClient = new KscRedisInstanceClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscRedisInstanceClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void createRedis() {
        CreateRedisRequest createRedisRequest = new CreateRedisRequest();
        createRedisRequest.setName("libai-test");
        createRedisRequest.setMode(new Byte("2"));
        createRedisRequest.setCapacity(1);
        createRedisRequest.setBillType(5);
        createRedisRequest.setVnetId("e702e2cd-1b2b-4912-9a81-55e9c4a8b9e1");
        createRedisRequest.setVpcId("0bdaf89b-b6e6-4edb-9918-8660667ad5b2");
        //createRedisRequest.setSecurityGroupId("securityGroupId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.createRedis(createRedisRequest)));
    }

    @Test
    public void deleteRedis() {
        DeleteRedisRequest deleteRedisRequest = new DeleteRedisRequest();
        deleteRedisRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.deleteRedis(deleteRedisRequest)));
    }

    @Test
    public void resizeRedis() {
        ResizeRedisRequest resizeRedisRequest = new ResizeRedisRequest();
        resizeRedisRequest.setCapacity(2);
        resizeRedisRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.resizeRedis(resizeRedisRequest)));
    }

    @Test
    public void listRedis() {
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.listRedis(new ListRedisRequest())));
    }

    @Test
    public void describeRedis() {
        DescribeRedisRequest describeRedisRequest = new DescribeRedisRequest();
        describeRedisRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.describeRedis(describeRedisRequest)));
    }

    @Test
    public void flushRedis() {
        FlushRedisRequest flushRedisRequest = new FlushRedisRequest();
        flushRedisRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.flushRedis(flushRedisRequest)));
    }

    @Test
    public void renameRedis() {
        RenameRedisRequest renameRedisRequest = new RenameRedisRequest();
        renameRedisRequest.setCacheId("cacheId");
        renameRedisRequest.setName("name1101");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.renameRedis(renameRedisRequest)));
    }

    @Test
    public void createReadOnlyRedis() {
        CreateReadOnlyRedisRequest createReadOnlyRedisRequest = new CreateReadOnlyRedisRequest();
        createReadOnlyRedisRequest.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.createReadOnlyRedis(createReadOnlyRedisRequest)));
    }

    @Test
    public void deleteReadOnlyRedis() {
        DeleteReadOnlyRedisRequest deleteReadOnlyRedisRequest = new DeleteReadOnlyRedisRequest();
        deleteReadOnlyRedisRequest.setCacheId("cacheId");
        deleteReadOnlyRedisRequest.setNodeId("nodeId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.deleteReadOnlyRedis(deleteReadOnlyRedisRequest)));
    }

    @Test
    public void listReadOnlyRedis() {
        ListReadOnlyRedisRequest listReadOnlyRedisRequest = new ListReadOnlyRedisRequest();
        listReadOnlyRedisRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.listReadOnlyRedis(listReadOnlyRedisRequest)));
    }

    @Test
    public void statisticDBInstances() {
        StatisticDBInstancesRequest request = new StatisticDBInstancesRequest();
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.statisticDBInstances(request)));
    }

    @Test
    public void describeRegions() {
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.describeRegions(request)));
    }

    @Test
    public void describeAvailabilityZones() {
        DescribeAvailabilityZonesRequest request = new DescribeAvailabilityZonesRequest();
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.describeAvailabilityZones(request)));
    }
    /*
     *缓存服务外网绑定
    */
    @Test
    public void AllocateEip(){
        AllocateEipRequest request = new AllocateEipRequest();
        request.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        request.setInsType("1");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.AllocateEip(request)));
    }
    /*
     *缓存服务外网解绑
     */
    @Test
    public void DeallocateEip(){
        DeallocateEipRequest request = new DeallocateEipRequest();
        request.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        request.setInsType("1");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.DeallocateEip(request)));
    }
    /*
     *缓存服务开启直连
     */
    @Test
    public void OpenDirectAccessToCluster(){
        DirectAccessToClusterRequest request = new DirectAccessToClusterRequest();
        request.setCacheId("9338386e-6df7-422e-9b83-ff7bdc598ea4");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.OpenDirectAccessToCluster(request)));
    }
    /*
     *缓存服务关闭直连
     */
    @Test
    public void CloseDirectAccessToCluster(){
        DirectAccessToClusterRequest request = new DirectAccessToClusterRequest();
        request.setCacheId("9338386e-6df7-422e-9b83-ff7bdc598ea4");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.CloseDirectAccessToCluster(request)));
    }
    /*
     *缓存服务锁定
     */
    @Test
    public void LockCacheCluster(){
        CacheClusterRequest request = new CacheClusterRequest();
        request.setCacheId("9338386e-6df7-422e-9b83-ff7bdc598ea4");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.LockCacheCluster(request)));
    }
    /*
     *缓存服务解锁
     */
    @Test
    public void UnlockCacheCluster(){
        CacheClusterRequest request = new CacheClusterRequest();
        request.setCacheId("9338386e-6df7-422e-9b83-ff7bdc598ea4");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.UnlockCacheCluster(request)));
    }
    /*
     *缓存服务详情(制定节点类型)
     */
    @Test
    public void DescribeCacheByRole(){
        ListRedisRequest request = new ListRedisRequest();
        request.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        log.debug(RedisResponseConversion.toJson(kscRedisInstanceClient.DescribeCacheByRole(request)));
    }



}

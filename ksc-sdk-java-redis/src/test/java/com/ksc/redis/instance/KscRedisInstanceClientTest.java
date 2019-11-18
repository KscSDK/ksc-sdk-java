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
        createRedisRequest.setName("name");
        createRedisRequest.setMode(new Byte("2"));
        createRedisRequest.setCapacity(1);
        createRedisRequest.setBillType(5);
        createRedisRequest.setVnetId("vnetId");
        createRedisRequest.setVpcId("vpcId");
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
        createReadOnlyRedisRequest.setCacheId("cacheId");
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
}

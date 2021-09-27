package com.ksc.redis.parameter;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisParameterClient;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsRequest;
import com.ksc.redis.model.parameter.ListRedisParametersRequest;
import com.ksc.redis.model.parameter.ModifyCacheParameterGroupRequest;
import com.ksc.redis.model.parameter.SetRedisParametersRequest;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class KscRedisParameterClientTest {
    private static final Logger log = Logger.getLogger(KscRedisParameterClientTest.class);
    KscRedisParameterClient kscRedisParameterClient;

    @Before
    public void setup() {
        kscRedisParameterClient = new KscRedisParameterClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscRedisParameterClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void listRedisParameters(){
        ListRedisParametersRequest listRedisParametersRequest = new ListRedisParametersRequest();
        listRedisParametersRequest.setCacheId("cacheId");
        log.debug(RedisResponseConversion.toJson(kscRedisParameterClient.listRedisParameters(listRedisParametersRequest)));
    }

    @Test
    public void setRedisParameters(){
        SetRedisParametersRequest setRedisParametersRequest = new SetRedisParametersRequest();
        setRedisParametersRequest.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        setRedisParametersRequest.setParameterName(Arrays.asList(new String[]{"maxmemory-policy","appendfsync", "appendonly"}));
        setRedisParametersRequest.setParameterValue(Arrays.asList(new String[]{"volatile-random", "everysec", "yes"}));
        setRedisParametersRequest.setResetAllParameters(false);
        log.debug(RedisResponseConversion.toJson(kscRedisParameterClient.setRedisParameters(setRedisParametersRequest)));
    }
    /*
     *参数组列表
    */
    @Test
    public void DescribeCacheParameterGroups(){
        DescribeCacheParameterGroupsRequest request = new DescribeCacheParameterGroupsRequest();
        request.setCacheParameterGroupId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        log.debug(RedisResponseConversion.toJson(kscRedisParameterClient.DescribeCacheParameterGroups(request)));
    }
    /*
     *参数组修改
     */
    @Test
    public void ModifyCacheParameterGroup() {
        ModifyCacheParameterGroupRequest request = new ModifyCacheParameterGroupRequest();
        request.setCacheParameterGroupId("9fdc0097-1e63-496a-9c8f-03322977a573");
        request.setParamVersion("4.0");
        request.setParameterName(Arrays.asList(new String[]{"appendfsync", "appendonly"}));
        request.setParameterValue(Arrays.asList(new String[]{"always", "yes"}));
        log.debug(RedisResponseConversion.toJson(kscRedisParameterClient.ModifyCacheParameterGroup(request)));
    }
}

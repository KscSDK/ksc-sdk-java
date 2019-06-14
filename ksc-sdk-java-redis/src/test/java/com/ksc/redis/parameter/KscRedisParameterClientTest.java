package com.ksc.redis.parameter;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisParameterClient;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.parameter.ListRedisParametersRequest;
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
        setRedisParametersRequest.setCacheId("cacheId");
        setRedisParametersRequest.setParameterName(Arrays.asList(new String[]{"maxmemory-policy", "appendonly"}));
        setRedisParametersRequest.setParameterValue(Arrays.asList(new String[]{"volatile-random", "", "yes"}));
        setRedisParametersRequest.setResetAllParameters(false);
        log.debug(RedisResponseConversion.toJson(kscRedisParameterClient.setRedisParameters(setRedisParametersRequest)));
    }
}

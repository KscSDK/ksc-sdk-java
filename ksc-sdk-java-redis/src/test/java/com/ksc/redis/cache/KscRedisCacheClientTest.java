package com.ksc.redis.cache;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.redis.client.support.KscRedisCacheClient;
import com.ksc.redis.client.support.KscRedisInstanceClient;
import com.ksc.redis.instance.KscRedisInstanceClientTest;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.cache.AnalyzeHotKeysRequest;
import com.ksc.redis.model.cache.DescribeHotKeysRequest;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/***
 * @ClassName: KscRedisCacheClientTest
 * @Description:TODO
 * @version : V1.0
 */
public class KscRedisCacheClientTest {
    private static final Logger log = Logger.getLogger(KscRedisInstanceClientTest.class);
    KscRedisCacheClient kscRedisCacheClient;

    @Before
    public void setup() {
        kscRedisCacheClient = new KscRedisCacheClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscRedisCacheClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void AnalyzeHotKeys(){
        AnalyzeHotKeysRequest request = new AnalyzeHotKeysRequest();
        request.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        log.debug(RedisResponseConversion.toJson(kscRedisCacheClient.AnalyzeHotKeys(request)));
    }
    /*
    *  缓存服务热键分析列表
    */
    @Test
    public void DescribeHotKeys(){
        DescribeHotKeysRequest request = new DescribeHotKeysRequest();
        request.setCacheId("2a092a16-d24f-4734-838d-9606a4d8cd47");
        request.setAvailableZone("cn-beijing-6c");
        request.setLimit(2);
        log.debug(RedisResponseConversion.toJson(kscRedisCacheClient.DescribeHotKeys(request)));
    }


}

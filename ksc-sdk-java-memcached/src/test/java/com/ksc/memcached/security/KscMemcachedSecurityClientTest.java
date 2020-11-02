package com.ksc.memcached.security;


import com.ksc.auth.BasicAWSCredentials;
import com.ksc.memcached.client.support.KscMemcachedSecurityClient;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.memcached.model.security.DeleteMemcachedSecurityRuleRequest;
import com.ksc.memcached.model.security.ListMemcachedSecurityRulesRequest;
import com.ksc.memcached.model.security.SetMemcachedSecurityRulesRequest;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class KscMemcachedSecurityClientTest {
    private static final Logger log = Logger.getLogger(KscMemcachedSecurityClientTest.class);
    KscMemcachedSecurityClient kscMemcachedSecurityClient;

    @Before
    public void setup() {
        kscMemcachedSecurityClient = new KscMemcachedSecurityClient(new BasicAWSCredentials("ak", "sk"), "az");
        kscMemcachedSecurityClient.setRegion(RegionUtils.getRegion("region"));
    }

    @Test
    public void setMemcachedSecurityRules(){
        SetMemcachedSecurityRulesRequest setMemcachedSecurityRulesRequest = new SetMemcachedSecurityRulesRequest();
        setMemcachedSecurityRulesRequest.setCacheId("cacheId");
        setMemcachedSecurityRulesRequest.setSecurityRules(Arrays.asList(new String[]{"0.0.0.0/32"}));
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedSecurityClient.setMemcachedSecurityRules(setMemcachedSecurityRulesRequest)));
    }

    @Test
    public void listMemcachedSecurityRules(){
        ListMemcachedSecurityRulesRequest listMemcachedSecurityRulesRequest = new ListMemcachedSecurityRulesRequest();
        listMemcachedSecurityRulesRequest.setCacheId("cacheId");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedSecurityClient.listMemcachedSecurityRules(listMemcachedSecurityRulesRequest)));
    }

    @Test
    public void deleteMemcachedSecurityRule(){
        DeleteMemcachedSecurityRuleRequest deleteMemcachedSecurityRuleRequest = new DeleteMemcachedSecurityRuleRequest();
        deleteMemcachedSecurityRuleRequest.setCacheId("cacheId");
        deleteMemcachedSecurityRuleRequest.setSecurityRuleId("1");
        log.debug(MemcachedResponseConversion.toJson(kscMemcachedSecurityClient.deleteMemcachedSecurityRule(deleteMemcachedSecurityRuleRequest)));
    }
}

package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnDomain;
import com.ksc.cdn.model.domain.CacheConfigRequest;
import com.ksc.cdn.model.enums.CacheRuleTypeEnum;
import com.ksc.cdn.model.enums.DomainStatus;
import com.ksc.cdn.model.domain.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.GetCdnDomainsResult;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * DomainTest
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class DomainTest {
    @Test
    public void testGetCdnDomains(){
        KscCdnClient cdnClient=new KscCdnClient();
        GetCdnDomainsRequest request=new GetCdnDomainsRequest();
        request.setPageNumber(1l);
        request.setPageSize(20l);
        request.setCdnType("download");
        request.setDomainStatus(DomainStatus.ONLINE.getCode());
        request.setDomainName("");
        request.setFuzzyMatch("");
        try {
            GetCdnDomainsResult cdnDomains = cdnClient.getCdnDomains(request);
            Assert.assertNotNull(cdnDomains);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSetCacheRule(){
        KscCdnDomain client=new KscCdnClient();
        CacheConfigRequest request=new CacheConfigRequest();
        request.setDomainId("xxxxx");
        List<CacheConfigRequest.CacheRule> rules=new ArrayList<CacheConfigRequest.CacheRule>();
        CacheConfigRequest.CacheRule rule=new CacheConfigRequest().new CacheRule();
        rule.setCacheRuleType(CacheRuleTypeEnum.FILE_SUFFIX.getValue());
        rule.setCacheTime(10l);
        rule.setValue("sjfksjkfj.jpg");
        rules.add(rule);
        request.setCacheRules(rules);
        try {
            client.setCacheRule(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

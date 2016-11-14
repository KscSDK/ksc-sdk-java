package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnDomain;
import com.ksc.cdn.model.domain.*;
import com.ksc.cdn.model.enums.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DomainTest
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class DomainTest {
    KscCdnDomain client;
    @Before
    public void setup(){
        client=new KscCdnClient();

    }

    /**
     * 域名列表查询
     * @throws Exception
     */
    @Test
    public void testGetCdnDomains() throws Exception{
        GetCdnDomainsRequest request=new GetCdnDomainsRequest();
        request.setPageNumber(1l);
        request.setPageSize(20l);
        request.setCdnType("download");
        request.setDomainStatus(DomainStatus.ONLINE.getCode());
        request.setDomainName("");
        request.setFuzzyMatch("");
        GetCdnDomainsResult cdnDomains = client.getCdnDomains(request);
        Assert.assertTrue(cdnDomains.getDomains().length>0);
    }

    /**
     * 添加缓存规则
     * @throws Exception
     */
    @Test
    public void testSetCacheRule() throws Exception{
        CacheConfigRequest request=new CacheConfigRequest();
        request.setDomainId("2D09QXK");
        List<CacheConfigRequest.CacheRule> rules=new ArrayList<CacheConfigRequest.CacheRule>();
        CacheConfigRequest.CacheRule rule=new CacheConfigRequest().new CacheRule();
        rule.setCacheRuleType(CacheRuleTypeEnum.FILE_SUFFIX.getValue());
        rule.setCacheTime(10l);
        rule.setValue("jpg");
        rules.add(rule);
        request.setCacheRules(rules);
        client.setCacheRule(request);
    }

    /**
     * 添加加速域名
     * @throws Exception
     */
    @Test
    public void testAddDomainBase() throws Exception{
        AddDomainRequest request=new AddDomainRequest();
        request.setDomainName("www.qunar.com");
        request.setCdnType(CdnTypeEnum.download.getValue());
        request.setCdnProtocol(CdnProtocolEnum.HTTP.getValue());
        request.setOriginType("domain");
        request.setOrigin("www.ksyun.com");
        request.setOriginProtocol(CdnProtocolEnum.HTTP.getValue());
        request.setOriginPort(80);
        AddDomainResult addDomainResult = client.addDomainBase(request);
        Assert.assertNotNull(addDomainResult.getDomainId());
        System.out.print(addDomainResult.getDomainId()+"\n");
    }

    /**
     * 查询域名基础信息
     * @throws Exception
     */
    @Test
    public void testGetCdnDomainBasic() throws Exception{
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic("2D09QXH");
        Assert.assertNotNull(cdnDomainBasic.getDomainName());
    }

    /**
     * 更新域名基础信息
     * @throws Exception
     */
    @Test
    public void testUpdateDomainBase() throws Exception{
        ModifyDomainRequest request=new ModifyDomainRequest();
        request.setDomainId("2D09QXH");
        request.setOrigin("www.ks-cdn.com");
        request.setOriginType("domain");
        request.setOriginPort("80");
        client.updateDomainBase(request);
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic("2D09QXH");
        Assert.assertEquals("www.ks-cdn.com",cdnDomainBasic.getOrigin());

    }

    /**
     * 启动停止域名
     * @throws Exception
     */
    @Test
    public void testStartStopCdnDomain() throws Exception {
        /*client.startStopCdnDomain("2D09QXH", ActionTypeEnum.STOP);
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic("2D09QXH");
        Assert.assertEquals("offline",cdnDomainBasic.getDomainStatus());*/
        client.startStopCdnDomain("2D09QXH", ActionTypeEnum.START);
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic("2D09QXH");
        Assert.assertEquals("online",cdnDomainBasic.getDomainStatus());
    }

    /**
     * 查询域名详细配置信息
     * @throws Exception
     */
    @Test
    public void testGetDomainConfigs() throws Exception {
        GetDomainConfigResult domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals("www.qunar.com",domainConfigs.getBackOriginHostConfig().getBackOriginHost());
    }

    /**
     * 设置过滤参数
     * @throws Exception
     */
    @Test
    public void testSetIgnoreQueryStringConfig() throws Exception{
        client.setIgnoreQueryStringConfig("2D09QXH",SwitchEnum.ON);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals(SwitchEnum.ON.getValue(),domainConfigs.getIgnoreQueryStringConfig().getEnable());
        client.setIgnoreQueryStringConfig("2D09QXH",SwitchEnum.OFF);
        domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals(SwitchEnum.OFF.getValue(),domainConfigs.getIgnoreQueryStringConfig().getEnable());
    }

    /**
     * 设置回源 host
     * @throws Exception
     */
    @Test
    public void testSetBackOriginConfig() throws Exception{
        client.setBackOriginConfig("2D09QXH","www.a.qunar.com");
        GetDomainConfigResult domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals("www.a.qunar.com",domainConfigs.getBackOriginHostConfig().getBackOriginHost());
    }

    /**
     * 设置Refer 防盗链
     * @throws Exception
     */
    @Test
    public void testSetReferProtectionConfig() throws Exception {
        ReferProtectionRequest request=new ReferProtectionRequest();
        request.setDomainId("2D09QXH");
        request.setEnable(SwitchEnum.ON.getValue());
        request.setReferType("block");
        request.setReferList("www.baidu.com,www.sina.com");
        client.setReferProtectionConfig(request);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals(SwitchEnum.ON.getValue(),domainConfigs.getReferProtectionConfig().getEnable());
        Assert.assertEquals("www.baidu.com,www.sina.com",domainConfigs.getReferProtectionConfig().getReferList());
    }

    /**
     * 设置测试 url
     * @throws Exception
     */
    @Test
    public void testSetTestUrl() throws Exception{
        client.setTestUrl("2D09QXH","www.qunar.com/index.html");
        GetDomainConfigResult domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals("www.qunar.com/index.html",domainConfigs.getTestUrlConfig().getTestUrl());
    }

    /**
     * 设置高级回源
     * @throws Exception
     */
    @Test
    public void testSetOriginAdvanced() throws Exception{
        OriginAdvancedConfigRequest request=new OriginAdvancedConfigRequest();
        request.setDomainId("2D09QXH");
        request.setEnable(SwitchEnum.ON.getValue());
        request.setOriginType("domain");
        OriginAdvancedConfigRequest.OriginAdvancedItem advancedItems= new OriginAdvancedConfigRequest().new OriginAdvancedItem();
        advancedItems.setOrigin("www.b.qunar.com");
        advancedItems.setOriginLine("default");
        request.setOriginAdvancedItems(Arrays.asList(new OriginAdvancedConfigRequest.OriginAdvancedItem[]{advancedItems}));
        request.setOriginPolicy("rr");
        request.setOriginPolicyBestCount(1l);
        client.setOriginAdvanced(request);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs("2D09QXH");
        Assert.assertEquals(SwitchEnum.ON.getValue(),domainConfigs.getOriginAdvancedConfig().getEnable());
    }

    /**
     * 设置备注信息
     * @throws Exception
     */
    @Test
    public void testSetRemark() throws Exception{
        client.setRemark("2D09QXH","设置备注信息");
    }
}

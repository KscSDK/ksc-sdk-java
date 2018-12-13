package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnDomain;
import com.ksc.cdn.model.domain.createdomain.AddDomainRequest;
import com.ksc.cdn.model.domain.createdomain.AddDomainResult;
import com.ksc.cdn.model.domain.domainbase.GetDomainBaseResult;
import com.ksc.cdn.model.domain.domainbase.ModifyDomainRequest;
import com.ksc.cdn.model.domain.domaincache.CacheConfigRequest;
import com.ksc.cdn.model.domain.domaincache.CacheRule;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsResult;
import com.ksc.cdn.model.domain.domaindetail.*;
import com.ksc.cdn.model.domain.tool.GetServiceIpResult;
import com.ksc.cdn.model.enums.*;
import org.junit.Assert;
import org.junit.Before;
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
    KscCdnDomain client;
    private String domainId;

    @Before
    public void setup() {
        client = new KscCdnClient("ak",
                "sk",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
        /*client=new KscCdnClient("",
                "");*/
        domainId = "2D093GC";

    }


    /**
     * 获取域名当前的服务节点IP列表
     * @throws Exception
     */
    @Test
    public void testGetServiceIp() throws Exception{
    	GetServiceIpResult result = client.getServiceIp(domainId);
    	Assert.assertTrue(result.getDatas().length > 0);
    }




    /**
     * 域名列表查询
     *
     * @throws Exception
     */
    @Test
    public void testGetCdnDomains() throws Exception {
        GetCdnDomainsRequest request = new GetCdnDomainsRequest();
        //设置查询条件,可以多个条件组合查询,也可无查询条件查所有
        request.setPageNumber(1l);
        request.setPageSize(20l);
        request.setCdnType(CdnTypeEnum.video.getValue());
        request.setDomainStatus(DomainStatus.ONLINE.getCode());
        request.setDomainName("");
        request.setFuzzyMatch("");

        GetCdnDomainsResult cdnDomains = client.getCdnDomains(request);
        Assert.assertTrue(cdnDomains.getDomains().length > 0);
    }

    /**
     * 添加缓存规则
     *
     * @throws Exception
     */
    @Test
    public void testSetCacheRule() throws Exception {
        CacheConfigRequest request = new CacheConfigRequest();
        request.setDomainId(domainId);
        //添加缓存规则
        List<CacheRule> rules = new ArrayList<CacheRule>();
        CacheRule rule = new CacheRule();
        rule.setCacheRuleType(CacheRuleTypeEnum.FILE_SUFFIX.getValue());
        rule.setCacheTime(10l);
        rule.setValue("jpg");
        rules.add(rule);
        rule = new CacheRule();
        rule.setCacheRuleType(CacheRuleTypeEnum.DIRECTORY.getValue());
        rule.setCacheTime(100l);
        rule.setValue("/aaa/");
        rules.add(rule);
        request.setCacheRules(rules);

        client.setCacheRule(request);
    }

    /**
     * 添加加速域名
     *
     * @throws Exception
     */
    @Test
    public void testAddDomainBase() throws Exception {
        AddDomainRequest request = new AddDomainRequest();

        request.setDomainName("www.qunar.com");//加速域名
        request.setCdnType(CdnTypeEnum.video.getValue());//加速类型
        request.setCdnProtocol(CdnProtocolEnum.HTTP.getValue());//客户访问边缘节点的协议。默认http
        request.setOriginType(OriginTypeEnum.DOMAIN.getValue());//源站类型
        request.setOrigin("www.ksyun.com");//源站域名
        request.setOriginProtocol(CdnProtocolEnum.HTTP.getValue());//回源协议
        request.setOriginPort(80);//源站域名端口号
        request.setRegions(RegionsEnum.CN.getValue());//加速区域，默认CN， 可以输入多个，以逗号间隔。

        AddDomainResult addDomainResult = client.addDomainBase(request);
        Assert.assertNotNull(addDomainResult.getDomainId());
        System.out.print(addDomainResult.getDomainId() + "\n");
    }

    /**
     * 添加加速域名v2
     *
     * @throws Exception
     */
    @Test
    public void testAddDomainV2Base() throws Exception {
        AddDomainRequest request = new AddDomainRequest();

        request.setDomainName("testv2.qunar.com");//加速域名
        request.setCdnType(CdnTypeEnum.video.getValue());//加速类型
        request.setCdnProtocol(CdnProtocolEnum.HTTP.getValue());//客户访问边缘节点的协议。默认http
        request.setOriginType(OriginTypeEnum.DOMAIN.getValue());//源站类型
        request.setOrigin("www.ksyun.com");//源站域名
        request.setOriginProtocol(CdnProtocolEnum.HTTP.getValue());//回源协议
        request.setOriginPort(80);//源站域名端口号
        request.setRegions(RegionsEnum.CN.getValue());//加速区域，默认CN， 可以输入多个，以逗号间隔。

        AddDomainResult addDomainResult = client.addDomainV2Base(request);
        Assert.assertNotNull(addDomainResult.getDomainId());
        System.out.print(addDomainResult.getDomainId() + "\n");
    }

    /**
     * 查询域名基础信息
     *
     * @throws Exception
     */
    @Test
    public void testGetCdnDomainBasic() throws Exception {
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic(domainId);
        Assert.assertNotNull(cdnDomainBasic.getDomainName());
    }

    /**
     * 更新域名基础信息
     *
     * @throws Exception
     */
    @Test
    public void testUpdateDomainBase() throws Exception {
        ModifyDomainRequest request = new ModifyDomainRequest();
        request.setDomainId(domainId);//待更新的域名id
        request.setOrigin("www.ks-cdn.com");//源站域名
        request.setOriginType(OriginTypeEnum.DOMAIN.getValue());//源站类型
        request.setOriginPort("80");//源站域名端口号

        client.updateDomainBase(request);
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic(domainId);
        Assert.assertEquals("www.ks-cdn.com", cdnDomainBasic.getOrigin());

    }

    /**
     * 启动停止域名
     *
     * @throws Exception
     */
    @Test
    public void testStartStopCdnDomain() throws Exception {
        /*client.startStopCdnDomain("2D09QXH", ActionTypeEnum.STOP);
        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic("2D09QXH");
        Assert.assertEquals("offline",cdnDomainBasic.getDomainStatus());*/
        client.startStopCdnDomain(domainId, ActionTypeEnum.START);

        GetDomainBaseResult cdnDomainBasic = client.getCdnDomainBasic(domainId);
        Assert.assertEquals(DomainStatus.ONLINE.getCode(), cdnDomainBasic.getDomainStatus());
    }

    /**
     * 查询域名详细配置信息
     *
     * @throws Exception
     */
    @Test
    public void testGetDomainConfigs() throws Exception {
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);//查所有配置
        GetDomainConfigResult domainConfigsFilter = client.getDomainConfigs(domainId, new DomainConfigEnum[]{
                DomainConfigEnum.cache_expired, DomainConfigEnum.ip, DomainConfigEnum.ignore_query_string});//查某几项配置

        Assert.assertEquals("www.qunar.com", domainConfigs.getBackOriginHostConfig().getBackOriginHost());
    }

    /**
     * 设置过滤参数
     *
     * @throws Exception
     */
    @Test
    public void testSetIgnoreQueryStringConfig() throws Exception {
        //设置不忽略请求参数
        client.setIgnoreQueryStringConfig(domainId, SwitchEnum.ON);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals(SwitchEnum.ON.getValue(), domainConfigs.getIgnoreQueryStringConfig().getEnable());
        //设置忽略请求参数
        client.setIgnoreQueryStringConfig(domainId, SwitchEnum.OFF);
        domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals(SwitchEnum.OFF.getValue(), domainConfigs.getIgnoreQueryStringConfig().getEnable());
    }

    /**
     * 设置回源 host
     *
     * @throws Exception
     */
    @Test
    public void testSetBackOriginConfig() throws Exception {
        client.setBackOriginConfig(domainId, "www.a.qunar.com");
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals("www.a.qunar.com", domainConfigs.getBackOriginHostConfig().getBackOriginHost());
    }

    /**
     * 设置Refer 防盗链
     *
     * @throws Exception
     */
    @Test
    public void testSetReferProtectionConfig() throws Exception {
        ReferProtectionRequest request = new ReferProtectionRequest();
        request.setDomainId(domainId);//待设置域名id
        request.setEnable(SwitchEnum.ON.getValue());//打开配置
        request.setReferType(ReferTypeEnum.BLOCK.getValue());//设置refer类型
        request.setReferList("www.baidu.com,www.sina.com");//逗号隔开的域名列表

        client.setReferProtectionConfig(request);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals(SwitchEnum.ON.getValue(), domainConfigs.getReferProtectionConfig().getEnable());
        Assert.assertEquals("www.baidu.com,www.sina.com", domainConfigs.getReferProtectionConfig().getReferList());
    }

    /**
     * 设置Ip 防盗链
     *
     * @throws Exception
     */
    @Test
    public void testSetIpProtectionConfig() throws Exception {
        IpProtectionRequest request = new IpProtectionRequest();
        request.setDomainId(domainId);//待设置域名id
        request.setEnable(SwitchEnum.ON.getValue());//打开配置
        request.setIpType(ReferTypeEnum.BLOCK.getValue());//设置refer类型
        request.setIpList("1.1.1.1");//逗号隔开的域名列表

        client.setIpProtectionConfig(request);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals(SwitchEnum.ON.getValue(), domainConfigs.getIpProtectionConfig().getEnable());
        Assert.assertEquals("1.1.1.1", domainConfigs.getIpProtectionConfig().getIpList());
    }

    /**
     * 设置测试 url
     *
     * @throws Exception
     */
    @Test
    public void testSetTestUrl() throws Exception {
        client.setTestUrl(domainId, "www.qunar.com/index.html");
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals("www.qunar.com/index.html", domainConfigs.getTestUrlConfig().getTestUrl());
    }

    /**
     * 设置高级回源
     *
     * @throws Exception
     */
    @Test
    public void testSetOriginAdvanced() throws Exception {
        OriginAdvancedConfigRequest request = new OriginAdvancedConfigRequest();
        request.setDomainId(domainId);//待设置域名id
        request.setEnable(SwitchEnum.ON.getValue());//打开配置
        request.setOriginType(OriginTypeEnum.DOMAIN.getValue());//设置源站类型
        //源站信息
        List<OriginAdvancedItem> items = new ArrayList<OriginAdvancedItem>();
        OriginAdvancedItem advancedItems = new OriginAdvancedItem();
        advancedItems.setOrigin("www.b.qunar.com");//设置回源地址
        advancedItems.setOriginLine(OriginLineEnum.DEFAULT.getValue());//设置源站线路
        items.add(advancedItems);
        advancedItems = new OriginAdvancedItem();
        advancedItems.setOrigin("www.c.qunar.com");
        advancedItems.setOriginLine(OriginLineEnum.CM.getValue());
        items.add(advancedItems);
        request.setOriginAdvancedItems(items);

        request.setOriginPolicy(OriginPolicyEnum.QUALITY.getValue());//设置回源策略 rr: 轮询； quality: 按质量最优的topN来轮询回源
        request.setOriginPolicyBestCount(1l);//当OriginPolicy是quality时，该项必填。取值1-10
        client.setOriginAdvanced(request);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals(SwitchEnum.ON.getValue(), domainConfigs.getOriginAdvancedConfig().getEnable());
    }

    /**
     * 设置备注信息
     *
     * @throws Exception
     */
    @Test
    public void testSetRemark() throws Exception {
        client.setRemark(domainId, "设置备注信息");
    }

    /**
     * 设置单个域名多项配置
     * @throws Exception
     */
    @Test
    public void testSetDomainConfigs() throws Exception{
        AllConfigsRequest request = new AllConfigsRequest();
        request.setDomainId(domainId);
        BackOriginHostConfig backOriginHostConfig = new BackOriginHostConfig();
        backOriginHostConfig.setBackOriginHost("www.baidu.com");
        request.setBackOriginHostConfig(backOriginHostConfig);
        CacheRuleConfig cacheRuleConfig = new CacheRuleConfig();
        CacheRule rule1 = new CacheRule();
        CacheRule rule2 = new CacheRule();
        rule1.setCacheRuleType(CacheRuleTypeEnum.FILE_SUFFIX.getValue());
        rule1.setCacheTime(10l);
        rule1.setValue("jpg");
        rule2.setCacheRuleType(CacheRuleTypeEnum.DIRECTORY.getValue());
        rule2.setCacheTime(100l);
        rule2.setValue("/aaa/");
        cacheRuleConfig.setCacheRules(new CacheRule[]{rule1,rule2});
        request.setCacheRuleConfig(cacheRuleConfig);
        IpProtectionConfig ipProtectionConfig = new IpProtectionConfig();
        ipProtectionConfig.setEnable("on");
        ipProtectionConfig.setIpType("allow");
        ipProtectionConfig.setIpList("123.45.78.13");
        request.setIpProtectionConfig(ipProtectionConfig);
        ReferProtectionConfig referProtectionConfig = new ReferProtectionConfig();
        referProtectionConfig.setEnable("on");
        referProtectionConfig.setReferType("block");
        referProtectionConfig.setReferList("www.baidu.com");
        referProtectionConfig.setAllowEmpty("off");
        request.setReferProtectionConfig(referProtectionConfig);
        IgnoreQueryStringConfig ignoreQueryStringConfig = new IgnoreQueryStringConfig();
        ignoreQueryStringConfig.setEnable("on");
        request.setIgnoreQueryStringConfig(ignoreQueryStringConfig);
        client.setDomainConfigs(request);
    }

    /**
     * 根据源站地址获取域名列表
     * @throws Exception
     */
    @Test
    public void testGetDomainsByOrigin() throws Exception{
        client.getDomainsByOrigin("pie-bj.ks3-cn-beijing.ksyun.com");
    }

    /**
     * 产商CNAME后缀
     * @throws Exception
     */
    @Test
    public void testGetCnameSuffixs() throws Exception{
        client.getCnameSuffixs();
    }

    /**
     * 设置视频拖拽
     * @throws Exception
     */
    @Test
    public void testSetVideoSeekConfig() throws Exception{
        client.setVideoSeekConfig("2D09HG3", SwitchEnum.ON);
    }

    /**
     * 获取视频拖拽信息
     * @throws Exception
     */
    @Test
    public void testGetVideoSeekConfig() throws Exception{
        VideoSeekConfig videoSeekConfig = client.getVideoSeekConfig("2D09HG3");
        Assert.assertEquals(SwitchEnum.ON.getValue(), videoSeekConfig.getEnable());
    }

    /**
     * 设置http响应头
     * @throws Exception
     */
    @Test
    public void testSetHttpHeadersConfig() throws Exception{
        client.setHttpHeadersConfig("2D09HG3",HttpHeaderKeyEnum.Expires,"20");
    }

    /**
     * 删除http响应头
     * @throws Exception
     */
    @Test
    public void testDeleteHttpHeadersConfig() throws Exception{
        client.deleteHttpHeadersConfig("2D09HG3",HttpHeaderKeyEnum.Expires);
    }

    /**
     * 获取http响应头
     * @throws Exception
     */
    @Test
    public void testGetHttpHeaderList() throws Exception{
        HttpHeadersList httpHeaderList = client.getHttpHeaderList("2D09HG3");
        Assert.assertEquals(HttpHeaderKeyEnum.Expires.getValue(), httpHeaderList.getHttpHeadList()[0].getHeaderKey());
    }

    /**
     * 设置Ip 防盗链
     *
     * @throws Exception
     */
    @Test
    public void testSetRequestAuthConfig() throws Exception {
        RequestAuthConfig request = new RequestAuthConfig();
        request.setDomainId(domainId);//待设置域名id
        request.setEnable(SwitchEnum.ON.getValue());//打开配置
        request.setAuthType("typeA");
        request.setKey1("aaaaaa");
        request.setKey2("bbbbbb,cccccc");
        request.setExpirationTime(100L);

        client.setRequestAuthConfig(request);
        GetDomainConfigResult domainConfigs = client.getDomainConfigs(domainId);
        Assert.assertEquals(SwitchEnum.ON.getValue(), domainConfigs.getRequestAuthConfig().getEnable());
        Assert.assertEquals("aaaaaa", domainConfigs.getRequestAuthConfig().getKey1());
    }
}

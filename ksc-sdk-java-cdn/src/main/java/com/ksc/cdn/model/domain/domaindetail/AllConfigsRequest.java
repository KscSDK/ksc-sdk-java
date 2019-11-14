package com.ksc.cdn.model.domain.domaindetail;

/**
 * description：
 * author：ZHOURONG
 * date: 2017/12/7
 * mail：yangxueyi@kingsoft.com
 */
public class AllConfigsRequest {

    private String AccountId;

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    private String DomainId;

    private BackOriginHostConfig backOriginHostConfig;

    private CacheRuleConfig CacheRuleConfig;

    private IpProtectionConfig IpProtectionConfig;

    private ReferProtectionConfig ReferProtectionConfig;

    private IgnoreQueryStringConfig IgnoreQueryStringConfig;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public BackOriginHostConfig getBackOriginHostConfig() {
        return backOriginHostConfig;
    }

    public void setBackOriginHostConfig(BackOriginHostConfig backOriginHostConfig) {
        this.backOriginHostConfig = backOriginHostConfig;
    }

    public CacheRuleConfig getCacheRuleConfig() {
        return CacheRuleConfig;
    }

    public void setCacheRuleConfig(CacheRuleConfig cacheRuleConfig) {
        CacheRuleConfig = cacheRuleConfig;
    }

    public IpProtectionConfig getIpProtectionConfig() {
        return IpProtectionConfig;
    }

    public void setIpProtectionConfig(IpProtectionConfig ipProtectionConfig) {
        IpProtectionConfig = ipProtectionConfig;
    }

    public ReferProtectionConfig getReferProtectionConfig() {
        return ReferProtectionConfig;
    }

    public void setReferProtectionConfig(ReferProtectionConfig referProtectionConfig) {
        ReferProtectionConfig = referProtectionConfig;
    }

    public IgnoreQueryStringConfig getIgnoreQueryStringConfig() {
        return IgnoreQueryStringConfig;
    }

    public void setIgnoreQueryStringConfig(IgnoreQueryStringConfig ignoreQueryStringConfig) {
        IgnoreQueryStringConfig = ignoreQueryStringConfig;
    }
}
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

    public com.ksc.cdn.model.domain.domaindetail.CacheRuleConfig getCacheRuleConfig() {
        return CacheRuleConfig;
    }

    public void setCacheRuleConfig(com.ksc.cdn.model.domain.domaindetail.CacheRuleConfig cacheRuleConfig) {
        CacheRuleConfig = cacheRuleConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.IpProtectionConfig getIpProtectionConfig() {
        return IpProtectionConfig;
    }

    public void setIpProtectionConfig(com.ksc.cdn.model.domain.domaindetail.IpProtectionConfig ipProtectionConfig) {
        IpProtectionConfig = ipProtectionConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.ReferProtectionConfig getReferProtectionConfig() {
        return ReferProtectionConfig;
    }

    public void setReferProtectionConfig(com.ksc.cdn.model.domain.domaindetail.ReferProtectionConfig referProtectionConfig) {
        ReferProtectionConfig = referProtectionConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.IgnoreQueryStringConfig getIgnoreQueryStringConfig() {
        return IgnoreQueryStringConfig;
    }

    public void setIgnoreQueryStringConfig(com.ksc.cdn.model.domain.domaindetail.IgnoreQueryStringConfig ignoreQueryStringConfig) {
        IgnoreQueryStringConfig = ignoreQueryStringConfig;
    }
}
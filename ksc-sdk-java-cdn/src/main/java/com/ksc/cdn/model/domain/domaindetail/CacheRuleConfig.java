package com.ksc.cdn.model.domain.domaindetail;

/**
 * CacheRuleConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class CacheRuleConfig{
    private CacheRules[] CacheRules;

    public CacheRules[] getCacheRules() {
        return CacheRules;
    }

    public void setCacheRules(CacheRules[] cacheRules) {
        CacheRules = cacheRules;
    }
}

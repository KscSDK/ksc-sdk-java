package com.ksc.cdn.model.domain.domaindetail;

import com.ksc.cdn.model.domain.domaincache.CacheRule;

/**
 * CacheRuleConfig
 * 缓存策略设置
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class CacheRuleConfig{
    /**
     * 由CacheRule组成的数组，表示缓存规则列表。
     * 注意：该数组是有序的。
     */
    private CacheRule[] CacheRules;

    public CacheRule[] getCacheRules() {
        return CacheRules;
    }

    public void setCacheRules(CacheRule[] cacheRules) {
        CacheRules = cacheRules;
    }
}

package com.ksc.cdn.model.domain.domaindetail;

/**
 * CacheRules
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class CacheRules{
    private String CacheRuleType;
    private String Value;
    private int CacheTime;
    private String RespectOrigin;
    private String IgnoreNoCache;

    public String getCacheRuleType() {
        return CacheRuleType;
    }

    public void setCacheRuleType(String cacheRuleType) {
        CacheRuleType = cacheRuleType;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public int getCacheTime() {
        return CacheTime;
    }

    public void setCacheTime(int cacheTime) {
        CacheTime = cacheTime;
    }

    public String getRespectOrigin() {
        return RespectOrigin;
    }

    public void setRespectOrigin(String respectOrigin) {
        RespectOrigin = respectOrigin;
    }

    public String getIgnoreNoCache() {
        return IgnoreNoCache;
    }

    public void setIgnoreNoCache(String ignoreNoCache) {
        IgnoreNoCache = ignoreNoCache;
    }
}

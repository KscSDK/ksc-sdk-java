package com.ksc.cdn.model.domain.domaincache;

import com.ksc.cdn.model.valid.FieldValidate;

/**
 * CacheRule
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class CacheRule {
    /**
     * 缓存规则类型
     * @see com.ksc.cdn.model.enums.CacheRuleTypeEnum
     */
    @FieldValidate
    private String CacheRuleType;
    /**
     * 缓存规则的内容，当缓存规则类型为目录时仅允许单条输入，
     * 目录必须以\/开头且以\/结尾；当缓存规则类型为全路径时仅允许单条输入，
     * 全路径需输入完整路径，且必须以\/开头；当缓存规则类型为正则表达式时仅允许单条输入，
     * 且必须输入标准正则表达式；当缓存规则为文件后缀时允许多个输入，
     * 文件后缀必须输入英文文件后缀名，多个文件后缀名以逗号（半角）间隔
     */
    @FieldValidate
    private String Value;
    /**
     * 缓存时间，以秒为单位
     */
    @FieldValidate
    private Long CacheTime;
    /**
     * 是否遵循源站，off表示不遵循，on（默认)表示遵循
     */
    private String RespectOrigin;
    /**
     * 是否忽略源站的no－cache头，on表示忽略，off（默认）表示不忽略。
     */
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

    public Long getCacheTime() {
        return CacheTime;
    }

    public void setCacheTime(Long cacheTime) {
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

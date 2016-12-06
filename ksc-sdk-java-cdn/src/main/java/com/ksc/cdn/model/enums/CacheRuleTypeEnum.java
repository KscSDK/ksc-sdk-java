package com.ksc.cdn.model.enums;


/**
 * Created by CrazyHorse on 9/22/16.
 * 缓存规则类型
 */
public enum CacheRuleTypeEnum {

    FILE_SUFFIX("file_suffix", "文件后缀"),
    DIRECTORY("directory", "目录"),
    EXACT("exact", "全路径"),
    URL_REGEX("url_regex", "正则表达式");

    private String value;

    private String desc;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    CacheRuleTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static CacheRuleTypeEnum getByValue(String value) {
        for (CacheRuleTypeEnum cacheRuleTypeEnum : CacheRuleTypeEnum.values()) {
            if (cacheRuleTypeEnum.getValue().equals(value)) {
                return cacheRuleTypeEnum;
            }
        }
        return null;
    }

}

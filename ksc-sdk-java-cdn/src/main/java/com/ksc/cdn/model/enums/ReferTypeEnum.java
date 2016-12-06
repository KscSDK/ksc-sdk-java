package com.ksc.cdn.model.enums;

/**
 * ReferTypeEnum
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/14
 */
public enum ReferTypeEnum {
    BLOCK("block","黑名单"),
    ALLOW("allow","白名单");

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

    ReferTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

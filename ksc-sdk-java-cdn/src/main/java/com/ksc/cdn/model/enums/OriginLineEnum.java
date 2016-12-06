package com.ksc.cdn.model.enums;

/**
 * OriginLineEnum
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public enum OriginLineEnum {
    DEFAULT("default","默认源"),
    UN("un","联通源"),
    CT("ct","电信源"),
    CM("cm","移动源");

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

    OriginLineEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

package com.ksc.cdn.model.enums;

/**
 * Created by qichao on 2017/10/10.
 */
public enum ProtocolTypeEnum {

    HTTP("http", "http协议"),

    HTTPS("https", "https协议");

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

    ProtocolTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

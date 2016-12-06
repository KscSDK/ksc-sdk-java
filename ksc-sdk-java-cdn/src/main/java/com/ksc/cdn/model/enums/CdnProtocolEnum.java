package com.ksc.cdn.model.enums;

/**
 * CdnProtocolEnum
 * 访问协议
 * @author jiangran@kingsoft.com
 * @date 2016/11/11
 */
public enum  CdnProtocolEnum {

    HTTP("http","http"),
    HTTPFLV("http+flv","http+flv"),
    HLS("hls","hls"),
    RTMP("rtmp","rtmp");

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

    CdnProtocolEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

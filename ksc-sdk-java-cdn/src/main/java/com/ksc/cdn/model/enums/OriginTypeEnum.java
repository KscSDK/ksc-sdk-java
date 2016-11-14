package com.ksc.cdn.model.enums;

/**
 * Created by CrazyHorse on 9/23/16.
 */


/**
 * 回源类型.
 */

public enum OriginTypeEnum {

    IPADDR("ipaddr", "IP源站"),
    DOMAIN("domain", "域名源站"),
    KS3("KS3","KS3为源站"),
    KSVIDEO("ksvideo","金山云视频云源站");


    OriginTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    /**
     * 金山加速类型的value.
     */
    private String value;

    /**
     * 金山加速类型.
     */
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

    public static OriginTypeEnum getByValue(String value) {
        for (OriginTypeEnum originTypeEnum : OriginTypeEnum.values()) {
            if (originTypeEnum.getValue().equals(value)) {
                return originTypeEnum;
            }
        }
        return null;
    }

}

package com.ksc.cdn.model.enums;

/**
 * Created by CrazyHorse on 9/23/16.
 */

import lombok.Getter;

/**
 * 回源类型.
 */
@Getter
public enum OriginTypeEnum {

    /**
     * IP 回源.
     */
    IPADDR("ipaddr", "IP源站"),

    /**
     * 域名回源.
     */
    DOMAIN("domain", "域名源站");


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

    public static OriginTypeEnum getByValue(String value) {
        for (OriginTypeEnum originTypeEnum : OriginTypeEnum.values()) {
            if (originTypeEnum.getValue().equals(value)) {
                return originTypeEnum;
            }
        }
        return null;
    }

}

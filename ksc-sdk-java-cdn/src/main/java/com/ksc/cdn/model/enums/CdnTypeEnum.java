package com.ksc.cdn.model.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * CDN 加速类型
 *
 * @author CrazyHorse
 */
public enum CdnTypeEnum {

    /**
     * 下载业务
     */
    download("download", "download", "下载"),

    /**
     * 直播业务
     */
    live("live", "live", "直播");

    private final String value;
    private final String openApiValue;
    private final String desc;

    CdnTypeEnum(String value, String openApiValue, String desc) {
        this.value = value;
        this.openApiValue = openApiValue;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getValue() {
        return value;
    }

    public String getOpenApiValue() {
        return openApiValue;
    }

    public static CdnTypeEnum getByOpenApiValue(String value) {
        CdnTypeEnum[] values = CdnTypeEnum.values();
        for (CdnTypeEnum cdnTypeEnum : values) {
            if (StringUtils.equals(cdnTypeEnum.getOpenApiValue(), value)) {
                return cdnTypeEnum;
            }
        }
        return null;
    }
}

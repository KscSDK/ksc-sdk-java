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
    download("download", "下载"),
    /**
     * 视频下载业务
     */
    video("video","视频下载"),
    /**
     * 大文件下载业务
     */
    file("file","大文件下载"),
    /**
     * 直播业务
     */
    live("live", "直播");

    private final String value;
    private final String desc;

    CdnTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getValue() {
        return value;
    }


    public static CdnTypeEnum getByOpenApiValue(String value) {
        CdnTypeEnum[] values = CdnTypeEnum.values();
        for (CdnTypeEnum cdnTypeEnum : values) {
            if (StringUtils.equals(cdnTypeEnum.getValue(), value)) {
                return cdnTypeEnum;
            }
        }
        return null;
    }
}

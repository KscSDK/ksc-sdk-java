package com.ksc.cdn.model.enums;

/**
 * Created by chenyiwen on 2017/12/14.
 */
public enum HttpHeaderKeyEnum {

    /**
     * Block type
     */
    ContentType("Content-Type"),
    CacheControl("Cache-Control"),
    ContentDisposition("Content-Disposition"),
    ContentLanguage("Content-Language"),
    Expires("Expires"),
    AccessControlAllowOrigin("Access-Control-Allow-Origin"),
    AccessControlAllowMethods("Access-Control-Allow-Methods"),
    AccessControlMaxAge("Access-Control-Max-Age"),
    AccessControlExposeHeaders("Access-Control-Expose-Headers");

    private String value;

    HttpHeaderKeyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static HttpHeaderKeyEnum getByValue(String value) {
        for (HttpHeaderKeyEnum type : HttpHeaderKeyEnum.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }

}

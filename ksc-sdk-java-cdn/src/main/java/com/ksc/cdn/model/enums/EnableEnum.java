package com.ksc.cdn.model.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * v1.2域名管理cdn类型枚举
 *
 * @author wangwei
 */
public enum EnableEnum {
    on("on", 1),
    off("off", 0);
    private String value;
    private int code;
    /**
     * (0.否,1.是
     */

    private static Map<String, EnableEnum> map = new HashMap<String, EnableEnum>();

    static {
        for (EnableEnum em : EnableEnum.values()) {
            map.put(em.getValue(), em);
        }
    }

    private EnableEnum(String value, int code) {
        this.value = value;
        this.code = code;
    }

    /**
     * 根据枚举的文本值返回对应的枚举实例.
     *
     * @param enumValue 枚举的文本值
     * @return 对应的枚举实例
     */
    public static EnableEnum getByValue(String enumValue) {
        return map.get(enumValue);
    }


    /**
     * 根据枚举文本返回对应的code值.
     *
     * @param cd 枚举的文本值
     * @return 对应的枚举实例
     */
    public static String getValueByCode(Integer cd) {
        if (cd == null) {
            return null;
        }
        for (EnableEnum e : EnableEnum.values()) {
            if (e.code == cd) {
                return e.value;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public int getCode() {
        return code;
    }

}
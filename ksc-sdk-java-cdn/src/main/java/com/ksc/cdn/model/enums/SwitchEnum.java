package com.ksc.cdn.model.enums;

import lombok.Getter;

/**
 * Created by CrazyHorse on 9/22/16.
 */
@Getter
public enum SwitchEnum {

    ON("on", "开"),
    OFF("off", "关");

    private String value;

    private String desc;

    SwitchEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static SwitchEnum value(String value) {
        for (SwitchEnum switchEnum : SwitchEnum.values()) {
            if (switchEnum.getValue().equals(value)) {
                return switchEnum;
            }
        }
        return null;
    }
}

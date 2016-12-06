package com.ksc.cdn.model.enums;


/**
 * Created by CrazyHorse on 9/22/16.
 */
public enum SwitchEnum {

    ON("on", "开"),
    OFF("off", "关");

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

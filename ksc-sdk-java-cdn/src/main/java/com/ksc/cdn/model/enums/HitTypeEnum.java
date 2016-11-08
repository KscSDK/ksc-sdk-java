package com.ksc.cdn.model.enums;


/**
 * Created by CrazyHorse on 24/10/2016.
 */

public enum HitTypeEnum {

    FLOW_HIT_RATE("flowhitrate", "流量命中率"),
    REQ_HIT_RATE("reqhitrate", "请求数命中率");

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

    HitTypeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static HitTypeEnum getByValue(String value) {
        for (HitTypeEnum hitTypeEnum : HitTypeEnum.values()) {
            if (hitTypeEnum.getValue().equals(value)) {
                return hitTypeEnum;
            }
        }
        return null;
    }
}

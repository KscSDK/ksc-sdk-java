package com.ksc.cdn.model.enums;

/**
 * OriginPolicyEnum
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public enum OriginPolicyEnum {
    RR("rr","轮询"),
    QUALITY("quality","按质量最优的topN来轮询回源");

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

    OriginPolicyEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}

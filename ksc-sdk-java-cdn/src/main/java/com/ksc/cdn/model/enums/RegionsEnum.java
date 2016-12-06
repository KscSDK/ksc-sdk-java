package com.ksc.cdn.model.enums;

/**
 * RegionsEnum
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/14
 */
public enum RegionsEnum {
    CN("CN","中国大陆"),
    HK("HK","香港"),
    TW("TW","台湾"),
    AS("AS","亚洲其他"),
    NA("NA","北美洲"),
    EU("EU","欧洲"),
    AU("AU","大洋洲"),
    AF("AF","非洲"),
    SA("SA","南美洲");
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

    RegionsEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}

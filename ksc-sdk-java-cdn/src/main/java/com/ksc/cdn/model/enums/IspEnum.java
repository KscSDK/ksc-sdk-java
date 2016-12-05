package com.ksc.cdn.model.enums;

/**
 * Created by jiangran on 27/10/2016.
 */
public enum IspEnum {

    UN("UN","联通"),
    CM("CM","移动"),
    CT("CT","电信"),
    CTT("CTT","铁通"),
    PBS("PBS","鹏博士"),
    CE("CE","教育网"),
    Other("Other","国内其他"),
    OverseaIsp("OverseaIsp","海外ISP"),
    Unknown("Unknown","未知");

    private String shortName;
    private String fullName;

    IspEnum(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public static IspEnum getIspByShortN(String shortName){
        for (IspEnum ie:IspEnum.values()
             ) {
            if (ie.getShortName().equals(shortName))
                return ie;
        }
        return Unknown;
    }
}

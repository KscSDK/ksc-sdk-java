package com.ksc.cdn.model.enums;

/**
 * Created by jiangran on 27/10/2016.
 */
public enum  AreaEnum {
    beijing("beijing","北京"),
    neimenggu("neimenggu","内蒙古"),
    shanxi("shanxi","山西"),
    hebei("hebei","河北"),
    tianjian("tianjian","天津"),
    ningxia("ningxia","宁夏"),
    shaanxi("shaanxi","陕西"),
    gansu("gansu","甘肃"),
    qinghai("qinghai","青海"),
    xinjiang("xinjiang","新疆"),
    heilongjiang("heilongjiang","黑龙江"),
    jilin("jilin","吉林"),
    liaoning("liaoning","辽宁"),
    fujian("fujian","福建"),
    jiangsu("jiangsu","江苏"),
    anhui("anhui","安徽"),
    shandong("shandong","山东"),
    shanghai("shanghai","上海"),
    zhejiang("zhejiang","浙江"),
    henan("henan","河南"),
    hubei("hubei","湖北"),
    jiangxi("jiangxi","江西"),
    hunan("hunan","湖南"),
    guizhou("guizhou","贵州"),
    yunnan("yunnan","云南"),
    chongqing("chongqing","重庆"),
    sichuan("sichuan","四川"),
    xizang("xizang","西藏"),
    guangdong("guangdong","广东"),
    guangxi("guangxi","广西"),
    hainan("hainan","海南"),
    hongkong("hongkong","香港"),
    macao("macao","澳门"),
    taiwan("taiwan","台湾"),
    oversea("oversea","海外"),
    other("other","其他");

    private String shortName;
    private String fullName;

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    AreaEnum(String shortName, String fullName){
        this.shortName=shortName;
        this.fullName=fullName;
    }
    public static AreaEnum getArea(String name){
        for (AreaEnum ae:AreaEnum.values()
             ) {
            if(ae.getShortName().equals(name)){
                return ae;
            }
        }
        return other;
    }


}

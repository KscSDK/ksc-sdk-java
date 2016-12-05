package com.ksc.cdn.model.enums;

/**
 * Created by jiangran on 9/12/16.
 */
public enum RefreAndLoadType {

    REFREFILE("refreshFile","刷新文件"),
    REFREDIR("refreshDir","刷新目录"),
    PRELOADFILE("preloadFile","预加载");

    private String type;
    private String desc;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private RefreAndLoadType(String type, String desc){
        this.type=type;
        this.desc=desc;
    }
    public static RefreAndLoadType get(String type){
        for (RefreAndLoadType refreAndLoadType:RefreAndLoadType.values()){
            if(refreAndLoadType.getType().equals(type)){
                return refreAndLoadType;
            }
        }
        return null;
    }
}

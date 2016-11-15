package com.ksc.cdn.model.domain.domaindetail;

/**
 * OriginAdvancedConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class OriginAdvancedConfig{
    private String Enable;
    private String OriginType;
    private Object[] OriginAdvancedItems;
    private String OriginPolicy;
    private String OriginPolicyBestCount;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getOriginType() {
        return OriginType;
    }

    public void setOriginType(String originType) {
        OriginType = originType;
    }

    public Object[] getOriginAdvancedItems() {
        return OriginAdvancedItems;
    }

    public void setOriginAdvancedItems(Object[] originAdvancedItems) {
        OriginAdvancedItems = originAdvancedItems;
    }

    public String getOriginPolicy() {
        return OriginPolicy;
    }

    public void setOriginPolicy(String originPolicy) {
        OriginPolicy = originPolicy;
    }

    public String getOriginPolicyBestCount() {
        return OriginPolicyBestCount;
    }

    public void setOriginPolicyBestCount(String originPolicyBestCount) {
        OriginPolicyBestCount = originPolicyBestCount;
    }
}

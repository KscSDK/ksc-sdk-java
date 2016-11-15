package com.ksc.cdn.model.domain.domaindetail;

/**
 * ReferProtectionConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class ReferProtectionConfig{
    private String Enable;
    private String ReferType;
    private String ReferList;
    private String AllowEmpty;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getReferType() {
        return ReferType;
    }

    public void setReferType(String referType) {
        ReferType = referType;
    }

    public String getReferList() {
        return ReferList;
    }

    public void setReferList(String referList) {
        ReferList = referList;
    }

    public String getAllowEmpty() {
        return AllowEmpty;
    }

    public void setAllowEmpty(String allowEmpty) {
        AllowEmpty = allowEmpty;
    }
}

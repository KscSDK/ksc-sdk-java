package com.ksc.cdn.model.domain.domaindetail;

import com.ksc.cdn.model.valid.FieldValidate;

/**
 * ReferProtectionConfig
 *
 * 加速域名的Refer防盗链功能设置，加速域名创建后，默认不开启refer防盗链功能
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class ReferProtectionConfig{

    /**
     * 配置是否开启或关闭 开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。
     * 取值：
     * @see com.ksc.cdn.model.enums.SwitchEnum
     */
    @FieldValidate
    protected String Enable;
    /**
     * refer类型，取值：block：黑名单；allow：白名单，开启后必填
     */
    @FieldValidate
    protected String ReferType;

    /**
     * 逗号隔开的域名列表
     */
    protected String ReferList;
    /**
     * 是否允许空refer访问,取值：on：允许；off：不允许；默认值：on。注：仅当选择白名单时，此项才生效
     */
    protected String AllowEmpty;

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

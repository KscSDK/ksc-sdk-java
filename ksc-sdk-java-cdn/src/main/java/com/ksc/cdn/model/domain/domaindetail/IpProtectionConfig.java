package com.ksc.cdn.model.domain.domaindetail;

import com.ksc.cdn.model.valid.FieldValidate;

/**
 * IpProtectionConfig
 * 加速域名的IP防盗链功能设置，加速域名创建后，默认不开启ip防盗链功能
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class IpProtectionConfig {
    /**
     * 配置是否开启或关闭 开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。
     * 取值：
     *
     * @see com.ksc.cdn.model.enums.SwitchEnum
     */
    @FieldValidate
    protected String Enable;

    /**
     * refer类型，取值：block：黑名单；allow：白名单，开启后必填
     */
    @FieldValidate
    protected String IpType;

    /**
     * 逗号隔开的域名列表
     */
    protected String IpList;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getIpType() {
        return IpType;
    }

    public void setIpType(String ipType) {
        IpType = ipType;
    }

    public String getIpList() {
        return IpList;
    }

    public void setIpList(String ipList) {
        IpList = ipList;
    }
}

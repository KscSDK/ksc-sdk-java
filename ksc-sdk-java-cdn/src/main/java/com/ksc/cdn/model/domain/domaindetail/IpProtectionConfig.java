package com.ksc.cdn.model.domain.domaindetail;

/**
 * IpProtectionConfig
 * 加速域名的IP防盗链功能设置，加速域名创建后，默认不开启ip防盗链功能
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class IpProtectionConfig{
    /**
     * 逗号隔开的域名列表
     */
    private String IpList;

    public String getIpList() {
        return IpList;
    }

    public void setIpList(String ipList) {
        IpList = ipList;
    }
}

package com.ksc.cdn.model.domain.domaindetail;

/**
 * GzipConfig
 * 智能压缩功能设置
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 * https://docs.ksyun.com/documents/6263
 */
public class PageCompressConfig{

    /**
     * 需要接入CDN的域名ID
     */
    private String DomainId;

    /**
     * 配置智能压缩功能的开启或关闭
     * 取值
     * @see com.ksc.cdn.model.enums.SwitchEnum
     */
    private String Enable;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }
}

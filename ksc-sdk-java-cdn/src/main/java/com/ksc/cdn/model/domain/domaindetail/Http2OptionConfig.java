package com.ksc.cdn.model.domain.domaindetail;

/**
 * description：
 * author：ZHOURONG
 * date: 2019/5/10
 * 设置HTTP 2.0
 * https://docs.ksyun.com/documents/6262
 */
public class Http2OptionConfig {

    private String DomainId;

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

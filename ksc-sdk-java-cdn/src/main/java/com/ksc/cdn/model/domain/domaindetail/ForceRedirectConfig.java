package com.ksc.cdn.model.domain.domaindetail;

/**
 * description：
 * author：ZHOURONG
 * date: 2019/5/10
 * 设置强制跳转
 * https://docs.ksyun.com/documents/6191
 */
public class ForceRedirectConfig {

    private String DomainId;

    private String RedirectType;

    public String getRedirectType() {
        return RedirectType;
    }

    public void setRedirectType(String redirectType) {
        RedirectType = redirectType;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }
}

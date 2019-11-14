package com.ksc.cdn.model.domain.domaindetail;

import java.util.List;

/**
 * description：
 * author：ZHOURONG
 * date: 2019/5/10
 * 自定义错误页面
 * https://docs.ksyun.com/documents/6265
 */
public class ErrorPageConfig {

    private String DomainId;

    List<ErrorPages> ErrorPages;

    public List<ErrorPages> getErrorPages() {
        return ErrorPages;
    }

    public void setErrorPages(List<ErrorPages> errorPages) {
        ErrorPages = errorPages;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }
}

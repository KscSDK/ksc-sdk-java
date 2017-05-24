package com.ksc.cdn.model.statistic.province.isp.httpcode;

/**
 * HttpCodeDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class HttpCodeDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * Http状态码
     */
    private HttpCode[] Codes;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public HttpCode[] getCodes() {
        return Codes;
    }

    public void setCodes(HttpCode[] codes) {
        Codes = codes;
    }
}
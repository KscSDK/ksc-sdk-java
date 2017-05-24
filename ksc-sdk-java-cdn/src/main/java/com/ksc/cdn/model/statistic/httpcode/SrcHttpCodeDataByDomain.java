package com.ksc.cdn.model.statistic.httpcode;

/**
 * SrcHttpCodeDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class SrcHttpCodeDataByDomain {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * Http状态码
     */
    private SrcHttpCode[] SrcCodes;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public SrcHttpCode[] getSrcCodes() {
        return SrcCodes;
    }

    public void setSrcCodes(SrcHttpCode[] srcCodes) {
        SrcCodes = srcCodes;
    }
}

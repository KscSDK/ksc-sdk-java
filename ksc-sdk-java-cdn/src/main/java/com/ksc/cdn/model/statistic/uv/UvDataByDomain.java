package com.ksc.cdn.model.statistic.uv;

/**
 * UvDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class UvDataByDomain {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 该域名的独立请求的IP个数
     */
    private Long Uv;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getUv() {
        return Uv;
    }

    public void setUv(Long uv) {
        Uv = uv;
    }
}

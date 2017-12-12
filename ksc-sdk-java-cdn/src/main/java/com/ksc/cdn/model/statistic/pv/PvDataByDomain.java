package com.ksc.cdn.model.statistic.pv;

/**
 * PvDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class PvDataByDomain{
    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 域名
     */
    private String Domain;
    /**
     * 边缘请求数（该域名的边缘请求数，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long Pv;
    /**
     * 回源请求数（该域名的回源请求数，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long SrcPv;
    /**
     * 该域名在每个区域的请求数详细数据
     */
    private PvDataByRegion[] Regions;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public Long getSrcPv() {
        return SrcPv;
    }

    public void setSrcPv(Long srcPv) {
        SrcPv = srcPv;
    }

    public PvDataByRegion[] getRegions() {
        return Regions;
    }

    public void setRegions(PvDataByRegion[] regions) {
        Regions = regions;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }
}

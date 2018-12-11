package com.ksc.cdn.model.statistic.bandwidth;

/**
 * BpsDataByDomain
 * 每个域名的详细带宽数据
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class BpsDataByDomain{
    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 域名
     */
    private String Domain;
    /**
     * 边缘带宽（该域名的边缘带宽，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long Bw;
    /**
     * 回源带宽（该域名的回源带宽，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long SrcBw;
    private BpsDataByRegion[] Regions;

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public Long getSrcBw() {
        return SrcBw;
    }

    public void setSrcBw(Long srcBw) {
        SrcBw = srcBw;
    }

    public BpsDataByRegion[] getRegions() {
        return Regions;
    }

    public void setRegions(BpsDataByRegion[] regions) {
        Regions = regions;
    }
}
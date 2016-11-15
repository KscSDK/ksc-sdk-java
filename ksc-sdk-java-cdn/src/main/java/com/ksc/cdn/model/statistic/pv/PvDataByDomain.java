package com.ksc.cdn.model.statistic.pv;

/**
 * PvDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class PvDataByDomain{
    private String DomainId;
    private Long Pv;
    private Long SrcPv;
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
}

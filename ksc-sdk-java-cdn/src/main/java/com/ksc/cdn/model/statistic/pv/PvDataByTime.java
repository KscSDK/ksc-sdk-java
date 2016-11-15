package com.ksc.cdn.model.statistic.pv;

/**
 * PvDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class PvDataByTime {
    private String Time;
    private Long Pv;
    private Long SrcPv;
    private PvDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
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

    public PvDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(PvDataByDomain[] domains) {
        Domains = domains;
    }
}
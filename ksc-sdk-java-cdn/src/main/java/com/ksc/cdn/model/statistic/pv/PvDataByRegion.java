package com.ksc.cdn.model.statistic.pv;

/**
 * PvDataByRegion
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class PvDataByRegion{
    private String Region;
    private Long Pv;
    private Long SrcPv;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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
}
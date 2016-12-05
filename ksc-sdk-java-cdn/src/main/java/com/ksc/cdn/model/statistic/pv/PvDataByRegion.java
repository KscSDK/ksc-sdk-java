package com.ksc.cdn.model.statistic.pv;

/**
 * PvDataByRegion
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class PvDataByRegion{
    /**
     * 区域
     * 取值
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Region;
    /**
     * 边缘请求数（该域名在该区域的边缘请求数数据）
     */
    private Long Pv;
    /**
     * 回源请求数（该域名在该区域的边缘请求数数据）
     */
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
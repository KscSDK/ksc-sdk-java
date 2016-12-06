package com.ksc.cdn.model.statistic.bandwidth;

/**
 * BpsDataByRegion
 * 该域名在每个区域的带宽
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class BpsDataByRegion{
    /**
     * 区域
     */
    private String Region;
    /**
     * 边缘带宽（该域名在该区域的边缘带宽数据）
     */
    private Long Bw;
    /**
     * 回源带宽（该域名在该区域的回源带宽数据）
     */
    private Long SrcBw;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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
}

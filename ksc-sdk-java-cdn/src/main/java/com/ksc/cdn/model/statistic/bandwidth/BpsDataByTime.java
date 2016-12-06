package com.ksc.cdn.model.statistic.bandwidth;

/**
 * BpsDataByTime
 * 每个时间粒度的带宽数据
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class BpsDataByTime{
    /**
     * 时间点
     */
    private String Time;
    /**
     * 边缘带宽（所选域名合并值）
     */
    private Long Bw;
    /**
     * 回源带宽（所选域名合并值）
     */
    private Long SrcBw;
    private BpsDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
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

    public BpsDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(BpsDataByDomain[] domains) {
        Domains = domains;
    }
}

package com.ksc.cdn.model.statistic.hitrate;

/**
 * HitRateDetailDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HitRateDetailDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 流量命中率（所选域名合并值）
     */
    private Double FlowHitRate;
    /**
     * 请求数命中率（所选域名合并值）
     */
    private Double ReqHitRate;
    /**
     * 每个域名的详细命中率数据(仅当ResultType取值为1时返回此项数据))
     */
    private HitRateDataByDomain[] Domains;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Double getFlowHitRate() {
        return FlowHitRate;
    }

    public void setFlowHitRate(Double flowHitRate) {
        FlowHitRate = flowHitRate;
    }

    public Double getReqHitRate() {
        return ReqHitRate;
    }

    public void setReqHitRate(Double reqHitRate) {
        ReqHitRate = reqHitRate;
    }

    public HitRateDataByDomain[] getDomains() {
        return Domains;
    }

    public void setDomains(HitRateDataByDomain[] domains) {
        Domains = domains;
    }
}
package com.ksc.cdn.model.statistic.hitrate;

/**
 * HitRateDetailDataByTime
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HitRateDetailDataByTime {

    private String Time;

    private Double FlowHitRate;

    private Double ReqHitRate;

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
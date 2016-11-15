package com.ksc.cdn.model.statistic.hitrate;

/**
 * HitRateDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HitRateDataByDomain{
    private String DomainId;

    private Double FlowHitRate;

    private Double ReqHitRate;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
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
}

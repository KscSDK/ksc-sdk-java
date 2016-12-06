package com.ksc.cdn.model.statistic.hitrate;

/**
 * HitRateDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HitRateDataByDomain{
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 流量命中率（该域名的流量命中率）
     */
    private Double FlowHitRate;
    /**
     * 请求数命中率（该域名的请求数命中率
     */
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

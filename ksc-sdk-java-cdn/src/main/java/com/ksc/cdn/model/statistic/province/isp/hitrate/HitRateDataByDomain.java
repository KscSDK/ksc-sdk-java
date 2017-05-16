package com.ksc.cdn.model.statistic.province.isp.hitrate;

/**
 * HitRateDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class HitRateDataByDomain {
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

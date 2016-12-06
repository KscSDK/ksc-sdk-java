package com.ksc.cdn.model.statistic.hitrate;

/**
 * HitRateData
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HitRateData {
    /**
     * Hit状态的访问次数，即边缘请求数-回源请求数
     */
    private Long HitPv;
    /**
     * Miss状态的访问次数，即回源请求数
     */
    private Long MissPv;
    /**
     * Hit状态访问次数占比，即HitPv\/(HitPv+SrcPv)
     */
    private Double HitPvProportion;
    /**
     * Miss状态访问次数占比，即SrcPv\/(HitPv+SrcPv)
     */
    private Double MissPvProportion;
    /**
     * Hit状态的访问流量，即边缘请流量-回源流量
     */
    private Long HitFlow;
    /**
     * Miss状态的访问流量，即回源流量
     */
    private Long MissFlow;
    /**
     * Hit状态访问流量占比，即HitFlow\/(HitFlow+MissFlow)
     */
    private Double HitFlowProportion;
    /**
     * Miss状态访问流量占比，即MissFlow\/(HitFlow+MissFlow)
     */
    private Double MissFlowProportion;

    public Long getHitPv() {
        return HitPv;
    }

    public void setHitPv(Long hitPv) {
        HitPv = hitPv;
    }

    public Long getMissPv() {
        return MissPv;
    }

    public void setMissPv(Long missPv) {
        MissPv = missPv;
    }

    public Double getHitPvProportion() {
        return HitPvProportion;
    }

    public void setHitPvProportion(Double hitPvProportion) {
        HitPvProportion = hitPvProportion;
    }

    public Double getMissPvProportion() {
        return MissPvProportion;
    }

    public void setMissPvProportion(Double missPvProportion) {
        MissPvProportion = missPvProportion;
    }

    public Long getHitFlow() {
        return HitFlow;
    }

    public void setHitFlow(Long hitFlow) {
        HitFlow = hitFlow;
    }

    public Long getMissFlow() {
        return MissFlow;
    }

    public void setMissFlow(Long missFlow) {
        MissFlow = missFlow;
    }

    public Double getHitFlowProportion() {
        return HitFlowProportion;
    }

    public void setHitFlowProportion(Double hitFlowProportion) {
        HitFlowProportion = hitFlowProportion;
    }

    public Double getMissFlowProportion() {
        return MissFlowProportion;
    }

    public void setMissFlowProportion(Double missFlowProportion) {
        MissFlowProportion = missFlowProportion;
    }
}

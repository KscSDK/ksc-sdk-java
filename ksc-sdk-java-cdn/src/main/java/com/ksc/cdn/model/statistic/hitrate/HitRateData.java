package com.ksc.cdn.model.statistic.hitrate;

/**
 * HitRateData
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class HitRateData {

    private Long HitPv;

    private Long MissPv;

    private Double HitPvProportion;

    private Double MissPvProportion;

    private Long HitFlow;

    private Long MissFlow;

    private Double HitFlowProportion;

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

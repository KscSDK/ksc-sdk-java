package com.ksc.cdn.model.statistic;


/**
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateResult {
    private String StartTime;
    private String EndTime;
    private String CdnType;
    private String DomainIds;
    private HitRateData[] Datas;

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public HitRateData[] getDatas() {
        return Datas;
    }

    public void setDatas(HitRateData[] datas) {
        Datas = datas;
    }

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
}

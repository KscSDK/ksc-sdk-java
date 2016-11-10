package com.ksc.cdn.model.statistic;


/**
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateDetailResult extends CommonFieldResult {

    private String HitType;

    private HitRateDetailDataByTime[] Datas;

    public String getHitType() {
        return HitType;
    }

    public void setHitType(String hitType) {
        HitType = hitType;
    }

    public HitRateDetailDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(HitRateDetailDataByTime[] datas) {
        Datas = datas;
    }

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

}

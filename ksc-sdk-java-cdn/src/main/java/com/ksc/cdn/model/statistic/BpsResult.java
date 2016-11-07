package com.ksc.cdn.model.statistic;

/**
 * BpsResult
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class BpsResult extends CommonFieldResult {

    private BpsDataByTime[] Datas;

    public BpsDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(BpsDataByTime[] datas) {
        Datas = datas;
    }

    public class BpsDataByTime{
        private String Time;
        private Long Bw;
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
    public class BpsDataByDomain{
        private String DomainId;
        private Long Bw;
        private Long SrcBw;
        private BpsDataByRegion[] Regions;

        public String getDomainId() {
            return DomainId;
        }

        public void setDomainId(String domainId) {
            DomainId = domainId;
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

        public BpsDataByRegion[] getRegions() {
            return Regions;
        }

        public void setRegions(BpsDataByRegion[] regions) {
            Regions = regions;
        }
    }
    public class BpsDataByRegion{
        private String Region;
        private Long Bw;
        private Long SrcBw;

        public String getRegion() {
            return Region;
        }

        public void setRegion(String region) {
            Region = region;
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
    }
}

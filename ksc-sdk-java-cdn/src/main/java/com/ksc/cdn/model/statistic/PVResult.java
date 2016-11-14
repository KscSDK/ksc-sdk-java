package com.ksc.cdn.model.statistic;


import java.util.List;

/**
 * Created by CrazyHorse on 17/10/2016.
 */
public class PVResult extends CommonFieldResult{

    private PvDataByTime[] Datas;

    public PvDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(PvDataByTime[] datas) {
        Datas = datas;
    }

    public class PvDataByTime {
        private String Time;
        private Long Pv;
        private Long SrcPv;
        private PvDataByDomain[] Domains;

        public String getTime() {
            return Time;
        }

        public void setTime(String time) {
            Time = time;
        }

        public Long getPv() {
            return Pv;
        }

        public void setPv(Long pv) {
            Pv = pv;
        }

        public Long getSrcPv() {
            return SrcPv;
        }

        public void setSrcPv(Long srcPv) {
            SrcPv = srcPv;
        }

        public PvDataByDomain[] getDomains() {
            return Domains;
        }

        public void setDomains(PvDataByDomain[] domains) {
            Domains = domains;
        }
    }
    public class PvDataByDomain{
        private String DomainId;
        private Long Pv;
        private Long SrcPv;
        private PvDataByRegion[] Regions;

        public String getDomainId() {
            return DomainId;
        }

        public void setDomainId(String domainId) {
            DomainId = domainId;
        }

        public Long getPv() {
            return Pv;
        }

        public void setPv(Long pv) {
            Pv = pv;
        }

        public Long getSrcPv() {
            return SrcPv;
        }

        public void setSrcPv(Long srcPv) {
            SrcPv = srcPv;
        }

        public PvDataByRegion[] getRegions() {
            return Regions;
        }

        public void setRegions(PvDataByRegion[] regions) {
            Regions = regions;
        }
    }
    public class PvDataByRegion{
        private String Region;
        private Long Pv;
        private Long SrcPv;

        public String getRegion() {
            return Region;
        }

        public void setRegion(String region) {
            Region = region;
        }

        public Long getPv() {
            return Pv;
        }

        public void setPv(Long pv) {
            Pv = pv;
        }

        public Long getSrcPv() {
            return SrcPv;
        }

        public void setSrcPv(Long srcPv) {
            SrcPv = srcPv;
        }
    }
}

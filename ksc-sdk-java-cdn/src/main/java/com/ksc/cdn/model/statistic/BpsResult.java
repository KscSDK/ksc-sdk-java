package com.ksc.cdn.model.statistic;

/**
 * BpsResult
 * 带宽查询结果
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

    /**
     * 每个时间粒度的带宽数据
     */
    public class BpsDataByTime{
        /**
         * 时间点
         */
        private String Time;
        /**
         * 边缘带宽（所选域名合并值）
         */
        private Long Bw;
        /**
         * 回源带宽（所选域名合并值）
         */
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

    /**
     * 每个域名的详细带宽数据
     */
    public class BpsDataByDomain{
        /**
         * 域名ID
         */
        private String DomainId;
        /**
         * 边缘带宽（该域名的边缘带宽，若选择多个区域，则返回该域名多个区域的数据合并值）
         */
        private Long Bw;
        /**
         * 回源带宽（该域名的回源带宽，若选择多个区域，则返回该域名多个区域的数据合并值）
         */
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

    /**
     * 该域名在每个区域的带宽
     */
    public class BpsDataByRegion{
        /**
         * 区域
         */
        private String Region;
        /**
         * 边缘带宽（该域名在该区域的边缘带宽数据）
         */
        private Long Bw;
        /**
         * 回源带宽（该域名在该区域的回源带宽数据）
         */
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

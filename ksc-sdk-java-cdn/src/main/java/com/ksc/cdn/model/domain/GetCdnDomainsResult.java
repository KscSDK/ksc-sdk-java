package com.ksc.cdn.model.domain;

/**
 * GetCdnDomainsResult
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class GetCdnDomainsResult {
    /**
     * 页码
     */
    private long PageNumber;
    /**
     * 单页大小
     */
    private long PageSize;
    /**
     * 总条数
     */
    private long TotalCount;
    /**
     * Domain列表
     */
    private DomainSummary[] Domains;

    public long getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(long pageNumber) {
        PageNumber = pageNumber;
    }

    public long getPageSize() {
        return PageSize;
    }

    public void setPageSize(long pageSize) {
        PageSize = pageSize;
    }

    public long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(long totalCount) {
        TotalCount = totalCount;
    }

    public DomainSummary[] getDomains() {
        return Domains;
    }

    public void setDomains(DomainSummary[] domains) {
        Domains = domains;
    }

    public class DomainSummary{
        /**
         * 加速域名名称
         */
        private String DomainName;
        /**
         * 域名ID
         */
        private String DomainId;
        /**
         * 加速域名对应的CNAME域名
         */
        private String Cname;
        /**
         * 产品类型，download:下载类加速,live:直播加速
         */
        private String CdnType;
        /**
         * 加速业务产品子类型，若创建加速域名时未设置此项参数，则此处返回参数不显示此项而不是显示为空。
         */
        private String CdnSubType;
        /**
         * ICP备案号
         */
        private String IcpRegistration;
        /**
         * 加速域名状态
         */
        private String DomainStatus;
        /**
         * 加速域名创建时间
         */
        private String CreatedTime;
        /**
         * 加速域名修改时间
         */
        private String ModifiedTime;
        /**
         * 审核失败原因
         */
        private String Description;

        public String getDomainName() {
            return DomainName;
        }

        public void setDomainName(String domainName) {
            DomainName = domainName;
        }

        public String getDomainId() {
            return DomainId;
        }

        public void setDomainId(String domainId) {
            DomainId = domainId;
        }

        public String getCname() {
            return Cname;
        }

        public void setCname(String cname) {
            Cname = cname;
        }

        public String getCdnType() {
            return CdnType;
        }

        public void setCdnType(String cdnType) {
            CdnType = cdnType;
        }

        public String getCdnSubType() {
            return CdnSubType;
        }

        public void setCdnSubType(String cdnSubType) {
            CdnSubType = cdnSubType;
        }

        public String getIcpRegistration() {
            return IcpRegistration;
        }

        public void setIcpRegistration(String icpRegistration) {
            IcpRegistration = icpRegistration;
        }

        public String getDomainStatus() {
            return DomainStatus;
        }

        public void setDomainStatus(String domainStatus) {
            DomainStatus = domainStatus;
        }

        public String getCreatedTime() {
            return CreatedTime;
        }

        public void setCreatedTime(String createdTime) {
            CreatedTime = createdTime;
        }

        public String getModifiedTime() {
            return ModifiedTime;
        }

        public void setModifiedTime(String modifiedTime) {
            ModifiedTime = modifiedTime;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }
    }
}

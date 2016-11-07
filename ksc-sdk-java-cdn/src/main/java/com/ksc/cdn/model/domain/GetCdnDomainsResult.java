package com.ksc.cdn.model.domain;

/**
 * GetCdnDomainsResult
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class GetCdnDomainsResult {
    private long PageNumber;
    private long PageSize;
    private long TotalCount;
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
        private String DomainName;
        private String DomainId;
        private String Cname;
        private String CdnType;
        private String CdnSubType;
        private String IcpRegistration;
        private String DomainStatus;
        private String CreatedTime;
        private String ModifiedTime;
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

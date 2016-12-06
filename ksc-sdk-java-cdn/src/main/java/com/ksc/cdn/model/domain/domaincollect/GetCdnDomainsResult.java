package com.ksc.cdn.model.domain.domaincollect;

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


}

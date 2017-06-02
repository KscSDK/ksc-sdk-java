package com.ksc.cdn.model.log;

/**
 * 获取指定域名的原始访问日志的下载地址。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class DomainLogsResult {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 分页大小
     */
    private Long PageSize;

    /**
     * 取得第几页
     */
    private Long PageNumber;

    /**
     * 日志总条数
     */
    private Long TotalCount;

    /**
     * 日志信息数据
     */
    private DomainLogData[] DomainLogs;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getPageSize() {
        return PageSize;
    }

    public void setPageSize(Long pageSize) {
        PageSize = pageSize;
    }

    public Long getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        PageNumber = pageNumber;
    }

    public Long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Long totalCount) {
        TotalCount = totalCount;
    }

    public DomainLogData[] getDomainLogs() {
        return DomainLogs;
    }

    public void setDomainLogs(DomainLogData[] domainLogs) {
        DomainLogs = domainLogs;
    }
}

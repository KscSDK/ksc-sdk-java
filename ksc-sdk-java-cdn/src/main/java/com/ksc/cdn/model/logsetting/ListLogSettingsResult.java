package com.ksc.cdn.model.logsetting;

/**
 * ListLogSettingsResult
 * 日志查询结果列表
 * @author jiangran@kingsoft.com
 * @date 2016/11/29
 */
@Deprecated
public class ListLogSettingsResult {
    /**
     * 总记录数
     */
    private Integer totalCount;
    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 单页数量
     */
    private Integer pageSize;
    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 详细域名日志信息
     */
    private LogSettingByDomain[] data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public LogSettingByDomain[] getData() {
        return data;
    }

    public void setData(LogSettingByDomain[] data) {
        this.data = data;
    }
}

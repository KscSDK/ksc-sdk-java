package com.ksc.cdn.model.content;

/**
 * 用于获取刷新、预热任务进度百分比及状态，查看任务是否在全网生效。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class RefreshOrPreloadTaskResult {

    /**
     * 分页大小，取值为1-50，最大50，默认20
     */
    private Long PageSize;

    /**
     * 取得第几页，取值为：1-100000，最大100000，默认1
     */
    private Long PageNumber;

    /**
     * Url总条数
     */
    private Long TotalCount;

    /**
     * 刷新或预热任务进度百分比及状态信息
     */
    private UrlData[] Datas;

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

    public UrlData[] getDatas() {
        return Datas;
    }

    public void setDatas(UrlData[] datas) {
        Datas = datas;
    }
}

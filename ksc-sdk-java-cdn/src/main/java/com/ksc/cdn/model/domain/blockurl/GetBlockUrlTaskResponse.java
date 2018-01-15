package com.ksc.cdn.model.domain.blockurl;

import java.util.List;

/**
 * description：屏蔽url查询返回参数
 * author：YANGXUEYI
 * date: 2017/7/18
 * mail：yangxueyi@kingsoft.com
 */
public class GetBlockUrlTaskResponse {

    /**
     * 整页大小
     */
    private Long PageSize;
    /**
     * 页码
     */
    private Long pageNumber;
    /**
     * Url总条数
     */
    private Long TotalCount;
    /**
     * 任务进度百分比及状态信息
     */
    private List<UrlData> Datas;

    public Long getPageSize() {
        return PageSize;
    }

    public void setPageSize(Long pageSize) {
        PageSize = pageSize;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Long totalCount) {
        TotalCount = totalCount;
    }

    public List<UrlData> getDatas() {
        return Datas;
    }

    public void setDatas(List<UrlData> datas) {
        Datas = datas;
    }
}

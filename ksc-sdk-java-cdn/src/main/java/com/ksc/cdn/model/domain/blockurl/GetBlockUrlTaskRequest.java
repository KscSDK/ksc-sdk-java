package com.ksc.cdn.model.domain.blockurl;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * description：屏蔽进度查询参数
 * author：YANGXUEYI
 * date: 2017/7/18
 * mail：yangxueyi@kingsoft.com
 */
public class GetBlockUrlTaskRequest implements GeneralRequest {

    /**
     * Url组成的数组， 支持按Url路径查询，准确匹配
     */
    private List<TaskUrl> Urls;

    /**
     * 分页大小，取值为1-50，最大50，默认20
     */
    private Long PageSize;

    /**
     * 取得第几页，取值为：1-100000，最大100000，默认1
     */
    private Long PageNumber;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetBlockUrlTask", "2016-09-01", "/2016-09-01/content/GetBlockUrlTask");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public List<TaskUrl> getUrls() {
        return Urls;
    }

    public void setUrls(List<TaskUrl> urls) {
        Urls = urls;
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
}

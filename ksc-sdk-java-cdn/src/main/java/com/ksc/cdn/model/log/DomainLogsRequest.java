package com.ksc.cdn.model.log;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取指定域名的原始访问日志的下载地址。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class DomainLogsRequest implements GeneralRequest {

    /**
     * 域名ID，只支持单个域名输入
     */
    private String DomainId;

    /**
     * 查询开始时间，格式yyyy-MM-dd，开始时间和结束时间均不指定时，默认是当天
     */
    private String StartTime;

    /**
     * 查询结束时间，格式yyyy-MM-dd，开始时间和结束时间均不指定时，默认是当天
     */
    private String EndTime;

    /**
     * 分页大小，取值为1-500，最大500，默认50
     */
    private Long PageSize;

    /**
     * 取得第几页，取值为：1-10000，最大10000，默认1
     */
    private Long PageNumber;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetDomainLogs", "2016-09-01", "/2016-09-01/log/GetDomainLogs");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
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

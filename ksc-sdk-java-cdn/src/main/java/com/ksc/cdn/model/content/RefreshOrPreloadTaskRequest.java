package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.Map;

/**
 * 用于获取刷新、预热任务进度百分比及状态，查看任务是否在全网生效。
 * <p>
 * 支持根据任务ID、URL获取数据
 * 支持按指定的起止时间查询，两者需要同时指定
 * 所有参数都不指定，默认查7天内，第一页的数据（20条）
 * 起止时间、TaskId、Url可以同时指定，逻辑与的关系
 * 最多可获取7天内的数据
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class RefreshOrPreloadTaskRequest implements GeneralRequest {

    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    private String StartTime;

    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    private String EndTime;

    /**
     * 支持按任务ID查询，只允许输入单个任务ID
     */
    private String TaskId;

    /**
     * Url组成的数组， 支持按Url路径查询，准确匹配
     */
    private Url[] Urls;

    /**
     * 分页大小，取值为1-50，最大50，默认20
     */
    private Long PageSize;

    /**
     * 取得第几页，取值为：1-100000，最大100000，默认1
     */
    private Long PageNumber;

    /**
     * 任务类别，取值为：refresh，刷新任务；取值为:preload,预热任务
     */
    private String Type;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetRefreshOrPreloadTask", "2016-09-01", "/2016-09-01/content/GetRefreshOrPreloadTask");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
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

    public String getTaskId() {
        return TaskId;
    }

    public void setTaskId(String taskId) {
        TaskId = taskId;
    }

    public Url[] getUrls() {
        return Urls;
    }

    public void setUrls(Url[] urls) {
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

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}

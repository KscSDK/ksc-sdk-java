package com.ksc.cdn.model.statistic.live;

/**
 * LiveCommonFieldResult
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class LiveCommonFieldResult {
    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    private String StartTime;
    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    private String EndTime;
    /**
     * 计费区域名称
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Regions;

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

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }
}

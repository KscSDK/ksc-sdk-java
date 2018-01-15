package com.ksc.cdn.model.log;

/**
 * DomainLogData
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class DomainLogData {

    /**
     * 日志开始时间
     */
    private String StartTime;

    /**
     * 日志结束时间
     */
    private String EndTime;

    /**
     * 日志名称
     */
    private String LogName;

    /**
     * 日志下载地址，30分钟后过期
     */
    private String LogUrl;

    /**
     * 日志大小，单位Byte
     */
    private String LogSize;

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

    public String getLogName() {
        return LogName;
    }

    public void setLogName(String logName) {
        LogName = logName;
    }

    public String getLogUrl() {
        return LogUrl;
    }

    public void setLogUrl(String logUrl) {
        LogUrl = logUrl;
    }

    public String getLogSize() {
        return LogSize;
    }

    public void setLogSize(String logSize) {
        LogSize = logSize;
    }
}

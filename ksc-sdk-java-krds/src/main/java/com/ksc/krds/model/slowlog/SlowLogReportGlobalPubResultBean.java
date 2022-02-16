package com.ksc.krds.model.slowlog;

public class SlowLogReportGlobalPubResultBean {
    private Long reportTime;
    //次数
    private Long reportCount;
    //百分比
    private String percentage;

    public Long getReportTime() {
        return reportTime;
    }

    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

    public Long getReportCount() {
        return reportCount;
    }

    public void setReportCount(Long reportCount) {
        this.reportCount = reportCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}

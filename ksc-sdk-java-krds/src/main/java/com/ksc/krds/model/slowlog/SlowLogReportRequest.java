package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class SlowLogReportRequest extends BaseRequest<SlowLogReportRequest> {

    private String DBInstanceIdentifier;
    private String StartTime;
    private String  EndTime;
    private int Marker;
    private Integer MaxRecords;
    private String SortBy;
    private String SortWay;
    private String HeadKey;
    private String HeadKeySpare;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
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

    public int getMarker() {
        return Marker;
    }

    public void setMarker(int marker) {
        Marker = marker;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }

    public String getSortBy() {
        return SortBy;
    }

    public void setSortBy(String sortBy) {
        SortBy = sortBy;
    }

    public String getSortWay() {
        return SortWay;
    }

    public void setSortWay(String sortWay) {
        SortWay = sortWay;
    }

    public String getHeadKey() {
        return HeadKey;
    }

    public void setHeadKey(String headKey) {
        HeadKey = headKey;
    }

    public String getHeadKeySpare() {
        return HeadKeySpare;
    }

    public void setHeadKeySpare(String headKeySpare) {
        HeadKeySpare = headKeySpare;
    }
}

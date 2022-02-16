package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class SlowLogDetailRequest extends BaseRequest<SlowLogDetailRequest> {

    private String DBInstanceIdentifier;
    private String AccessSqlStatement;
    private String AccessSqlLanguage;
    private String StartTime;
    private String EndTime;
    private Long Marker;
    private Integer MaxRecords;
    private String HeadKey;
    private String QueryTime;
    private String LockTime;
    private String RowsExamined;
    private String RowSent;
    private String SqlExecTimeStamp;
    private String FingerPrint;
    private String SortBy;
    private Integer SortWay;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getAccessSqlStatement() {
        return AccessSqlStatement;
    }

    public void setAccessSqlStatement(String accessSqlStatement) {
        AccessSqlStatement = accessSqlStatement;
    }

    public String getAccessSqlLanguage() {
        return AccessSqlLanguage;
    }

    public void setAccessSqlLanguage(String accessSqlLanguage) {
        AccessSqlLanguage = accessSqlLanguage;
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

    public Long getMarker() {
        return Marker;
    }

    public void setMarker(Long marker) {
        Marker = marker;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }

    public String getHeadKey() {
        return HeadKey;
    }

    public void setHeadKey(String headKey) {
        HeadKey = headKey;
    }

    public String getQueryTime() {
        return QueryTime;
    }

    public void setQueryTime(String queryTime) {
        QueryTime = queryTime;
    }

    public String getLockTime() {
        return LockTime;
    }

    public void setLockTime(String lockTime) {
        LockTime = lockTime;
    }

    public String getRowsExamined() {
        return RowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        RowsExamined = rowsExamined;
    }

    public String getRowSent() {
        return RowSent;
    }

    public void setRowSent(String rowSent) {
        RowSent = rowSent;
    }

    public String getSqlExecTimeStamp() {
        return SqlExecTimeStamp;
    }

    public void setSqlExecTimeStamp(String sqlExecTimeStamp) {
        SqlExecTimeStamp = sqlExecTimeStamp;
    }

    public String getFingerPrint() {
        return FingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        FingerPrint = fingerPrint;
    }

    public String getSortBy() {
        return SortBy;
    }

    public void setSortBy(String sortBy) {
        SortBy = sortBy;
    }

    public Integer getSortWay() {
        return SortWay;
    }

    public void setSortWay(Integer sortWay) {
        SortWay = sortWay;
    }
}

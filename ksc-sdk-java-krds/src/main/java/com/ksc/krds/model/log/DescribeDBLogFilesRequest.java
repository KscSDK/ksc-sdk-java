package com.ksc.krds.model.log;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.Date;

public class DescribeDBLogFilesRequest extends BaseRequest<DescribeDBLogFilesRequest> {

    private String DBInstanceIdentifier;

    private DBLogType DBLogType;

    private Long MaxFileSize;

    private Integer Marker;

    private Date StartTime;

    private Date EndTime;

    private Integer MaxRecords;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public com.ksc.krds.model.log.DBLogType getDBLogType() {
        return DBLogType;
    }

    public void setDBLogType(com.ksc.krds.model.log.DBLogType DBLogType) {
        this.DBLogType = DBLogType;
    }

    public Long getMaxFileSize() {
        return MaxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        MaxFileSize = maxFileSize;
    }

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }
}

package com.ksc.krds.model.log;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DescribeDBLogFilesRequest extends BaseRequest<DescribeDBLogFilesRequest> {

    private String DBInstanceIdentifier;

    private DBLogType DBLogType;

    private Long MaxFileSize;

    private Integer Marker;

    private Date StartTime;

    private Date EndTime;

    private Integer MaxRecords;

    private String SecurityGroupIds;



    private List<String> SecurityGroupIdList = new ArrayList<String>();
    private List<String> SecurityGroupId;
    private String Type;
    public String getSecurityGroupIds() {
        return SecurityGroupIds;
    }

    public void setSecurityGroupIds(String securityGroupIds) {
        SecurityGroupIds = securityGroupIds;
    }

    public List<String> getSecurityGroupIdList() {
        return SecurityGroupIdList;
    }

    public void setSecurityGroupIdList(List<String> securityGroupIdList) {
        SecurityGroupIdList = securityGroupIdList;
    }

    public List<String> getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


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

package com.ksc.krds.model.auditstatistic;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class AuditTemplateRequest extends BaseRequest<AuditTemplateRequest> {

    private String dBInstanceIdentifier;

    private String timeRange;

    private String startTime;

    private String endTime;

    private Integer page;

    private Integer size;

    private String sortBy;

    private Integer sortWay;

    private String dbName;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Integer getSortWay() {
        return sortWay;
    }

    public void setSortWay(Integer sortWay) {
        this.sortWay = sortWay;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}

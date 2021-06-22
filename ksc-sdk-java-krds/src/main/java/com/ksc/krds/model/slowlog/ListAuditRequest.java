package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class ListAuditRequest extends BaseRequest<ListAuditRequest> {

    private String DBInstanceIdentifier;
    private String AccessSqlStatement;
    private String AccessSqlLanguage;
    private String AccessDBName;
    private String SourceIp;
    private String AccessUsername;
    private String AuditBeginTime;
    private String AuditEndTime;
    private String RunResult;
    private Long Marker;
    private Integer MaxRecords;
    private String KeyWord;
    private String ExecTime;
    private String Duration;
    private String UpdateRows;
    private String SortBy;
    private Integer SortWay;
    private String ExportFileds;

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

    public String getAccessDBName() {
        return AccessDBName;
    }

    public void setAccessDBName(String accessDBName) {
        AccessDBName = accessDBName;
    }

    public String getSourceIp() {
        return SourceIp;
    }

    public void setSourceIp(String sourceIp) {
        SourceIp = sourceIp;
    }

    public String getAccessUsername() {
        return AccessUsername;
    }

    public void setAccessUsername(String accessUsername) {
        AccessUsername = accessUsername;
    }

    public String getAuditBeginTime() {
        return AuditBeginTime;
    }

    public void setAuditBeginTime(String auditBeginTime) {
        AuditBeginTime = auditBeginTime;
    }

    public String getAuditEndTime() {
        return AuditEndTime;
    }

    public void setAuditEndTime(String auditEndTime) {
        AuditEndTime = auditEndTime;
    }

    public String getRunResult() {
        return RunResult;
    }

    public void setRunResult(String runResult) {
        RunResult = runResult;
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

    public String getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(String keyWord) {
        KeyWord = keyWord;
    }

    public String getExecTime() {
        return ExecTime;
    }

    public void setExecTime(String execTime) {
        ExecTime = execTime;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getUpdateRows() {
        return UpdateRows;
    }

    public void setUpdateRows(String updateRows) {
        UpdateRows = updateRows;
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

    public String getExportFileds() {
        return ExportFileds;
    }

    public void setExportFileds(String exportFileds) {
        ExportFileds = exportFileds;
    }
}

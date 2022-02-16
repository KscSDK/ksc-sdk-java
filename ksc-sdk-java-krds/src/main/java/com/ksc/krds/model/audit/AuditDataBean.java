package com.ksc.krds.model.audit;

public class AuditDataBean {

    private String Id;
    private String InstanceId;
    private String AccessUsername;
    private String SourceIp;
    private String AccessSqlExt;
    private String AccessSqlStatement;
    private String AccessSqlLanguage;
    private String AccessDBName;
    private Integer SourcePort;
    private Boolean RunResult;
    private Long Timestamp;
    private Long ExecTime;
    private Long TotalCount;
    private Integer Limit;
    private Long Offset;
    private Long StartTime;
    private Long EndTime;
    //执行时长
    private String Duration;
    private Long RowSent;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    public String getAccessUsername() {
        return AccessUsername;
    }

    public void setAccessUsername(String accessUsername) {
        AccessUsername = accessUsername;
    }

    public String getSourceIp() {
        return SourceIp;
    }

    public void setSourceIp(String sourceIp) {
        SourceIp = sourceIp;
    }

    public String getAccessSqlExt() {
        return AccessSqlExt;
    }

    public void setAccessSqlExt(String accessSqlExt) {
        AccessSqlExt = accessSqlExt;
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

    public Integer getSourcePort() {
        return SourcePort;
    }

    public void setSourcePort(Integer sourcePort) {
        SourcePort = sourcePort;
    }

    public Boolean getRunResult() {
        return RunResult;
    }

    public void setRunResult(Boolean runResult) {
        RunResult = runResult;
    }

    public Long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Long timestamp) {
        Timestamp = timestamp;
    }

    public Long getExecTime() {
        return ExecTime;
    }

    public void setExecTime(Long execTime) {
        ExecTime = execTime;
    }

    public Long getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Long totalCount) {
        TotalCount = totalCount;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer limit) {
        Limit = limit;
    }

    public Long getOffset() {
        return Offset;
    }

    public void setOffset(Long offset) {
        Offset = offset;
    }

    public Long getStartTime() {
        return StartTime;
    }

    public void setStartTime(Long startTime) {
        StartTime = startTime;
    }

    public Long getEndTime() {
        return EndTime;
    }

    public void setEndTime(Long endTime) {
        EndTime = endTime;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public Long getRowSent() {
        return RowSent;
    }

    public void setRowSent(Long rowSent) {
        RowSent = rowSent;
    }
}

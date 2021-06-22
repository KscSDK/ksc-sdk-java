package com.ksc.krds.model.auditstatistic;

public class AuditTemplateData {
    private String dbName;
    private Long duration;
    private Integer count;
    private String sqlTemplate;
    private String sqlTemplateIdentity;
    private Float countRatio;
    private Float durationRatio;
    private Float durationAvg;
    private Long execTime;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

    public String getSqlTemplateIdentity() {
        return sqlTemplateIdentity;
    }

    public void setSqlTemplateIdentity(String sqlTemplateIdentity) {
        this.sqlTemplateIdentity = sqlTemplateIdentity;
    }

    public Float getCountRatio() {
        return countRatio;
    }

    public void setCountRatio(Float countRatio) {
        this.countRatio = countRatio;
    }

    public Float getDurationRatio() {
        return durationRatio;
    }

    public void setDurationRatio(Float durationRatio) {
        this.durationRatio = durationRatio;
    }

    public Float getDurationAvg() {
        return durationAvg;
    }

    public void setDurationAvg(Float durationAvg) {
        this.durationAvg = durationAvg;
    }

    public Long getExecTime() {
        return execTime;
    }

    public void setExecTime(Long execTime) {
        this.execTime = execTime;
    }
}

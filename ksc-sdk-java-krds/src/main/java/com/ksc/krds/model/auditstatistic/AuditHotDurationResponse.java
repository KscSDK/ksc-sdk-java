package com.ksc.krds.model.auditstatistic;

public class AuditHotDurationResponse {
    private String productId;
    private String dbName;
    private String tableName;
    private Double duration;
    private Float durationRatio;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Float getDurationRatio() {
        return durationRatio;
    }

    public void setDurationRatio(Float durationRatio) {
        this.durationRatio = durationRatio;
    }
}

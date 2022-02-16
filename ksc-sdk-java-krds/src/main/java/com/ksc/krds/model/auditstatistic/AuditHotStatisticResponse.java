package com.ksc.krds.model.auditstatistic;

public class AuditHotStatisticResponse {

    private String productId;
    private String dbName;
    private String tableName;
    private Integer count;
    private Float countRatio;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getCountRatio() {
        return countRatio;
    }

    public void setCountRatio(Float countRatio) {
        this.countRatio = countRatio;
    }
}

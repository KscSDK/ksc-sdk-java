package com.ksc.krds.model.slowlog;

import java.math.BigDecimal;

public class SlowLogReportPub {

    private Long processingTime;

    private Long id;

    private String productId;

    private String tenantId;

    private String groupId;

    private String guestId;

    /**
     * 唯一标示
     */
    private String checksum;

    private String fingerprint;

    private Long tsMin;

    private Long tsMax;

    private Integer queryCount;

    private String metricsDb;

    /**
     * ip
     */
    private String metricsHost;

    private String metricsUser;
    /**
     * 平均查询时间
     */
    private BigDecimal queryTimeAvg;

    private BigDecimal queryTimeMax;

    private BigDecimal queryTimeSum;

    /**
     * 平均所等待时间
     */
    private BigDecimal lockTimeAvg;

    private BigDecimal lockTimeMax;

    private BigDecimal lockTimeSum;

    /**
     * 平均扫描行数
     */
    private BigDecimal rowsExaminedAvg;

    private BigDecimal rowsExaminedMax;

    private BigDecimal rowsExaminedSum;

    /**
     * 平均返回行数
     */
    private BigDecimal rowsSentAvg;

    private BigDecimal rowsSentMax;

    private BigDecimal rowsSentSum;

    public Long getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Long processingTime) {
        this.processingTime = processingTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Long getTsMin() {
        return tsMin;
    }

    public void setTsMin(Long tsMin) {
        this.tsMin = tsMin;
    }

    public Long getTsMax() {
        return tsMax;
    }

    public void setTsMax(Long tsMax) {
        this.tsMax = tsMax;
    }

    public Integer getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
    }

    public String getMetricsDb() {
        return metricsDb;
    }

    public void setMetricsDb(String metricsDb) {
        this.metricsDb = metricsDb;
    }

    public String getMetricsHost() {
        return metricsHost;
    }

    public void setMetricsHost(String metricsHost) {
        this.metricsHost = metricsHost;
    }

    public String getMetricsUser() {
        return metricsUser;
    }

    public void setMetricsUser(String metricsUser) {
        this.metricsUser = metricsUser;
    }

    public BigDecimal getQueryTimeAvg() {
        return queryTimeAvg;
    }

    public void setQueryTimeAvg(BigDecimal queryTimeAvg) {
        this.queryTimeAvg = queryTimeAvg;
    }

    public BigDecimal getQueryTimeMax() {
        return queryTimeMax;
    }

    public void setQueryTimeMax(BigDecimal queryTimeMax) {
        this.queryTimeMax = queryTimeMax;
    }

    public BigDecimal getQueryTimeSum() {
        return queryTimeSum;
    }

    public void setQueryTimeSum(BigDecimal queryTimeSum) {
        this.queryTimeSum = queryTimeSum;
    }

    public BigDecimal getLockTimeAvg() {
        return lockTimeAvg;
    }

    public void setLockTimeAvg(BigDecimal lockTimeAvg) {
        this.lockTimeAvg = lockTimeAvg;
    }

    public BigDecimal getLockTimeMax() {
        return lockTimeMax;
    }

    public void setLockTimeMax(BigDecimal lockTimeMax) {
        this.lockTimeMax = lockTimeMax;
    }

    public BigDecimal getLockTimeSum() {
        return lockTimeSum;
    }

    public void setLockTimeSum(BigDecimal lockTimeSum) {
        this.lockTimeSum = lockTimeSum;
    }

    public BigDecimal getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    public BigDecimal getRowsExaminedMax() {
        return rowsExaminedMax;
    }

    public void setRowsExaminedMax(BigDecimal rowsExaminedMax) {
        this.rowsExaminedMax = rowsExaminedMax;
    }

    public BigDecimal getRowsExaminedSum() {
        return rowsExaminedSum;
    }

    public void setRowsExaminedSum(BigDecimal rowsExaminedSum) {
        this.rowsExaminedSum = rowsExaminedSum;
    }

    public BigDecimal getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(BigDecimal rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    public BigDecimal getRowsSentMax() {
        return rowsSentMax;
    }

    public void setRowsSentMax(BigDecimal rowsSentMax) {
        this.rowsSentMax = rowsSentMax;
    }

    public BigDecimal getRowsSentSum() {
        return rowsSentSum;
    }

    public void setRowsSentSum(BigDecimal rowsSentSum) {
        this.rowsSentSum = rowsSentSum;
    }
}

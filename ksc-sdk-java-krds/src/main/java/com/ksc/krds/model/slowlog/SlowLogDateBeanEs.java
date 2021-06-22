package com.ksc.krds.model.slowlog;

public class SlowLogDateBeanEs {

    private String id;
    private String sqlExecTimeStamp;
    private String aggTime;
    private String authUser;
    private String currentUser;
    private String hostname;
    private String queryTime; //查询时间
    private String lockTime; //等待时间
    private String rowsSent; //返回行
    private String rowsExamined; //扫描行
    private String sqlContent; //sql内容
    private String threadId; //线程id
    private String productId;  //实例id
    private String tenantId; //租户id
    private String checksum; //唯一标识
    private String fingerprint; //SQL模板

    //根据数据库的返回
    private String processingTime;
    private String groupId;
    private String guestId;
    private String tsMin;
    private String tsMax;
    private String queryCount;
    private String metricsDb;  //db
    private String metricsHost;
    private String metricsUser;
    private String queryTimeAvg;
    private String queryTimeMax;
    private String queryTimeSum;
    private String lockTimeAvg;
    private String lockTimeMax;
    private String lockTimeSum;
    private String rowsExaminedAvg;
    private String rowsExaminedMax;
    private String rowsExaminedSum;
    private String rowsSentAvg;
    private String rowsSentMax;
    private String rowsSentSum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSqlExecTimeStamp() {
        return sqlExecTimeStamp;
    }

    public void setSqlExecTimeStamp(String sqlExecTimeStamp) {
        this.sqlExecTimeStamp = sqlExecTimeStamp;
    }

    public String getAggTime() {
        return aggTime;
    }

    public void setAggTime(String aggTime) {
        this.aggTime = aggTime;
    }

    public String getAuthUser() {
        return authUser;
    }

    public void setAuthUser(String authUser) {
        this.authUser = authUser;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public String getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(String rowsSent) {
        this.rowsSent = rowsSent;
    }

    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public String getSqlContent() {
        return sqlContent;
    }

    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
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

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
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

    public String getTsMin() {
        return tsMin;
    }

    public void setTsMin(String tsMin) {
        this.tsMin = tsMin;
    }

    public String getTsMax() {
        return tsMax;
    }

    public void setTsMax(String tsMax) {
        this.tsMax = tsMax;
    }

    public String getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(String queryCount) {
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

    public String getQueryTimeAvg() {
        return queryTimeAvg;
    }

    public void setQueryTimeAvg(String queryTimeAvg) {
        this.queryTimeAvg = queryTimeAvg;
    }

    public String getQueryTimeMax() {
        return queryTimeMax;
    }

    public void setQueryTimeMax(String queryTimeMax) {
        this.queryTimeMax = queryTimeMax;
    }

    public String getQueryTimeSum() {
        return queryTimeSum;
    }

    public void setQueryTimeSum(String queryTimeSum) {
        this.queryTimeSum = queryTimeSum;
    }

    public String getLockTimeAvg() {
        return lockTimeAvg;
    }

    public void setLockTimeAvg(String lockTimeAvg) {
        this.lockTimeAvg = lockTimeAvg;
    }

    public String getLockTimeMax() {
        return lockTimeMax;
    }

    public void setLockTimeMax(String lockTimeMax) {
        this.lockTimeMax = lockTimeMax;
    }

    public String getLockTimeSum() {
        return lockTimeSum;
    }

    public void setLockTimeSum(String lockTimeSum) {
        this.lockTimeSum = lockTimeSum;
    }

    public String getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    public void setRowsExaminedAvg(String rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    public String getRowsExaminedMax() {
        return rowsExaminedMax;
    }

    public void setRowsExaminedMax(String rowsExaminedMax) {
        this.rowsExaminedMax = rowsExaminedMax;
    }

    public String getRowsExaminedSum() {
        return rowsExaminedSum;
    }

    public void setRowsExaminedSum(String rowsExaminedSum) {
        this.rowsExaminedSum = rowsExaminedSum;
    }

    public String getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(String rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    public String getRowsSentMax() {
        return rowsSentMax;
    }

    public void setRowsSentMax(String rowsSentMax) {
        this.rowsSentMax = rowsSentMax;
    }

    public String getRowsSentSum() {
        return rowsSentSum;
    }

    public void setRowsSentSum(String rowsSentSum) {
        this.rowsSentSum = rowsSentSum;
    }
}

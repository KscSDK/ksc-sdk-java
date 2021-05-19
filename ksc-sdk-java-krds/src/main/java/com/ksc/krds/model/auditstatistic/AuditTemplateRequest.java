package com.ksc.krds.model.auditstatistic;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class AuditTemplateRequest extends BaseRequest<AuditTemplateRequest> {

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
}

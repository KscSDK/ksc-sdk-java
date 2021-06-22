package com.ksc.krds.model.auditstatistic;

import com.ksc.krds.model.RdsResponse;

public class AuditTemplateResponse<T> extends RdsResponse<T> {

    private Integer size;

    private Integer totalSize;

    private Integer page;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}

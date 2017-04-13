package com.ksc.cdn.model.log;

/**
 * Created by qichao on 2017/2/28.
 */
public class Data {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 域名的日志服务状态，取值为start：启用；stop：停用
     */
    private String Status;

    /**
     * 日志存储粒度，取值为60：按小时粒度存储；1440：按天粒度存储
     */
    private Long Granularity;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getGranularity() {
        return Granularity;
    }

    public void setGranularity(Long granularity) {
        Granularity = granularity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}

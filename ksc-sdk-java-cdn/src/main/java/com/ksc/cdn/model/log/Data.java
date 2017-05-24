package com.ksc.cdn.model.log;

/**
 * Created by qichao on 2017/2/28.
 */
@lombok.Data
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

}

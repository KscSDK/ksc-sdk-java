package com.ksc.cdn.model.log;

/**
 * 获取指定域名的原始访问日志的下载地址。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@lombok.Data
public class DomainLogsResult {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 分页大小
     */
    private Long PageSize;

    /**
     * 取得第几页
     */
    private Long PageNumber;

    /**
     * 日志总条数
     */
    private Long TotalCount;

    /**
     * 日志信息数据
     */
    private DomainLogData[] DomainLogs;
}

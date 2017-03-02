package com.ksc.cdn;

import com.ksc.cdn.model.log.*;

/**
 * KscCdnLogSetting
 * 日志管理
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/28
 */
public interface KscCdnLog {

    /**
     * 获取指定域名的原始访问日志的下载地址。
     */
    DomainLogsResult getDomainLogs(DomainLogsRequest request) throws Exception;

    /**
     * 本接口用于启用、停用某个加速域名的日志服务。
     */
    void setDomainLogService(DomainLogServiceRequest request) throws Exception;

    /**
     * 获取域名日志服务状态
     */
    DomainLogServiceStatusResult getDomainLogServiceStatus(DomainLogServiceStatusRequest request) throws Exception;
}

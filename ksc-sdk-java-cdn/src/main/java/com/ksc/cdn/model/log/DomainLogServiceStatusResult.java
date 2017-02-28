package com.ksc.cdn.model.log;

/**
 * 获取域名日志服务状态。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@lombok.Data
public class DomainLogServiceStatusResult {

    /**
     * 域名日志状态信息
     */
    private com.ksc.cdn.model.log.Data[] Datas;

}

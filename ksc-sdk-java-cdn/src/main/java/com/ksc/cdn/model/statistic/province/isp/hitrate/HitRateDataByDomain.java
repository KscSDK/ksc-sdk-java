package com.ksc.cdn.model.statistic.province.isp.hitrate;

import lombok.Data;

/**
 * HitRateDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class HitRateDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 流量命中率（该域名的流量命中率）
     */
    private Double FlowHitRate;
    /**
     * 请求数命中率（该域名的请求数命中率
     */
    private Double ReqHitRate;
}

package com.ksc.cdn.model.statistic.province.isp.hitrate;

import lombok.Data;

/**
 * HitRateDetailDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/28
 */
@Data
public class HitRateDetailDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 流量命中率（所选域名合并值）
     */
    private Double FlowHitRate;
    /**
     * 请求数命中率（所选域名合并值）
     */
    private Double ReqHitRate;
    /**
     * 每个域名的详细命中率数据(仅当ResultType取值为1时返回此项数据))
     */
    private HitRateDataByDomain[] Domains;
}
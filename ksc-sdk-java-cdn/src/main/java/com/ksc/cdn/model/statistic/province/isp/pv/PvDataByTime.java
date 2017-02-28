package com.ksc.cdn.model.statistic.province.isp.pv;

import lombok.Data;

/**
 * PvDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class PvDataByTime {
    /**
     * 时间点
     */
    private String Time;
    /**
     * 边缘请求数（所选域名合并值）
     */
    private Long Pv;
    /**
     * 每个域名的详细请求数数据(仅当ResultType取值为1时返回此项数据))
     */
    private PvDataByDomain[] Domains;
}
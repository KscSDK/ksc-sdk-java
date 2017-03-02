package com.ksc.cdn.model.statistic.uv;

import lombok.Data;

/**
 * UvDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class UvDataByTime {

    /**
     * 时间点
     */
    private String Time;

    /**
     * 独立请求的IP个数，（所选域名合并值）
     */
    private Long Uv;

    /**
     * 每个域名的详细独立请求的IP个数数据ResultType取值为1时返回此项数据))
     */
    private UvDataByDomain[] Domains;

}

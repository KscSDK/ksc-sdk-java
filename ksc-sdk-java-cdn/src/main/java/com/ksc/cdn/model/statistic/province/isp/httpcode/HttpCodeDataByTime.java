package com.ksc.cdn.model.statistic.province.isp.httpcode;

import lombok.Data;

/**
 * HttpCodeDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class HttpCodeDataByTime {

    /**
     * 时间点
     */
    private String Time;

    /**
     * 所选域名在所选省份区域及运营商的详细状态码数据的合并数据，仅当ResultType取值为0是返回此项参数
     */
    private HttpCode[] CodeSum;

    /**
     * 各域名的详细状态码数据， 仅当ResultType取值为1是返回此项参数
     */
    private HttpCodeDataByDomain[] Domains;

}

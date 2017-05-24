package com.ksc.cdn.model.statistic.httpcode;

import lombok.Data;

/**
 * SrcHttpCodeDataByTime
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class SrcHttpCodeDataByTime {

    /**
     * 时间点
     */
    private String Time;

    /**
     * 所选域名详细状态码数据的合并数据，仅当ResultType取值为0是返回此项参数
     */
    private SrcHttpCode[] SrcCodeSum;

    /**
     * 各域名的详细状态码数据， 仅当ResultType取值为1是返回此项参数
     */
    private SrcHttpCodeDataByDomain[] Domains;

}

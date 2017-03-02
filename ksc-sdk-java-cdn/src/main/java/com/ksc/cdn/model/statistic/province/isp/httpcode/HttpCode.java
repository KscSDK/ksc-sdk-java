package com.ksc.cdn.model.statistic.province.isp.httpcode;

import lombok.Data;

/**
 * HttpCode
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class HttpCode {
    /**
     * 各种Http状态码，如：200，206，302，403,504
     */
    private String Code;
    /**
     * 各种状态码访问占比
     */
    private Double Proportion;
    /**
     * 本状态码的的访问次数
     */
    private Long Pv;
}


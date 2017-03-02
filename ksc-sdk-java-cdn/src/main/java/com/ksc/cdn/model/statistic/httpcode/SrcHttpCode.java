package com.ksc.cdn.model.statistic.httpcode;

import lombok.Data;

/**
 * SrcHttpCode
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class SrcHttpCode {

    /**
     * 各种回源Http状态码，如：200，206，302，403,504
     */
    private String SrcCode;

    /**
     * 各种状态码访问占比，如：200占2XX的百分比
     */
    private Double Proportion;

    /**
     * 本状态码的的访问次数
     */
    private Long Pv;

}

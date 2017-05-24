package com.ksc.cdn.model.statistic.province.isp.httpcode;

import lombok.Data;

/**
 * HttpCodeDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class HttpCodeDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * Http状态码
     */
    private HttpCode[] Codes;
}
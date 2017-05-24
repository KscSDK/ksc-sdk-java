package com.ksc.cdn.model.statistic.uv;

import lombok.Data;

/**
 * UvDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class UvDataByDomain {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * 该域名的独立请求的IP个数
     */
    private Long Uv;

}

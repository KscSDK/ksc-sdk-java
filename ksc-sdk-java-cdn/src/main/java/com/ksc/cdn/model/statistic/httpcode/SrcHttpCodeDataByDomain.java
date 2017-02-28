package com.ksc.cdn.model.statistic.httpcode;

import lombok.Data;

/**
 * SrcHttpCodeDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class SrcHttpCodeDataByDomain {

    /**
     * 域名ID
     */
    private String DomainId;

    /**
     * Http状态码
     */
    private SrcHttpCode[] SrcCodes;

}

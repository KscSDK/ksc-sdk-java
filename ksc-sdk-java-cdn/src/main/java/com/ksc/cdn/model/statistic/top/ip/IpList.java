package com.ksc.cdn.model.statistic.top.ip;

import lombok.Data;

/**
 * IpList
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class IpList {
    /**
     * 独立请求的IP地址
     */
    private String Ip;

    /**
     * 访问次数
     */
    private Long Pv;

    /**
     * 访问流量
     */
    private Long Flow;

}

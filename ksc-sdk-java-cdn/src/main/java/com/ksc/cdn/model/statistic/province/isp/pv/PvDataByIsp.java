package com.ksc.cdn.model.statistic.province.isp.pv;

import lombok.Data;

/**
 * PvDataByIsp
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class PvDataByIsp {

    /**
     * 运营商
     */
    private String Isp;

    /**
     * 边缘请求数 （该域名在该省份区域该运营商的边缘请求数数据）
     */
    private Long Pv;

}

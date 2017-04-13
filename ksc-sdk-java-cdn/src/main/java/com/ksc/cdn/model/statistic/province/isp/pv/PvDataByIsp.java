package com.ksc.cdn.model.statistic.province.isp.pv;

/**
 * PvDataByIsp
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class PvDataByIsp {

    /**
     * 运营商
     */
    private String Isp;

    /**
     * 边缘请求数 （该域名在该省份区域该运营商的边缘请求数数据）
     */
    private Long Pv;

    public String getIsp() {
        return Isp;
    }

    public void setIsp(String isp) {
        Isp = isp;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }
}

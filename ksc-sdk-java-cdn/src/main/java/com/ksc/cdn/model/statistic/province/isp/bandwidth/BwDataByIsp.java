package com.ksc.cdn.model.statistic.province.isp.bandwidth;

/**
 * BwDataByIsp
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class BwDataByIsp {
    /**
     * 运营商
     */
    private String Isp;
    /**
     * 边缘带宽（该域名在该省份区域该运营商的边缘带宽数据）
     */
    private Long Bw;

    public String getIsp() {
        return Isp;
    }

    public void setIsp(String isp) {
        Isp = isp;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }
}

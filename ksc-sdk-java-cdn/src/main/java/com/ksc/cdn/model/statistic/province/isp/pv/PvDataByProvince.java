package com.ksc.cdn.model.statistic.province.isp.pv;

/**
 * PvDataByProvince
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class PvDataByProvince {

    /**
     * 省份区域
     */
    private String Province;

    /**
     * 边缘请求数 （该域名在该省份区域的边缘请求数数据）
     */
    private Long Pv;

    /**
     * 该域名在该省份每个运营商的请求数详细数据
     */
    private PvDataByIsp[] Isps;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public PvDataByIsp[] getIsps() {
        return Isps;
    }

    public void setIsps(PvDataByIsp[] isps) {
        Isps = isps;
    }
}

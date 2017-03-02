package com.ksc.cdn.model.statistic.province.isp.bandwidth;

import lombok.ToString;

/**
 * BwDataByProvince
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
@ToString
public class BwDataByProvince {
    /**
     * 省份区域
     */
    private String Province;
    /**
     * 边缘带宽（该域名在该省份区域的边缘带宽数据）
     */
    private Long Bw;
    /**
     * 该域名在该省份每个运营商的带宽详细数据
     */
    private BwDataByIsp[] Isps;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public BwDataByIsp[] getIsps() {
        return Isps;
    }

    public void setIsps(BwDataByIsp[] isps) {
        Isps = isps;
    }
}

package com.ksc.cdn.model.statistic.province.isp.bandwidth;

import lombok.ToString;

/**
 * BwDataByDomain
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
@ToString
public class BwDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 边缘带宽（该域名的边缘带宽，若选择多个省份区域多个运营商，则返回该域名多个省份区域多个运营商的数据合并值）
     */
    private Long Bw;
    /**
     * 该域名在每个省份区域的带宽详细数据
     */
    private BwDataByProvince[] Provinces;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getBw() {
        return Bw;
    }

    public void setBw(Long bw) {
        Bw = bw;
    }

    public BwDataByProvince[] getProvinces() {
        return Provinces;
    }

    public void setProvinces(BwDataByProvince[] provinces) {
        Provinces = provinces;
    }
}

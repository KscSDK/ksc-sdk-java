package com.ksc.cdn.model.statistic.province.isp.pv;

/**
 * PvDataByDomain
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class PvDataByDomain {
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 边缘请求数（该域名的边缘请求数，若选择多个区域，则返回该域名多个区域的数据合并值）
     */
    private Long Pv;
    /**
     * 该域名在每个区域的请求数详细数据
     */
    private PvDataByProvince[] Provinces;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public PvDataByProvince[] getProvinces() {
        return Provinces;
    }

    public void setProvinces(PvDataByProvince[] provinces) {
        Provinces = provinces;
    }
}

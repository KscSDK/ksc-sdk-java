package com.ksc.cdn.model.statistic.province.isp.bandwidth;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * ProvinceAndIspBandwidthResult
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class ProvinceAndIspBandwidthResult extends CommonFieldResult {
    /**
     * 省份区域，逗号（半角）间隔
     */
    private String Provinces;
    /**
     * 运营商，逗号（半角）分隔
     */
    private String Isps;
    /**
     * 每个时间粒度的流量数据
     */
    private BwDataByTime[] Datas;

    public String getProvinces() {
        return Provinces;
    }

    public void setProvinces(String provinces) {
        Provinces = provinces;
    }

    public String getIsps() {
        return Isps;
    }

    public void setIsps(String isps) {
        Isps = isps;
    }

    public BwDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(BwDataByTime[] datas) {
        Datas = datas;
    }
}

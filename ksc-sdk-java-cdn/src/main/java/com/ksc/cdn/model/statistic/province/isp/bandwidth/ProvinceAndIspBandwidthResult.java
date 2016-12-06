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
     * 取值为0：多域名多区域数据做合并返回；1：每个域名每个区域的数据分别返回。
     */
    private String ResultType;
    /**
     * 统计粒度，取值为 5：5分钟粒度；
     * 10：10分钟粒度；
     * 20：20分钟粒度；
     * 60：1小时粒度；
     * 240：4小时粒度；
     * 480：8小时粒度；
     * 1440：1天粒度；
     * 以上粒度的带宽值均取该粒度时间段的峰值
     */
    private String Granularity;

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

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getGranularity() {
        return Granularity;
    }

    public void setGranularity(String granularity) {
        Granularity = granularity;
    }

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

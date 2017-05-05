package com.ksc.cdn.model.statistic.province.isp.httpcode;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * ProvinceAndIspHttpCodeResult
 * <p>
 * 获取域名一段时间内在中国大陆地区各省份及各运营商的Http状态码访问次数及占比数据
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class ProvinceAndIspHttpCodeResult extends CommonFieldResult {

    /**
     * 省份区域，逗号（半角）间隔
     */
    private String Provinces;
    /**
     * 运营商，逗号（半角）分隔
     */
    private String Isps;
    /**
     * 所选时间段内的各种Http状态码求和数据、各种回源状态码及占比
     */
    private HttpCodeData[] Datas;

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

    public HttpCodeData[] getDatas() {
        return Datas;
    }

    public void setDatas(HttpCodeData[] datas) {
        Datas = datas;
    }
}

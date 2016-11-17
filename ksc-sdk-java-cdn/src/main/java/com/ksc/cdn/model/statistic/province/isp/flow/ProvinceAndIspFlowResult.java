package com.ksc.cdn.model.statistic.province.isp.flow;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * ProvinceAndIspFlowResult
 *
 * 获取域名在中国大陆地区各省份及各运营商的流量数据，仅包括边缘节点数据，单位:byte
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class ProvinceAndIspFlowResult extends CommonFieldResult{
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
    private FlowDataByTime[] Datas;

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

    public FlowDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(FlowDataByTime[] datas) {
        Datas = datas;
    }
}

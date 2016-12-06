package com.ksc.cdn.model.statistic.province;

/**
 * AreaDataByArea
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class AreaDataByArea {
    /**
     * 地区名称，国内为省份，海外为国家
     * @see com.ksc.cdn.model.enums.AreaEnum
     */
    private String Area;
    /**
     * 边缘流量（所选域名、所选时间段内合并值）
     */
    private Long Flow;
    /**
     * 边缘请求数（所选域名、所选时间段内合并值）
     */
    private Long Pv;
    /**
     * 流量占比（所选域名在所选时间段内在该区域该运营商的流量合并值占总量的百分比）
     */
    private Double FlowProportion;
    /**
     * 请求数占比（所选域名在所选时间段内在该区域该运营商的请求数合并值占总请求数的百分比）
     */
    private Double PvProportion;
    /**
     * 该区域各运营商的统计数据，当区域为海外国家时
     */
    private AreaDataByIsp[] Isps;

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public Double getFlowProportion() {
        return FlowProportion;
    }

    public void setFlowProportion(Double flowProportion) {
        FlowProportion = flowProportion;
    }

    public Double getPvProportion() {
        return PvProportion;
    }

    public void setPvProportion(Double pvProportion) {
        PvProportion = pvProportion;
    }

    public AreaDataByIsp[] getIsps() {
        return Isps;
    }

    public void setIsps(AreaDataByIsp[] isps) {
        Isps = isps;
    }
}

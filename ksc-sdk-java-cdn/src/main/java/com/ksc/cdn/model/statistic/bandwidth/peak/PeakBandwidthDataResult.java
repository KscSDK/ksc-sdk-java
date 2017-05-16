package com.ksc.cdn.model.statistic.bandwidth.peak;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * 获取域名带宽峰值，峰值时间点
 * 1、峰值带宽计算方法：在选定时间段内，取每5分钟有效带宽值进行降序排列，最高带宽就是峰值带宽
 * 2、realtime，峰值时间点，取每5分钟一个时间点，最高峰出现的时间点即为峰值时间
 *
 * @author qichao@kingsoft.com
 * @date 2017/03/29
 */
public class PeakBandwidthDataResult extends CommonFieldResult {

    /**
     * 非必须
     * 缺省为CN
     * 计费区域名称
     */
    private String Regions;

    /**
     * 峰值带宽
     */
    private Long PeakBw;

    /**
     * 峰值时间点
     */
    private String RealTime;

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public Long getPeakBw() {
        return PeakBw;
    }

    public void setPeakBw(Long peakBw) {
        PeakBw = peakBw;
    }

    public String getRealTime() {
        return RealTime;
    }

    public void setRealTime(String realTime) {
        RealTime = realTime;
    }
}


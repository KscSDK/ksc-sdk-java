package com.ksc.cdn.model.statistic.province;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * AreaResult
 * 获取国内各省份及运营商流量、访问次数、流量占比，请求数占比，海外地区的流量、访问次数、流量占比、请求数占比
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class AreaResult extends CommonFieldResult {
    /**
     * 查询时间段内的地区数据
     */
    private AreaDataByArea[] Datas;

    public AreaDataByArea[] getDatas() {
        return Datas;
    }

    public void setDatas(AreaDataByArea[] datas) {
        Datas = datas;
    }
}

package com.ksc.cdn.model.statistic.isp;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * IspResult
 *
 * 获取各运营商流量、访问次数、流量占比、访问次数占比
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class IspResult extends CommonFieldResult {
    /**
     * 查询时间段内的运营商的统计数据
     */
    private IspData[] Datas;

    public IspData[] getDatas() {
        return Datas;
    }

    public void setDatas(IspData[] datas) {
        Datas = datas;
    }
}

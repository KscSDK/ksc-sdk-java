package com.ksc.cdn.model.statistic.flow;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * 获取域名流量数据，包括边缘流量、回源流量数据， 单位：byte
 *
 * Created by jiangran on 19/10/2016.
 */
public class FlowResult extends CommonFieldResult {
    /**
     * 每个时间粒度的流量数据
     */
    private FlowDataByTime[] Datas;

    public FlowDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(FlowDataByTime[] datas) {
        Datas = datas;
    }
}

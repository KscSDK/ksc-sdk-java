package com.ksc.cdn.model.statistic.flow;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * Created by jiangran on 19/10/2016.
 */
public class FlowResult extends CommonFieldResult {
    private FlowDataByTime[] Datas;

    public FlowDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(FlowDataByTime[] datas) {
        Datas = datas;
    }
}

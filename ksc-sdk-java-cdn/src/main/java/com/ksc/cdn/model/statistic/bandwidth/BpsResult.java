package com.ksc.cdn.model.statistic.bandwidth;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * BpsResult
 * 带宽查询结果
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class BpsResult extends CommonFieldResult {

    /**
     * 每个时间粒度的带宽数据
     */
    private BpsDataByTime[] Datas;

    public BpsDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(BpsDataByTime[] datas) {
        Datas = datas;
    }


}

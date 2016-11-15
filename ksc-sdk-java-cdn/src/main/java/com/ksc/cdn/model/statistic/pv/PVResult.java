package com.ksc.cdn.model.statistic.pv;


import com.ksc.cdn.model.statistic.CommonFieldResult;

import java.util.List;

/**
 * 获取域名请求数数据，包括边缘请求数、回源请求数， 单位：次
 *
 * Created by CrazyHorse on 17/10/2016.
 */
public class PVResult extends CommonFieldResult {
    /**
     * 每个时间粒度的请求数数据
     */
    private PvDataByTime[] Datas;

    public PvDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(PvDataByTime[] datas) {
        Datas = datas;
    }




}

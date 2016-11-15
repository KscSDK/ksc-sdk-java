package com.ksc.cdn.model.statistic.pv;


import com.ksc.cdn.model.statistic.CommonFieldResult;

import java.util.List;

/**
 * Created by CrazyHorse on 17/10/2016.
 */
public class PVResult extends CommonFieldResult {

    private PvDataByTime[] Datas;

    public PvDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(PvDataByTime[] datas) {
        Datas = datas;
    }




}

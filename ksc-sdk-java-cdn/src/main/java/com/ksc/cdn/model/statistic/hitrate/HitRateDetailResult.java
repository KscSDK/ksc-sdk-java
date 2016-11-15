package com.ksc.cdn.model.statistic.hitrate;


import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateDetailResult extends CommonFieldResult {

    private String HitType;

    private HitRateDetailDataByTime[] Datas;

    public String getHitType() {
        return HitType;
    }

    public void setHitType(String hitType) {
        HitType = hitType;
    }

    public HitRateDetailDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(HitRateDetailDataByTime[] datas) {
        Datas = datas;
    }




}

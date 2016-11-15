package com.ksc.cdn.model.statistic.hitrate;


import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * 获取域名流量命中率、请求数命中率数据，单位：百分比
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateDetailResult extends CommonFieldResult {
    /**
     * 数据类型
     * @see com.ksc.cdn.model.enums.HitTypeEnum
     */
    private String HitType;
    /**
     * 每个时间粒度的命中百分占比数据
     */
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

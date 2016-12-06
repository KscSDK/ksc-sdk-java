package com.ksc.cdn.model.statistic.hitrate;


import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * 获取域名流量命中率、请求数命中率数据，单位：百分比
 * Created by CrazyHorse on 24/10/2016.
 */
public class HitRateDetailResult extends CommonFieldResult {
    /**
     * 取值为0：多域名多区域数据做合并返回；1：每个域名每个区域的数据分别返回。
     */
    private String ResultType;
    /**
     * 统计粒度，取值为 5：5分钟粒度；
     * 10：10分钟粒度；
     * 20：20分钟粒度；
     * 60：1小时粒度；
     * 240：4小时粒度；
     * 480：8小时粒度；
     * 1440：1天粒度；
     * 以上粒度的带宽值均取该粒度时间段的峰值
     */
    private String Granularity;
    /**
     * 数据类型
     * @see com.ksc.cdn.model.enums.HitTypeEnum
     */
    private String HitType;
    /**
     * 每个时间粒度的命中百分占比数据
     */
    private HitRateDetailDataByTime[] Datas;

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getGranularity() {
        return Granularity;
    }

    public void setGranularity(String granularity) {
        Granularity = granularity;
    }

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

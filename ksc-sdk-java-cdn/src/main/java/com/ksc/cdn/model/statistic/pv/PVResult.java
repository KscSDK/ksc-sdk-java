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
     * 区域，逗号（半角）间隔
     */
    private String Regions;
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
     * 数据类型， 取值为edge:边缘数据; origin:回源数据; 支持多类型选择，多个类型用逗号（半角）分隔，缺省为edge
     */
    private String DataType;
    /**
     * 每个时间粒度的请求数数据
     */
    private PvDataByTime[] Datas;

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

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

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public PvDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(PvDataByTime[] datas) {
        Datas = datas;
    }

}

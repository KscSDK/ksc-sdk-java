package com.ksc.cdn.model.statistic.wildcard;

import com.ksc.cdn.model.statistic.CommonFieldResult;
import com.ksc.cdn.model.statistic.pv.PvDataByTime;

/**
 * description：
 * author：ZHOURONG
 * date: 2017/12/7
 * mail：yangxueyi@kingsoft.com
 */
public class SubDomainsPvResult extends CommonFieldResult {


    /**
     * 表示一个泛域名
     */
    private String DomainId;
    /**
     * 表示泛域名的次级域名，但查询次级域名的个数≤100个
     */
    private String Domains;
    /**
     * 非必须
     * 缺省为CN
     * 计费区域名称
     */
    private String Regions;

    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    private String ResultType;

    /**
     * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String Granularity;

    /**
     * 非必须
     * 数据类型,edge边缘数据origin回源数据
     * 缺省为edge
     */
    private String DataType;


    private PvDataByTime[] Datas;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getDomains() {
        return Domains;
    }

    public void setDomains(String domains) {
        Domains = domains;
    }

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

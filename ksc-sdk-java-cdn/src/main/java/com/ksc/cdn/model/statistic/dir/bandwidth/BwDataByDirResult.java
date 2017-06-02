package com.ksc.cdn.model.statistic.dir.bandwidth;

import com.ksc.cdn.model.statistic.CommonFieldResult;

/**
 * 获取某段时间内按一级目录为维度下消耗的带宽，单位bit\/second
 *
 * @author zr
 * @date 2017/03/07
 */
public class BwDataByDirResult extends CommonFieldResult {



    /**
     * 输入需要查询的域名ID，只允许输入一个
     */
    private String DomainId;
    
    /**
     * 目录名称，无一级目录以“\/”表示
     */
    private String Dirs;
    
    /**
     * 区域，逗号（半角）间隔
     */
    private String Regions;
    
    /**
     * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String Granularity;
    /**
     * 每个时间粒度的独立请求的IP数据
     * 
     */
    
    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    private String ResultType;
    
    /**
     * 每个时间粒度的带宽数据
     */
    private BpsDataByTime[] Datas;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getDirs() {
        return Dirs;
    }

    public void setDirs(String dirs) {
        Dirs = dirs;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getGranularity() {
        return Granularity;
    }

    public void setGranularity(String granularity) {
        Granularity = granularity;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public BpsDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(BpsDataByTime[] datas) {
        Datas = datas;
    }
}

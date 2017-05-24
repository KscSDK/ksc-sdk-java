package com.ksc.cdn.model.statistic.playtime;

import com.ksc.cdn.model.statistic.CommonFieldResult;
import com.ksc.cdn.model.valid.FieldValidate;

import java.util.List;

/**
 * Created by JIANGYANG1 on 2017/3/14.
 */
public class LiveWatchTimeByDomainWebResponse extends CommonFieldResult {
    /**
     * 计费区域名称， 取值为CN:中国大陆，HK：香港，TW：台湾，AS：亚洲其他，NA：北美洲，SA：南美洲，EU：欧洲，AU：大洋洲，AF：非洲，支持多计费区域查询，多个区域用逗号（半角）分隔，缺省为 CN
     */
    private String Regions;

    /**
     * 取值为0：多流名多区域数据做合并；1：每个流名每个区域的数据分别返回
     */
    @FieldValidate
    private String ResultType;

    /**
     * 统计粒度，取值为 5（默认）：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度的观看时长均取播放时长求和，除以该时段的总访问次数的值
     */
    private String Granularity;

    /**
     * 每个时间粒度的观看时长数据
     */
    private List<WatchLengthDataByTime> Datas;

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

    public List<WatchLengthDataByTime> getDatas() {
        return Datas;
    }

    public void setDatas(List<WatchLengthDataByTime> datas) {
        Datas = datas;
    }
}
package com.ksc.cdn.model.statistic.live.stream.top;

import com.ksc.cdn.model.statistic.live.stream.uv.OnlineUserDataByStream;

/**
 * LiveTopOnlineUserResult
 * 获取按流维度的直播在线人数排行
 * @author jiangran@kingsoft.com
 * @date 2016/11/22
 */
public class LiveTopOnlineUserResult {
    /**
     * 开始时间
     */
    private String StartTime;
    /**
     * 域名ID列表，逗号（半角）间隔
     */
    private String DomainIds;
    /**
     * 计费区域，逗号（半角）间隔
     */
    private String Regions;
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    private String ResultType;
    /**
     * Top条数，取值为1-200，最大200，默认100
     */
    private String LimitN;
    /**
     * 每个时间粒度的在线人数数据
     */
    private OnlineUserDataByStream[] Datas;

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
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

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    public OnlineUserDataByStream[] getDatas() {
        return Datas;
    }

    public void setDatas(OnlineUserDataByStream[] datas) {
        Datas = datas;
    }
}

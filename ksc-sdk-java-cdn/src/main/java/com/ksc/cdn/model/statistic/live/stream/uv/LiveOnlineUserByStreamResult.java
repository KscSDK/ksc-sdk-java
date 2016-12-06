package com.ksc.cdn.model.statistic.live.stream.uv;

import com.ksc.cdn.model.statistic.live.LiveCommonFieldResult;

/**
 * LiveOnlineUserByStreamResult
 * 获取按流维度的直播在线人数数据， 单位：每分钟的在线人数
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class LiveOnlineUserByStreamResult extends LiveCommonFieldResult {
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    private String ResultType;
    /**
     * 统计粒度
     */
    private String Granularity;
    /**
     * 每个时间粒度的在线人数数据
     */
    private OnlineUserDataByTime[] Datas;

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

    public OnlineUserDataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(OnlineUserDataByTime[] datas) {
        Datas = datas;
    }
}

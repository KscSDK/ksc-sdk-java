package com.ksc.cdn.model.statistic.live.stream.flow;


import com.ksc.cdn.model.statistic.live.LiveCommonFieldResult;

/**
 * LiveFlowByStreamResult
 * 直播业务，获取按流为维度的流量数据，流量单位byte
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class LiveFlowByStreamResult extends LiveCommonFieldResult {
    /**
     * 流名，支持批量查询，多个流名用逗号（半角）分隔
     */
    private String StreamUrl;
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    private String ResultType;
    /**
     * 统计粒度，取值为 1（默认）：1分钟粒度；取值为 5：5分钟粒度；
     * 10：10分钟粒度；20：20分钟粒度；60：1小时力度；
     * 240：4小时粒度；480：8小时粒度；1440：1天粒度；
     * 以上粒度均取该粒度时间段的流量总和
     */
    private String Granularity;
    /**
     * 每个时间粒度的流量数据
     */
    private DataByTime[] Datas;

    public String getStreamUrl() {
        return StreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        StreamUrl = streamUrl;
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

    public DataByTime[] getDatas() {
        return Datas;
    }

    public void setDatas(DataByTime[] datas) {
        Datas = datas;
    }
}

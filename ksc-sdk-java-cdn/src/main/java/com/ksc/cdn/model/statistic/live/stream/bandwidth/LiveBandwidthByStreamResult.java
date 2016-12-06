package com.ksc.cdn.model.statistic.live.stream.bandwidth;

import com.ksc.cdn.model.statistic.live.LiveCommonFieldResult;

/**
 * LiveBandwidthByStreamResult
 *
 * 直播业务，获取按流为维度的带宽数据，带宽单位bit\/second
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class LiveBandwidthByStreamResult extends LiveCommonFieldResult {
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    private String ResultType;
    /**
     * 统计粒度
     */
    private String Granularity;
    /**
     * 每个时间粒度的带宽数据
     */
    private DataByTime[] Datas;

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

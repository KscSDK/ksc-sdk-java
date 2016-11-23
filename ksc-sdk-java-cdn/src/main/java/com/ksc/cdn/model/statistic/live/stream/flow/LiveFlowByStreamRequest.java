package com.ksc.cdn.model.statistic.live.stream.flow;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.GeneralRequestParam;
import com.ksc.cdn.model.statistic.live.LiveCommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * LiveFlowByStreamRequest
 * <P>
 * 直播业务，获取按流为维度的流量数据<P>
 * 支持按指定的起止时间查询，两者需要同时指定<P>
 * 支持批量流名过滤查询，多个流名用逗号（半角）分隔<P>
 * 最多可获取最近62天内，7天跨度的数据<P>
 * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度均取该粒度时间段的求和<P>
 * 只支持直播业务<P>
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class LiveFlowByStreamRequest extends LiveCommonFieldRequest {
    /**
     * 流名，支持批量查询，多个流名用逗号（半角）分隔
     */
    @FieldValidate
    private String StreamUrl;
    /**
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    @FieldValidate
    private String ResultType;
    /**
     * 统计粒度，取值为 1（默认）：1分钟粒度；取值为 5：5分钟粒度；
     * 10：10分钟粒度；20：20分钟粒度；60：1小时力度；
     * 240：4小时粒度；480：8小时粒度；1440：1天粒度；
     * 以上粒度均取该粒度时间段的流量总和
     */
    private String Granularity;

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

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        Map<String,String> params= super.buildParams();

        params.put("StreamUrl",this.getStreamUrl());
        params.put("ResultType",this.getResultType());
        if(StringUtils.isNotBlank(this.getGranularity())){
            params.put("Granularity",this.getGranularity());
        }else {
            params.put("Granularity",super.getGranularity(this.getStartTime(),this.getEndTime()));
        }
        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetLiveFlowDataByStream","2016-09-01","/2016-09-01/statistics/GetLiveFlowDataByStream");
    }
}

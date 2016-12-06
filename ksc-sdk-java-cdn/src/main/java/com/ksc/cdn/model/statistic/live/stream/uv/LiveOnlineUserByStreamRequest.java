package com.ksc.cdn.model.statistic.live.stream.uv;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.live.LiveCommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * LiveOnlineUserByStreamRequest
 * <p>
 * 获取按流维度的直播在线人数数据， 单位：每分钟的在线人数<p>
 * 支持按指定的起止时间查询，两者需要同时指定<p>
 * 支持批量流名过滤查询，多个流名用逗号（半角）分隔<p>
 * 支持多计费区域查询，多个计费区域用逗号（半角）分隔<p>
 * 最多可获取最近62天内，7天跨度的数据。（注意： 按流名维度的数据，只保留2个月）<p>
 * 统计粒度：1分钟粒度；5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度；以上粒度的在线人数均取该粒度时间段的在线人数的峰值 (注意： 需要按统计粒度来汇聚，用于在界面上展示。)<p>
 * 说明:<p>
 * 按流名维度的数据，返回时并不按照“域名”维度汇聚。如果需要按域名维度的数据，请按单个域名过滤<p>
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/21
 */
public class LiveOnlineUserByStreamRequest extends LiveCommonFieldRequest {
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
     * 统计粒度
     * 取值为 5（默认）：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时力度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度的带宽值均取该粒度时间段的峰值
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
        return new GeneralRequestParam("GetLiveOnlineUserDataByStream","2016-09-01","/2016-09-01/statistics/GetLiveOnlineUserDataByStream");
    }
}

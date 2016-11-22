package com.ksc.cdn.model.statistic.live.stream.uv;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.live.LiveCommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * LiveOnlineUserByStreamRequest
 * 获取按流维度的直播在线人数数据
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
}

package com.ksc.cdn.model.statistic.wildcard;

import com.ksc.cdn.model.GeneralRequestParam;

/**
 * description：
 * author：ZHOURONG
 * date: 2017/12/7
 * mail：yangxueyi@kingsoft.com
 */
public class SubDomainsFlowRequest extends WildcardStatisticsBaseRequest {


    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetSubDomainsFlowData", "2016-09-01", "/2016-09-01/statistics/GetSubDomainsFlowData");
    }
}

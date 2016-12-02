package com.ksc.cdn.model.statistic.flow;

import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

import java.util.HashMap;
import java.util.Map;

/**
 * DomainRankingRequest
 * <p>
 * 域名排行查询<p>
 * 获取用户维度下所有域名的流量、流量占比、带宽峰值、峰值时间、访问次数，并按流量排行<p>
 * 单天维度，仅指定的单天时间查询<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 最多可获取最近一年内以天为维度的数据<p>
 * 注：仅展示查询日期内有效域名<p>
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class DomainRankingRequest implements GeneralRequest {
    /**
     * 获取数据起始时间点
     * 格式UTC时间：YYYY-MM-DD Thh:mmZ
     */
    @FieldValidate
    private String StartTime;

    /**
     * 获取数据结束时间点,结束时间应大于起始时间
     * 格式UTC时间：YYYY-MM-DD Thh:mmZ
     */
    @FieldValidate
    private String EndTime;

    /**
     * 产品类型只允许输入一种,下载download,直播live
     * @see com.ksc.cdn.model.enums.CdnTypeEnum
     */
    @FieldValidate
    private String CdnType;

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }
    @Override
    public Map<String,String> buildParams(){
        Map<String,String> params=new HashMap<String, String>();
        params.put("StartTime",StartTime);
        params.put("EndTime",EndTime);
        params.put("CdnType",CdnType);
        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetDomainRankingListData","2016-09-01","/2016-09-01/statistics/GetDomainRankingListData");
    }
}

package com.ksc.cdn.model.statistic.flow;

import com.ksc.cdn.model.valid.FieldValidate;

import java.util.HashMap;
import java.util.Map;

/**
 * DomainRankingRequest
 * 域名排行查询
 * @author jiangran@kingsoft.com
 * @date 2016/11/16
 */
public class DomainRankingRequest {
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
    public Map<String,String> buildParams(){
        Map<String,String> params=new HashMap<String, String>();
        params.put("StartTime",StartTime);
        params.put("EndTime",EndTime);
        params.put("CdnType",CdnType);
        return params;
    }
}

package com.ksc.cdn.model.statistic;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import com.ksc.cdn.util.DateUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CrazyHorse on 8/23/16.
 * 标准统计分析查询类
 * 支持按指定的起止时间查询，两者需要同时指定
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近三年内93天跨度的数据
 * 时效性：5分钟延迟
 */
public class CommonFieldRequest {

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

    /**
     * 非必须
     * 缺省为当前产品类型下的全部域名
     */
    private String DomainIds;


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

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public Map<String,String> buildParams() throws KscClientException, ParseException {
        Map<String,String> params=new HashMap<String, String>();
        params.put("CdnType", this.getCdnType());
        params.put("StartTime", this.getStartTime());
        params.put("EndTime", this.getEndTime());
        if (StringUtils.isNotBlank(this.getDomainIds()))
            params.put("DomainIds", this.getDomainIds());

        return params;
    }

    /**
     * 计算查询粒度,当需要传递查询粒度参数时,如果没有赋值则通过此方法算一个默认值并给予赋值
     * 如果期望不用默认值,自定义设置Granularity值即可
     * Granularity的取值为 5（默认）：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度
     * @param startTime
     * @param endTime
     * @return
     * @throws ParseException
     */
    public String getGranularity(String startTime, String endTime) throws ParseException {
        Date startDate = DateUtils.getTimestampByUTCDate(startTime);
        Date endDate = DateUtils.getTimestampByUTCDate(endTime);
        int betweenDay = DateUtils.getDayDiff(startDate, endDate);
        return getGranularity(betweenDay);
    }
    private String getGranularity(int betweenDay) {
        if (betweenDay == 0) {
            return "5";
        } else if (betweenDay < 2) {
            return "10";
        } else if (betweenDay < 5) {
            return "20";
        } else if (betweenDay < 15) {
            return "60";
        } else if (betweenDay < 62) {
            return "240";
        } else if (betweenDay <= 93) {
            return "480";
        } else {
            return "";
        }
    }

}

package com.ksc.cdn.model.statistic.live;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;
import com.ksc.cdn.util.DateUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * LiveCommonFieldRequest
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class LiveCommonFieldRequest implements GeneralRequest {
    /**
     * 获取数据起始时间点，日期格式按ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    @FieldValidate
    private String StartTime;
    /**
     * 结束时间需大于起始时间；获取日期格式按照ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800，例如： 2016-08-01T21:14+0800
     */
    @FieldValidate
    private String EndTime;
    /**
     * 计费区域名称
     * @see com.ksc.cdn.model.enums.RegionsEnum
     */
    private String Regions;

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

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    @Override
    public Map<String,String> buildParams() throws KscClientException, ParseException {
        Map<String,String> params=new HashMap<String, String>();

        params.put("StartTime", this.getStartTime());
        params.put("EndTime", this.getEndTime());
        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions",this.getRegions());

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

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return null;
    }
}

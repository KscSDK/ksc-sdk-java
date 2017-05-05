package com.ksc.cdn.model.statistic.playtime;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * Created by JIANGYANG1 on 2017/3/13.
 */
public class LiveWatchTimeByStreamWebRequest extends CommonFieldRequest {


    /**
     * 流名，支持批量查询，多个流名用逗号（半角）分隔
     */
    @FieldValidate
    private String streamUrls;

    /**
     * 计费区域名称， 取值为CN:中国大陆，HK：香港，TW：台湾，AS：亚洲其他，NA：北美洲，SA：南美洲，EU：欧洲，AU：大洋洲，AF：非洲，支持多计费区域查询，多个区域用逗号（半角）分隔，缺省为 CN
     */
    private String regions;

    /**
     * 取值为0：多流名多区域数据做合并；1：每个流名每个区域的数据分别返回
     */
    @FieldValidate
    private String resultType;

    /**
     * 统计粒度，取值为 5（默认）：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度；以上粒度的观看时长均取播放时长求和，除以该时段的总访问次数的值
     */
    private String granularity;

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getStreamUrls())) {
            params.put("StreamUrls", this.getStreamUrls());
        }
        if (StringUtils.isNotBlank(this.getRegions())) {
            params.put("Regions", this.getRegions());
        }
        if (StringUtils.isNotBlank(this.getResultType())) {
            params.put("ResultType", this.getResultType());
        }
        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        }
        return params;
    }


    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetPlayTimeDataByStream", "2016-09-01", "/2016-09-01/statistics/GetPlayTimeDataByStream");
    }

    public String getStreamUrls() {
        return streamUrls;
    }

    public void setStreamUrls(String streamUrls) {
        this.streamUrls = streamUrls;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }
}

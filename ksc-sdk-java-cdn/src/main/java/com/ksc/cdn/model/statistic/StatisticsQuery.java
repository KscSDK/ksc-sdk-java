package com.ksc.cdn.model.statistic;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CrazyHorse on 8/23/16.
 * 标准统计分析查询类
 */
public class StatisticsQuery {

    /**
     * 获取数据起始时间点
     * 格式UTC时间：YYYY-MM-DD Thh:mmZ
     */
    @FieldValidate
    private String startTime;

    /**
     * 获取数据结束时间点,结束时间应大于起始时间
     * 格式UTC时间：YYYY-MM-DD Thh:mmZ
     */
    @FieldValidate
    private String endTime;

    /**
     * 产品类型只允许输入一种,下载download,直播live
     */
    @FieldValidate
    private String cdnType;

    /**
     * 非必须
     * 缺省为当前产品类型下的全部域名
     */
    private String DomainIds;

    /**
     * 非必须
     * 缺省为CN
     * 计费区域名称
     */
    private String regions;

    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    @FieldValidate
    private String resultType;

    /**
     * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String granularity;

    /**
     * 非必须
     * 数据类型,edge边缘数据origin回源数据
     * 缺省为edge
     */
    private String dataType;
    /**
     * 命中率类型
     * 数据类型， 取值为flowhitrate:流量命中率;reqhitrate:请求数命中率;
     * 支持多类型选择，多个类型用逗号（半角）分隔，缺省为reqhitrate
     */
    private String hitType;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCdnType() {
        return cdnType;
    }

    public void setCdnType(String cdnType) {
        this.cdnType = cdnType;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getHitType() {
        return hitType;
    }

    public void setHitType(String hitType) {
        this.hitType = hitType;
    }

    public Map<String, String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);

        Map params = new HashMap<String, String>();

        params.put("CdnType", this.getCdnType());

        if (StringUtils.isNotBlank(this.getStartTime()))
            params.put("StartTime", this.getStartTime());

        if (StringUtils.isNotBlank(this.getEndTime()))
            params.put("EndTime", this.getEndTime());

        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions", this.getRegions());

        if (StringUtils.isNotBlank(this.getResultType()))
            params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity()))
            params.put("Granularity", this.getGranularity());

        if (StringUtils.isNotBlank(this.getDataType()))
            params.put("DataType", this.getDataType());

        if (StringUtils.isNotBlank(this.getDomainIds()))
            params.put("DomainIds", this.getDomainIds());

        if (StringUtils.isNotBlank(this.getHitType()))
            params.put("HitType", this.getHitType());

        return params;
    }
}

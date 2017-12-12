package com.ksc.cdn.model.statistic.wildcard;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * description：
 * author：ZHOURONG
 * date: 2017/12/7
 * mail：yangxueyi@kingsoft.com
 */
public class WildcardStatisticsBaseRequest extends CommonFieldRequest {


    /**
     * 表示一个泛域名
     */
    @FieldValidate
    private String domainId;
    /**
     * 表示泛域名的次级域名，但查询次级域名的个数≤100个
     */
    @FieldValidate
    private String domains;
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
     * 非必须
     * 协议类型
     * 取值为http:http协议数据; https:https协议数据
     */
    private String protocolType;

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
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

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);

        Map params = super.buildParams();

        params.put("DomainId",this.getDomainId());

        params.put("Domains",this.getDomains());

        if (StringUtils.isNotBlank(this.getRegions()))
            params.put("Regions", this.getRegions());

        if (StringUtils.isNotBlank(this.getResultType()))
            params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        } else {
            params.put("Granularity", getGranularity(this.getStartTime(), this.getEndTime()));
        }

        if (StringUtils.isNotBlank(this.getProtocolType())) {
            params.put("ProtocolType", this.getProtocolType());
        }

        if (StringUtils.isNotBlank(this.getDataType()))
            params.put("DataType", this.getDataType());

        params.put("AccountId","73406303");

        return params;
    }
}

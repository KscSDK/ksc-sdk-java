package com.ksc.cdn.model.statistic.dir.flow;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;


public class DirFlowStatisticRequest extends CommonFieldRequest{
	
	/**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    @FieldValidate
    private String resultType;

    /**
     * 统计粒度，取值为 5（默认）：5分钟粒度；
     */
    private String granularity;
    
    /**
     * 域名id
     */
    @FieldValidate
    private String domainId;
	
    /**
     * 目录
     */
    private String dirs;
    
    /**
     * 区域名称， 取值为CN:中国大陆，HK：香港，TW：台湾，AS：亚洲其他，NA：北美洲，SA：南美洲，EU：欧洲，AU：大洋洲，AF：非洲，支持多区域查询，多个区域用逗号（半角）分隔，缺省为 CN
     */
    private String regions;
    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getResultType()))
            params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        }
        
        if (StringUtils.isNotBlank(this.getDirs())) {
            params.put("Dirs", this.getDirs());
        }
        params.put("DomainId", this.domainId);
        return params;
    }
    
    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetFlowDataByDir", "2016-09-01", "/2016-09-01/statistics/GetFlowDataByDir");
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

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getDirs() {
        return dirs;
    }

    public void setDirs(String dirs) {
        this.dirs = dirs;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }
}

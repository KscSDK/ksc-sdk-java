package com.ksc.cdn.model.statistic.dir.flow;

import java.text.ParseException;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;


@Data
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
	
}

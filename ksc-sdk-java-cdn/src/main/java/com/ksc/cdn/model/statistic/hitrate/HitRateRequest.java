package com.ksc.cdn.model.statistic.hitrate;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * HitRateRequest
 *
 * @author jiangran@kingsoft.com
 * @date 10/11/2016
 */
public class HitRateRequest {
    @FieldValidate
    private String StartTime;
    @FieldValidate
    private String EndTime;
    /**
     * 产品类型，只允许输入一种类型，取值为download:下载类加速,live:直播加速
     */
    @FieldValidate
    private String CdnType;
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

    public Map<String, String> buildParams() throws KscClientException{
        CommonValidUtil.check(this);
        Map<String,String> params=new HashMap<String, String>();
        params.put("StartTime",StartTime);
        params.put("EndTime",EndTime);
        params.put("CdnType",CdnType);
        if(StringUtils.isNotBlank(DomainIds))
            params.put("DomainIds",DomainIds);
        return params;
    }
}

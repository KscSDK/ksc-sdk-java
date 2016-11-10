package com.ksc.cdn.model.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * GetCdnDomainsRequest
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class GetCdnDomainsRequest {
    private Long PageSize;
    private Long PageNumber;
    private String DomainName;
    private String DomainStatus;
    private String CdnType;
    private String FuzzyMatch;


    public Long getPageDomainsSize() {
        return PageSize;
    }

    public void setPageSize(Long pageSize) {
        PageSize = pageSize;
    }

    public Long getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        PageNumber = pageNumber;
    }

    public String getDomainName() {
        return DomainName;
    }

    public void setDomainName(String domainName) {
        DomainName = domainName;
    }

    public String getDomainStatus() {
        return DomainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        DomainStatus = domainStatus;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }

    public String getFuzzyMatch() {
        return FuzzyMatch;
    }

    public void setFuzzyMatch(String fuzzyMatch) {
        FuzzyMatch = fuzzyMatch;
    }
    public Map<String,String> buildParams(){
        Map<String,String> params=new HashMap();
        if(PageSize>0)
            params.put("PageSize",String.valueOf(PageSize));
        if(PageNumber>0)
            params.put("PageNumber",String.valueOf(PageNumber));
        if(StringUtils.isNotBlank(DomainName))
            params.put("DomainName",DomainName);
        if(StringUtils.isNotBlank(DomainStatus))
            params.put("DomainStatus",DomainStatus);
        if(StringUtils.isNotBlank(CdnType))
            params.put("CdnType",CdnType);
        if(StringUtils.isNotBlank(FuzzyMatch))
            params.put("FuzzyMatch",FuzzyMatch);
        return params;
    }
}

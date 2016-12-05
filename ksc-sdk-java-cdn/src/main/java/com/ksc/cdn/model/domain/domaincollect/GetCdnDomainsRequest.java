package com.ksc.cdn.model.domain.domaincollect;

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
    /**
     * 分页大小，默认20，最大500，取值1～500间整数
     */
    private Long PageSize;
    /**
     * 取第几页。默认为1，取值1～10000
     */
    private Long PageNumber;
    /**
     * 按域名过滤，默认为空，代表当前用户下所有域名
     */
    private String DomainName;
    /**
     * 按域名状态过滤，默认为空，代表当前用户下所有域名状态全部
     */
    private String DomainStatus;
    /**
     * 产品类型，取值为download:下载类加速,live:直播加速，多个产品类型之间用逗号（半角）间隔，默认为空，代表当前用户下全部产品类型
     */
    private String CdnType;
    /**
     * 域名过滤是否使用模糊匹配，取值为on：开启，off：关闭，默认为on
     */
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

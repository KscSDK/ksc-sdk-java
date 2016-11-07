package com.ksc.cdn;

import com.ksc.cdn.model.domain.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.GetCdnDomainsResult;

/**
 * KscCdnDomain
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public interface KscCdnDomain {
    /**
     * 域名列表
     */
    String GETCDNDOMAINS_URL = "/2016-09-01/domain/GetCdnDomains";
    String GETCDNDOMAINS_VERSION = "2016-09-01";
    String GETCDNDOMAINS_ACTION = "GetCdnDomains";

    /**
     * 获取域名列表
     * @param getCdnDomainsRequest
     * @return
     * @throws Exception
     */
    GetCdnDomainsResult getCdnDomains(GetCdnDomainsRequest getCdnDomainsRequest) throws Exception;
}

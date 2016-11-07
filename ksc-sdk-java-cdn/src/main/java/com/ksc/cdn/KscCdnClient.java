package com.ksc.cdn;


import com.ksc.HttpMethod;
import com.ksc.cdn.model.domain.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.GetCdnDomainsResult;

import java.util.Map;

public class KscCdnClient extends KscApiCommon implements KscCdnDomain{

    private final String ENDPOINT="http://cdn.api.ksyun.com";
    private final String API_REGION="cn-shanghai-1";
    private final String ACCESS_KEY="AKTPKpSIjlP9TAmNnyhoJhAu9w";
    private final String SECRET_ACCESS_KEY="OEZh7MI3BWvFhkxlxMnEoh+9rvYPg5dCUuN3SnOT9qvZfEXgfZhX6FwbWfHs2upwNQ==";
    private final String API_SERVICE_NAME="cdn";

    public KscCdnClient(){
        this.setSecretAccessKey(SECRET_ACCESS_KEY);
        this.setAccessKey(ACCESS_KEY);
        this.setEndPoint(ENDPOINT);
        this.setApiRegion(API_REGION);
        this.setApiServiceName(API_SERVICE_NAME);
    }


    @Override
    public GetCdnDomainsResult getCdnDomains(GetCdnDomainsRequest getCdnDomainsRequest) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(GETCDNDOMAINS_VERSION, GETCDNDOMAINS_ACTION);
        GetCdnDomainsResult result = this.httpExecute(HttpMethod.GET, GETCDNDOMAINS_URL, getCdnDomainsRequest.buildParams(), buildHeaders, GetCdnDomainsResult.class);
        return result;
    }
}

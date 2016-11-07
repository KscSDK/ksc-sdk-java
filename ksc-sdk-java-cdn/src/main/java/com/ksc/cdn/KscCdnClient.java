package com.ksc.cdn;


import com.ksc.HttpMethod;
import com.ksc.cdn.model.domain.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.GetCdnDomainsResult;
import com.ksc.cdn.model.statistic.BpsResult;
import com.ksc.cdn.model.statistic.StatisticsQuery;

import java.util.Map;

public class KscCdnClient extends KscApiCommon implements KscCdnDomain,KscCdnStatistics{

    private final String ENDPOINT="http://cdn.api.ksyun.com";
    private final String API_REGION="cn-shanghai-1";
    private final String ACCESS_KEY="AKTPVehAgM_QRJO1qB0sp_UqOQ";
    private final String SECRET_ACCESS_KEY="OBu94Km05RpidhuyL3Ryp72NR895q0nGCLjMCuWm7zkPK9xbaE5EnFwfidW0oCIHXw==";
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

    @Override
    public BpsResult getBandwidthData(StatisticsQuery statisticsQuery) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(BANDWIDTH_VERSION, BANDWIDTH_ACTION);
        BpsResult result=this.httpExecute(HttpMethod.GET,BANDWIDTH_URL,statisticsQuery.buildParams(),buildHeaders,BpsResult.class);
        return result;
    }
}

package com.ksc.cdn;


import com.ksc.HttpMethod;
import com.ksc.cdn.model.domain.*;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;
import com.ksc.cdn.model.statistic.BpsResult;
import com.ksc.cdn.model.statistic.FlowResult;
import com.ksc.cdn.model.statistic.StatisticsQuery;
import org.apache.commons.lang3.StringUtils;


import java.util.HashMap;
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

    @Override
    public FlowResult getFlowDataByApi(StatisticsQuery statisticsQuery) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(FLOW_VERSION, FLOW_ACTION);
        FlowResult result=this.httpExecute(HttpMethod.GET,FLOW_URL,statisticsQuery.buildParams(),buildHeaders,FlowResult.class);
        return result;
    }

    @Override
    public AddDomainResult addDomainBase(AddDomainRequest addDomainRequest) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(ADD_DOMAIN_VERSION, ADD_DOMAIN_ACTION);
        AddDomainResult addDomainResult = this.httpExecute(HttpMethod.GET, ADD_DOMAIN_URL, addDomainRequest.buildParams(), buildHeaders, AddDomainResult.class);
        return addDomainResult;
    }

    @Override
    public GetDomainBaseResult getCdnDomainBasic(String domainId) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(QUERY_DOMAIN_VERSION, QUERY_DOMAIN_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        GetDomainBaseResult getDomainBaseResult = this.httpExecute(HttpMethod.GET, QUERY_DOMAIN_URL, params, buildHeaders, GetDomainBaseResult.class);
        return getDomainBaseResult;
    }

    @Override
    public String updateDomainBase(ModifyDomainRequest modifyParam) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(MODIFY_DOMAIN_VERSION, MODIFY_DOMAIN_ACTION);
        String requestId = this.httpExecute(HttpMethod.GET, MODIFY_DOMAIN_URL, modifyParam.buildParams(), buildHeaders, String.class);
        return requestId;
    }

    @Override
    public String startStopCdnDomain(String domainId, ActionTypeEnum action) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(STARTSTOPCDNDOMAIN_VERSION, STARTSTOPCDNDOMAIN_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        params.put("ActionType",action.getValue());
        String requestId = this.httpExecute(HttpMethod.GET, STARTSTOPCDNDOMAIN_URL, params, buildHeaders, String.class);
        return requestId;
    }

    @Override
    public String deleteCdnDomain(String domainId) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(DELETECDNDOMAIN_VERSION, DELETECDNDOMAIN_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        String requestId = this.httpExecute(HttpMethod.GET, DELETECDNDOMAIN_URL, params, buildHeaders, String.class);
        return requestId;
    }

    @Override
    public GetDomainConfigResult getDomainConfigs(String domainId, DomainConfigEnum... configs) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(CONFIG_VERSION, CONFIG_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        StringBuilder configList=new StringBuilder();
        for (DomainConfigEnum conf:configs
             ) {
            configList.append(conf.getValue()).append(",");
        }
        params.put("ConfigList", StringUtils.substringBeforeLast(configList.toString(),","));
        GetDomainConfigResult getDomainConfigResult = this.httpExecute(HttpMethod.GET, CONFIG_URL, params, buildHeaders, GetDomainConfigResult.class);
        return getDomainConfigResult;
    }
}

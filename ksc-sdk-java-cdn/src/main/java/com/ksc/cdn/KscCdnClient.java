package com.ksc.cdn;


import com.ksc.HttpMethod;
import com.ksc.cdn.model.domain.*;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;
import com.ksc.cdn.model.enums.SwitchEnum;
import com.ksc.cdn.model.statistic.*;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;


import java.util.HashMap;
import java.util.Map;

public class KscCdnClient extends KscApiCommon implements KscCdnDomain,KscCdnStatistics{

    private final String ENDPOINT="http://cdn.api.ksyun.com";
    private final String API_REGION="cn-shanghai-1";
    private final String ACCESS_KEY="AKTPnBeE8s5_RUOdTNiyqt6MHQ";
    private final String SECRET_ACCESS_KEY="ONV7B2Phe0rt4g35pIC9Ve8gLoWTuAU27bsyu92ZIXpLdZ/tESR2IVj1t2Ch5tQDxw==";
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
    public void updateDomainBase(ModifyDomainRequest modifyParam) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(MODIFY_DOMAIN_VERSION, MODIFY_DOMAIN_ACTION);
        this.httpExecute(HttpMethod.GET, MODIFY_DOMAIN_URL, modifyParam.buildParams(), buildHeaders, Void.class);
    }

    @Override
    public void startStopCdnDomain(String domainId, ActionTypeEnum action) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(STARTSTOPCDNDOMAIN_VERSION, STARTSTOPCDNDOMAIN_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        params.put("ActionType",action.getValue());
        this.httpExecute(HttpMethod.GET, STARTSTOPCDNDOMAIN_URL, params, buildHeaders, Void.class);
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

    @Override
    public void setIgnoreQueryStringConfig(String domainId, SwitchEnum enable) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(IGNORE_QUERY_STRING_VERSION, IGNORE_QUERY_STRING_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        params.put("Enable",enable.getValue());
        this.httpExecute(HttpMethod.GET, IGNORE_QUERY_STRING_URL, params, buildHeaders, Void.class);

    }

    @Override
    public void setBackOriginConfig(String domainId, String originHost) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(BACK_ORIGIN_VERSION, BACK_ORIGIN_ACTION);
        Map<String,String> params=new HashMap<String, String>();
        params.put("DomainId",domainId);
        params.put("BackOriginHost",originHost);
        this.httpExecute(HttpMethod.GET, BACK_ORIGIN_URL, params, buildHeaders, Void.class);
    }

    @Override
    public void setReferProtectionConfig(ReferProtectionRequest referProtection) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(REFER_PROTECTION_VERSION, REFER_PROTECTION_ACTION);
        this.httpExecute(HttpMethod.GET,REFER_PROTECTION_URL,referProtection.buildParams(),buildHeaders,Void.class);
    }

    @Override
    public void setCacheRule(CacheConfigRequest cacheRuleConfig) throws Exception {
        CommonValidUtil.check(cacheRuleConfig);
        Map<String, String> buildHeaders = this.buildHeaders(SETCACHERULECONFIG_VERSION, SETCACHERULECONFIG_ACTION, true);
        this.httpExecute(HttpMethod.POST, SETCACHERULECONFIG_URL, cacheRuleConfig, buildHeaders, Void.class);
    }

    @Override
    public void setTestUrl(String domainId, String testUrl) throws Exception {
        Map<String, String> params = new HashMap();
        params.put("DomainId", domainId);
        params.put("TestUrl", testUrl);
        Map<String, String> buildHeaders = this.buildHeaders(SETTESTURLCONFIG_VERSION, SETTESTURLCONFIG_ACTION);
        this.httpExecute(HttpMethod.GET, SETTESTURLCONFIG_URL, params, buildHeaders, Void.class);
    }

    @Override
    public void setOriginAdvanced(OriginAdvancedConfigRequest originAdvancedConfig) throws Exception {
        CommonValidUtil.check(originAdvancedConfig);
        Map<String, String> buildHeaders = this.buildHeaders(SETORIGINADVANCEDCONFIG_VERSION, SETORIGINADVANCEDCONFIG_ACTION, true);
        this.httpExecute(HttpMethod.POST, SETORIGINADVANCEDCONFIG_URL, originAdvancedConfig, buildHeaders, Void.class);
    }

    @Override
    public void setRemark(String domainId, String remark) throws Exception {
        Map<String, String> params = new HashMap();
        params.put("DomainId", domainId);
        params.put("Remark", remark);
        Map<String, String> buildHeaders = this.buildHeaders(SETREMARKCONFIG_VERSION, SETREMARKCONFIG_ACTION);
        this.httpExecute(HttpMethod.GET, SETREMARKCONFIG_URL, params, buildHeaders, Void.class);
    }

    @Override
    public HitRateResult getHitRate(HitRateRequest hitRateRequest) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(HITRATE_VERSION, HITRATE_ACTION);
        HitRateResult hitRateResult = this.httpExecute(HttpMethod.GET, HITRATE_URL, hitRateRequest.buildParams(), buildHeaders, HitRateResult.class);
        return hitRateResult;
    }

    @Override
    public HitRateDetailResult getHitRateDetail(StatisticsQuery statisticsQuery) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(HITRATE_DETAIL_VERSION, HITRATE_DETAIL_ACTION);
        HitRateDetailResult hitRateDetailResult = this.httpExecute(HttpMethod.GET, HITRATE_DETAIL_URL, statisticsQuery.buildParams(), buildHeaders, HitRateDetailResult.class);
        return hitRateDetailResult;
    }

    @Override
    public PVResult getPV(StatisticsQuery statisticsQuery) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(PV_VERSION, PV_ACTION);
        PVResult pvResult = this.httpExecute(HttpMethod.GET, HITRATE_DETAIL_URL, statisticsQuery.buildParams(), buildHeaders, PVResult.class);
        return pvResult;
    }
}

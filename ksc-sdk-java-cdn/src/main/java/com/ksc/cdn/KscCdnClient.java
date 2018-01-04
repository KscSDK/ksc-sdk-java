package com.ksc.cdn;


import com.ksc.HttpMethod;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.content.*;
import com.ksc.cdn.model.domain.blockurl.BlockDomainUrlRequest;
import com.ksc.cdn.model.domain.blockurl.GetBlockUrlQuotaResponse;
import com.ksc.cdn.model.domain.blockurl.GetBlockUrlTaskRequest;
import com.ksc.cdn.model.domain.blockurl.GetBlockUrlTaskResponse;
import com.ksc.cdn.model.domain.createdomain.AddDomainRequest;
import com.ksc.cdn.model.domain.createdomain.AddDomainResult;
import com.ksc.cdn.model.domain.domainbase.GetDomainBaseResult;
import com.ksc.cdn.model.domain.domainbase.ModifyDomainRequest;
import com.ksc.cdn.model.domain.domaincache.CacheConfigRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsResult;
import com.ksc.cdn.model.domain.domaindetail.*;
import com.ksc.cdn.model.domain.domainhttps.*;
import com.ksc.cdn.model.domain.tool.GetCnameSuffixsResult;
import com.ksc.cdn.model.domain.tool.GetDomainsByOriginResult;
import com.ksc.cdn.model.domain.tool.GetServiceIpResult;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;
import com.ksc.cdn.model.enums.HttpHeaderKeyEnum;
import com.ksc.cdn.model.enums.SwitchEnum;
import com.ksc.cdn.model.log.*;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * api接口功能实现
 */
public class KscCdnClient<R> extends KscApiCommon implements KscCdnDomain, KscCdnStatistics, KscCdnLog, KscCdnContent, KscCdnHttps, KscCdnBlockUrl {

    public KscCdnClient() {

    }

    public KscCdnClient(String accessKey, String secretKey) {
        this.setSecretAccessKey(secretKey);
        this.setAccessKey(accessKey);
        this.setEndPoint("http://cdn.api.ksyun.com");
        this.setApiRegion("cn-shanghai-1");
        this.setApiServiceName("cdn");
    }

    public KscCdnClient(String accessKey, String secretKey, String endPoint, String region, String serviceName) {
        this.setSecretAccessKey(secretKey);
        this.setAccessKey(accessKey);
        this.setEndPoint(endPoint);
        this.setApiRegion(region);
        this.setApiServiceName(serviceName);
    }

    private static Logger log = LoggerFactory.getLogger(KscCdnClient.class);


    @Override
    public GetServiceIpResult getServiceIp(String domainId) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(GETSERVICEIP_VERSION, GETSERVICEIP_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        GetServiceIpResult result = this.httpExecute(HttpMethod.GET, GETSERVICEIP_URL, params, buildHeaders, GetServiceIpResult.class);
        return result;
    }

    @Override
    public void setDomainConfigs(AllConfigsRequest allConfigs) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(SETDOMAINCONFIGS_VERSION, SETDOMAINCONFIGS_ACTION,true);
        this.httpExecute(HttpMethod.POST, SETDOMAINCONFIGS_URL, allConfigs, buildHeaders, Void.class);
    }

    @Override
    public GetDomainsByOriginResult getDomainsByOrigin(String origin) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(GETDOMAINSBYORIGIN_VERSION, GETDOMAINSBYORIGIN_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        GetDomainsByOriginResult result = this.httpExecute(HttpMethod.GET, GETDOMAINSBYORIGIN_URL,params,buildHeaders, GetDomainsByOriginResult.class);
        return result;
    }

    @Override
    public GetCnameSuffixsResult getCnameSuffixs() throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(GETCNAMESUFFIXS_VERSION, GETCNAMESUFFIXS_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("AccountId", "2000001954");
        GetCnameSuffixsResult result = this.httpExecute(HttpMethod.GET, GETCNAMESUFFIXS_URL,params,buildHeaders, GetCnameSuffixsResult.class);
        return result;
    }

    @Override
    public GetCdnDomainsResult getCdnDomains(GetCdnDomainsRequest getCdnDomainsRequest) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(GETCDNDOMAINS_VERSION, GETCDNDOMAINS_ACTION);
        GetCdnDomainsResult result = this.httpExecute(HttpMethod.GET, GETCDNDOMAINS_URL, getCdnDomainsRequest.buildParams(), buildHeaders, GetCdnDomainsResult.class);
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
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
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
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        params.put("ActionType", action.getValue());
        this.httpExecute(HttpMethod.GET, STARTSTOPCDNDOMAIN_URL, params, buildHeaders, Void.class);
    }

    @Override
    public String deleteCdnDomain(String domainId) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(DELETECDNDOMAIN_VERSION, DELETECDNDOMAIN_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        String requestId = this.httpExecute(HttpMethod.GET, DELETECDNDOMAIN_URL, params, buildHeaders, String.class);
        return requestId;
    }

    @Override
    public GetDomainConfigResult getDomainConfigs(String domainId, DomainConfigEnum... configs) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(CONFIG_VERSION, CONFIG_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        StringBuilder configList = new StringBuilder();
        for (DomainConfigEnum conf : configs
                ) {
            configList.append(conf.getValue()).append(",");
        }
        params.put("ConfigList", StringUtils.substringBeforeLast(configList.toString(), ","));
        GetDomainConfigResult getDomainConfigResult = this.httpExecute(HttpMethod.GET, CONFIG_URL, params, buildHeaders, GetDomainConfigResult.class);
        return getDomainConfigResult;
    }

    @Override
    public void setIgnoreQueryStringConfig(String domainId, SwitchEnum enable) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(IGNORE_QUERY_STRING_VERSION, IGNORE_QUERY_STRING_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        params.put("Enable", enable.getValue());
        this.httpExecute(HttpMethod.GET, IGNORE_QUERY_STRING_URL, params, buildHeaders, Void.class);

    }

    @Override
    public void setBackOriginConfig(String domainId, String originHost) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(BACK_ORIGIN_VERSION, BACK_ORIGIN_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        params.put("BackOriginHost", originHost);
        this.httpExecute(HttpMethod.GET, BACK_ORIGIN_URL, params, buildHeaders, Void.class);
    }

    @Override
    public void setReferProtectionConfig(ReferProtectionRequest referProtection) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(REFER_PROTECTION_VERSION, REFER_PROTECTION_ACTION);
        this.httpExecute(HttpMethod.GET, REFER_PROTECTION_URL, referProtection.buildParams(), buildHeaders, Void.class);
    }

    @Override
    public void setIpProtectionConfig(IpProtectionRequest ipProtection) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(IP_PROTECTION_VERSION, IP_PROTECTION_ACTION);
        this.httpExecute(HttpMethod.GET, IP_PROTECTION_URL, ipProtection.buildParams(), buildHeaders, Void.class);
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
    public R generalGetStatisticsData(GeneralRequest request, Class rType) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction());
        R result = (R) this.httpExecute(HttpMethod.GET, generalRequestParam.getUrl(), request.buildParams(), buildHeaders, rType);
        return result;
    }

    @Override
    public RefreshCachesResult refreshCaches(RefreshCachesRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, RefreshCachesResult.class);
    }

    @Override
    public PreloadCachesResult preloadCaches(PreloadCachesRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, PreloadCachesResult.class);
    }

    @Override
    public RefreshOrPreloadTaskResult getRefreshOrPreloadTask(RefreshOrPreloadTaskRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, RefreshOrPreloadTaskResult.class);
    }

    @Override
    public RefreshOrPreloadQuotaResult getRefreshOrPreloadQuota(RefreshOrPreloadQuotaRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, RefreshOrPreloadQuotaResult.class);
    }

    @Override
    public DomainLogsResult getDomainLogs(DomainLogsRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, DomainLogsResult.class);
    }

    @Override
    public void setDomainLogService(DomainLogServiceRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request.buildParams(), buildHeaders, Void.class);
    }

    @Override
    public DomainLogServiceStatusResult getDomainLogServiceStatus(DomainLogServiceStatusRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, DomainLogServiceStatusResult.class);
    }

    @Override
    public void blockDomainUrl(BlockDomainUrlRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, Void.class);
    }

    @Override
    public GetBlockUrlTaskResponse getBlockUrlTask(GetBlockUrlTaskRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, GetBlockUrlTaskResponse.class);
    }

    @Override
    public GetBlockUrlQuotaResponse getBlockUrlQuota() throws Exception {
        GeneralRequestParam generalRequestParam = new GeneralRequestParam("GetBlockUrlQuota", "2016-09-01", "/2016-09-01/content/GetBlockUrlQuota");
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.GET, generalRequestParam.getUrl(), new HashMap<String,String>(), buildHeaders, GetBlockUrlQuotaResponse.class);
    }

    @Override
    public void configCertificate(HttpsConfCertRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, Void.class);
    }

    @Override
    public void setCertificate(HttpsSetCertRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, Void.class);
    }

    @Override
    public void removeCertificates(HttpsRemoveCertRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, Void.class);
    }

    @Override
    public HttpsGetCertResponse getCertificates(HttpsGetCertRequest request) throws Exception {
        GeneralRequestParam generalRequestParam = request.getGeneralRequestParam();
        Map<String, String> buildHeaders = this.buildHeaders(generalRequestParam.getVersion(), generalRequestParam.getAction(), true);
        return this.httpExecute(HttpMethod.POST, generalRequestParam.getUrl(), request, buildHeaders, HttpsGetCertResponse.class);
    }

    private String getDomainByUrl(String url) {
        Pattern p = Pattern.compile("(?<=://|)([^\\s/]+\\.)+[^\\s/:]+", Pattern.CASE_INSENSITIVE);
        java.util.regex.Matcher matcher = p.matcher(url);
        matcher.find();
        return matcher.group();
    }

    @Override
    public void setVideoSeekConfig(String domainId, SwitchEnum enable) throws Exception {
        Map<String, String> buildHeaders = this.buildHeaders(SETVIDEOSEEKCONFIG_VERSION, SETVIDEOSEEKCONFIG_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        params.put("Enable", enable.getValue());
        this.httpExecute(HttpMethod.POST, SETVIDEOSEEKCONFIG_URL, params, buildHeaders, Void.class);
    }

    @Override
    public VideoSeekConfig getVideoSeekConfig(String domainId) throws Exception{
        Map<String, String> buildHeaders = this.buildHeaders(GETVIDEOSEEKCONFIG_VERSION, GETVIDEOSEEKCONFIG_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        return this.httpExecute(HttpMethod.POST, GETVIDEOSEEKCONFIG_URL, params, buildHeaders, VideoSeekConfig.class);
    }

    @Override
    public void setHttpHeadersConfig(String domainId, HttpHeaderKeyEnum httpHeaderKeyEnum, String headerValue) throws Exception{
        Map<String, String> buildHeaders = this.buildHeaders(SETHTTPHEADERSCONFIG_VERSION, SETHTTPHEADERSCONFIG_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        params.put("HeaderKey", httpHeaderKeyEnum.getValue());
        params.put("HeaderValue",headerValue);
        this.httpExecute(HttpMethod.POST, SETHTTPHEADERSCONFIG_URL, params, buildHeaders, Void.class);
    }

    @Override
    public void deleteHttpHeadersConfig(String domainId, HttpHeaderKeyEnum httpHeaderKeyEnum) throws Exception{
        Map<String, String> buildHeaders = this.buildHeaders(DELETEHTTPHEADERSCONFIG_VERSION, DELETEHTTPHEADERSCONFIG_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        params.put("HeaderKey", httpHeaderKeyEnum.getValue());
        this.httpExecute(HttpMethod.POST, DELETEHTTPHEADERSCONFIG_URL, params, buildHeaders, Void.class);
    }

    @Override
    public HttpHeadersList getHttpHeaderList(String domainId) throws Exception{
        Map<String, String> buildHeaders = this.buildHeaders(GETHTTPHEADERLIST_VERSION, GETHTTPHEADERLIST_ACTION);
        Map<String, String> params = new HashMap<String, String>();
        params.put("DomainId", domainId);
        return this.httpExecute(HttpMethod.POST, GETHTTPHEADERLIST_URL, params, buildHeaders, HttpHeadersList.class);
    }


}
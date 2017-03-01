package com.ksc.cdn;


import com.ksc.HttpMethod;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.content.*;
import com.ksc.cdn.model.domain.createdomain.AddDomainRequest;
import com.ksc.cdn.model.domain.createdomain.AddDomainResult;
import com.ksc.cdn.model.domain.domainbase.GetDomainBaseResult;
import com.ksc.cdn.model.domain.domainbase.ModifyDomainRequest;
import com.ksc.cdn.model.domain.domaincache.CacheConfigRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsResult;
import com.ksc.cdn.model.domain.domaindetail.GetDomainConfigResult;
import com.ksc.cdn.model.domain.domaindetail.OriginAdvancedConfigRequest;
import com.ksc.cdn.model.domain.domaindetail.ReferProtectionRequest;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;
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
public class KscCdnClient<R> extends KscApiCommon implements KscCdnDomain, KscCdnStatistics, KscCdnLog, KscCdnContent {

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

    private String getDomainByUrl(String url) {
        Pattern p = Pattern.compile("(?<=://|)([^\\s/]+\\.)+[^\\s/:]+", Pattern.CASE_INSENSITIVE);
        java.util.regex.Matcher matcher = p.matcher(url);
        matcher.find();
        return matcher.group();
    }
}

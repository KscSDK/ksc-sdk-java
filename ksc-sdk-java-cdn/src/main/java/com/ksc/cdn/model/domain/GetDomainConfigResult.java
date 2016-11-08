package com.ksc.cdn.model.domain;

/**
 * GetDomainConfigResult
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class GetDomainConfigResult {

    private CacheRuleConfig CacheRuleConfig;
    private IpProtectionConfig IpProtectionConfig;
    private GzipConfig GzipConfig;
    private IgnoreQueryStringConfig IgnoreQueryStringConfig;
    private BackOriginConfig BackOriginConfig;
    private ReferProtectionConfig ReferProtectionConfig;
    private UrlAuthConfig UrlAuthConfig;
    private BackOriginHostConfig BackOriginHostConfig;
    private VideoSeekConfig VideoSeekConfig;
    private OriginAdvancedConfig OriginAdvancedConfig;
    private DetectOriginConfig DetectOriginConfig;

    public GetDomainConfigResult.CacheRuleConfig getCacheRuleConfig() {
        return CacheRuleConfig;
    }

    public void setCacheRuleConfig(GetDomainConfigResult.CacheRuleConfig cacheRuleConfig) {
        CacheRuleConfig = cacheRuleConfig;
    }

    public GetDomainConfigResult.IpProtectionConfig getIpProtectionConfig() {
        return IpProtectionConfig;
    }

    public void setIpProtectionConfig(GetDomainConfigResult.IpProtectionConfig ipProtectionConfig) {
        IpProtectionConfig = ipProtectionConfig;
    }

    public GetDomainConfigResult.GzipConfig getGzipConfig() {
        return GzipConfig;
    }

    public void setGzipConfig(GetDomainConfigResult.GzipConfig gzipConfig) {
        GzipConfig = gzipConfig;
    }

    public GetDomainConfigResult.IgnoreQueryStringConfig getIgnoreQueryStringConfig() {
        return IgnoreQueryStringConfig;
    }

    public void setIgnoreQueryStringConfig(GetDomainConfigResult.IgnoreQueryStringConfig ignoreQueryStringConfig) {
        IgnoreQueryStringConfig = ignoreQueryStringConfig;
    }

    public GetDomainConfigResult.BackOriginConfig getBackOriginConfig() {
        return BackOriginConfig;
    }

    public void setBackOriginConfig(GetDomainConfigResult.BackOriginConfig backOriginConfig) {
        BackOriginConfig = backOriginConfig;
    }

    public GetDomainConfigResult.ReferProtectionConfig getReferProtectionConfig() {
        return ReferProtectionConfig;
    }

    public void setReferProtectionConfig(GetDomainConfigResult.ReferProtectionConfig referProtectionConfig) {
        ReferProtectionConfig = referProtectionConfig;
    }

    public GetDomainConfigResult.UrlAuthConfig getUrlAuthConfig() {
        return UrlAuthConfig;
    }

    public void setUrlAuthConfig(GetDomainConfigResult.UrlAuthConfig urlAuthConfig) {
        UrlAuthConfig = urlAuthConfig;
    }

    public GetDomainConfigResult.BackOriginHostConfig getBackOriginHostConfig() {
        return BackOriginHostConfig;
    }

    public void setBackOriginHostConfig(GetDomainConfigResult.BackOriginHostConfig backOriginHostConfig) {
        BackOriginHostConfig = backOriginHostConfig;
    }

    public GetDomainConfigResult.VideoSeekConfig getVideoSeekConfig() {
        return VideoSeekConfig;
    }

    public void setVideoSeekConfig(GetDomainConfigResult.VideoSeekConfig videoSeekConfig) {
        VideoSeekConfig = videoSeekConfig;
    }

    public GetDomainConfigResult.OriginAdvancedConfig getOriginAdvancedConfig() {
        return OriginAdvancedConfig;
    }

    public void setOriginAdvancedConfig(GetDomainConfigResult.OriginAdvancedConfig originAdvancedConfig) {
        OriginAdvancedConfig = originAdvancedConfig;
    }

    public GetDomainConfigResult.DetectOriginConfig getDetectOriginConfig() {
        return DetectOriginConfig;
    }

    public void setDetectOriginConfig(GetDomainConfigResult.DetectOriginConfig detectOriginConfig) {
        DetectOriginConfig = detectOriginConfig;
    }

    public class CacheRuleConfig{
        private CacheRules[] CacheRules;

        public GetDomainConfigResult.CacheRules[] getCacheRules() {
            return CacheRules;
        }

        public void setCacheRules(GetDomainConfigResult.CacheRules[] cacheRules) {
            CacheRules = cacheRules;
        }
    }
    public class CacheRules{
        private String CacheRuleType;
        private String Value;
        private int CacheTime;
        private String RespectOrigin;
        private String IgnoreNoCache;

        public String getCacheRuleType() {
            return CacheRuleType;
        }

        public void setCacheRuleType(String cacheRuleType) {
            CacheRuleType = cacheRuleType;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }

        public int getCacheTime() {
            return CacheTime;
        }

        public void setCacheTime(int cacheTime) {
            CacheTime = cacheTime;
        }

        public String getRespectOrigin() {
            return RespectOrigin;
        }

        public void setRespectOrigin(String respectOrigin) {
            RespectOrigin = respectOrigin;
        }

        public String getIgnoreNoCache() {
            return IgnoreNoCache;
        }

        public void setIgnoreNoCache(String ignoreNoCache) {
            IgnoreNoCache = ignoreNoCache;
        }
    }
    public class IpProtectionConfig{
        private String IpList;

        public String getIpList() {
            return IpList;
        }

        public void setIpList(String ipList) {
            IpList = ipList;
        }
    }
    public class HttpHeaderRules{
        private Object[] HttpHeaderRules;

        public Object[] getHttpHeaderRules() {
            return HttpHeaderRules;
        }

        public void setHttpHeaderRules(Object[] httpHeaderRules) {
            HttpHeaderRules = httpHeaderRules;
        }
    }
    public class GzipConfig{
        private String Enable;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }
    }
    public class IgnoreQueryStringConfig{
        private String Enable;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }
    }
    public class BackOriginConfig{
        private String Enable;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }
    }
    public class ReferProtectionConfig{
        private String Enable;
        private String ReferType;
        private String ReferList;
        private String AllowEmpty;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }

        public String getReferType() {
            return ReferType;
        }

        public void setReferType(String referType) {
            ReferType = referType;
        }

        public String getReferList() {
            return ReferList;
        }

        public void setReferList(String referList) {
            ReferList = referList;
        }

        public String getAllowEmpty() {
            return AllowEmpty;
        }

        public void setAllowEmpty(String allowEmpty) {
            AllowEmpty = allowEmpty;
        }
    }
    public class UrlAuthConfig{
        private String Enable;
        private String AuthType;
        private String Key1;
        private String Key2;
        private String Timeout;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }

        public String getAuthType() {
            return AuthType;
        }

        public void setAuthType(String authType) {
            AuthType = authType;
        }

        public String getKey1() {
            return Key1;
        }

        public void setKey1(String key1) {
            Key1 = key1;
        }

        public String getKey2() {
            return Key2;
        }

        public void setKey2(String key2) {
            Key2 = key2;
        }

        public String getTimeout() {
            return Timeout;
        }

        public void setTimeout(String timeout) {
            Timeout = timeout;
        }
    }
    public class BackOriginHostConfig {
        private String BackOriginHost;

        public String getBackOriginHost() {
            return BackOriginHost;
        }

        public void setBackOriginHost(String backOriginHost) {
            BackOriginHost = backOriginHost;
        }
    }
    public class VideoSeekConfig{
        private String Enable;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }
    }
    public class OriginAdvancedConfig{
        private String Enable;
        private String OriginType;
        private Object[] OriginAdvancedItems;
        private String OriginPolicy;
        private String OriginPolicyBestCount;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }

        public String getOriginType() {
            return OriginType;
        }

        public void setOriginType(String originType) {
            OriginType = originType;
        }

        public Object[] getOriginAdvancedItems() {
            return OriginAdvancedItems;
        }

        public void setOriginAdvancedItems(Object[] originAdvancedItems) {
            OriginAdvancedItems = originAdvancedItems;
        }

        public String getOriginPolicy() {
            return OriginPolicy;
        }

        public void setOriginPolicy(String originPolicy) {
            OriginPolicy = originPolicy;
        }

        public String getOriginPolicyBestCount() {
            return OriginPolicyBestCount;
        }

        public void setOriginPolicyBestCount(String originPolicyBestCount) {
            OriginPolicyBestCount = originPolicyBestCount;
        }
    }
    public class DetectOriginConfig{
        private String Enable;
        private String DetectMethod;
        private String ExpectedResponse;
        private String DetectUrl;
        private String Frequency;

        public String getEnable() {
            return Enable;
        }

        public void setEnable(String enable) {
            Enable = enable;
        }

        public String getDetectMethod() {
            return DetectMethod;
        }

        public void setDetectMethod(String detectMethod) {
            DetectMethod = detectMethod;
        }

        public String getExpectedResponse() {
            return ExpectedResponse;
        }

        public void setExpectedResponse(String expectedResponse) {
            ExpectedResponse = expectedResponse;
        }

        public String getDetectUrl() {
            return DetectUrl;
        }

        public void setDetectUrl(String detectUrl) {
            DetectUrl = detectUrl;
        }

        public String getFrequency() {
            return Frequency;
        }

        public void setFrequency(String frequency) {
            Frequency = frequency;
        }
    }
    public class TestUrlConfig{
        private String TestUrlConfig;

        public String getTestUrlConfig() {
            return TestUrlConfig;
        }

        public void setTestUrlConfig(String testUrlConfig) {
            TestUrlConfig = testUrlConfig;
        }
    }
}

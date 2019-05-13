package com.ksc.cdn.model.domain.domaindetail;

/**
 * GetDomainConfigResult
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class GetDomainConfigResult {

    private CacheRuleConfig CacheRuleConfig;
    private IpProtectionConfig IpProtectionConfig;
    private IgnoreQueryStringConfig IgnoreQueryStringConfig;
    private BackOriginConfig BackOriginConfig;
    private ReferProtectionConfig ReferProtectionConfig;
    private UrlAuthConfig UrlAuthConfig;

    private BackOriginHostConfig BackOriginHostConfig;
    private VideoSeekConfig VideoSeekConfig;
    private OriginAdvancedConfig OriginAdvancedConfig;
    private DetectOriginConfig DetectOriginConfig;
    private TestUrlConfig TestUrlConfig;
    private HttpHeadersConfig HttpHeadersConfig;
    private RequestAuthConfig RequestAuthConfig;
    private Http2OptionConfig Http2OptionConfig;
    private PageCompressConfig PageCompressConfig;
    private ErrorPageConfig ErrorPageConfig;
    private ForceRedirectConfig ForceRedirectConfig;


    public com.ksc.cdn.model.domain.domaindetail.CacheRuleConfig getCacheRuleConfig() {
        return CacheRuleConfig;
    }

    public void setCacheRuleConfig(com.ksc.cdn.model.domain.domaindetail.CacheRuleConfig cacheRuleConfig) {
        CacheRuleConfig = cacheRuleConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.IpProtectionConfig getIpProtectionConfig() {
        return IpProtectionConfig;
    }

    public void setIpProtectionConfig(com.ksc.cdn.model.domain.domaindetail.IpProtectionConfig ipProtectionConfig) {
        IpProtectionConfig = ipProtectionConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.IgnoreQueryStringConfig getIgnoreQueryStringConfig() {
        return IgnoreQueryStringConfig;
    }

    public void setIgnoreQueryStringConfig(com.ksc.cdn.model.domain.domaindetail.IgnoreQueryStringConfig ignoreQueryStringConfig) {
        IgnoreQueryStringConfig = ignoreQueryStringConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.BackOriginConfig getBackOriginConfig() {
        return BackOriginConfig;
    }

    public void setBackOriginConfig(com.ksc.cdn.model.domain.domaindetail.BackOriginConfig backOriginConfig) {
        BackOriginConfig = backOriginConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.ReferProtectionConfig getReferProtectionConfig() {
        return ReferProtectionConfig;
    }

    public void setReferProtectionConfig(com.ksc.cdn.model.domain.domaindetail.ReferProtectionConfig referProtectionConfig) {
        ReferProtectionConfig = referProtectionConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.UrlAuthConfig getUrlAuthConfig() {
        return UrlAuthConfig;
    }

    public void setUrlAuthConfig(com.ksc.cdn.model.domain.domaindetail.UrlAuthConfig urlAuthConfig) {
        UrlAuthConfig = urlAuthConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.BackOriginHostConfig getBackOriginHostConfig() {
        return BackOriginHostConfig;
    }

    public void setBackOriginHostConfig(com.ksc.cdn.model.domain.domaindetail.BackOriginHostConfig backOriginHostConfig) {
        BackOriginHostConfig = backOriginHostConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.VideoSeekConfig getVideoSeekConfig() {
        return VideoSeekConfig;
    }

    public void setVideoSeekConfig(com.ksc.cdn.model.domain.domaindetail.VideoSeekConfig videoSeekConfig) {
        VideoSeekConfig = videoSeekConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.OriginAdvancedConfig getOriginAdvancedConfig() {
        return OriginAdvancedConfig;
    }

    public void setOriginAdvancedConfig(com.ksc.cdn.model.domain.domaindetail.OriginAdvancedConfig originAdvancedConfig) {
        OriginAdvancedConfig = originAdvancedConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.DetectOriginConfig getDetectOriginConfig() {
        return DetectOriginConfig;
    }

    public void setDetectOriginConfig(com.ksc.cdn.model.domain.domaindetail.DetectOriginConfig detectOriginConfig) {
        DetectOriginConfig = detectOriginConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.TestUrlConfig getTestUrlConfig() {
        return TestUrlConfig;
    }

    public void setTestUrlConfig(com.ksc.cdn.model.domain.domaindetail.TestUrlConfig testUrlConfig) {
        TestUrlConfig = testUrlConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.HttpHeadersConfig getHttpHeadersConfig() {
        return HttpHeadersConfig;
    }

    public void setHttpHeadersConfig(com.ksc.cdn.model.domain.domaindetail.HttpHeadersConfig httpHeadersConfig) {
        HttpHeadersConfig = httpHeadersConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.RequestAuthConfig getRequestAuthConfig() {
        return RequestAuthConfig;
    }

    public void setRequestAuthConfig(com.ksc.cdn.model.domain.domaindetail.RequestAuthConfig requestAuthConfig) {
        RequestAuthConfig = requestAuthConfig;
    }

    public ErrorPageConfig getErrorPageConfig() {
        return ErrorPageConfig;
    }

    public void setErrorPageConfig(ErrorPageConfig errorPageConfig) {
        this.ErrorPageConfig = errorPageConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.PageCompressConfig getPageCompressConfig() {
        return PageCompressConfig;
    }

    public void setPageCompressConfig(com.ksc.cdn.model.domain.domaindetail.PageCompressConfig pageCompressConfig) {
        PageCompressConfig = pageCompressConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.Http2OptionConfig getHttp2OptionConfig() {
        return Http2OptionConfig;
    }

    public void setHttp2OptionConfig(com.ksc.cdn.model.domain.domaindetail.Http2OptionConfig http2OptionConfig) {
        Http2OptionConfig = http2OptionConfig;
    }

    public com.ksc.cdn.model.domain.domaindetail.ForceRedirectConfig getForceRedirectConfig() {
        return ForceRedirectConfig;
    }

    public void setForceRedirectConfig(com.ksc.cdn.model.domain.domaindetail.ForceRedirectConfig forceRedirectConfig) {
        ForceRedirectConfig = forceRedirectConfig;
    }
}

package com.ksc.cdn;

import com.ksc.cdn.model.domain.createdomain.AddDomainRequest;
import com.ksc.cdn.model.domain.createdomain.AddDomainResult;
import com.ksc.cdn.model.domain.domainbase.GetDomainBaseResult;
import com.ksc.cdn.model.domain.domainbase.ModifyDomainRequest;
import com.ksc.cdn.model.domain.domaincache.CacheConfigRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsRequest;
import com.ksc.cdn.model.domain.domaincollect.GetCdnDomainsResult;
import com.ksc.cdn.model.domain.domaindetail.*;
import com.ksc.cdn.model.domain.tool.GetCnameSuffixsResult;
import com.ksc.cdn.model.domain.tool.GetDomainsByOriginResult;
import com.ksc.cdn.model.domain.tool.GetServiceIpResult;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;
import com.ksc.cdn.model.enums.HttpHeaderKeyEnum;
import com.ksc.cdn.model.enums.SwitchEnum;


/**
 * KscCdnDomain
 * <p>
 * 域名配置相关接口
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public interface KscCdnDomain {

    /**
     * 加速域名后缀
     */
    String GETCNAMESUFFIXS_URL = "/2016-09-01/domain/GetCnameSuffixs";
    String GETCNAMESUFFIXS_VERSION = "2016-09-01";
    String GETCNAMESUFFIXS_ACTION = "GetCnameSuffixs";

    /**
     * 根据源站地址获取加速域名
     */
    String GETDOMAINSBYORIGIN_URL = "/2016-09-01/domain/GetDomainsByOrigin";
    String GETDOMAINSBYORIGIN_VERSION = "2016-09-01";
    String GETDOMAINSBYORIGIN_ACTION = "GetDomainsByOrigin";
    /**
     * 单域名多项配置设置
     */
    String SETDOMAINCONFIGS_URL = "/2016-09-01/domain/SetDomainConfigs";
    String SETDOMAINCONFIGS_VERSION = "2016-09-01";
    String SETDOMAINCONFIGS_ACTION = "SetDomainConfigs";

    /**
     * 设置备注信息
     */
    String GETSERVICEIP_URL = "/2016-09-01/domain/GetServiceIpData";
    String GETSERVICEIP_VERSION = "2016-09-01";
    String GETSERVICEIP_ACTION = "GetServiceIpData";

    /**
     * 域名列表
     */
    String GETCDNDOMAINS_URL = "/2016-09-01/domain/GetCdnDomains";
    String GETCDNDOMAINS_VERSION = "2016-09-01";
    String GETCDNDOMAINS_ACTION = "GetCdnDomains";

    /**
     * 新增域名
     */
    String ADD_DOMAIN_URL = "/2016-09-01/domain/AddCdnDomain";
    String ADD_DOMAIN_VERSION = "2016-09-01";
    String ADD_DOMAIN_ACTION = "AddCdnDomain";

    /**
     * 新增域名v2
     */
    String ADD_DOMAIN_V2_URL = "/2016-09-01/domain/AddCdnDomain";
    String ADD_DOMAIN_V2_VERSION = "2016-09-01";
    String ADD_DOMAIN_V2_ACTION = "AddCdnDomain";

    /**
     * 域名基本信息
     */
    String QUERY_DOMAIN_URL = "/2016-09-01/domain/GetCdnDomainBasicInfo";
    String QUERY_DOMAIN_VERSION = "2016-09-01";
    String QUERY_DOMAIN_ACTION = "GetCdnDomainBasicInfo";

    /**
     * 修改域名配置
     */
    String MODIFY_DOMAIN_URL = "/2016-09-01/domain/ModifyCdnDomainBasicInfo";
    String MODIFY_DOMAIN_VERSION = "2016-09-01";
    String MODIFY_DOMAIN_ACTION = "ModifyCdnDomainBasicInfo";

    /**
     * 启用、停用某个加速域名
     */
    String STARTSTOPCDNDOMAIN_URL = "/2016-09-01/domain/StartStopCdnDomain";
    String STARTSTOPCDNDOMAIN_VERSION = "2016-09-01";
    String STARTSTOPCDNDOMAIN_ACTION = "StartStopCdnDomain";

    /**
     * 删除域名
     */
    String DELETECDNDOMAIN_URL = "/2016-09-01/domain/DeleteCdnDomain";
    String DELETECDNDOMAIN_VERSION = "2016-09-01";
    String DELETECDNDOMAIN_ACTION = "DeleteCdnDomain";

    /**
     * 查询域名详细配置信息
     */
    String CONFIG_URL = "/2016-09-01/domain/GetDomainConfigs";
    String CONFIG_VERSION = "2016-09-01";
    String CONFIG_ACTION = "GetDomainConfigs";

    /**
     * 设置过滤参数
     */
    String IGNORE_QUERY_STRING_URL = "/2016-09-01/domain/SetIgnoreQueryStringConfig";
    String IGNORE_QUERY_STRING_VERSION = "2016-09-01";
    String IGNORE_QUERY_STRING_ACTION = "SetIgnoreQueryStringConfig";

    /**
     * 设置回源host
     */
    String BACK_ORIGIN_URL = "/2016-09-01/domain/SetBackOriginHostConfig";
    String BACK_ORIGIN_VERSION = "2016-09-01";
    String BACK_ORIGIN_ACTION = "SetBackOriginHostConfig";

    /**
     * 设置refer防盗链
     */
    String REFER_PROTECTION_URL = "/2016-09-01/domain/SetReferProtectionConfig";
    String REFER_PROTECTION_VERSION = "2016-09-01";
    String REFER_PROTECTION_ACTION = "SetReferProtectionConfig";

    /**
     * 设置Ip防盗链
     */
    String IP_PROTECTION_URL = "/2016-09-01/domain/SetIpProtectionConfig";
    String IP_PROTECTION_VERSION = "2016-09-01";
    String IP_PROTECTION_ACTION = "SetIpProtectionConfig";

    /**
     * 设置缓存策略
     */
    String SETCACHERULECONFIG_URL = "/2016-09-01/domain/SetCacheRuleConfig";
    String SETCACHERULECONFIG_VERSION = "2016-09-01";
    String SETCACHERULECONFIG_ACTION = "SetCacheRuleConfig";

    /**
     * 设置测试URL
     */
    String SETTESTURLCONFIG_URL = "/2016-09-01/domain/SetTestUrlConfig";
    String SETTESTURLCONFIG_VERSION = "2016-09-01";
    String SETTESTURLCONFIG_ACTION = "SetTestUrlConfig";

    /**
     * 设置高级回源
     */
    String SETORIGINADVANCEDCONFIG_URL = "/2016-09-01/domain/SetOriginAdvancedConfig";
    String SETORIGINADVANCEDCONFIG_VERSION = "2016-09-01";
    String SETORIGINADVANCEDCONFIG_ACTION = "SetOriginAdvancedConfig";

    /**
     * 设置备注信息
     */
    String SETREMARKCONFIG_URL = "/2016-09-01/domain/SetRemarkConfig";
    String SETREMARKCONFIG_VERSION = "2016-09-01";
    String SETREMARKCONFIG_ACTION = "SetRemarkConfig";

    /**
     * 设置视频拖拽
     */
    String SETVIDEOSEEKCONFIG_URL = "/2016-09-01/domain/SetVideoSeekConfig";
    String SETVIDEOSEEKCONFIG_VERSION = "2016-09-01";
    String SETVIDEOSEEKCONFIG_ACTION = "SetVideoSeekConfig";

    /**
     * 获取视频拖拽信息
     */
    String GETVIDEOSEEKCONFIG_URL = "/2016-09-01/domain/GetVideoSeekConfig";
    String GETVIDEOSEEKCONFIG_VERSION = "2016-09-01";
    String GETVIDEOSEEKCONFIG_ACTION = "GetVideoSeekConfig";

    /**
     * 设置Http响应头
     */
    String SETHTTPHEADERSCONFIG_URL = "/2016-09-01/domain/SetHttpHeadersConfig";
    String SETHTTPHEADERSCONFIG_VERSION = "2016-09-01";
    String SETHTTPHEADERSCONFIG_ACTION = "SetHttpHeadersConfig";

    /**
     * 删除Http响应头
     */
    String DELETEHTTPHEADERSCONFIG_URL = "/2016-09-01/domain/DeleteHttpHeadersConfig";
    String DELETEHTTPHEADERSCONFIG_VERSION = "2016-09-01";
    String DELETEHTTPHEADERSCONFIG_ACTION = "DeleteHttpHeadersConfig";

    /**
     * 获取Http响应头列表
     */
    String GETHTTPHEADERLIST_URL = "/2016-09-01/domain/GetHttpHeaderList";
    String GETHTTPHEADERLIST_VERSION = "2016-09-01";
    String GETHTTPHEADERLIST_ACTION = "GetHttpHeaderList";

    /**
     * 时间戳防盗链
     */
    String SETREQUESTAUTHCONFIG_URL = "/2016-09-01/domain/SetRequestAuthConfig";
    String SETREQUESTAUTHCONFIG_VERSION = "2016-09-01";
    String SETREQUESTAUTHCONFIG_ACTION = "SetRequestAuthConfig";


    String NOPAHT_URL = "/";
    String VERSION_20160901 = "2016-09-01";
    /**
     * 设置强制跳转
     */
    String SETFORCEREDIRECTCONFIG_ACTION = "SetForceRedirectConfig";


    String SETHTTP2OPTIONCONFIG_ACTION = "SetHttp2OptionConfig";


    String SETERRORPAGECONFIG_ACTION = "SetErrorPageConfig";


    String SETPAGECOMPRESSCONFIG_ACTION = "SetPageCompressConfig";

    /**
     * 获取域名列表
     *
     * @param getCdnDomainsRequest
     * @return
     * @throws Exception
     */
    GetCdnDomainsResult getCdnDomains(GetCdnDomainsRequest getCdnDomainsRequest) throws Exception;

    /**
     * 添加加速域名
     *
     * @param domainParam
     * @return
     * @throws Exception
     */
    AddDomainResult addDomainBase(AddDomainRequest domainParam) throws Exception;

    /**
     * 添加加速域名v2
     *
     * @param domainParam
     * @return
     * @throws Exception
     */
    AddDomainResult addDomainV2Base(AddDomainRequest domainParam) throws Exception;

    /**
     * 获取指定加速域名配置的基本信息
     *
     * @param domainId 域名ID，只允许输入单个域名ID
     * @return
     * @throws Exception
     */
    GetDomainBaseResult getCdnDomainBasic(String domainId) throws Exception;

    /**
     * 修改域名基本信息
     *
     * @param modifyParam
     * @return 该条任务请求ID
     * @throws Exception
     */
    void updateDomainBase(ModifyDomainRequest modifyParam) throws Exception;

    /**
     * 启用、停用某个加速域名
     * 域名对应账户如果由于欠费，或域名处于非法状态，无法正常调用该接口启用加速域名。
     * 停用该加速域名后，该加速域名的相关配置信息仍保留，但无法提供服务。
     * 无法停用状态为审核失败、审核中、配置中的域名，需要等待审核完成或配置完成后再进行停用操作。
     *
     * @param domainId
     * @param action
     * @return 该条任务请求ID
     * @throws Exception
     */
    void startStopCdnDomain(String domainId, ActionTypeEnum action) throws Exception;

    /**
     * 删除用户下已添加的加速域名
     * <p>
     * 此操作只允许删除 DomainStatus 为已停止的域名；
     * 此操作不可恢复，删除后域名将不可访问，请慎重操作；
     * DeleteCdnDomain调用成功后，本条加速域名的带宽、计费数据仍然会被保留，其他全部相关记录都将被删除。
     *
     * @param domainId
     * @return 该条任务请求ID
     * @throws Exception
     */
    String deleteCdnDomain(String domainId) throws Exception;

    /**
     * 查询域名详细配置信息
     *
     * @param domainId
     * @param config
     * @return
     * @throws Exception
     */
    GetDomainConfigResult getDomainConfigs(String domainId, DomainConfigEnum... config) throws Exception;

    /**
     * 设置过滤参数
     *
     * @param domainId
     * @param enable   配置是否开启或关闭 取值：on、off。默认值为on
     * @throws Exception
     */
    void setIgnoreQueryStringConfig(String domainId, SwitchEnum enable) throws Exception;

    /**
     * 设置回源host功能
     *
     * @param domainId
     * @param originHost 若源站为KS3域名，需将ks3域名设置为回源host（即源站域名），方可正常回源
     * @throws Exception
     */
    void setBackOriginConfig(String domainId, String originHost) throws Exception;

    /**
     * 设置加速域名的Refer防盗链功能，加速域名创建后，默认不开启refer防盗链功能
     *
     * @param referProtection
     * @throws Exception
     */
    void setReferProtectionConfig(ReferProtectionRequest referProtection) throws Exception;

    /**
     * 设置加速域名的Ip防盗链功能，加速域名创建后，默认不开启Ip防盗链功能
     *
     * @param ipProtection
     * @throws Exception
     */
    void setIpProtectionConfig(IpProtectionRequest ipProtection) throws Exception;

    /**
     * 设置缓存规则
     *
     * @param cacheRuleConfig
     * @throws Exception
     */
    void setCacheRule(CacheConfigRequest cacheRuleConfig) throws Exception;

    /**
     * 设置测试url
     *
     * @param domainId
     * @param testUrl
     * @throws Exception
     */
    void setTestUrl(String domainId, String testUrl) throws Exception;

    /**
     * 设置高级回源
     *
     * @param originAdvancedConfig
     * @throws Exception
     */
    void setOriginAdvanced(OriginAdvancedConfigRequest originAdvancedConfig) throws Exception;

    /**
     * 设置备注信息
     *
     * @param domainId
     * @param remark
     * @throws Exception
     */
    void setRemark(String domainId, String remark) throws Exception;

    GetServiceIpResult getServiceIp(String domainId) throws Exception;

    void setDomainConfigs(AllConfigsRequest allConfigs) throws Exception;

    GetDomainsByOriginResult getDomainsByOrigin(String origin) throws Exception;

    GetCnameSuffixsResult getCnameSuffixs() throws Exception;

    /**
     * 设置视频拖拽配置
     *
     * @param domainId
     * @param enable
     * @throws Exception
     */
    void setVideoSeekConfig(String domainId, SwitchEnum enable) throws Exception;

    /**
     * 获取视频拖拽配置
     *
     * @param domainId
     * @return
     * @throws Exception
     */
    VideoSeekConfig getVideoSeekConfig(String domainId) throws Exception;

    /**
     * 设置http响应头
     *
     * @param domainId
     * @param httpHeaderKeyEnum
     * @param headerValue
     * @throws Exception
     */
    void setHttpHeadersConfig(String domainId, HttpHeaderKeyEnum httpHeaderKeyEnum, String headerValue) throws Exception;

    /**
     * 删除http响应头
     *
     * @param domainId
     * @param httpHeaderKeyEnum
     * @throws Exception
     */
    void deleteHttpHeadersConfig(String domainId, HttpHeaderKeyEnum httpHeaderKeyEnum) throws Exception;

    /**
     * 获取http响应头
     *
     * @param domainId
     * @return
     * @throws Exception
     */
    HttpHeadersList getHttpHeaderList(String domainId) throws Exception;

    /**
     * 时间戳共享秘钥防盗链
     * @param requestAuthConfig
     * @throws Exception
     */
    void setRequestAuthConfig(RequestAuthConfig requestAuthConfig) throws Exception;

    /**
     * 设置强制跳转
     * @param forceRedirectConfig
     * @throws Exception
     */
    void setForceRedirectConfig(ForceRedirectConfig forceRedirectConfig) throws Exception;

    /**
     * 设置HTTP 2.0
     * @param http2OptionConfig
     * @throws Exception
     */
    void setHttp2OptionConfig(Http2OptionConfig http2OptionConfig) throws Exception;

    /**
     * 自定义错误页面
     * @param errorPageConfig
     * @throws Exception
     */
    void setErrorPageConfig(ErrorPageConfig errorPageConfig) throws Exception;

    /**
     * 设置智能压缩
     * @param pageCompressConfig
     * @throws Exception
     */
    void setPageCompressConfig(PageCompressConfig pageCompressConfig) throws Exception;

    /**
     * 设置过滤参数
     * @param ignoreQueryStringConfig
     * @throws Exception
     */
    void setIgnoreQueryStringConfig(IgnoreQueryStringConfig ignoreQueryStringConfig) throws Exception;
}

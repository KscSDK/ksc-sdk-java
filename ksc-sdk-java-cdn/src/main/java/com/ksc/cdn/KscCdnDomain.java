package com.ksc.cdn;

import com.ksc.cdn.model.domain.*;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;


/**
 * KscCdnDomain
 *
 * 域名配置相关接口
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
     * 新增域名
     */
    String ADD_DOMAIN_URL = "/2016-09-01/domain/AddCdnDomain";
    String ADD_DOMAIN_VERSION="2016-09-01";
    String ADD_DOMAIN_ACTION="AddCdnDomain";

    /**
     * 域名基本信息
     */
    String QUERY_DOMAIN_URL = "/2016-09-01/domain/GetCdnDomainBasicInfo";
    String QUERY_DOMAIN_VERSION="2016-09-01";
    String QUERY_DOMAIN_ACTION="GetCdnDomainBasicInfo";

    /**
     * 修改域名配置
     */
    String MODIFY_DOMAIN_URL = "/2016-09-01/domain/ModifyCdnDomainBasicInfo";
    String MODIFY_DOMAIN_VERSION="2016-09-01";
    String MODIFY_DOMAIN_ACTION="ModifyCdnDomainBasicInfo";

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
    String CONFIG_VERSION="2016-09-01";
    String CONFIG_ACTION="GetDomainConfigs";

    /**
     * 设置过滤参数
     */
    String IGNORE_QUERY_STRING_URL = "/2016-09-01/domain/SetIgnoreQueryStringConfig";
    String IGNORE_QUERY_STRING_VERSION="2016-09-01";
    String IGNORE_QUERY_STRING_ACTION="SetIgnoreQueryStringConfig";
    /**
     * 设置回源host
     */
    String BACK_ORIGIN_URL = "/2016-09-01/domain/SetBackOriginHostConfig";
    String BACK_ORIGIN_VERSION="2016-09-01";
    String BACK_ORIGIN_ACTION="SetBackOriginHostConfig";
    /**
     * 设置refer防盗链
     */
    String REFER_PROTECTION_URL = "/2016-09-01/domain/SetReferProtectionConfig";
    String REFER_PROTECTION_VERSION="2016-09-01";
    String REFER_PROTECTION_ACTION="SetReferProtectionConfig";
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
     * 获取域名列表
     * @param getCdnDomainsRequest
     * @return
     * @throws Exception
     */
    GetCdnDomainsResult getCdnDomains(GetCdnDomainsRequest getCdnDomainsRequest) throws Exception;

    /**
     * 添加加速域名
     * @param domainParam
     * @return
     * @throws Exception
     */
    AddDomainResult addDomainBase(AddDomainRequest domainParam) throws Exception;

    /**
     * 获取指定加速域名配置的基本信息
     * @param domainId 域名ID，只允许输入单个域名ID
     * @return
     * @throws Exception
     */
    GetDomainBaseResult getCdnDomainBasic(String domainId) throws Exception;

    /**
     * 修改域名基本信息
     * @param modifyParam
     * @return 该条任务请求ID
     * @throws Exception
     */
    String updateDomainBase(ModifyDomainRequest modifyParam) throws Exception;

    /**
     * 启用、停用某个加速域名
     * 域名对应账户如果由于欠费，或域名处于非法状态，无法正常调用该接口启用加速域名。
     * 停用该加速域名后，该加速域名的相关配置信息仍保留，但无法提供服务。
     * 无法停用状态为审核失败、审核中、配置中的域名，需要等待审核完成或配置完成后再进行停用操作。
     * @param domainId
     * @param action
     * @return 该条任务请求ID
     * @throws Exception
     */
    String startStopCdnDomain(String domainId, ActionTypeEnum action) throws Exception;

    /**
     * 删除用户下已添加的加速域名
     *
     * 此操作只允许删除 DomainStatus 为已停止的域名；
     * 此操作不可恢复，删除后域名将不可访问，请慎重操作；
     * DeleteCdnDomain调用成功后，本条加速域名的带宽、计费数据仍然会被保留，其他全部相关记录都将被删除。
     * @param domainId
     * @return 该条任务请求ID
     * @throws Exception
     */
    String deleteCdnDomain(String domainId) throws Exception;

    /**
     * 查询域名详细配置信息
     * @param domainId
     * @param config
     * @return
     * @throws Exception
     */
    GetDomainConfigResult getDomainConfigs(String domainId, DomainConfigEnum... config) throws Exception;

    /**
     * 设置过滤参数
     * @param domainId
     * @param enable 配置是否开启或关闭 取值：on、off。默认值为on
     * @throws Exception
     */
    void setIgnoreQueryStringConfig(String domainId, String enable) throws Exception;

    /**
     * 设置回源host功能
     * @param domainId
     * @param originHost 若源站为KS3域名，需将ks3域名设置为回源host（即源站域名），方可正常回源
     * @throws Exception
     */
    void setBackOriginConfig(String domainId, String originHost) throws Exception;

    /**
     * 设置加速域名的Refer防盗链功能，加速域名创建后，默认不开启refer防盗链功能
     * @param referProtection
     * @throws Exception
     */
    void setReferProtectionConfig(ReferProtectionRequest referProtection) throws Exception;

    /**
     * 设置缓存规则
     * @param cacheRuleConfig
     * @throws Exception
     */
    void setCacheRule(CacheConfigRequest cacheRuleConfig) throws Exception;

    /**
     * 设置测试url
     * @param domainId
     * @param testUrl
     * @throws Exception
     */
    void setTestUrl(String domainId, String testUrl) throws Exception;

    /**
     * 设置高级回源
     * @param originAdvancedConfig
     * @throws Exception
     */
    void setOriginAdvanced(OriginAdvancedConfigRequest originAdvancedConfig) throws Exception;

    /**
     * 设置备注信息
     * @param domainId
     * @param remark
     * @throws Exception
     */
    void setRemark(String domainId, String remark) throws Exception;
}

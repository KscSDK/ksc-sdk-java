package com.ksc.cdn;

import com.ksc.cdn.model.domain.*;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.enums.DomainConfigEnum;


/**
 * KscCdnDomain
 *
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
}

package com.ksc.network.slb;

import com.ksc.network.slb.model.*;

public interface KSCSLB {
    /**
     * <p>
     * Describes one or more of your LoadBalancers.
     * </p>
     *
     * @param describeLoadBalancersRequest
     *            Contains the parameters for DescribeLoadBalancers.
     * @return Result of the DescribeAddresses operation returned by the
     *         service.
     * @sample KSC.DescribeLoadBalancers
     */

    /**
     * 描述负载均衡
     */
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * 创建负载均衡
     */
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest);

    /**
     * 删除负载均衡
     */
    public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

    /**
     * 更新负载均衡信息
     */
    public ModifyLoadBalancerResult modifyLoadBalancer(ModifyLoadBalancerRequest modifyLoadBalancerRequest);

    /**
     * 创建监听器
     */
    public CreateListenersResult createListeners(CreateListenersRequest createListenersRequest);

    /**
     * 更新监听器配置
     */
    public ModifyListenersResult modifyListeners(ModifyListenersRequest modifyListenersRequest);

    /**
     * 删除监听器
     */
    public DeleteListenersResult deleteListeners(DeleteListenersRequest deleteListenersRequest);

    /**
     * 描述监听器
     */
    public DescribeListenersResult describeListeners(DescribeListenersRequest describeListenersRequest);

    /**
     * 创建健康检查
     */
    public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest configureHealthCheckRequest);

    /**
     * 更新健康检查
     */
    public ModifyHealthCheckResult modifyHealthCheck(ModifyHealthCheckRequest modifyHealthCheckRequest);

    /**
     * 删除负载均衡
     */
    public DeleteHealthCheckResult deleteHealthCheck(DeleteHealthCheckRequest deleteHealthCheckRequest);

    /**
     * 描述健康检查
     */
    public DescribeHealthChecksResult describeHealthChecks(DescribeHealthChecksRequest describeHealthChecksRequest);

    /**
     * 监听器中绑定真实服务器
     */
    public RegisterInstancesWithListenerResult registerInstancesWithListener(
            RegisterInstancesWithListenerRequest registerInstancesWithListenerRequest);

    /**
     * 修改真实服务器信息
     */
    public ModifyInstancesWithListenerResult modifyInstancesWithListener(
            ModifyInstancesWithListenerRequest modifyInstancesWithListenerRequest);

    /**
     * 解绑真实服务器
     */
    public DeregisterInstancesFromListenerResult deregisterInstancesFromListener(
            DeregisterInstancesFromListenerRequest deregisterInstancesFromListenerRequest);

    /**
     * 描述监听器中的真实服务器
     */
    public DescribeInstancesWithListenerResult describeInstancesWithListener(
            DescribeInstancesWithListenerRequest describeInstancesWithListenerRequest);

    /**
     * 创建域名
     */
    public CreateHostHeaderResult createHostHeader(CreateHostHeaderRequest createHostHeaderRequest);

    /**
     * 修改域名
     */
    public ModifyHostHeaderResult modifyHostHeader(ModifyHostHeaderRequest modifyHostHeaderRequest);

    /**
     * 删除域名
     */
    public DeleteHostHeaderResult deleteHostHeader(DeleteHostHeaderRequest deleteHostHeaderRequest);

    /**
     * 获取域名列表
     */
    public DescribeHostHeadersResult describeHostHeader(DescribeHostHeadersRequest describeHostHeadersRequest);

    /**
     * 创建负载均衡ACL
     */
    public CreateLoadBalancerAclResult createLoadBalancerAcl(CreateLoadBalancerAclRequest createLoadBalancerAclRequest);

    /**
     * 修改负载均衡ACL
     */
    public ModifyLoadBalancerAclResult modifyLoadBalancerAcl(ModifyLoadBalancerAclRequest modifyLoadBalancerAclRequest);

    /**
     * 删除负载均衡ACL
     */
    public DeleteLoadBalancerAclResult deleteLoadBalancerAcl(DeleteLoadBalancerAclRequest deleteLoadBalancerAclRequest);

    /**
     * 获取负载均衡ACL列表
     */
    public DescribeLoadBalancerAclsResult describeLoadBalancerAcls(DescribeLoadBalancerAclsRequest describeLoadBalancerAclsRequest);

    /**
     * 删除LoadBalancerAcl规则
     */
    public DeleteLoadBalancerAclEntryResult deleteLoadBalancerAclEntry(DeleteLoadBalancerAclEntryRequest deleteLoadBalancerAclEntryRequest);

    /**
     * 获取LoadBalancerAcl规则
     */
    public CreateLoadBalancerAclEntryResult createLoadBalancerAclEntry(CreateLoadBalancerAclEntryRequest createLoadBalancerAclEntryRequest);

    /**
     * 监听器绑定ACL
     */
    public AssociateLoadBalancerAclResult associateLoadBalancerAcl(AssociateLoadBalancerAclRequest associateLoadBalancerAclRequest);

    /**
     * 监听器解绑ACL
     */
    public DisassociateLoadBalancerAclResult disassociateLoadBalancerAcl(DisassociateLoadBalancerAclRequest disassociateLoadBalancerAclRequest);

    /**
     * 创建规则
     */
    public CreateSlbRuleResult createSlbRule(CreateSlbRuleRequest createSlbRuleRequest);

    /**
     * 修改规则
     */
    public ModifySlbRuleResult modifySlbRule(ModifySlbRuleRequest modifySlbRuleRequest);

    /**
     * 删除规则
     */
    public DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * 查询规则
     */
    public DescribeRulesResult describeRules(DescribeRulesRequest describeRulesRequest);

    /**
     * 创建后端服务组
     */
    public CreateBackendServerGroupResult createBackendServerGroup(CreateBackendServerGroupRequest createBackendServerGroupRequest);
    /**
     * 修改后端服务组
     */
    public ModifyBackendServerGroupResult modifyBackendServerGroup(ModifyBackendServerGroupRequest modifyBackendServerGroupRequest);
    /**
     * 删除后端服务组
     */
    public DeleteBackendServerGroupResult deleteBackendServerGroup(DeleteBackendServerGroupRequest deleteBackendServerGroupRequest);
    /**
     * 查询后端服务组
     */
    public DescribeBackendServerGroupsResult describeBackendServerGroups(DescribeBackendServerGroupsRequest describeBackendServerGroupsRequest);

    /**
     * 添加服务器至服务组
     */
    public RegisterBackendServerResult registerBackendServer(RegisterBackendServerRequest registerBackendServerRequest);
    /**
     * 修改服务器信息
     */
    public ModifyBackendServerResult modifyBackendServer(ModifyBackendServerRequest modifyBackendServerRequest);
    /**
     * 删除服务组中服务器
     */
    public DeregisterBackendServerResult deregisterBackendServer(DeregisterBackendServerRequest deregisterBackendServerRequest);
    /**
     * 查询服务组中服务器信息
     */
    public DescribeBackendServersResult describeBackendServers(DescribeBackendServersRequest describeBackendServersRequest);


}

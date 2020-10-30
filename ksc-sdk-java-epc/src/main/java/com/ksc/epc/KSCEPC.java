package com.ksc.epc;

import com.ksc.epc.model.*;

public interface KSCEPC {

    /**
     * 创建裸金属服务器
     */
    public CreateEpcResult createEpc(CreateEpcRequest createEpcRequest);
    /**
     * 获取裸金属服务器
     */
    public DescribeEpcsResult describeEpcs(DescribeEpcsRequest describeEpcsRequest);
    /**
     * 删除裸金属服务器
     */
    public DeleteEpcResult deleteEpc(DeleteEpcRequest deleteEpcRequest);
    /**
     * 修改裸金属服务器
     */
    public ModifyEpcResult modifyEpc(ModifyEpcRequest modifyEpcRequest);
    /**
     * 启动裸金属服务器
     */
    public StartEpcResult startEpc(StartEpcRequest startEpcRequest);
    /**
     * 关闭裸金属服务器
     */
    public StopEpcResult stopEpc(StopEpcRequest stopEpcRequest);
    /**
     * 重启裸金属服务器
     */
    public RebootEpcResult rebootEpc(RebootEpcRequest rebootEpcRequest);
    /**
     * 重装裸金属服务器
     */
    public ReinstallEpcResult reinstallEpc(ReinstallEpcRequest reinstallEpcRequest);
    /**
     * 重装托管裸金属服务器
     */
    public ReinstallCustomerEpcResult reinstallCustomerEpc(ReinstallCustomerEpcRequest reinstallCustomerEpcRequest);
    /**
     * 重置密码
     */
    public ResetPasswordResult resetPassword(ResetPasswordRequest resetPasswordRequest);
    /**
     * 修改超线程
     */
    public ModifyHyperThreadingResult modifyHyperThreading(ModifyHyperThreadingRequest modifyHyperThreadingRequest);
    /**
     * 制作镜像
     */
    public CreateImageResult createImage(CreateImageRequest createImageRequest);
    /**
     * 修改镜像
     */
    public ModifyImageResult modifyImage(ModifyImageRequest modifyImageRequest);
    /**
     * 删除镜像
     */
    public DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest);
    /**
     * 查询镜像
     */
    public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);
    /**
     * 导入密钥
     */
    public ImportKeyResult importKey(ImportKeyRequest importKeyRequest);
    /**
     * 删除密钥
     */
    public DeleteKeyResult deleteKey(DeleteKeyRequest deleteKeyRequest);
    /**
     * 修改密钥名称
     */
    public ModifyKeyResult modifyKey(ModifyKeyRequest modifyKeyRequest);
    /**
     * 生成密钥
     */
    public CreateKeyResult createKey(CreateKeyRequest createKeyRequest);
    /**
     * 查询密钥
     */
    public DescribeKeysResult describeKeys(DescribeKeysRequest describeKeysRequest);
    /**
     * 查询监控信息
     */
    public DescribePhysicalMonitorResult describePhysicalMonitor(DescribePhysicalMonitorRequest describePhysicalMonitorRequest);
    /**
     * 修改网卡信息
     */
    public ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest);
    /**
     * 修改DNS信息
     */
    public ModifyDnsResult modifyDns(ModifyDnsRequest modifyDnsRequest);
    /**
     * 修改安全组信息
     */
    public ModifySecurityGroupResult modifySecurityGroup(ModifySecurityGroupRequest modifySecurityGroupRequest);
    /**
     * 查询机柜信息
     */
    public DescribeCabinetsResult describeCabinets(DescribeCabinetsRequest describeCabinetsRequest);
    /**
     * 查询巡检信息
     */
    public DescribeInspectionsResult describeInspections(DescribeInspectionsRequest describeInspectionsRequest);
    /**
     * 查询库存信息
     */
    public DescribeEpcStocksResult describeEpcStocks(DescribeEpcStocksRequest describeEpcStocksRequest);
    /**
     * 查询机型配置信息
     */
    public DescribeEpcDeviceAttributesResult describeEpcDeviceAttributes(DescribeEpcDeviceAttributesRequest describeEpcDeviceAttributesRequest);
    /**
     * 获取回收站信息
     */
    public DescribeEpcTrashesResult describeEpcTrashes(DescribeEpcTrashesRequest describeEpcTrashesRequest);
    /**
     * 加入回收站
     */
    public ReturnEpcResult returnEpc(ReturnEpcRequest returnEpcRequest);
    /**
     * 移出回收站
     */
    public RecoverEpcResult recoverEpc(RecoverEpcRequest recoverEpcRequest);
    /**
     * 查询价格信息
     */
    public DescribePriceResult describePrice(DescribePriceRequest describePriceRequest);
    /**
     * 查询配件
     */
    public DescribeAccessorysResult describeAccessorys(DescribeAccessorysRequest describeAccessorysRequest);
    /**
     * 删除配件
     */
    public DeleteAccessoryResult deleteAccessory(DeleteAccessoryRequest deleteAccessoryRequest);
    /**
     * 创建配件（租赁）
     */
    public CreateAccessoryResult createAccessory(CreateAccessoryRequest createAccessoryRequest);
    /**
     * 销售配置
     */
    public BuyAccessoryResult buyAccessory(BuyAccessoryRequest buyAccessoryRequest);
    /**
     * 创建预留机柜
     */
    public CreateCabinetResult createCabinet(CreateCabinetRequest createCabinetRequest);
    /**
     * 查询工单
     */
    public DescribeProcessesResult describeProcesses(DescribeProcessesRequest describeProcessesRequest);
    /**
     * 创建工单
     */
    public CreateProcessResult createProcess(CreateProcessRequest createProcessRequest);
    /**
     * 删除工单
     */
    public DeleteProcessResult deleteProcess(DeleteProcessRequest deleteProcessRequest);
    /**
     * 回复工单
     */
    public ReplyProcessResult replyProcess(ReplyProcessRequest replyProcessRequest);
    /**
     * 创建带外管理
     */
    public CreateRemoteManagementResult createRemoteManagement(CreateRemoteManagementRequest createRemoteManagementRequest);
    /**
     * 获取动态码
     */
    public GetDynamicCodeResult getDynamicCode(GetDynamicCodeRequest getDynamicCodeRequest);
    /**
     * 查询带外管理信息
     */
    public DescribeRemoteManagementsResult describeRemoteManagements(DescribeRemoteManagementsRequest describeRemoteManagementsRequest);
    /**
     * 修改带外管理
     */
    public ModifyRemoteManagementResult modifyRemoteManagement(ModifyRemoteManagementRequest modifyRemoteManagementRequest);
    /**
     * 删除带外管理
     */
    public DeleteRemoteManagementResult deleteRemoteManagement(DeleteRemoteManagementRequest deleteRemoteManagementRequest);
    /**
     * 查询ILO信息
     */
    public DescribeEpcManagementsResult describeEpcManagements(DescribeEpcManagementsRequest describeEpcManagementsRequest);
    /**
     * 查询VPN信息
     */
    public DescribeVpnsResult describeVpns(DescribeVpnsRequest describeVpnsRequest);
    /**
     * 创建资源需求工单
     */
    public CreateResourceRequirementResult createResourceRequirement(CreateResourceRequirementRequest createResourceRequirementRequest);
    /**
     * 修改资源需求工单
     */
    public ModifyResourceRequirementResult modifyResourceRequirement(ModifyResourceRequirementRequest modifyResourceRequirementRequest);
    /**
     * 删除资源需求工单
     */
    public DeleteResourceRequirementResult deleteResourceRequirement(DeleteResourceRequirementRequest deleteResourceRequirementRequest);
    /**
     * 查询资源需求工单
     */
    public DescribeResourceRequirementsResult describeResourceRequirements(DescribeResourceRequirementsRequest describeResourceRequirementsRequest);
    /**
     * 回复资源需求工单信息
     */
    public ReplyResourceRequirementResult replyResourceRequirement(ReplyResourceRequirementRequest replyResourceRequirementRequest);


}
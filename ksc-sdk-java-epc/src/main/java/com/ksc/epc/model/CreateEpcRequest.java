package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateEpcRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateEpc.
 * </p>
 */
@Data
public class CreateEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateEpcRequest> {

    /**
     * 机型
     */
    private String hostType;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 数据盘Raid级别
     */
    private String raid;
    /**
     * 镜像ID
     */
    private String imageId;
    /**
     * 网卡模式
     */
    private String networkInterfaceMode;
    /**
     * 主网卡的子网ID
     */
    private String subnetId;
    /**
     * 网卡的内网IP
     */
    private String privateIpAddress;
    /**
     * 网卡的安全组ID
     */
    private com.ksc.internal.SdkInternalList<String> securityGroupIds;
    /**
     * 网卡的DNS1
     */
    private String dNS1;
    /**
     * 网卡的DNS2
     */
    private String dNS2;
    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 实例名称
     */
    private String hostName;
    /**
     * 计费方式
     */
    private String chargeType;
    /**
     * 购买时长
     */
    private Integer purchaseTime;
    /**
     * 密码
     */
    private String password;
    /**
     * 安全组件类型
     */
    private String securityAgent;
    /**
     * 监控组件类型
     */
    private String cloudMonitorAgent;
    /**
     * 从网卡的子网ID
     */
    private String extensionSubnetId;
    /**
     * 从网卡的内网IP
     */
    private String extensionPrivateIpAddress;
    /**
     * 从网卡的安全组ID
     */
    private com.ksc.internal.SdkInternalList<String> extensionSecurityGroupIds;
    /**
     * 从网卡的DNS1
     */
    private String extensionDNS1;
    /**
     * 从网卡的DNS2
     */
    private String extensionDNS2;
    /**
     * 项目ID
     */
    private String projectId;
    /**
     * 弹性IP的带宽
     */
    private Integer addressBandWidth;
    /**
     * 弹性IP的链路类型的ID
     */
    private String lineId;
    /**
     * 弹性IP的计费类型
     */
    private String addressChargeType;
    /**
     * 购买时长
     */
    private Integer addressPurchaseTime;
    /**
     * 弹性IP项目的ID
     */
    private String addressProjectId;
    /**
     * 系统盘文件格式
     */
    private String systemFileType;
    /**
     * 数据盘文件格式
     */
    private String dataFileType;
    /**
     * 数据盘目录
     */
    private String dataDiskCatalogue;
    /**
     * 数据盘目录后缀属性
     */
    private String dataDiskCatalogueSuffix;
    /**
     * 对超线程的变更
     */
    private String hyperThreading;
    /**
     * NVME数据盘类型
     */
    private String nvmeDataFileType;
    /**
     * NVME数据盘目录
     */
    private String nvmeDataDiskCatalogue;
    /**
     * NVME数据盘目录后缀属性
     */
    private String nvmeDataDiskCatalogueSuffix;
    /**
     * 网卡bond的属性
     */
    private String bondAttribute;
    /**
     * 容器引擎组件类型
     */
    private String containerAgent;
    /**
     * KES组件类型
     */
    private String kesAgent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateEpcRequest that = (CreateEpcRequest) o;
        if (hostType != null ? !hostType.equals(that.hostType) : that.hostType != null)
            return false;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (raid != null ? !raid.equals(that.raid) : that.raid != null)
            return false;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null)
            return false;
        if (networkInterfaceMode != null ? !networkInterfaceMode.equals(that.networkInterfaceMode) : that.networkInterfaceMode != null)
            return false;
        if (subnetId != null ? !subnetId.equals(that.subnetId) : that.subnetId != null)
            return false;
        if (privateIpAddress != null ? !privateIpAddress.equals(that.privateIpAddress) : that.privateIpAddress != null)
            return false;
        if (securityGroupIds != null ? !securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null)
            return false;
        if (dNS1 != null ? !dNS1.equals(that.dNS1) : that.dNS1 != null)
            return false;
        if (dNS2 != null ? !dNS2.equals(that.dNS2) : that.dNS2 != null)
            return false;
        if (keyId != null ? !keyId.equals(that.keyId) : that.keyId != null)
            return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        if (securityAgent != null ? !securityAgent.equals(that.securityAgent) : that.securityAgent != null)
            return false;
        if (cloudMonitorAgent != null ? !cloudMonitorAgent.equals(that.cloudMonitorAgent) : that.cloudMonitorAgent != null)
            return false;
        if (extensionSubnetId != null ? !extensionSubnetId.equals(that.extensionSubnetId) : that.extensionSubnetId != null)
            return false;
        if (extensionPrivateIpAddress != null ? !extensionPrivateIpAddress.equals(that.extensionPrivateIpAddress) : that.extensionPrivateIpAddress != null)
            return false;
        if (extensionSecurityGroupIds != null ? !extensionSecurityGroupIds.equals(that.extensionSecurityGroupIds) : that.extensionSecurityGroupIds != null)
            return false;
        if (extensionDNS1 != null ? !extensionDNS1.equals(that.extensionDNS1) : that.extensionDNS1 != null)
            return false;
        if (extensionDNS2 != null ? !extensionDNS2.equals(that.extensionDNS2) : that.extensionDNS2 != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        if (addressBandWidth != null ? !addressBandWidth.equals(that.addressBandWidth) : that.addressBandWidth != null)
            return false;
        if (lineId != null ? !lineId.equals(that.lineId) : that.lineId != null)
            return false;
        if (addressChargeType != null ? !addressChargeType.equals(that.addressChargeType) : that.addressChargeType != null)
            return false;
        if (addressPurchaseTime != null ? !addressPurchaseTime.equals(that.addressPurchaseTime) : that.addressPurchaseTime != null)
            return false;
        if (addressProjectId != null ? !addressProjectId.equals(that.addressProjectId) : that.addressProjectId != null)
            return false;
        if (systemFileType != null ? !systemFileType.equals(that.systemFileType) : that.systemFileType != null)
            return false;
        if (dataFileType != null ? !dataFileType.equals(that.dataFileType) : that.dataFileType != null)
            return false;
        if (dataDiskCatalogue != null ? !dataDiskCatalogue.equals(that.dataDiskCatalogue) : that.dataDiskCatalogue != null)
            return false;
        if (dataDiskCatalogueSuffix != null ? !dataDiskCatalogueSuffix.equals(that.dataDiskCatalogueSuffix) : that.dataDiskCatalogueSuffix != null)
            return false;
        if (hyperThreading != null ? !hyperThreading.equals(that.hyperThreading) : that.hyperThreading != null)
            return false;
        if (nvmeDataFileType != null ? !nvmeDataFileType.equals(that.nvmeDataFileType) : that.nvmeDataFileType != null)
            return false;
        if (nvmeDataDiskCatalogue != null ? !nvmeDataDiskCatalogue.equals(that.nvmeDataDiskCatalogue) : that.nvmeDataDiskCatalogue != null)
            return false;
        if (nvmeDataDiskCatalogueSuffix != null ? !nvmeDataDiskCatalogueSuffix.equals(that.nvmeDataDiskCatalogueSuffix) : that.nvmeDataDiskCatalogueSuffix != null)
            return false;
        if (bondAttribute != null ? !bondAttribute.equals(that.bondAttribute) : that.bondAttribute != null)
            return false;
        if (containerAgent != null ? !containerAgent.equals(that.containerAgent) : that.containerAgent != null)
            return false;
        if (kesAgent != null ? !kesAgent.equals(that.kesAgent) : that.kesAgent != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostType != null ? hostType.hashCode() : 0);
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (raid != null ? raid.hashCode() : 0);
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        result = 31 * result + (networkInterfaceMode != null ? networkInterfaceMode.hashCode() : 0);
        result = 31 * result + (subnetId != null ? subnetId.hashCode() : 0);
        result = 31 * result + (privateIpAddress != null ? privateIpAddress.hashCode() : 0);
        result = 31 * result + (securityGroupIds != null ? securityGroupIds.hashCode() : 0);
        result = 31 * result + (dNS1 != null ? dNS1.hashCode() : 0);
        result = 31 * result + (dNS2 != null ? dNS2.hashCode() : 0);
        result = 31 * result + (keyId != null ? keyId.hashCode() : 0);
        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (securityAgent != null ? securityAgent.hashCode() : 0);
        result = 31 * result + (cloudMonitorAgent != null ? cloudMonitorAgent.hashCode() : 0);
        result = 31 * result + (extensionSubnetId != null ? extensionSubnetId.hashCode() : 0);
        result = 31 * result + (extensionPrivateIpAddress != null ? extensionPrivateIpAddress.hashCode() : 0);
        result = 31 * result + (extensionSecurityGroupIds != null ? extensionSecurityGroupIds.hashCode() : 0);
        result = 31 * result + (extensionDNS1 != null ? extensionDNS1.hashCode() : 0);
        result = 31 * result + (extensionDNS2 != null ? extensionDNS2.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (addressBandWidth != null ? addressBandWidth.hashCode() : 0);
        result = 31 * result + (lineId != null ? lineId.hashCode() : 0);
        result = 31 * result + (addressChargeType != null ? addressChargeType.hashCode() : 0);
        result = 31 * result + (addressPurchaseTime != null ? addressPurchaseTime.hashCode() : 0);
        result = 31 * result + (addressProjectId != null ? addressProjectId.hashCode() : 0);
        result = 31 * result + (systemFileType != null ? systemFileType.hashCode() : 0);
        result = 31 * result + (dataFileType != null ? dataFileType.hashCode() : 0);
        result = 31 * result + (dataDiskCatalogue != null ? dataDiskCatalogue.hashCode() : 0);
        result = 31 * result + (dataDiskCatalogueSuffix != null ? dataDiskCatalogueSuffix.hashCode() : 0);
        result = 31 * result + (hyperThreading != null ? hyperThreading.hashCode() : 0);
        result = 31 * result + (nvmeDataFileType != null ? nvmeDataFileType.hashCode() : 0);
        result = 31 * result + (nvmeDataDiskCatalogue != null ? nvmeDataDiskCatalogue.hashCode() : 0);
        result = 31 * result + (nvmeDataDiskCatalogueSuffix != null ? nvmeDataDiskCatalogueSuffix.hashCode() : 0);
        result = 31 * result + (bondAttribute != null ? bondAttribute.hashCode() : 0);
        result = 31 * result + (containerAgent != null ? containerAgent.hashCode() : 0);
        result = 31 * result + (kesAgent != null ? kesAgent.hashCode() : 0);
        return result;
    }

        public void addSecurityGroupIds(String... securityGroupIds){
            if (this.securityGroupIds == null) {
                this.securityGroupIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : securityGroupIds){
                this.securityGroupIds.add(value);
            }
        }
        public void addExtensionSecurityGroupIds(String... extensionSecurityGroupIds){
            if (this.extensionSecurityGroupIds == null) {
                this.extensionSecurityGroupIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : extensionSecurityGroupIds){
                this.extensionSecurityGroupIds.add(value);
            }
        }

    @Override
    public Request<CreateEpcRequest> getDryRunRequest() {
        Request<CreateEpcRequest> request = new CreateEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateEpcRequest clone() {
        return (CreateEpcRequest) super.clone();
    }
}


package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ReinstallEpcRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ReinstallEpc.
 * </p>
 */
@Data
public class ReinstallEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReinstallEpcRequest> {

    /**
     * 实例ID
     */
    private String hostId;
    /**
     * 镜像ID
     */
    private String imageId;
    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 密码
     */
    private String password;
    /**
     * 网卡模式
     */
    private String networkInterfaceMode;
    /**
     * 安全组件类型
     */
    private String securityAgent;
    /**
     * 监控组件类型
     */
    private String cloudMonitorAgent;
    /**
     * 数据盘Raid级别
     */
    private String raid;
    /**
     * 实例名称
     */
    private String hostName;
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

        ReinstallEpcRequest that = (ReinstallEpcRequest) o;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null)
            return false;
        if (keyId != null ? !keyId.equals(that.keyId) : that.keyId != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        if (networkInterfaceMode != null ? !networkInterfaceMode.equals(that.networkInterfaceMode) : that.networkInterfaceMode != null)
            return false;
        if (securityAgent != null ? !securityAgent.equals(that.securityAgent) : that.securityAgent != null)
            return false;
        if (cloudMonitorAgent != null ? !cloudMonitorAgent.equals(that.cloudMonitorAgent) : that.cloudMonitorAgent != null)
            return false;
        if (raid != null ? !raid.equals(that.raid) : that.raid != null)
            return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null)
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
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        result = 31 * result + (keyId != null ? keyId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (networkInterfaceMode != null ? networkInterfaceMode.hashCode() : 0);
        result = 31 * result + (securityAgent != null ? securityAgent.hashCode() : 0);
        result = 31 * result + (cloudMonitorAgent != null ? cloudMonitorAgent.hashCode() : 0);
        result = 31 * result + (raid != null ? raid.hashCode() : 0);
        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
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


    @Override
    public Request<ReinstallEpcRequest> getDryRunRequest() {
        Request<ReinstallEpcRequest> request = new ReinstallEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ReinstallEpcRequest clone() {
        return (ReinstallEpcRequest) super.clone();
    }
}


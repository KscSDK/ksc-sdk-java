package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.CreateKrdsMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreateKrdsRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<CreateKrdsRequest> {

    private String DBInstanceClass;
    private String DBInstanceName;
    private String Engine;
    private String EngineVersion;
    private String MasterUserPassword;
    private String MasterUserName;
    private String DBInstanceType;
    private String VpcId;
    private String SubnetId;
    private Integer Mem;
    private Integer Disk;
    private String PreferredBackupTime;
    private String DBParameterGroupId;
    private Integer Port;
    private String BillType;
    private String Duration;
    private String DurationUnit;
    private Integer ProjectId;
    private String RequestId;

    private Integer MaxConn;

    private Integer Iops;

    private Integer Vcpus;

    private String DBInstanceIdentifier;

    private String FlavorId;

    private String SecurityGroupId;

    private String VipId;

    private String Vip;

    private String DesignatedHost;

    private String EndTime;

    private List<String> AvailabilityZone = new ArrayList<String>();

    private String SubOrderId;

    private Integer VolumeSize;

    private String VolumeType;

    private Integer CountNodes;

    private List<SecurityGroups> SecurityGroups = new ArrayList<SecurityGroups>();

    private Boolean SupportIPV6 = false;

    private Instance.WithData WithData;

    private String PreSubmitId;

    public Integer getMaxConn() {
        return MaxConn;
    }

    public void setMaxConn(Integer maxConn) {
        MaxConn = maxConn;
    }

    public Integer getIops() {
        return Iops;
    }

    public void setIops(Integer iops) {
        Iops = iops;
    }

    public Integer getVcpus() {
        return Vcpus;
    }

    public void setVcpus(Integer vcpus) {
        Vcpus = vcpus;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getFlavorId() {
        return FlavorId;
    }

    public void setFlavorId(String flavorId) {
        FlavorId = flavorId;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public String getVipId() {
        return VipId;
    }

    public void setVipId(String vipId) {
        VipId = vipId;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String vip) {
        Vip = vip;
    }

    public String getDesignatedHost() {
        return DesignatedHost;
    }

    public void setDesignatedHost(String designatedHost) {
        DesignatedHost = designatedHost;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public List<String> getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        AvailabilityZone = availabilityZone;
    }

    public String getSubOrderId() {
        return SubOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        SubOrderId = subOrderId;
    }

    public Integer getVolumeSize() {
        return VolumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        VolumeSize = volumeSize;
    }

    public String getVolumeType() {
        return VolumeType;
    }

    public void setVolumeType(String volumeType) {
        VolumeType = volumeType;
    }

    public Integer getCountNodes() {
        return CountNodes;
    }

    public void setCountNodes(Integer countNodes) {
        CountNodes = countNodes;
    }

    public List<CreateKrdsRequest.SecurityGroups> getSecurityGroups() {
        return SecurityGroups;
    }

    public void setSecurityGroups(List<CreateKrdsRequest.SecurityGroups> securityGroups) {
        SecurityGroups = securityGroups;
    }

    public Boolean getSupportIPV6() {
        return SupportIPV6;
    }

    public void setSupportIPV6(Boolean supportIPV6) {
        SupportIPV6 = supportIPV6;
    }

    public Instance.WithData getWithData() {
        return WithData;
    }

    public void setWithData(Instance.WithData withData) {
        WithData = withData;
    }

    public String getPreSubmitId() {
        return PreSubmitId;
    }

    public void setPreSubmitId(String preSubmitId) {
        PreSubmitId = preSubmitId;
    }

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getEngineVersion() {
        return EngineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        EngineVersion = engineVersion;
    }

    public String getMasterUserPassword() {
        return MasterUserPassword;
    }

    public void setMasterUserPassword(String masterUserPassword) {
        MasterUserPassword = masterUserPassword;
    }

    public String getMasterUserName() {
        return MasterUserName;
    }

    public void setMasterUserName(String masterUserName) {
        MasterUserName = masterUserName;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }

    public Integer getMem() {
        return Mem;
    }

    public void setMem(Integer mem) {
        Mem = mem;
    }

    public Integer getDisk() {
        return Disk;
    }

    public void setDisk(Integer disk) {
        Disk = disk;
    }

    public String getPreferredBackupTime() {
        return PreferredBackupTime;
    }

    public void setPreferredBackupTime(String preferredBackupTime) {
        PreferredBackupTime = preferredBackupTime;
    }

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getDurationUnit() {
        return DurationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        DurationUnit = durationUnit;
    }

    public Integer getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }



    public Request<CreateKrdsRequest> getDryRunRequest() {
        Request<CreateKrdsRequest> request = new CreateKrdsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    public static class SecurityGroups{
        private String SecurityGroupId;
        private String SecurityGroupType;

        public String getSecurityGroupId() {
            return SecurityGroupId;
        }

        public void setSecurityGroupId(String securityGroupId) {
            SecurityGroupId = securityGroupId;
        }

        public String getSecurityGroupType() {
            return SecurityGroupType;
        }

        public void setSecurityGroupType(String securityGroupType) {
            SecurityGroupType = securityGroupType;
        }

        public SecurityGroups() {
        }

        public SecurityGroups(String securityGroupId, String securityGroupType) {
            SecurityGroupId = securityGroupId;
            SecurityGroupType = securityGroupType;
        }
    }
}
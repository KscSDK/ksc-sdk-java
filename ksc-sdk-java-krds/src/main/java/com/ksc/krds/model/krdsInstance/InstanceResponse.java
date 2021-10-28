package com.ksc.krds.model.krdsInstance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstanceResponse {

    private RetInstance DBInstance;
    private String InstanceId;
    private List<String> Source;
    private String InstanceName;
    private String InstanceStatus;
    private String InstanceType;
    private String ParameterGroupId;
    private String GroupId;

    private String SecurityGroupId;
    private String Vip;
    private Integer Port;
    private String Engine;
    private String EngineVersion;
    private Date InstanceCreateTime;
    private String MasterUserName;
    private String DatastoreVersionId;
    private String Region;
    private String VpcId;
    private String SubnetId;
    private String PubliclyAccessible;
    private String ReadReplicaDBInstanceIdentifiers;
    private String PMALink;
    private String BillType;
    private String ProductId;
    private String ServiceEndTime;
    private String DiskUsed;

    private String InnerAzCode;
    private String Audit;
    private String ProductWhat;
    private String ProjectId;
    private String ProjectName;
    private Date ServiceStartTime;
    private String SubOrderId;
    private List<String> SecurityGroups;
    private String SupportIPV6;
    private String BillTypeIdl;

    public String getInnerAzCode() {
        return InnerAzCode;
    }

    public void setInnerAzCode(String innerAzCode) {
        InnerAzCode = innerAzCode;
    }

    public String getAudit() {
        return Audit;
    }

    public void setAudit(String audit) {
        Audit = audit;
    }

    public String getProductWhat() {
        return ProductWhat;
    }

    public void setProductWhat(String productWhat) {
        ProductWhat = productWhat;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public Date getServiceStartTime() {
        return ServiceStartTime;
    }

    public void setServiceStartTime(Date serviceStartTime) {
        ServiceStartTime = serviceStartTime;
    }

    public String getSubOrderId() {
        return SubOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        SubOrderId = subOrderId;
    }

    public List<String> getSecurityGroups() {
        return SecurityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        SecurityGroups = securityGroups;
    }

    public String getSupportIPV6() {
        return SupportIPV6;
    }

    public void setSupportIPV6(String supportIPV6) {
        SupportIPV6 = supportIPV6;
    }

    public String getBillTypeIdl() {
        return BillTypeIdl;
    }

    public void setBillTypeIdl(String billTypeIdl) {
        BillTypeIdl = billTypeIdl;
    }


    private List<RetInstance> Instances = new ArrayList<RetInstance>();
    private Integer TotalCount;
    private Integer MaxRecords;
    private Integer Marker;
    public List<RetInstance> getInstances() {
        return Instances;
    }

    public void setInstances(List<RetInstance> instances) {
        Instances = instances;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }


    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    public List<String> getSource() {
        return Source;
    }

    public void setSource(List<String> source) {
        Source = source;
    }

    public String getInstanceName() {
        return InstanceName;
    }

    public void setInstanceName(String instanceName) {
        InstanceName = instanceName;
    }

    public String getInstanceStatus() {
        return InstanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        InstanceStatus = instanceStatus;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String instanceType) {
        InstanceType = instanceType;
    }

    public String getParameterGroupId() {
        return ParameterGroupId;
    }

    public void setParameterGroupId(String parameterGroupId) {
        ParameterGroupId = parameterGroupId;
    }

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public String getVip() {
        return Vip;
    }

    public void setVip(String vip) {
        Vip = vip;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
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

    public Date getInstanceCreateTime() {
        return InstanceCreateTime;
    }

    public void setInstanceCreateTime(Date instanceCreateTime) {
        InstanceCreateTime = instanceCreateTime;
    }

    public String getMasterUserName() {
        return MasterUserName;
    }

    public void setMasterUserName(String masterUserName) {
        MasterUserName = masterUserName;
    }

    public String getDatastoreVersionId() {
        return DatastoreVersionId;
    }

    public void setDatastoreVersionId(String datastoreVersionId) {
        DatastoreVersionId = datastoreVersionId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
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

    public String getPubliclyAccessible() {
        return PubliclyAccessible;
    }

    public void setPubliclyAccessible(String publiclyAccessible) {
        PubliclyAccessible = publiclyAccessible;
    }

    public String getReadReplicaDBInstanceIdentifiers() {
        return ReadReplicaDBInstanceIdentifiers;
    }

    public void setReadReplicaDBInstanceIdentifiers(String readReplicaDBInstanceIdentifiers) {
        ReadReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiers;
    }

    public String getPMALink() {
        return PMALink;
    }

    public void setPMALink(String PMALink) {
        this.PMALink = PMALink;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getServiceEndTime() {
        return ServiceEndTime;
    }

    public void setServiceEndTime(String serviceEndTime) {
        ServiceEndTime = serviceEndTime;
    }

    public String getDiskUsed() {
        return DiskUsed;
    }

    public void setDiskUsed(String diskUsed) {
        DiskUsed = diskUsed;
    }



    public RetInstance getDBInstance() {
        return DBInstance;
    }

    public void setDBInstance(RetInstance DBInstance) {
        this.DBInstance = DBInstance;
    }
}

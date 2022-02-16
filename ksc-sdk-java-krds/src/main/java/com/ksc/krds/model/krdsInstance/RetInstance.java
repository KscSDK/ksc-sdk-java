package com.ksc.krds.model.krdsInstance;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RetInstance {
    private Flavor DBInstanceClass;

    private String DBInstanceIdentifier;

    private String DBInstanceName;

    private String DBInstanceStatus;

    private String DBInstanceType;

    private String DBParameterGroupId;
    private String PreferredBackupTime;

    private String GroupId;

    private String SecurityGroupId;

    private String Vip;

    private Integer Port;

    private String Engine;

    private String EngineVersion;

    private String VolumeType;
    private Integer VolumeSize;
    private String VolumeId;
    private Integer CountNodes;

    private String InstanceCreateTime;

    private String MasterUserName;

    private String DatastoreVersionId;

    private String VpcId;

    private String SubnetId;

    private Boolean PubliclyAccessible = false;


    private BILLTYPE BillType;

    private String OrderType;


    private Boolean MultiAvailabilityZone;

    private String MasterAvailabilityZone;

    private String SlaveAvailabilityZone;

    private String AvailabilityZone;

    private List<AvailabilityZoneMember>AvailabilityZoneList;

    private Float DiskUsed = 0f;

    private String Eip;

    private Integer EipPort;

    private String InnerEip;

    private Integer InneEipPort;

    private String Rip;

    private String InnerAzCode;

    private Boolean Audit = false;

    private List<ReadReplicaDBInstanceIdentifier> ReadReplicaDBInstanceIdentifiers;
    private DBSource DBSource;

    private String ProductId;

    private Integer ProductWhat;

    private BigInteger ProjectId;

    private String ProjectName;

    private String Region;

    private String ServiceEndTime;

    private String ServiceStartTime;

    private String SubOrderId;

    private List<SecurityGroups> SecurityGroups;
    public Boolean SupportIPV6=false;
    private String IPV6Vip;
    private String UserId;
    private String UserEmail;
    private String UserName;
    private String UserCompany;
    private String UserTelephone;
    private String ServiceOrderStatus;

    private Integer BillTypeId;

    public Flavor getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(Flavor DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    public String getDBInstanceStatus() {
        return DBInstanceStatus;
    }

    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getDBParameterGroupId() {
        return DBParameterGroupId;
    }

    public void setDBParameterGroupId(String DBParameterGroupId) {
        this.DBParameterGroupId = DBParameterGroupId;
    }

    public String getPreferredBackupTime() {
        return PreferredBackupTime;
    }

    public void setPreferredBackupTime(String preferredBackupTime) {
        PreferredBackupTime = preferredBackupTime;
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

    public String getVolumeType() {
        return VolumeType;
    }

    public void setVolumeType(String volumeType) {
        VolumeType = volumeType;
    }

    public Integer getVolumeSize() {
        return VolumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        VolumeSize = volumeSize;
    }

    public String getVolumeId() {
        return VolumeId;
    }

    public void setVolumeId(String volumeId) {
        VolumeId = volumeId;
    }

    public Integer getCountNodes() {
        return CountNodes;
    }

    public void setCountNodes(Integer countNodes) {
        CountNodes = countNodes;
    }

    public String getInstanceCreateTime() {
        return InstanceCreateTime;
    }

    public void setInstanceCreateTime(String instanceCreateTime) {
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

    public Boolean getPubliclyAccessible() {
        return PubliclyAccessible;
    }

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        PubliclyAccessible = publiclyAccessible;
    }

    public BILLTYPE getBillType() {
        return BillType;
    }

    public void setBillType(BILLTYPE billType) {
        BillType = billType;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public Boolean getMultiAvailabilityZone() {
        return MultiAvailabilityZone;
    }

    public void setMultiAvailabilityZone(Boolean multiAvailabilityZone) {
        MultiAvailabilityZone = multiAvailabilityZone;
    }

    public String getMasterAvailabilityZone() {
        return MasterAvailabilityZone;
    }

    public void setMasterAvailabilityZone(String masterAvailabilityZone) {
        MasterAvailabilityZone = masterAvailabilityZone;
    }

    public String getSlaveAvailabilityZone() {
        return SlaveAvailabilityZone;
    }

    public void setSlaveAvailabilityZone(String slaveAvailabilityZone) {
        SlaveAvailabilityZone = slaveAvailabilityZone;
    }

    public String getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        AvailabilityZone = availabilityZone;
    }

    public List<AvailabilityZoneMember> getAvailabilityZoneList() {
        return AvailabilityZoneList;
    }

    public void setAvailabilityZoneList(List<AvailabilityZoneMember> availabilityZoneList) {
        AvailabilityZoneList = availabilityZoneList;
    }

    public Float getDiskUsed() {
        return DiskUsed;
    }

    public void setDiskUsed(Float diskUsed) {
        DiskUsed = diskUsed;
    }

    public String getEip() {
        return Eip;
    }

    public void setEip(String eip) {
        Eip = eip;
    }

    public Integer getEipPort() {
        return EipPort;
    }

    public void setEipPort(Integer eipPort) {
        EipPort = eipPort;
    }

    public String getInnerEip() {
        return InnerEip;
    }

    public void setInnerEip(String innerEip) {
        InnerEip = innerEip;
    }

    public Integer getInneEipPort() {
        return InneEipPort;
    }

    public void setInneEipPort(Integer inneEipPort) {
        InneEipPort = inneEipPort;
    }

    public String getRip() {
        return Rip;
    }

    public void setRip(String rip) {
        Rip = rip;
    }

    public String getInnerAzCode() {
        return InnerAzCode;
    }

    public void setInnerAzCode(String innerAzCode) {
        InnerAzCode = innerAzCode;
    }

    public Boolean getAudit() {
        return Audit;
    }

    public void setAudit(Boolean audit) {
        Audit = audit;
    }

    public List<ReadReplicaDBInstanceIdentifier> getReadReplicaDBInstanceIdentifiers() {
        return ReadReplicaDBInstanceIdentifiers;
    }

    public void setReadReplicaDBInstanceIdentifiers(List<ReadReplicaDBInstanceIdentifier> readReplicaDBInstanceIdentifiers) {
        ReadReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiers;
    }

    public RetInstance.DBSource getDBSource() {
        return DBSource;
    }

    public void setDBSource(RetInstance.DBSource DBSource) {
        this.DBSource = DBSource;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public Integer getProductWhat() {
        return ProductWhat;
    }

    public void setProductWhat(Integer productWhat) {
        ProductWhat = productWhat;
    }

    public BigInteger getProjectId() {
        return ProjectId;
    }

    public void setProjectId(BigInteger projectId) {
        ProjectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getServiceEndTime() {
        return ServiceEndTime;
    }

    public void setServiceEndTime(String serviceEndTime) {
        ServiceEndTime = serviceEndTime;
    }

    public String getServiceStartTime() {
        return ServiceStartTime;
    }

    public void setServiceStartTime(String serviceStartTime) {
        ServiceStartTime = serviceStartTime;
    }

    public String getSubOrderId() {
        return SubOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        SubOrderId = subOrderId;
    }

    public List<RetInstance.SecurityGroups> getSecurityGroups() {
        return SecurityGroups;
    }

    public void setSecurityGroups(List<RetInstance.SecurityGroups> securityGroups) {
        SecurityGroups = securityGroups;
    }

    public Boolean getSupportIPV6() {
        return SupportIPV6;
    }

    public void setSupportIPV6(Boolean supportIPV6) {
        SupportIPV6 = supportIPV6;
    }

    public String getIPV6Vip() {
        return IPV6Vip;
    }

    public void setIPV6Vip(String IPV6Vip) {
        this.IPV6Vip = IPV6Vip;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserCompany() {
        return UserCompany;
    }

    public void setUserCompany(String userCompany) {
        UserCompany = userCompany;
    }

    public String getUserTelephone() {
        return UserTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        UserTelephone = userTelephone;
    }

    public String getServiceOrderStatus() {
        return ServiceOrderStatus;
    }

    public void setServiceOrderStatus(String serviceOrderStatus) {
        ServiceOrderStatus = serviceOrderStatus;
    }

    public Integer getBillTypeId() {
        return BillTypeId;
    }

    public void setBillTypeId(Integer billTypeId) {
        BillTypeId = billTypeId;
    }

    public static class Flavor {
        private String Id;
        private Integer Iops;
        private Integer Vcpus;
        private Integer Disk;
        private Integer Ram;
        private Integer Mem;
        private Integer MaxConn;

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
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

        public Integer getDisk() {
            return Disk;
        }

        public void setDisk(Integer disk) {
            Disk = disk;
        }

        public Integer getRam() {
            return Ram;
        }

        public void setRam(Integer ram) {
            Ram = ram;
        }

        public Integer getMem() {
            return Mem;
        }

        public void setMem(Integer mem) {
            Mem = mem;
        }

        public Integer getMaxConn() {
            return MaxConn;
        }

        public void setMaxConn(Integer maxConn) {
            MaxConn = maxConn;
        }
    }

    public static class ReadReplicaDBInstanceIdentifier{

        private String Vip;
        private String ReadReplicaDBInstanceIdentifier;
        private String DBInstanceName;
        private String id;
        private String DBInstanceStatus;

        public String getVip() {
            return Vip;
        }

        public void setVip(String vip) {
            Vip = vip;
        }

        public String getReadReplicaDBInstanceIdentifier() {
            return ReadReplicaDBInstanceIdentifier;
        }

        public void setReadReplicaDBInstanceIdentifier(String readReplicaDBInstanceIdentifier) {
            ReadReplicaDBInstanceIdentifier = readReplicaDBInstanceIdentifier;
        }

        public String getDBInstanceName() {
            return DBInstanceName;
        }

        public void setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDBInstanceStatus() {
            return DBInstanceStatus;
        }

        public void setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
        }
    }

    public static class AvailabilityZoneMember{
        private String DBInstanceIdentifier;
        private String MemberType;
        private String AzCode;

        public String getDBInstanceIdentifier() {
            return DBInstanceIdentifier;
        }

        public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
            this.DBInstanceIdentifier = DBInstanceIdentifier;
        }

        public String getMemberType() {
            return MemberType;
        }

        public void setMemberType(String memberType) {
            MemberType = memberType;
        }

        public String getAzCode() {
            return AzCode;
        }

        public void setAzCode(String azCode) {
            AzCode = azCode;
        }
    }

    public static class DBSource {
        private String DBInstanceIdentifier;
        private String DBInstanceName;
        private String DBInstanceType;
        private String DBBackupIdentifier;
        private String DBBackupName;
        private String PointInTime;
        private String DBInstanceStatus;

        public String getDBInstanceIdentifier() {
            return DBInstanceIdentifier;
        }

        public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
            this.DBInstanceIdentifier = DBInstanceIdentifier;
        }

        public String getDBInstanceName() {
            return DBInstanceName;
        }

        public void setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
        }

        public String getDBInstanceType() {
            return DBInstanceType;
        }

        public void setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
        }

        public String getDBBackupIdentifier() {
            return DBBackupIdentifier;
        }

        public void setDBBackupIdentifier(String DBBackupIdentifier) {
            this.DBBackupIdentifier = DBBackupIdentifier;
        }

        public String getDBBackupName() {
            return DBBackupName;
        }

        public void setDBBackupName(String DBBackupName) {
            this.DBBackupName = DBBackupName;
        }

        public String getPointInTime() {
            return PointInTime;
        }

        public void setPointInTime(String pointInTime) {
            PointInTime = pointInTime;
        }

        public String getDBInstanceStatus() {
            return DBInstanceStatus;
        }

        public void setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
        }
    }

    public static class SecurityGroups{
        private String SecurityGroupId;
        private String SecurityGroupName;
        private String SecurityGroupDescription;
        private String SecurityGroupType;

        public String getSecurityGroupId() {
            return SecurityGroupId;
        }

        public void setSecurityGroupId(String securityGroupId) {
            SecurityGroupId = securityGroupId;
        }

        public String getSecurityGroupName() {
            return SecurityGroupName;
        }

        public void setSecurityGroupName(String securityGroupName) {
            SecurityGroupName = securityGroupName;
        }

        public String getSecurityGroupDescription() {
            return SecurityGroupDescription;
        }

        public void setSecurityGroupDescription(String securityGroupDescription) {
            SecurityGroupDescription = securityGroupDescription;
        }

        public String getSecurityGroupType() {
            return SecurityGroupType;
        }

        public void setSecurityGroupType(String securityGroupType) {
            SecurityGroupType = securityGroupType;
        }
    }
}

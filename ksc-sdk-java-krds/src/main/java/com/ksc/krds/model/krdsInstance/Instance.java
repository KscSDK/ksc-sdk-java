package com.ksc.krds.model.krdsInstance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Instance {

    private DBInstanceClass DBInstanceClass;
    private String DBInstanceIdentifier;
    private String DBInstanceName;
    private String DBInstanceStatus;
    private String DBInstanceType;
    private String GroupId;
    private String Vip;
    private Integer Port;
    private String Engine;
    private String EngineVersion;
    private String InstanceCreateTime;
    private String MasterUserName;
    private String BillType;
    private String ProjectName;
    private String VpcId;
    private String SubnetId;

    private Boolean MultiAvailabilityZone;
    private String DBParameterGroupId;
    private String PreferredBackupTime;
    private String SecurityGroupId;
    private String VolumeType;
    private Integer VolumeSize;
    private String DatastoreVersionId;
    private Boolean PubliclyAccessible;
    private String OrderType;
    private String VolumeId;
    private Integer CountNodes;
    private String MasterAvailabilityZone;
    private String SlaveAvailabilityZone;
    private String AvailabilityZone;
    private List<RetInstance.AvailabilityZoneMember> AvailabilityZoneList;
    private Float DiskUsed;
    private String Eip;
    private Integer EipPort;
    private String InnerEip;
    private Integer InneEipPort;
    private String Rip;
    private String InnerAzCode;
    private Boolean Audit = false;
    private List<RetInstance.ReadReplicaDBInstanceIdentifier> ReadReplicaDBInstanceIdentifiers;
    private RetInstance.DBSource DBSource;
    private String ProductId;
    private Integer ProductWhat;
    private BigInteger ProjectId;
    private String Region;
    private String ServiceEndTime;
    private String ServiceStartTime;
    private String SubOrderId;
    private List<RetInstance.SecurityGroups> SecurityGroups;
    public Boolean SupportIPV6;
    private String IPV6Vip;

    public Instance.DBInstanceClass getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(Instance.DBInstanceClass DBInstanceClass) {
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

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
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

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
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

    //@Getter
    //@Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class DBInstanceClass {
        private Integer Ram;
        private Integer Disk;

        private String Id;

        private Integer Iops;

        private Integer Vcpus;

        private Integer Mem;

        private Integer MaxConn;

        public Integer getRam() {
            return Ram;
        }

        public void setRam(Integer ram) {
            Ram = ram;
        }

        public Integer getDisk() {
            return Disk;
        }

        public void setDisk(Integer disk) {
            Disk = disk;
        }

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

    public String toString(){
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            return  objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e){
            return null;
        }
    }

    public static class Schema{
        @JsonProperty("SchemaName")
        private String SchemaName;

        public Schema(String schemaName) {
            SchemaName = schemaName;
        }

        public Schema() {
        }

        public String getSchemaName() {
            return SchemaName;
        }

        public void setSchemaName(String schemaName) {
            SchemaName = schemaName;
        }
    }

    public static class WithData{
        @JsonProperty("SourceInstanceIdentifier")
        private String SourceInstanceIdentifier;
        @JsonProperty("GivenTime")
        private String GivenTime;
        @JsonProperty("Schemas")
        List<Schema> Schemas = new ArrayList<Schema>();

        public String getSourceInstanceIdentifier() {
            return SourceInstanceIdentifier;
        }

        public void setSourceInstanceIdentifier(String sourceInstanceIdentifier) {
            SourceInstanceIdentifier = sourceInstanceIdentifier;
        }

        public String getGivenTime() {
            return GivenTime;
        }

        public void setGivenTime(String givenTime) {
            GivenTime = givenTime;
        }

        public List<Schema> getSchemas() {
            return Schemas;
        }

        public void setSchemas(List<Schema> schemas) {
            Schemas = schemas;
        }

        public WithData() {
        }

        public WithData(String sourceInstanceIdentifier, String givenTime, List<Schema> schemas) {
            SourceInstanceIdentifier = sourceInstanceIdentifier;
            GivenTime = givenTime;
            Schemas = schemas;
        }
    }

    public Boolean getMultiAvailabilityZone() {
        return MultiAvailabilityZone;
    }

    public void setMultiAvailabilityZone(Boolean multiAvailabilityZone) {
        MultiAvailabilityZone = multiAvailabilityZone;
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

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
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

    public String getDatastoreVersionId() {
        return DatastoreVersionId;
    }

    public void setDatastoreVersionId(String datastoreVersionId) {
        DatastoreVersionId = datastoreVersionId;
    }

    public Boolean getPubliclyAccessible() {
        return PubliclyAccessible;
    }

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        PubliclyAccessible = publiclyAccessible;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
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

    public List<RetInstance.AvailabilityZoneMember> getAvailabilityZoneList() {
        return AvailabilityZoneList;
    }

    public void setAvailabilityZoneList(List<RetInstance.AvailabilityZoneMember> availabilityZoneList) {
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

    public List<RetInstance.ReadReplicaDBInstanceIdentifier> getReadReplicaDBInstanceIdentifiers() {
        return ReadReplicaDBInstanceIdentifiers;
    }

    public void setReadReplicaDBInstanceIdentifiers(List<RetInstance.ReadReplicaDBInstanceIdentifier> readReplicaDBInstanceIdentifiers) {
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
}

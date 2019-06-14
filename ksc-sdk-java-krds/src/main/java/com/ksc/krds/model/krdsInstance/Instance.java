package com.ksc.krds.model.krdsInstance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


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
    public class DBInstanceClass {
        private Integer Ram;
        private Integer Disk;

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
    }

    public String toString(){
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            return  objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e){
            return null;
        }
    }
}

package com.ksc.krds.model.krdsInstance;

import com.ksc.annotation.SdkTestInternalApi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CreateReadReplicaRequest extends BaseRequest<CreateReadReplicaRequest>{

    private String DBInstanceIdentifier;

    private String DBInstanceName;

    //private String DBInstanceClass;

    private String AttachedVipId;

    private Integer Duration;

    private DURATION_UNIT DurationUnit;

    private BILLTYPE BillType;

    private PRODUCTWHAT ProductWhat;

    private List<String> AvailabilityZone;

    private BigInteger ProjectId;

    private String SecurityGroupId;

    private String Vip;
    private Integer Mem;
    private Integer Disk;


    private String Engine;

    private String EngineVersion;

    private String MasterUserPassword;

    private String MasterUserName;

    private String DBInstanceType;

    private String PubliclyAccessible;

    private String VpcId;

    private String SubnetId;

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

    public String getPubliclyAccessible() {
        return PubliclyAccessible;
    }

    public void setPubliclyAccessible(String publiclyAccessible) {
        PubliclyAccessible = publiclyAccessible;
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

    public String getAttachedVipId() {
        return AttachedVipId;
    }

    public void setAttachedVipId(String attachedVipId) {
        AttachedVipId = attachedVipId;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public DURATION_UNIT getDurationUnit() {
        return DurationUnit;
    }

    public void setDurationUnit(DURATION_UNIT durationUnit) {
        DurationUnit = durationUnit;
    }

    public BILLTYPE getBillType() {
        return BillType;
    }

    public void setBillType(BILLTYPE billType) {
        BillType = billType;
    }

    public PRODUCTWHAT getProductWhat() {
        return ProductWhat;
    }

    public void setProductWhat(PRODUCTWHAT productWhat) {
        ProductWhat = productWhat;
    }

    public List<String> getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        AvailabilityZone = availabilityZone;
    }

    public BigInteger getProjectId() {
        return ProjectId;
    }

    public void setProjectId(BigInteger projectId) {
        ProjectId = projectId;
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
}
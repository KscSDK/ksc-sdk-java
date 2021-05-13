package com.ksc.krds.model.krdsInstance;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SDKRestoreDBInstanceFromDBBackupRequest extends BaseRequest<SDKRestoreDBInstanceFromDBBackupRequest>{

    private String DBBackupIdentifier;

    private String DBInstanceType;

    private String DBInstanceName;

    private Integer Duration;

    private String DurationUnit;

    private List<String> AvailabilityZone;

    private BigInteger ProjectId;

    private String ProductWhat;

    private String VpcId;

    private String SubnetId;

    public String getDBBackupIdentifier() {
        return DBBackupIdentifier;
    }

    public void setDBBackupIdentifier(String DBBackupIdentifier) {
        this.DBBackupIdentifier = DBBackupIdentifier;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public String getDurationUnit() {
        return DurationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        DurationUnit = durationUnit;
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

    public String getProductWhat() {
        return ProductWhat;
    }

    public void setProductWhat(String productWhat) {
        ProductWhat = productWhat;
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
}

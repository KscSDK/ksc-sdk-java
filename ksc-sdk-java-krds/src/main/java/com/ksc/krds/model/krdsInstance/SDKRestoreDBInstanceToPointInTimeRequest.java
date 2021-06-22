package com.ksc.krds.model.krdsInstance;

import java.math.BigInteger;
import java.util.List;

public class SDKRestoreDBInstanceToPointInTimeRequest extends BaseRequest<SDKRestoreDBInstanceToPointInTimeRequest>{

    private String DBInstanceIdentifier;

    private String DBInstanceType;

    private String RestorableTime;

    private List<String> AvailabilityZone;

    private BigInteger ProjectId;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBInstanceType() {
        return DBInstanceType;
    }

    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    public String getRestorableTime() {
        return RestorableTime;
    }

    public void setRestorableTime(String restorableTime) {
        RestorableTime = restorableTime;
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
}

package com.ksc.krds.model.krdsInstance;

import java.util.List;

public class ModifyDBInstanceAvailabilityZoneRequest extends BaseRequest<ModifyDBInstanceAvailabilityZoneRequest>{

    private String DBInstanceIdentifier;
    private List<String> AvailabilityZone;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public List<String> getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        AvailabilityZone = availabilityZone;
    }
}

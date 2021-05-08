package com.ksc.krds.model.krdsInstance;

import java.util.ArrayList;
import java.util.List;

public class ModifyInstanceTypeRequest extends BaseRequest<ModifyInstanceTypeRequest> {

    private String DBInstanceIdentifier;

    private String DBInstanceType;

    private Integer Duration;

    private String DurationUnit;

    private String BillType;

    private List<String> AvailabilityZone = new ArrayList<String>();

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

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }

    public List<String> getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        AvailabilityZone = availabilityZone;
    }


}

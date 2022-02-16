package com.ksc.krds.model.krdsInstance;

public class CreateInstanceOrderRequest extends BaseRequest<CreateInstanceOrderRequest>{

    private String DBInstanceIdentifier;

    private Integer Duration = 1;

    private String EndTime;

    private DURATION_UNIT DurationUnit;

    private BILLTYPE BillType;

    private PRODUCTWHAT ProductWhat;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
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
}

package com.ksc.krds.model.slowlog;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class SlowLogLineChartRequest extends BaseRequest<SlowLogLineChartRequest> {

    private String DBInstanceIdentifier;

    private String StartTime;

    private String EndTime;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
}

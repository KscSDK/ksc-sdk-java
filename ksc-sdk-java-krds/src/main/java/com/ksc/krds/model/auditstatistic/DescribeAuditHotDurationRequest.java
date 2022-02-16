package com.ksc.krds.model.auditstatistic;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DescribeAuditHotDurationRequest extends BaseRequest<DescribeAuditHotDurationRequest> {

    private String dBInstanceIdentifier;

    private String timeRange;

    private String startTime;

    private String endTime;

    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}

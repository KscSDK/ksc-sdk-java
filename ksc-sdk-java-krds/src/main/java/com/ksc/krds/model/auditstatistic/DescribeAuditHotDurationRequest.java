package com.ksc.krds.model.auditstatistic;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.Date;

public class DescribeAuditHotDurationRequest extends BaseRequest<DescribeAuditHotDurationRequest> {

    private String dBInstanceIdentifier;

    private String timeRange;

    private Date startTime;

    private Date endTime;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}

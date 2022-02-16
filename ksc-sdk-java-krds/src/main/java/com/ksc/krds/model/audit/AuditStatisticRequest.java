package com.ksc.krds.model.audit;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class AuditStatisticRequest extends BaseRequest<AuditStatisticRequest> {

    private String AuditStatisticBeginTime;

    private String AuditStatisticEndTime;

    private String DBInstanceIdentifier;

    public String getAuditStatisticBeginTime() {
        return AuditStatisticBeginTime;
    }

    public void setAuditStatisticBeginTime(String auditStatisticBeginTime) {
        AuditStatisticBeginTime = auditStatisticBeginTime;
    }

    public String getAuditStatisticEndTime() {
        return AuditStatisticEndTime;
    }

    public void setAuditStatisticEndTime(String auditStatisticEndTime) {
        AuditStatisticEndTime = auditStatisticEndTime;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }
}

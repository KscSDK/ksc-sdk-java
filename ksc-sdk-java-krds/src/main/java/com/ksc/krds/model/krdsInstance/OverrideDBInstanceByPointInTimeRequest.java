package com.ksc.krds.model.krdsInstance;

import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.OverrideDBInstanceByPointInTimeMarshaller;

public class OverrideDBInstanceByPointInTimeRequest extends BaseRequest<OverrideDBInstanceByPointInTimeRequest> {

    private String DBInstanceIdentifier;
    private String DBBackupIdentifier;
    private String RestorableTime;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBBackupIdentifier() {
        return DBBackupIdentifier;
    }

    public void setDBBackupIdentifier(String DBBackupIdentifier) {
        this.DBBackupIdentifier = DBBackupIdentifier;
    }

    public String getRestorableTime() {
        return RestorableTime;
    }

    public void setRestorableTime(String restorableTime) {
        RestorableTime = restorableTime;
    }

    public Request<OverrideDBInstanceByPointInTimeRequest> getDryRunRequest() {
        Request<OverrideDBInstanceByPointInTimeRequest> request = new OverrideDBInstanceByPointInTimeMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

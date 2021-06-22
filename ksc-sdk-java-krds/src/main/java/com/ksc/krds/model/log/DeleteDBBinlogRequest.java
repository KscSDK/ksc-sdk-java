package com.ksc.krds.model.log;

import com.ksc.krds.model.krdsInstance.BaseRequest;

public class DeleteDBBinlogRequest extends BaseRequest<DeleteDBBinlogRequest> {

    private String DBInstanceIdentifier;
    private String BinlogName;

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getBinlogName() {
        return BinlogName;
    }

    public void setBinlogName(String binlogName) {
        BinlogName = binlogName;
    }
}

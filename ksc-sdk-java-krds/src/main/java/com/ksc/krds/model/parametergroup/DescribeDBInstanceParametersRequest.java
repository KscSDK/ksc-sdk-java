package com.ksc.krds.model.parametergroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.model.krdsInstance.ListKrdsRequest;

/***
 * @ClassName: DescribeDBInstanceParametersRequest
 * @Description:TODO
 * @Auther: TaiBai
 * @Date: 2021/9/26 10:48
 * @version : V1.0
 */
public class DescribeDBInstanceParametersRequest extends BaseRequest<DescribeDBInstanceParametersRequest> {
    private String DBInstanceIdentifier;
    private String DBBackupIdentifier;
    private String BackupName;

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

    public String getBackupName() {
        return BackupName;
    }

    public void setBackupName(String backupName) {
        BackupName = backupName;
    }


}

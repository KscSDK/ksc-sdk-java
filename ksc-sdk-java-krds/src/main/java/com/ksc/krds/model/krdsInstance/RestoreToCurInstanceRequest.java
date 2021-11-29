package com.ksc.krds.model.krdsInstance;

import com.ksc.Request;
import com.ksc.krds.transform.krdsInstance.RestoreToCurInstanceMarshaller;

import java.util.List;

public class RestoreToCurInstanceRequest extends BaseRequest<RestoreToCurInstanceRequest> {

    private String DBInstanceIdentifier;

    private String DBBackupIdentifier;
    private String RestorableTime;

    private List<SrcDatabases> SrcDatabases;
    private List<DstDatabases> DstDatabases;


    public static class  SrcDatabases{
        public String getDatabaseName() {
            return DatabaseName;
        }

        public void setDatabaseName(String databaseName) {
            DatabaseName = databaseName;
        }

        public String getWholeDatabase() {
            return WholeDatabase;
        }

        public void setWholeDatabase(String wholeDatabase) {
            WholeDatabase = wholeDatabase;
        }

        public String[] getTableNames() {
            return TableNames;
        }

        public void setTableNames(String[] tableNames) {
            TableNames = tableNames;
        }

        private String DatabaseName;
        private String WholeDatabase;
        private String[] TableNames;
    }

    public static class  DstDatabases{
        public String getDatabaseName() {
            return DatabaseName;
        }

        public void setDatabaseName(String databaseName) {
            DatabaseName = databaseName;
        }

        public String getWholeDatabase() {
            return WholeDatabase;
        }

        public void setWholeDatabase(String wholeDatabase) {
            WholeDatabase = wholeDatabase;
        }

        public String[] getTableNames() {
            return TableNames;
        }

        public void setTableNames(String[] tableNames) {
            TableNames = tableNames;
        }

        private String DatabaseName;
        private String WholeDatabase;
        private String[] TableNames;
    }

    public List<RestoreToCurInstanceRequest.SrcDatabases> getSrcDatabases() {
        return SrcDatabases;
    }

    public void setSrcDatabases(List<RestoreToCurInstanceRequest.SrcDatabases> srcDatabases) {
        SrcDatabases = srcDatabases;
    }

    public List<RestoreToCurInstanceRequest.DstDatabases> getDstDatabases() {
        return DstDatabases;
    }

    public void setDstDatabases(List<RestoreToCurInstanceRequest.DstDatabases> dstDatabases) {
        DstDatabases = dstDatabases;
    }

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

    public Request<RestoreToCurInstanceRequest> getDryRunRequest() {
        Request<RestoreToCurInstanceRequest> request = new RestoreToCurInstanceMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

package com.ksc.krds.model.krdsBackup;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.krds.model.RdsResponse;

import java.util.List;


public class ListKrdsBackupResponse extends RdsResponse {
    private Data Data = new Data();
    private String RequestId;

    public ListKrdsBackupResponse.Data getData() {
        return Data;
    }

    public void setData(ListKrdsBackupResponse.Data data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public class Data{
        List<DBBackup> DBBackup;

        public Integer getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(Integer totalCount) {
            TotalCount = totalCount;
        }

        public Integer getMaxRecords() {
            return MaxRecords;
        }

        public void setMaxRecords(Integer maxRecords) {
            MaxRecords = maxRecords;
        }

        Integer TotalCount;
        Integer MaxRecords;

        public List<ListKrdsBackupResponse.DBBackup> getDBBackup() {
            return DBBackup;
        }

        public void setDBBackup(List<ListKrdsBackupResponse.DBBackup> DBBackup) {
            this.DBBackup = DBBackup;
        }
    }

    public class DBBackup{

        //TODO：
        private String BackupLocationRef;
        private String MD5;

        private String DBBackupIdentifier;
        private String DBBackupName;
        private String BackupCreateTime;
        private String BackupUpdatedTime;
        private String Status;
        private Double BackupSize;
        private String RemotePath;
        private String BackupMode;
        private String BackupType;
        private String ParentId;

        private String DBInstanceIdentifier;
        private String Engine;
        private String EngineVersion;


        public String getBackupLocationRef() {
            return BackupLocationRef;
        }

        public void setBackupLocationRef(String backupLocationRef) {
            BackupLocationRef = backupLocationRef;
        }

        public String getMD5() {
            return MD5;
        }

        public void setMD5(String MD5) {
            this.MD5 = MD5;
        }


        public String getDBBackupIdentifier() {
            return DBBackupIdentifier;
        }

        public void setDBBackupIdentifier(String DBBackupIdentifier) {
            this.DBBackupIdentifier = DBBackupIdentifier;
        }

        public String getDBBackupName() {
            return DBBackupName;
        }

        public void setDBBackupName(String DBBackupName) {
            this.DBBackupName = DBBackupName;
        }

        public String getBackupCreateTime() {
            return BackupCreateTime;
        }

        public void setBackupCreateTime(String backupCreateTime) {
            BackupCreateTime = backupCreateTime;
        }

        public String getBackupUpdatedTime() {
            return BackupUpdatedTime;
        }

        public void setBackupUpdatedTime(String backupUpdatedTime) {
            BackupUpdatedTime = backupUpdatedTime;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }

        public Double getBackupSize() {
            return BackupSize;
        }

        public void setBackupSize(Double backupSize) {
            BackupSize = backupSize;
        }

        public String getRemotePath() {
            return RemotePath;
        }

        public void setRemotePath(String remotePath) {
            RemotePath = remotePath;
        }

        public String getBackupMode() {
            return BackupMode;
        }

        public void setBackupMode(String backupMode) {
            BackupMode = backupMode;
        }

        public String getBackupType() {
            return BackupType;
        }

        public void setBackupType(String backupType) {
            BackupType = backupType;
        }

        public String getParentId() {
            return ParentId;
        }

        public void setParentId(String parentId) {
            ParentId = parentId;
        }

        public String getDBInstanceIdentifier() {
            return DBInstanceIdentifier;
        }

        public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
            this.DBInstanceIdentifier = DBInstanceIdentifier;
        }

        public String getEngine() {
            return Engine;
        }

        public void setEngine(String engine) {
            Engine = engine;
        }

        public String getEngineVersion() {
            return EngineVersion;
        }

        public void setEngineVersion(String engineVersion) {
            EngineVersion = engineVersion;
        }

        public String toString(){
            ObjectMapper objectMapper=new ObjectMapper();
            try {
                return  objectMapper.writeValueAsString(this);
            } catch (JsonProcessingException e){
                return null;
            }
        }
    }
}

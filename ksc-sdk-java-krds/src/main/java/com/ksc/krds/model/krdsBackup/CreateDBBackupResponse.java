package com.ksc.krds.model.krdsBackup;

public class CreateDBBackupResponse {

    private String DBInstanceIdentifier;
    private String DBBackupIdentifier;
    private String Engine;
    private String EngineVersion;
    private String BackupCreateTime;
    private String BackupUpdatedTime;
    private String DBBackupName;
    private String Description;
    private String ParentId;
    private String BackupMode;
    private String BackupType;
    private String Status;
    private Double BackupSize;
    private String BackupLocationRef;
    private String RemotePath;
    private String MD5;

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

    public String getDBBackupName() {
        return DBBackupName;
    }

    public void setDBBackupName(String DBBackupName) {
        this.DBBackupName = DBBackupName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
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

    public String getBackupLocationRef() {
        return BackupLocationRef;
    }

    public void setBackupLocationRef(String backupLocationRef) {
        BackupLocationRef = backupLocationRef;
    }

    public String getRemotePath() {
        return RemotePath;
    }

    public void setRemotePath(String remotePath) {
        RemotePath = remotePath;
    }

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }
}

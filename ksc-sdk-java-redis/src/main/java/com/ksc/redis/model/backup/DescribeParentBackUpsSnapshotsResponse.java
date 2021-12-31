package com.ksc.redis.model.backup;

import java.util.Date;

/***
 * @ClassName: DescribeParentBackUpsSnapshotsResponse
 * @version : V1.0
 */
public class
DescribeParentBackUpsSnapshotsResponse {
    private String snapshotId;
    private String resourceId;
    private String backupType;
    private String backupName;
    private Date createTime;
    private Date backUpTime;
    private Date updateTime;
    private String taskStatus;
    private Integer resourceSize;

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getBackUpTime() {
        return backUpTime;
    }

    public void setBackUpTime(Date backUpTime) {
        this.backUpTime = backUpTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }
}

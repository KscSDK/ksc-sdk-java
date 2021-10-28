package com.ksc.krds.model.slowlog;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * @ClassName: CreateDBBackupRespomse
 * @Description:TODO
 * @version : V1.0
 */
public class CreateDBBackupRespomse<T> {
    @JsonProperty(value = "RequestId")
    private String requestId;
    @JsonProperty(value = "DBBackup")
    private T DBBackup;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public T getDBBackup() {
        return DBBackup;
    }

    public void setDBBackup(T DBBackup) {
        this.DBBackup = DBBackup;
    }
}

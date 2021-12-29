package com.ksc.krds.model.krdsBackup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsBackup.ListKrdsBackupMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class ListKrdsBackupRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<ListKrdsBackupRequest> {

    private String DBInatanceIdentifier;
    private BackupType BackupType;
    private String Keyword;
    private Integer Marker;
    private Integer MaxRecords;

    public com.ksc.krds.model.krdsBackup.BackupType getBackupType() {
        return BackupType;
    }

    public void setBackupType(com.ksc.krds.model.krdsBackup.BackupType backupType) {
        BackupType = backupType;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public Integer getMarker() {
        return Marker;
    }

    public void setMarker(Integer marker) {
        Marker = marker;
    }

    public Integer getMaxRecords() {
        return MaxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        MaxRecords = maxRecords;
    }


    public String getDBInatanceIdentifier() {
        return DBInatanceIdentifier;
    }

    public void setDBInatanceIdentifier(String DBInatanceIdentifier) {
        this.DBInatanceIdentifier = DBInatanceIdentifier;
    }

    public Request<ListKrdsBackupRequest> getDryRunRequest() {
        Request<ListKrdsBackupRequest> request = new ListKrdsBackupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

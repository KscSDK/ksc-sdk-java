package com.ksc.krds.model.krdsBackup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.krdsBackup.ListKrdsBackupMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class ListKrdsBackupRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<ListKrdsBackupRequest> {
    private String DBInatanceIdentifier;

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

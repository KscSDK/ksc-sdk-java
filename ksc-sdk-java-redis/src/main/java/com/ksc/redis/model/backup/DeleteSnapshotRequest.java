package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.DeleteSnapshotMarshaller;

import java.io.Serializable;

public class DeleteSnapshotRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteSnapshotRequest> {
    private String snapshotId;

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    @Override
    public Request<DeleteSnapshotRequest> getDryRunRequest() {
        Request<DeleteSnapshotRequest> request = new DeleteSnapshotMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

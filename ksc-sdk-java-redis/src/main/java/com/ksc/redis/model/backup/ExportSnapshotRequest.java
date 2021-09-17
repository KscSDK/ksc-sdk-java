package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.ExportSnapshotMarshaller;

import java.io.Serializable;

public class ExportSnapshotRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ExportSnapshotRequest> {
    private String snapshotId;
    private String bucketName;

    
    private String ObjectName;
    public String getObjectName() {
        return ObjectName;
    }

    public void setObjectName(String objectName) {
        this.ObjectName = objectName;
    }


    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public Request<ExportSnapshotRequest> getDryRunRequest() {
        Request<ExportSnapshotRequest> request = new ExportSnapshotMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

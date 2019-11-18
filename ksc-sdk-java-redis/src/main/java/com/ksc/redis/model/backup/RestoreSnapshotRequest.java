package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.RestoreSnapshotMarshaller;

import java.io.Serializable;

public class RestoreSnapshotRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RestoreSnapshotRequest> {
    private String cacheId;
    private String type;
    private String snapshotId;
    private String bucketName;
    private String objectName;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public Request<RestoreSnapshotRequest> getDryRunRequest() {
        Request<RestoreSnapshotRequest> request = new RestoreSnapshotMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

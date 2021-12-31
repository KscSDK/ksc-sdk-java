package com.ksc.redis.model.backup;


import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.DeleteLevelSnapshotsMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DeleteLevelSnapshotsRequest
 * @Description:TODO
 */
public class DeleteLevelSnapshotsRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteLevelSnapshotsRequest> {
    private String CacheId;
    private String shareId;
    private String snapshotId;

    public String getCacheId() {
        return CacheId;
    }

    public void setCacheId(String cacheId) {
        CacheId = cacheId;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    @Override
    public String toString() {
        return "DownloadSnapshotForm [snapshotId=" + snapshotId + "]";
    }
    @Override
    public Request<DeleteLevelSnapshotsRequest> getDryRunRequest() throws Exception {
        Request<DeleteLevelSnapshotsRequest> request = new DeleteLevelSnapshotsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

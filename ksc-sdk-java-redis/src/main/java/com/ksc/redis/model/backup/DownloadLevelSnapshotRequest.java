package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.DownloadLevelSnapshotMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DownloadLevelSnapshotRequest
 */
public class DownloadLevelSnapshotRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DownloadLevelSnapshotRequest> {
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
    public Request<DownloadLevelSnapshotRequest> getDryRunRequest() throws Exception {
        Request<DownloadLevelSnapshotRequest> request = new DownloadLevelSnapshotMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

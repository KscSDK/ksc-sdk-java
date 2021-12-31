package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.DescribeBackUpsSnapshotsDetailMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DescribeBackUpsSnapshotsDetailRequest
 * @version : V1.0
 */
public class DescribeBackUpsSnapshotsDetailRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeBackUpsSnapshotsDetailRequest> {
    private String CacheId;
    private String shardId;
    private String snapshotId;

    public String getCacheId() {
        return CacheId;
    }

    public void setCacheId(String cacheId) {
        CacheId = cacheId;
    }

    public String getShareId() {
        return shardId;
    }

    public void setShareId(String shareId) {
        this.shardId = shareId;
    }

    public String getSnapshotId() {
        return snapshotId;
    }
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    @Override
    public Request<DescribeBackUpsSnapshotsDetailRequest> getDryRunRequest() throws Exception {
        Request<DescribeBackUpsSnapshotsDetailRequest> request = new DescribeBackUpsSnapshotsDetailMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

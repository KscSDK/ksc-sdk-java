package com.ksc.redis.model.backup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.backup.DescribeParentBackUpsSnapshotsMarshaller;

import java.io.Serializable;

/***
 * @ClassName: DescribeParentBackUpsSnapshotsRequest
 * @version : V1.0
 */
public class DescribeParentBackUpsSnapshotsRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeParentBackUpsSnapshotsRequest> {
    private String CacheId;
    private String shareId;

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
    @Override
    public Request<DescribeParentBackUpsSnapshotsRequest> getDryRunRequest() throws Exception {
        Request<DescribeParentBackUpsSnapshotsRequest> request = new DescribeParentBackUpsSnapshotsMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}

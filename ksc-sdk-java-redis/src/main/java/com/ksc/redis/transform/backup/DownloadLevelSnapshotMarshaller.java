package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DownloadLevelSnapshotRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: DownloadLevelSnapshotMarshaller
 */
public class DownloadLevelSnapshotMarshaller implements Marshaller<Request<DownloadLevelSnapshotRequest>, DownloadLevelSnapshotRequest> {

    @Override
    public Request<DownloadLevelSnapshotRequest> marshall(DownloadLevelSnapshotRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DownloadLevelSnapshotRequest> request = new DefaultRequest<DownloadLevelSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "DownloadLevelSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("shareId", in.getShareId());
        request.addParameter("SnapshotId", in.getSnapshotId());

        return request;
    }
}

package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DeleteLevelSnapshotsRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: DeleteLevelSnapshotsMarshaller
 * @Description:TODO
 */
public class DeleteLevelSnapshotsMarshaller implements Marshaller<Request<DeleteLevelSnapshotsRequest>, DeleteLevelSnapshotsRequest> {
    @Override
    public Request<DeleteLevelSnapshotsRequest> marshall(DeleteLevelSnapshotsRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DeleteLevelSnapshotsRequest> request = new DefaultRequest<DeleteLevelSnapshotsRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteLevelSnapshots");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("shareId", in.getShareId());
        request.addParameter("SnapshotId", in.getSnapshotId());
        return request;
    }
}

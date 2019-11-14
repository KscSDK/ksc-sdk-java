package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.RestoreSnapshotRequest;
import com.ksc.transform.Marshaller;

public class RestoreSnapshotMarshaller implements Marshaller<Request<RestoreSnapshotRequest>, RestoreSnapshotRequest> {
    @Override
    public Request<RestoreSnapshotRequest> marshall(RestoreSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<RestoreSnapshotRequest> request = new DefaultRequest<RestoreSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "RestoreSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("Type", in.getType());
        request.addParameter("SnapshotId", in.getSnapshotId());
        request.addParameter("BucketName", in.getBucketName());
        request.addParameter("ObjectName", in.getObjectName());
        return request;
    }
}

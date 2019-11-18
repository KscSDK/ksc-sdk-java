package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DeleteSnapshotRequest;
import com.ksc.transform.Marshaller;

public class DeleteSnapshotMarshaller implements Marshaller<Request<DeleteSnapshotRequest>, DeleteSnapshotRequest> {
    @Override
    public Request<DeleteSnapshotRequest> marshall(DeleteSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DeleteSnapshotRequest> request = new DefaultRequest<DeleteSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("SnapshotId", in.getSnapshotId());
        return request;
    }
}

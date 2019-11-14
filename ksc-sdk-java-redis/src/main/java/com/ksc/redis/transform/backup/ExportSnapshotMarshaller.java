package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.transform.Marshaller;

public class ExportSnapshotMarshaller implements Marshaller<Request<ExportSnapshotRequest>, ExportSnapshotRequest> {
    @Override
    public Request<ExportSnapshotRequest> marshall(ExportSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ExportSnapshotRequest> request = new DefaultRequest<ExportSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "ExportSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("SnapshotId", in.getSnapshotId());
        request.addParameter("BucketName", in.getBucketName());
        return request;
    }
}

package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DownloadSnapshotRequest;
import com.ksc.transform.Marshaller;

public class DownloadSnapshotMarshaller implements Marshaller<Request<DownloadSnapshotRequest>, DownloadSnapshotRequest> {
    @Override
    public Request<DownloadSnapshotRequest> marshall(DownloadSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DownloadSnapshotRequest> request = new DefaultRequest<DownloadSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DownloadSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("SnapshotId", in.getSnapshotId());
        return request;
    }
}

package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DescribeSnapshotRequest;
import com.ksc.transform.Marshaller;

public class DescribeSnapshotMarshaller implements Marshaller<Request<DescribeSnapshotRequest>, DescribeSnapshotRequest> {
    @Override
    public Request<DescribeSnapshotRequest> marshall(DescribeSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeSnapshotRequest> request = new DefaultRequest<DescribeSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeSnapshots");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        return request;
    }
}

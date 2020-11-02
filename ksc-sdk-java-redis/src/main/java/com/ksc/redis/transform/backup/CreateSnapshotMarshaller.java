package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.CreateSnapshotRequest;
import com.ksc.transform.Marshaller;

public class CreateSnapshotMarshaller implements Marshaller<Request<CreateSnapshotRequest>, CreateSnapshotRequest> {
    @Override
    public Request<CreateSnapshotRequest> marshall(CreateSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<CreateSnapshotRequest> request = new DefaultRequest<CreateSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "CreateSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("Name", in.getName());
        return request;
    }
}

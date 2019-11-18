package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.SetTimingSnapshotRequest;
import com.ksc.transform.Marshaller;

public class SetTimingSnapshotMarshaller implements Marshaller<Request<SetTimingSnapshotRequest>, SetTimingSnapshotRequest> {
    @Override
    public Request<SetTimingSnapshotRequest> marshall(SetTimingSnapshotRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<SetTimingSnapshotRequest> request = new DefaultRequest<SetTimingSnapshotRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "SetTimingSnapshot");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("TimingSwitch", in.getTimingSwitch());
        request.addParameter("Timezone", in.getTimezone());
        return request;
    }
}

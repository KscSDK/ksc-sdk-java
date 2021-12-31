package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DescribeParentBackUpsSnapshotsRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: DescribeParentBackUpsSnapshotsMarshaller
 * @version : V1.0
 */
public class DescribeParentBackUpsSnapshotsMarshaller implements Marshaller<Request<DescribeParentBackUpsSnapshotsRequest>, DescribeParentBackUpsSnapshotsRequest> {
    @Override
    public Request<DescribeParentBackUpsSnapshotsRequest> marshall(DescribeParentBackUpsSnapshotsRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeParentBackUpsSnapshotsRequest> request = new DefaultRequest<DescribeParentBackUpsSnapshotsRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeParentBackUpsSnapshots");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("shareId", in.getShareId());
        return request;
    }
}

package com.ksc.redis.transform.backup;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.DescribeBackUpsSnapshotsDetailRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: DescribeBackUpsSnapshotsDetailMarshaller
 * @version : V1.0
 */
public class DescribeBackUpsSnapshotsDetailMarshaller implements Marshaller<Request<DescribeBackUpsSnapshotsDetailRequest>, DescribeBackUpsSnapshotsDetailRequest> {

    @Override
    public Request<DescribeBackUpsSnapshotsDetailRequest> marshall(DescribeBackUpsSnapshotsDetailRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeBackUpsSnapshotsDetailRequest> request = new DefaultRequest<DescribeBackUpsSnapshotsDetailRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeBackUpsSnapshotsDetail");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", in.getCacheId());
        request.addParameter("shareId", in.getShareId());
        request.addParameter("SnapshotId", in.getSnapshotId());
        return request;
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.redis.model.instance.AllocateEipRequest;
import com.ksc.redis.model.instance.CreateReadOnlyRedisRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: AllocateEipMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class AllocateEipMarshaller implements Marshaller<Request<AllocateEipRequest>, AllocateEipRequest> {
    @Override
    public Request<AllocateEipRequest> marshall(AllocateEipRequest allocateEipRequest) {
        if (allocateEipRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<AllocateEipRequest> request = new DefaultRequest<AllocateEipRequest>(allocateEipRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "AllocateEip");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",allocateEipRequest.getCacheId());
        request.addParameter("InsType",allocateEipRequest.getInsType());
        return request;
    }

}

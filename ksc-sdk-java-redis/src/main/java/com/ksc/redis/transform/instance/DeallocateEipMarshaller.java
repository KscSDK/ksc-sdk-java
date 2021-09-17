package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.AllocateEipRequest;
import com.ksc.redis.model.instance.DeallocateEipRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: DeallocateEipMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DeallocateEipMarshaller implements Marshaller<Request<DeallocateEipRequest>, DeallocateEipRequest> {
    @Override
    public Request<DeallocateEipRequest> marshall(DeallocateEipRequest deallocateEipRequest) {
        if (deallocateEipRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DeallocateEipRequest> request = new DefaultRequest<DeallocateEipRequest>(deallocateEipRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "DeallocateEip");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",deallocateEipRequest.getCacheId());
        request.addParameter("InsType",deallocateEipRequest.getInsType());
        return request;
    }
}

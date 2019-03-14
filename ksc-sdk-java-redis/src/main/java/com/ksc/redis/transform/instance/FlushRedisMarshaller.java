package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.FlushRedisRequest;
import com.ksc.transform.Marshaller;

public class FlushRedisMarshaller implements Marshaller<Request<FlushRedisRequest>, FlushRedisRequest> {

    @Override
    public Request<FlushRedisRequest> marshall(FlushRedisRequest flushRedisRequest) {
        if (flushRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<FlushRedisRequest> request = new DefaultRequest<>(flushRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "FlushCacheCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", flushRedisRequest.getCacheId());

        return request;
    }
}

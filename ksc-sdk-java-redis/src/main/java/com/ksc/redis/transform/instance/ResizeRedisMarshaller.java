package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.ResizeRedisRequest;
import com.ksc.transform.Marshaller;

public class ResizeRedisMarshaller implements Marshaller<Request<ResizeRedisRequest>, ResizeRedisRequest> {

    @Override
    public Request<ResizeRedisRequest> marshall(ResizeRedisRequest resizeRedisRequest) {
        if (resizeRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResizeRedisRequest> request = new DefaultRequest<>(resizeRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "ResizeCacheCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", resizeRedisRequest.getCacheId());
        request.addParameter("Capacity",
                resizeRedisRequest.getCapacity() == null ? "" : resizeRedisRequest.getCapacity().toString());

        return request;
    }
}

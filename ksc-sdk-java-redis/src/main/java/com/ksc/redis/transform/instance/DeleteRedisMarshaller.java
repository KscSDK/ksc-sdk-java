package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DeleteRedisRequest;
import com.ksc.transform.Marshaller;

public class DeleteRedisMarshaller implements Marshaller<Request<DeleteRedisRequest>, DeleteRedisRequest> {

    @Override
    public Request<DeleteRedisRequest> marshall(DeleteRedisRequest deleteRedisRequest) {
        if (deleteRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRedisRequest> request = new DefaultRequest<>(deleteRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteCacheCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", deleteRedisRequest.getCacheId());

        return request;
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DeleteReadOnlyRedisRequest;
import com.ksc.transform.Marshaller;

public class DeleteReadOnlyRedisMarshaller implements Marshaller<Request<DeleteReadOnlyRedisRequest>, DeleteReadOnlyRedisRequest> {

    @Override
    public Request<DeleteReadOnlyRedisRequest> marshall(DeleteReadOnlyRedisRequest deleteReadOnlyRedisRequest) {
        if (deleteReadOnlyRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteReadOnlyRedisRequest> request = new DefaultRequest<>(deleteReadOnlyRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "DeleteCacheSlaveNode");
        request.addParameter("Version", "2017-04-01");
        request.addParameter("CacheId", deleteReadOnlyRedisRequest.getCacheId());
        request.addParameter("NodeId", deleteReadOnlyRedisRequest.getNodeId());

        return request;
    }
}

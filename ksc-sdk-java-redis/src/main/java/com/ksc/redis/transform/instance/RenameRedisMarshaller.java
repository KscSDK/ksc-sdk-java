package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.RenameRedisRequest;
import com.ksc.transform.Marshaller;

public class RenameRedisMarshaller implements Marshaller<Request<RenameRedisRequest>, RenameRedisRequest> {

    @Override
    public Request<RenameRedisRequest> marshall(RenameRedisRequest renameRedisRequest) {
        if (renameRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RenameRedisRequest> request = new DefaultRequest<RenameRedisRequest>(renameRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "RenameCacheCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", renameRedisRequest.getCacheId());
        request.addParameter("Name", renameRedisRequest.getName());

        return request;
    }
}

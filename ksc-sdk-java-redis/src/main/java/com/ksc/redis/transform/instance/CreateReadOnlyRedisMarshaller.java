package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.CreateReadOnlyRedisRequest;
import com.ksc.transform.Marshaller;

public class CreateReadOnlyRedisMarshaller implements Marshaller<Request<CreateReadOnlyRedisRequest>, CreateReadOnlyRedisRequest> {

    @Override
    public Request<CreateReadOnlyRedisRequest> marshall(CreateReadOnlyRedisRequest createReadOnlyRedisRequest) {
        if (createReadOnlyRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReadOnlyRedisRequest> request = new DefaultRequest<CreateReadOnlyRedisRequest>(createReadOnlyRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "AddCacheSlaveNode");
        request.addParameter("Version", "2017-04-01");
        request.addParameter("CacheId", createReadOnlyRedisRequest.getCacheId());

        return request;
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.ListReadOnlyRedisRequest;
import com.ksc.transform.Marshaller;

public class ListReadOnlyRedisMarshaller implements Marshaller<Request<ListReadOnlyRedisRequest>, ListReadOnlyRedisRequest> {

    @Override
    public Request<ListReadOnlyRedisRequest> marshall(ListReadOnlyRedisRequest listReadOnlyRedisRequest) {
        if (listReadOnlyRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListReadOnlyRedisRequest> request = new DefaultRequest<>(listReadOnlyRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheReadonlyNode");
        request.addParameter("Version", "2017-04-01");
        request.addParameter("CacheId", listReadOnlyRedisRequest.getCacheId());

        return request;
    }
}

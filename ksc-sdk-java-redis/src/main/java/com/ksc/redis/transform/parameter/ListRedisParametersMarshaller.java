package com.ksc.redis.transform.parameter;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.parameter.ListRedisParametersRequest;
import com.ksc.transform.Marshaller;

public class ListRedisParametersMarshaller implements Marshaller<Request<ListRedisParametersRequest>, ListRedisParametersRequest> {

    @Override
    public Request<ListRedisParametersRequest> marshall(ListRedisParametersRequest listRedisParametersRequest) {
        if (listRedisParametersRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListRedisParametersRequest> request = new DefaultRequest<ListRedisParametersRequest>(listRedisParametersRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheParameters");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", listRedisParametersRequest.getCacheId());

        return request;
    }
}

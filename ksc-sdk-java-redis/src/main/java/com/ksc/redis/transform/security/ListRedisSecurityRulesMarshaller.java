package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.ListRedisSecurityRulesRequest;
import com.ksc.transform.Marshaller;

public class ListRedisSecurityRulesMarshaller implements Marshaller<Request<ListRedisSecurityRulesRequest>, ListRedisSecurityRulesRequest> {

    @Override
    public Request<ListRedisSecurityRulesRequest> marshall(ListRedisSecurityRulesRequest listRedisSecurityRulesRequest) {
        if (listRedisSecurityRulesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListRedisSecurityRulesRequest> request = new DefaultRequest<>(listRedisSecurityRulesRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheSecurityRules");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", listRedisSecurityRulesRequest.getCacheId());

        return request;
    }
}

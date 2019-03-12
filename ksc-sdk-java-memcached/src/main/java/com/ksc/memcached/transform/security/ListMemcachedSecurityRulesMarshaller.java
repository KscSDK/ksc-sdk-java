package com.ksc.memcached.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.security.ListMemcachedSecurityRulesRequest;
import com.ksc.transform.Marshaller;

public class ListMemcachedSecurityRulesMarshaller implements Marshaller<Request<ListMemcachedSecurityRulesRequest>, ListMemcachedSecurityRulesRequest> {

    @Override
    public Request<ListMemcachedSecurityRulesRequest> marshall(ListMemcachedSecurityRulesRequest listMemcachedSecurityRulesRequest) {
        if (listMemcachedSecurityRulesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListMemcachedSecurityRulesRequest> request = new DefaultRequest<>(listMemcachedSecurityRulesRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheSecurityRules");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", listMemcachedSecurityRulesRequest.getCacheId());

        return request;
    }
}

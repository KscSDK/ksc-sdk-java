package com.ksc.memcached.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.security.DeleteMemcachedSecurityRuleRequest;
import com.ksc.transform.Marshaller;

public class DeleteMemcachedSecurityRuleMarshaller implements Marshaller<Request<DeleteMemcachedSecurityRuleRequest>, DeleteMemcachedSecurityRuleRequest> {

    @Override
    public Request<DeleteMemcachedSecurityRuleRequest> marshall(DeleteMemcachedSecurityRuleRequest deleteMemcachedSecurityRuleRequest) {
        if (deleteMemcachedSecurityRuleRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMemcachedSecurityRuleRequest> request = new DefaultRequest<>(deleteMemcachedSecurityRuleRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteCacheSecurityRule");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", deleteMemcachedSecurityRuleRequest.getCacheId());
        request.addParameter("SecurityRuleId", deleteMemcachedSecurityRuleRequest.getSecurityRuleId());

        return request;
    }
}

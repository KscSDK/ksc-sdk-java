package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DeleteRedisSecurityRuleRequest;
import com.ksc.transform.Marshaller;

public class DeleteRedisSecurityRuleMarshaller implements Marshaller<Request<DeleteRedisSecurityRuleRequest>, DeleteRedisSecurityRuleRequest> {

    @Override
    public Request<DeleteRedisSecurityRuleRequest> marshall(DeleteRedisSecurityRuleRequest deleteRedisSecurityRuleRequest) {
        if (deleteRedisSecurityRuleRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRedisSecurityRuleRequest> request = new DefaultRequest<DeleteRedisSecurityRuleRequest>(deleteRedisSecurityRuleRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteCacheSecurityRule");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", deleteRedisSecurityRuleRequest.getCacheId());
        request.addParameter("SecurityRuleId", deleteRedisSecurityRuleRequest.getSecurityRuleId());

        return request;
    }
}

package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DeleteRedisSecurityGroupRuleRequest;
import com.ksc.transform.Marshaller;

public class DeleteRedisSecurityGroupRuleMarshaller implements Marshaller<Request<DeleteRedisSecurityGroupRuleRequest>, DeleteRedisSecurityGroupRuleRequest> {

    @Override
    public Request<DeleteRedisSecurityGroupRuleRequest> marshall(DeleteRedisSecurityGroupRuleRequest deleteRedisSecurityGroupRuleRequest) {
        if (deleteRedisSecurityGroupRuleRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRedisSecurityGroupRuleRequest> request = new DefaultRequest<>(deleteRedisSecurityGroupRuleRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteCacheSecurityGroupRule");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheSecurityGroupId", deleteRedisSecurityGroupRuleRequest.getCacheSecurityGroupId());
        request.addParameter("SecurityRuleId", deleteRedisSecurityGroupRuleRequest.getSecurityRuleId());

        return request;
    }
}

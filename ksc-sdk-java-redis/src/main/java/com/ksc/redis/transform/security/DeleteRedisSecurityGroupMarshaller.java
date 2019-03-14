package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DeleteRedisSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class DeleteRedisSecurityGroupMarshaller implements Marshaller<Request<DeleteRedisSecurityGroupRequest>, DeleteRedisSecurityGroupRequest> {

    @Override
    public Request<DeleteRedisSecurityGroupRequest> marshall(DeleteRedisSecurityGroupRequest deleteRedisSecurityGroupRequest) {
        if (deleteRedisSecurityGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRedisSecurityGroupRequest> request = new DefaultRequest<>(deleteRedisSecurityGroupRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteCacheSecurityGroup");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheSecurityGroupId", deleteRedisSecurityGroupRequest.getCacheSecurityGroupId());

        return request;
    }
}

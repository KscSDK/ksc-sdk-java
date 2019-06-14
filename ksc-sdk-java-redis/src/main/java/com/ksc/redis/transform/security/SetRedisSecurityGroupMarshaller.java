package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.SetRedisSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class SetRedisSecurityGroupMarshaller implements Marshaller<Request<SetRedisSecurityGroupRequest>, SetRedisSecurityGroupRequest> {

    @Override
    public Request<SetRedisSecurityGroupRequest> marshall(SetRedisSecurityGroupRequest setRedisSecurityGroupRequest) {
        if (setRedisSecurityGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetRedisSecurityGroupRequest> request = new DefaultRequest<SetRedisSecurityGroupRequest>(setRedisSecurityGroupRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "SetCacheParameterGroup");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", setRedisSecurityGroupRequest.getCacheId());
        request.addParameter("CacheSecurityGroupId", setRedisSecurityGroupRequest.getCacheSecurityGroupId());

        return request;
    }
}

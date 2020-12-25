package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DeallocateSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class DeallocateSecurityGroupMarshaller implements Marshaller<Request<DeallocateSecurityGroupRequest>, DeallocateSecurityGroupRequest> {
    @Override
    public Request<DeallocateSecurityGroupRequest> marshall(DeallocateSecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeallocateSecurityGroupRequest> req = new DefaultRequest<DeallocateSecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "DeallocateSecurityGroup");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("SecurityGroupId", request.getSecurityGroupId());
        if (request.getCacheId() != null && request.getCacheId().size() > 0) {
            for (int i = 0, j = request.getCacheId().size(); i < j; i++) {
                req.addParameter("CacheId." + (i + 1), request.getCacheId().get(i));
            }
        }
        return req;
    }
}

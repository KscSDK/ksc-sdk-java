package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.AllocateSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class AllocateSecurityGroupMarshaller implements Marshaller<Request<AllocateSecurityGroupRequest>, AllocateSecurityGroupRequest> {
    @Override
    public Request<AllocateSecurityGroupRequest> marshall(AllocateSecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocateSecurityGroupRequest> req = new DefaultRequest<AllocateSecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "AllocateSecurityGroup");
        req.addParameter("Version", "2016-07-01");
        if (request.getCacheId() != null && request.getCacheId().size() > 0) {
            for (int i = 0, j = request.getCacheId().size(); i < j; i++) {
                req.addParameter("CacheId." + (i + 1), request.getCacheId().get(i));
            }
        }
        if (request.getSecurityGroupId() != null && request.getSecurityGroupId().size() > 0) {
            for (int i = 0, j = request.getSecurityGroupId().size(); i < j; i++) {
                req.addParameter("SecurityGroupId." + (i + 1), request.getSecurityGroupId().get(i));
            }
        }
        return req;
    }
}

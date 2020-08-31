package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DeleteSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class DeleteSecurityGroupMarshaller implements Marshaller<Request<DeleteSecurityGroupRequest>, DeleteSecurityGroupRequest> {
    @Override
    public Request<DeleteSecurityGroupRequest> marshall(DeleteSecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteSecurityGroupRequest> req = new DefaultRequest<DeleteSecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "DeleteSecurityGroup");
        req.addParameter("Version", "2016-07-01");
        if (request.getSecurityGroupId() != null && request.getSecurityGroupId().size() > 0) {
            for (int i = 0, j = request.getSecurityGroupId().size(); i < j; i++) {
                req.addParameter("SecurityGroupId." + (i + 1), request.getSecurityGroupId().get(i));
            }
        }
        return req;
    }
}

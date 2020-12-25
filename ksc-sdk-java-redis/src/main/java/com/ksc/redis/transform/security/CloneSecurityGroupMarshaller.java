package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.CloneSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class CloneSecurityGroupMarshaller implements Marshaller<Request<CloneSecurityGroupRequest>, CloneSecurityGroupRequest> {
    @Override
    public Request<CloneSecurityGroupRequest> marshall(CloneSecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CloneSecurityGroupRequest> req = new DefaultRequest<CloneSecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "CloneSecurityGroup");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("Name", request.getName());
        req.addParameter("Description", request.getDescription());
        req.addParameter("SrcSecurityGroupId", request.getSrcSecurityGroupId());
        return req;
    }
}

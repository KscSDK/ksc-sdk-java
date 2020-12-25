package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.CreateSecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class CreateSecurityGroupMarshaller implements Marshaller<Request<CreateSecurityGroupRequest>, CreateSecurityGroupRequest> {
    @Override
    public Request<CreateSecurityGroupRequest> marshall(CreateSecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSecurityGroupRequest> req = new DefaultRequest<CreateSecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "CreateSecurityGroup");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("Name", request.getName());
        req.addParameter("Description", request.getDescription());
        return req;
    }
}

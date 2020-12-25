package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.ModifySecurityGroupRequest;
import com.ksc.transform.Marshaller;

public class ModifySecurityGroupMarshaller implements Marshaller<Request<ModifySecurityGroupRequest>, ModifySecurityGroupRequest> {
    @Override
    public Request<ModifySecurityGroupRequest> marshall(ModifySecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySecurityGroupRequest> req = new DefaultRequest<ModifySecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "ModifySecurityGroup");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("Name", request.getName());
        req.addParameter("Description", request.getDescription());
        req.addParameter("SecurityGroupId", request.getSecurityGroupId());
        return req;
    }
}

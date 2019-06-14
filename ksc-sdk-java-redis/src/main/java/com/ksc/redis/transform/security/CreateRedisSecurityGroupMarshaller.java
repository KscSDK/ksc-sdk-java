package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.CreateRedisSecurityGroupRequest;
import com.ksc.transform.Marshaller;

import java.util.List;

public class CreateRedisSecurityGroupMarshaller implements Marshaller<Request<CreateRedisSecurityGroupRequest>, CreateRedisSecurityGroupRequest> {

    @Override
    public Request<CreateRedisSecurityGroupRequest> marshall(CreateRedisSecurityGroupRequest createRedisSecurityGroupRequest) {
        if (createRedisSecurityGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRedisSecurityGroupRequest> request = new DefaultRequest<CreateRedisSecurityGroupRequest>(createRedisSecurityGroupRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "CreateCacheSecurityGroup");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("Name", createRedisSecurityGroupRequest.getName());
        request.addParameter("Description", createRedisSecurityGroupRequest.getDescription());
        List<String> list = createRedisSecurityGroupRequest.getSecurityGroupRules();
        if (list != null && list.size() > 0) {
            for (int i = 0, j = list.size(); i < j; i++) {
                request.addParameter("SecurityGroupRules.Cidr." + (i + 1), list.get(i));
            }
        }

        return request;
    }
}

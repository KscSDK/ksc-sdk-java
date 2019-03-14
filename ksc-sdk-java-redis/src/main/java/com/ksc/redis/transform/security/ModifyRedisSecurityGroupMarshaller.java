package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.ModifyRedisSecurityGroupRequest;
import com.ksc.transform.Marshaller;

import java.util.List;

public class ModifyRedisSecurityGroupMarshaller implements Marshaller<Request<ModifyRedisSecurityGroupRequest>, ModifyRedisSecurityGroupRequest> {

    @Override
    public Request<ModifyRedisSecurityGroupRequest> marshall(ModifyRedisSecurityGroupRequest modifyRedisSecurityGroupRequest) {
        if (modifyRedisSecurityGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyRedisSecurityGroupRequest> request = new DefaultRequest<>(modifyRedisSecurityGroupRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "ModifyCacheSecurityGroup");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheSecurityGroupId", modifyRedisSecurityGroupRequest.getCacheSecurityGroupId());
        request.addParameter("Description", modifyRedisSecurityGroupRequest.getDescription());
        List<String> list = modifyRedisSecurityGroupRequest.getSecurityGroupRules();
        if (list != null && list.size() > 0) {
            for (int i = 0, j = list.size(); i < j; i++) {
                request.addParameter("SecurityGroupRules.Cidr." + (i + 1), list.get(i));
            }
        }

        return request;
    }
}

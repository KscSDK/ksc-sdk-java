package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.CreateSecurityGroupRuleRequest;
import com.ksc.transform.Marshaller;

public class CreateSecurityGroupRuleMarshaller implements Marshaller<Request<CreateSecurityGroupRuleRequest>, CreateSecurityGroupRuleRequest> {
    @Override
    public Request<CreateSecurityGroupRuleRequest> marshall(CreateSecurityGroupRuleRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSecurityGroupRuleRequest> req = new DefaultRequest<CreateSecurityGroupRuleRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "CreateSecurityGroupRule");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("SecurityGroupId", request.getSecurityGroupId());
        if (request.getCidrs() != null && request.getCidrs().size() > 0) {
            for (int i = 0, j = request.getCidrs().size(); i < j; i++) {
                req.addParameter("Cidrs." + (i + 1), request.getCidrs().get(i));
            }
        }
        return req;
    }
}

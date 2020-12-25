package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DeleteSecurityGroupRuleRequest;
import com.ksc.transform.Marshaller;

public class DeleteSecurityGroupRuleMarshaller implements Marshaller<Request<DeleteSecurityGroupRuleRequest>, DeleteSecurityGroupRuleRequest> {
    @Override
    public Request<DeleteSecurityGroupRuleRequest> marshall(DeleteSecurityGroupRuleRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteSecurityGroupRuleRequest> req = new DefaultRequest<DeleteSecurityGroupRuleRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.POST);
        req.addParameter("Action", "DeleteSecurityGroupRule");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("SecurityGroupId", request.getSecurityGroupId());
        if (request.getSecurityGroupRuleId() != null && request.getSecurityGroupRuleId().size() > 0) {
            for (int i = 0, j = request.getSecurityGroupRuleId().size(); i < j; i++) {
                req.addParameter("SecurityGroupRuleId." + (i + 1), request.getSecurityGroupRuleId().get(i));
            }
        }
        return req;
    }
}

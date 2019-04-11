package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.SetRedisSecurityRulesRequest;
import com.ksc.transform.Marshaller;

import java.util.List;

public class SetRedisSecurityRulesMarshaller implements Marshaller<Request<SetRedisSecurityRulesRequest>, SetRedisSecurityRulesRequest> {

    @Override
    public Request<SetRedisSecurityRulesRequest> marshall(SetRedisSecurityRulesRequest setRedisSecurityRulesRequest) {
        if (setRedisSecurityRulesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetRedisSecurityRulesRequest> request = new DefaultRequest<SetRedisSecurityRulesRequest>(setRedisSecurityRulesRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "SetCacheSecurityRules");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", setRedisSecurityRulesRequest.getCacheId());
        List<String> list = setRedisSecurityRulesRequest.getSecurityRules();
        if (list != null && list.size() > 0) {
            for (int i = 0, j = list.size(); i < j; i++) {
                request.addParameter("SecurityRules.Cidr." + (i + 1), list.get(i));
            }
        }

        return request;
    }
}

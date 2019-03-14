package com.ksc.memcached.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.security.SetMemcachedSecurityRulesRequest;
import com.ksc.transform.Marshaller;

import java.util.List;

public class SetMemcachedSecurityRulesMarshaller implements Marshaller<Request<SetMemcachedSecurityRulesRequest>, SetMemcachedSecurityRulesRequest> {

    @Override
    public Request<SetMemcachedSecurityRulesRequest> marshall(SetMemcachedSecurityRulesRequest setMemcachedSecurityRulesRequest) {
        if (setMemcachedSecurityRulesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetMemcachedSecurityRulesRequest> request = new DefaultRequest<>(setMemcachedSecurityRulesRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "SetCacheSecurityRules");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", setMemcachedSecurityRulesRequest.getCacheId());
        List<String> list = setMemcachedSecurityRulesRequest.getSecurityRules();
        if (list != null && list.size() > 0) {
            for (int i = 0, j = list.size(); i < j; i++) {
                request.addParameter("SecurityRules.Cidr." + (i + 1), list.get(i));
            }
        }

        return request;
    }
}

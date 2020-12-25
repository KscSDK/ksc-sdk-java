package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DescribeSecurityGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeSecurityGroupMarshaller implements Marshaller<Request<DescribeSecurityGroupRequest>, DescribeSecurityGroupRequest> {
    @Override
    public Request<DescribeSecurityGroupRequest> marshall(DescribeSecurityGroupRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSecurityGroupRequest> req = new DefaultRequest<DescribeSecurityGroupRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.GET);
        req.addParameter("Action", "DescribeSecurityGroup");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("SecurityGroupId", request.getSecurityGroupId());
        if (!StringUtils.isNullOrEmpty(request.getSearchKey())) {
            req.addParameter("SearchKey", request.getSearchKey());
        }

        if (request.getOffset() != null) {
            req.addParameter("Offset", request.getOffset().toString());
        }

        if (request.getLimit() != null) {
            req.addParameter("Limit", request.getLimit().toString());
        }
        return req;
    }
}

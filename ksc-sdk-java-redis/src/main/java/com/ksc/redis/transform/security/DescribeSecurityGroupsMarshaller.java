package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.DescribeSecurityGroupsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeSecurityGroupsMarshaller implements Marshaller<Request<DescribeSecurityGroupsRequest>, DescribeSecurityGroupsRequest> {
    @Override
    public Request<DescribeSecurityGroupsRequest> marshall(DescribeSecurityGroupsRequest request) {
        if (request == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSecurityGroupsRequest> req = new DefaultRequest<DescribeSecurityGroupsRequest>(request,
                KscRedisClient.DEFAULT_SIGNING_NAME);
        req.setHttpMethod(HttpMethodName.GET);
        req.addParameter("Action", "DescribeSecurityGroups");
        req.addParameter("Version", "2016-07-01");
        req.addParameter("CacheId", request.getCacheId());
        if (request.getFilterCache() != null) {
            req.addParameter("FilterCache", request.getFilterCache().toString());
        }

        if (request.getOffset() != null) {
            req.addParameter("Offset", request.getOffset().toString());
        }

        if (request.getLimit() != null) {
            req.addParameter("Limit", request.getLimit().toString());
        }

        if (!StringUtils.isNullOrEmpty(request.getSearchKey())) {
            req.addParameter("SearchKey", request.getSearchKey());
        }
        return req;
    }
}

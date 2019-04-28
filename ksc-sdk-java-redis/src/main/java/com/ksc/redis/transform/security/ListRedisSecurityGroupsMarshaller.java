package com.ksc.redis.transform.security;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.security.ListRedisSecurityGroupsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListRedisSecurityGroupsMarshaller implements Marshaller<Request<ListRedisSecurityGroupsRequest>, ListRedisSecurityGroupsRequest> {

    @Override
    public Request<ListRedisSecurityGroupsRequest> marshall(ListRedisSecurityGroupsRequest listRedisSecurityGroupsRequest) {
        if (listRedisSecurityGroupsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListRedisSecurityGroupsRequest> request = new DefaultRequest<ListRedisSecurityGroupsRequest>(listRedisSecurityGroupsRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheSecurityGroups");
        request.addParameter("Version", "2016-07-01");

        if (!StringUtils.isNullOrEmpty(listRedisSecurityGroupsRequest.getName())) {
            request.addParameter("Name", listRedisSecurityGroupsRequest.getName());
        }

        if (!StringUtils.isNullOrEmpty(listRedisSecurityGroupsRequest.getCacheSecurityGroupId())) {
            request.addParameter("CacheSecurityGroupId", listRedisSecurityGroupsRequest.getCacheSecurityGroupId());
        }

        request.addParameter("Offset", listRedisSecurityGroupsRequest.getOffset() ==
                null ? "0" : listRedisSecurityGroupsRequest.getOffset().toString());
        request.addParameter("Limit", listRedisSecurityGroupsRequest.getLimit() ==
                null ? "10" : listRedisSecurityGroupsRequest.getLimit().toString());

        return request;
    }
}

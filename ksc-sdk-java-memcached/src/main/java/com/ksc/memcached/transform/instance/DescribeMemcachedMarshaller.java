package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.DescribeMemcachedRequest;
import com.ksc.transform.Marshaller;

public class DescribeMemcachedMarshaller implements Marshaller<Request<DescribeMemcachedRequest>, DescribeMemcachedRequest> {

    @Override
    public Request<DescribeMemcachedRequest> marshall(DescribeMemcachedRequest describeMemcachedRequest) {
        if (describeMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeMemcachedRequest> request = new DefaultRequest<DescribeMemcachedRequest>(describeMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheCluster");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", describeMemcachedRequest.getCacheId());

        return request;
    }
}

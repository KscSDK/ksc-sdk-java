package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DescribeRedisRequest;
import com.ksc.transform.Marshaller;

public class DescribeRedisMarshaller implements Marshaller<Request<DescribeRedisRequest>, DescribeRedisRequest> {

    @Override
    public Request<DescribeRedisRequest> marshall(DescribeRedisRequest describeRedisRequest) {
        if (describeRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeRedisRequest> request = new DefaultRequest<>(describeRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", describeRedisRequest.getCacheId());

        return request;
    }
}

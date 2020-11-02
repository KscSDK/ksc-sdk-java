package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DescribeRegionsRequest;
import com.ksc.transform.Marshaller;

public class DescribeRegionsMarshaller implements Marshaller<Request<DescribeRegionsRequest>, DescribeRegionsRequest> {
    @Override
    public Request<DescribeRegionsRequest> marshall(DescribeRegionsRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeRegionsRequest> request = new DefaultRequest<DescribeRegionsRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeRegions");
        request.addParameter("Version", "2016-07-01");
        return request;
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DescribeAvailabilityZonesRequest;
import com.ksc.transform.Marshaller;

public class DescribeAvailabilityZonesMarshaller implements Marshaller<Request<DescribeAvailabilityZonesRequest>, DescribeAvailabilityZonesRequest> {
    @Override
    public Request<DescribeAvailabilityZonesRequest> marshall(DescribeAvailabilityZonesRequest in) {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeAvailabilityZonesRequest> request = new DefaultRequest<DescribeAvailabilityZonesRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeAvailabilityZones");
        request.addParameter("Version", "2016-07-01");
        return request;
    }
}

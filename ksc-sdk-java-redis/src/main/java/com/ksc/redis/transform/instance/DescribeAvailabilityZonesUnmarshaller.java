package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.DescribeAvailabilityZonesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeAvailabilityZonesUnmarshaller implements Unmarshaller<DescribeAvailabilityZonesResponse, JsonUnmarshallerContext> {
    @Override
    public DescribeAvailabilityZonesResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke1(in.getJsonParser(), DescribeAvailabilityZonesResponse.class);
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.DescribeRegionsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeRegionsUnmarshaller implements Unmarshaller<DescribeRegionsResponse, JsonUnmarshallerContext> {
    @Override
    public DescribeRegionsResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke1(in.getJsonParser(), DescribeRegionsResponse.class);
    }
}

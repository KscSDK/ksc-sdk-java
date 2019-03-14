package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.DescribeRedisResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeRedisUnmarshaller implements Unmarshaller<RedisResponse<DescribeRedisResponse>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<DescribeRedisResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), DescribeRedisResponse.class);
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.ListRedisResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListRedisUnmarshaller implements Unmarshaller<RedisResponse<ListRedisResponse>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<ListRedisResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), ListRedisResponse.class);
    }
}

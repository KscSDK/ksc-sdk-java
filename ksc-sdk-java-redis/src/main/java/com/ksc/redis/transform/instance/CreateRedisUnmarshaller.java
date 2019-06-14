package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.CreateRedisResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateRedisUnmarshaller implements Unmarshaller<RedisResponse<CreateRedisResponse>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<CreateRedisResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), CreateRedisResponse.class);
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DeleteRedisUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {

    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), null);
    }
}

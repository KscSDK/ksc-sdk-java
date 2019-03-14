package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.ListReadOnlyRedisResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListReadOnlyRedisUnmarshaller implements Unmarshaller<RedisResponse<ListReadOnlyRedisResponse[]>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<ListReadOnlyRedisResponse[]> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), ListReadOnlyRedisResponse[].class);
    }
}

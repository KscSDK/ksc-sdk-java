package com.ksc.redis.transform.parameter;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.parameter.ListRedisParametersResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListRedisParametersUnmarshaller implements Unmarshaller<RedisResponse<ListRedisParametersResponse[]>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<ListRedisParametersResponse[]> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), ListRedisParametersResponse[].class);
    }
}

package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.ListRedisSecurityRulesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListRedisSecurityRulesUnmarshaller implements Unmarshaller<RedisResponse<ListRedisSecurityRulesResponse[]>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<ListRedisSecurityRulesResponse[]> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), ListRedisSecurityRulesResponse[].class);
    }
}

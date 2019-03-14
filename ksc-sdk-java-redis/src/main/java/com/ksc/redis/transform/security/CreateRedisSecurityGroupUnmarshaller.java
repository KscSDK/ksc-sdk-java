package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.CreateRedisSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateRedisSecurityGroupUnmarshaller implements Unmarshaller<RedisResponse<CreateRedisSecurityGroupResponse>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<CreateRedisSecurityGroupResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), CreateRedisSecurityGroupResponse.class);
    }
}

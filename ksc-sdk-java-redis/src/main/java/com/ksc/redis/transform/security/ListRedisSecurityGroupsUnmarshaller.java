package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.ListRedisSecurityGroupsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListRedisSecurityGroupsUnmarshaller implements Unmarshaller<RedisResponse<ListRedisSecurityGroupsResponse>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<ListRedisSecurityGroupsResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), ListRedisSecurityGroupsResponse.class);
    }
}

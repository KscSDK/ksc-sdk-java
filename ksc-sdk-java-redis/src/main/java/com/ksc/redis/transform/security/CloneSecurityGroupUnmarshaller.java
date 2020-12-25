package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.CreateSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CloneSecurityGroupUnmarshaller implements Unmarshaller<RedisResponse<CreateSecurityGroupResponse>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<CreateSecurityGroupResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), CreateSecurityGroupResponse.class);
    }
}
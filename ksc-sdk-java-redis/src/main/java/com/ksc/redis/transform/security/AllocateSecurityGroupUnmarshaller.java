package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.AllocateSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AllocateSecurityGroupUnmarshaller implements Unmarshaller<RedisResponse<AllocateSecurityGroupResponse[]>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<AllocateSecurityGroupResponse[]> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), AllocateSecurityGroupResponse[].class);
    }
}

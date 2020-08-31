package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.DeleteSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DeleteSecurityGroupUnmarshaller implements Unmarshaller<RedisResponse<DeleteSecurityGroupResponse[]>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<DeleteSecurityGroupResponse[]> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), DeleteSecurityGroupResponse[].class);
    }
}

package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.DescribeSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeSecurityGroupUnmarshaller implements Unmarshaller<RedisResponse<DescribeSecurityGroupResponse>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<DescribeSecurityGroupResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), DescribeSecurityGroupResponse.class);
    }
}

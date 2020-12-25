package com.ksc.redis.transform.security;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.security.DescribeSecurityGroupsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeSecurityGroupsUnmarshaller implements Unmarshaller<RedisResponse<DescribeSecurityGroupsResponse>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<DescribeSecurityGroupsResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return RedisResponseConversion.invoke(context.getJsonParser(), DescribeSecurityGroupsResponse.class);
    }
}

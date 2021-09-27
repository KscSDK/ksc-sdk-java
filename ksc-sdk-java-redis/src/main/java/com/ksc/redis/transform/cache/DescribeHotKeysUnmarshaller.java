package com.ksc.redis.transform.cache;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.cache.DescribeHotKeysResponse;
import com.ksc.redis.model.parameter.ModifyCacheParameterGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: DescribeHotKeysUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeHotKeysUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {
    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), DescribeHotKeysResponse.class);
    }
}

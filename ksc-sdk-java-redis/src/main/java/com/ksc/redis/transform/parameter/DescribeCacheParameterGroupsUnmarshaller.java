package com.ksc.redis.transform.parameter;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: DescribeCacheParameterGroupsUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeCacheParameterGroupsUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {

    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), DescribeCacheParameterGroupsResponse.class);
    }
}

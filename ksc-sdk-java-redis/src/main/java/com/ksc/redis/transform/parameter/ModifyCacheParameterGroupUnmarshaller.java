package com.ksc.redis.transform.parameter;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsResponse;
import com.ksc.redis.model.parameter.ModifyCacheParameterGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: ModifyCacheParameterGroupUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class ModifyCacheParameterGroupUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {
    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), ModifyCacheParameterGroupResponse.class);
    }
}

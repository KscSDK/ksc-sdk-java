package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.AllocateEipResponse;
import com.ksc.redis.model.instance.DescribeRegionsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: AllocateEipUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class AllocateEipUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {

    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), AllocateEipResponse.class);
    }
}

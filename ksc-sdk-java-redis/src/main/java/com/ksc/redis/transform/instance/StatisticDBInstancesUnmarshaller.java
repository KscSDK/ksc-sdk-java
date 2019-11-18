package com.ksc.redis.transform.instance;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.StatisticDBInstancesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class StatisticDBInstancesUnmarshaller implements Unmarshaller<RedisResponse<StatisticDBInstancesResponse>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<StatisticDBInstancesResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), StatisticDBInstancesResponse.class);
    }
}

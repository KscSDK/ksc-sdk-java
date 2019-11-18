package com.ksc.redis.transform.backup;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class SetTimingSnapshotUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {
    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), null);
    }
}

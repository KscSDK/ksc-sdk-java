package com.ksc.redis.model.backup;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: DeleteLevelSnapshotsUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DeleteLevelSnapshotsUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {
    @Override
    public RedisResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), null);
    }
}

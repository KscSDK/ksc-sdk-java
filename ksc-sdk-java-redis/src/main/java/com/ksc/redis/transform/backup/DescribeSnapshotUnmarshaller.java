package com.ksc.redis.transform.backup;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.backup.DescribeSnapshotResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeSnapshotUnmarshaller implements Unmarshaller<RedisResponse<DescribeSnapshotResponse[]>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<DescribeSnapshotResponse[]> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), DescribeSnapshotResponse[].class);
    }
}

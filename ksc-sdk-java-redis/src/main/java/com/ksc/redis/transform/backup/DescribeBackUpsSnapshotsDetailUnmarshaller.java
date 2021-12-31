package com.ksc.redis.transform.backup;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.backup.DescribeBackUpsSnapshotsDetailResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/***
 * @ClassName: DescribeBackUpsSnapshotsDetailUnmarshaller
 * @version : V1.0
 */
public class DescribeBackUpsSnapshotsDetailUnmarshaller implements Unmarshaller<RedisResponse, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<DescribeBackUpsSnapshotsDetailResponse[]> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), DescribeBackUpsSnapshotsDetailResponse[].class);
    }
}

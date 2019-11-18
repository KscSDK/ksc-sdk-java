package com.ksc.redis.transform.backup;

import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.backup.DownloadSnapshotResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DownloadSnapshotUnmarshaller implements Unmarshaller<RedisResponse<DownloadSnapshotResponse>, JsonUnmarshallerContext> {
    @Override
    public RedisResponse<DownloadSnapshotResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RedisResponseConversion.invoke(in.getJsonParser(), DownloadSnapshotResponse.class);
    }
}

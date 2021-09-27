package com.ksc.redis.transform.cache;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.backup.ExportSnapshotRequest;
import com.ksc.redis.model.cache.AnalyzeHotKeysRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: AnalyzeHotKeysMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class AnalyzeHotKeysMarshaller implements Marshaller<Request<AnalyzeHotKeysRequest>, AnalyzeHotKeysRequest> {

    @Override
    public Request<AnalyzeHotKeysRequest> marshall(AnalyzeHotKeysRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<AnalyzeHotKeysRequest> request = new DefaultRequest<AnalyzeHotKeysRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "AnalyzeHotKeys");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",in.getCacheId());

        return request;
    }
}

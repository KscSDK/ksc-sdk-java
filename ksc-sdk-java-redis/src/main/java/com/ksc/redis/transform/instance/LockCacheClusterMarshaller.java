package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.CacheClusterRequest;
import com.ksc.redis.model.instance.DirectAccessToClusterRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: LockCacheClusterMarshaller
 * @Description:TODO 缓存服务锁定
 * @version : V1.0
 */
public class LockCacheClusterMarshaller implements Marshaller<Request<CacheClusterRequest>, CacheClusterRequest> {

    @Override
    public Request<CacheClusterRequest> marshall(CacheClusterRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<CacheClusterRequest> request = new DefaultRequest<CacheClusterRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "LockCacheCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",in.getCacheId());
        return request;
    }
}

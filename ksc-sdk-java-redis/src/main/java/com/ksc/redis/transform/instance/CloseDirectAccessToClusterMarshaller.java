package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DirectAccessToClusterRequest;
import com.ksc.transform.Marshaller;

/***
 * @ClassName: CloseDirectAccessToClusterMarshaller
 * @Description:TODO 缓存服务关闭直连
 * @version : V1.0
 */
public class CloseDirectAccessToClusterMarshaller implements Marshaller<Request<DirectAccessToClusterRequest>, DirectAccessToClusterRequest> {

    @Override
    public Request<DirectAccessToClusterRequest> marshall(DirectAccessToClusterRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DirectAccessToClusterRequest> request = new DefaultRequest<DirectAccessToClusterRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "CloseDirectAccessToCluster");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",in.getCacheId());
        return request;
    }
}

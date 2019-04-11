package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.FlushMemcachedRequest;
import com.ksc.transform.Marshaller;

public class FlushMemcachedMarshaller implements Marshaller<Request<FlushMemcachedRequest>, FlushMemcachedRequest> {

    @Override
    public Request<FlushMemcachedRequest> marshall(FlushMemcachedRequest flushMemcachedRequest) {
        if (flushMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<FlushMemcachedRequest> request = new DefaultRequest<FlushMemcachedRequest>(flushMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "FlushCacheCluster");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", flushMemcachedRequest.getCacheId());

        return request;
    }
}

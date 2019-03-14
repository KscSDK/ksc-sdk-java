package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.ResizeMemcachedRequest;
import com.ksc.transform.Marshaller;

public class ResizeMemcachedMarshaller implements Marshaller<Request<ResizeMemcachedRequest>, ResizeMemcachedRequest> {

    @Override
    public Request<ResizeMemcachedRequest> marshall(ResizeMemcachedRequest resizeMemcachedRequest) {
        if (resizeMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResizeMemcachedRequest> request = new DefaultRequest<>(resizeMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "ResizeCacheCluster");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", resizeMemcachedRequest.getCacheId());
        request.addParameter("Capacity",
                resizeMemcachedRequest.getCapacity() == null ? "" : resizeMemcachedRequest.getCapacity().toString());

        return request;
    }
}

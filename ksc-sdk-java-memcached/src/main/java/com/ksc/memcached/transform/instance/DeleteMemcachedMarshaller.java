package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.DeleteMemcachedRequest;
import com.ksc.transform.Marshaller;

public class DeleteMemcachedMarshaller implements Marshaller<Request<DeleteMemcachedRequest>, DeleteMemcachedRequest> {

    @Override
    public Request<DeleteMemcachedRequest> marshall(DeleteMemcachedRequest deleteMemcachedRequest) {
        if (deleteMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMemcachedRequest> request = new DefaultRequest<DeleteMemcachedRequest>(deleteMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.DELETE);
        request.addParameter("Action", "DeleteCacheCluster");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", deleteMemcachedRequest.getCacheId());

        return request;
    }
}

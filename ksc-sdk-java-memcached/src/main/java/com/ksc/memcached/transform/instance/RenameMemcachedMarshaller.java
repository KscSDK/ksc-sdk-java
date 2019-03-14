package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.RenameMemcachedRequest;
import com.ksc.transform.Marshaller;

public class RenameMemcachedMarshaller implements Marshaller<Request<RenameMemcachedRequest>, RenameMemcachedRequest> {

    @Override
    public Request<RenameMemcachedRequest> marshall(RenameMemcachedRequest renameMemcachedRequest) {
        if (renameMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RenameMemcachedRequest> request = new DefaultRequest<>(renameMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "RenameCacheCluster");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", renameMemcachedRequest.getCacheId());
        request.addParameter("Name", renameMemcachedRequest.getName());

        return request;
    }
}

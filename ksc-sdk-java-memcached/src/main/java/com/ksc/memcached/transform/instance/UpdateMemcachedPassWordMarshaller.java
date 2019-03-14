package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.UpdateMemcachedPassWordRequest;
import com.ksc.transform.Marshaller;

public class UpdateMemcachedPassWordMarshaller implements Marshaller<Request<UpdateMemcachedPassWordRequest>, UpdateMemcachedPassWordRequest> {

    @Override
    public Request<UpdateMemcachedPassWordRequest> marshall(UpdateMemcachedPassWordRequest updateMemcachedPassWordRequest) {
        if (updateMemcachedPassWordRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateMemcachedPassWordRequest> request = new DefaultRequest<>(updateMemcachedPassWordRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "UpdatePassword");
        request.addParameter("Version", "2018-06-27");
        request.addParameter("CacheId", updateMemcachedPassWordRequest.getCacheId());
        request.addParameter("Password", updateMemcachedPassWordRequest.getPassword());
        request.addParameter("Mode", updateMemcachedPassWordRequest.getMode() ==
                null ? "" : updateMemcachedPassWordRequest.getMode().toString());
        return request;
    }
}

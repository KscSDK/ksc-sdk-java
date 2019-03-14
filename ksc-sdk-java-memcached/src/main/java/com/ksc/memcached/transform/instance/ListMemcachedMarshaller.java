package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.ListMemcachedRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListMemcachedMarshaller implements Marshaller<Request<ListMemcachedRequest>, ListMemcachedRequest> {

    @Override
    public Request<ListMemcachedRequest> marshall(ListMemcachedRequest listMemcachedRequest) {
        if (listMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListMemcachedRequest> request = new DefaultRequest<>(listMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheClusters");
        request.addParameter("Version", "2018-06-27");

        if (!StringUtils.isNullOrEmpty(listMemcachedRequest.getName())) {
            request.addParameter("Name", listMemcachedRequest.getName());
        }
        if (!StringUtils.isNullOrEmpty(listMemcachedRequest.getCacheId())) {
            request.addParameter("CacheId", listMemcachedRequest.getCacheId());
        }
        if (!StringUtils.isNullOrEmpty(listMemcachedRequest.getVip())) {
            request.addParameter("Vip", listMemcachedRequest.getVip());
        }

        if (!StringUtils.isNullOrEmpty(listMemcachedRequest.getIamProjectId())) {
            request.addParameter("IamProjectId", listMemcachedRequest.getIamProjectId());
        }
        if (!StringUtils.isNullOrEmpty(listMemcachedRequest.getProtocol())) {
            request.addParameter("Protocol", listMemcachedRequest.getProtocol());
        }

        request.addParameter("Offset",
                listMemcachedRequest.getOffset() == null ? "0" : listMemcachedRequest.getOffset().toString());
        request.addParameter("Limit",
                listMemcachedRequest.getLimit() == null ? "10" : listMemcachedRequest.getLimit().toString());

        return request;
    }
}

package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.ListRedisRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListRedisMarshaller implements Marshaller<Request<ListRedisRequest>, ListRedisRequest> {

    @Override
    public Request<ListRedisRequest> marshall(ListRedisRequest listRedisRequest) {
        if (listRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListRedisRequest> request = new DefaultRequest<>(listRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheClusters");
        request.addParameter("Version", "2016-07-01");

        if (!StringUtils.isNullOrEmpty(listRedisRequest.getName())) {
            request.addParameter("Name", listRedisRequest.getName());
        }
        if (!StringUtils.isNullOrEmpty(listRedisRequest.getCacheId())) {
            request.addParameter("CacheId", listRedisRequest.getCacheId());
        }
        if (!StringUtils.isNullOrEmpty(listRedisRequest.getVip())) {
            request.addParameter("Vip", listRedisRequest.getVip());
        }

        if (!StringUtils.isNullOrEmpty(listRedisRequest.getIamProjectId())) {
            request.addParameter("IamProjectId", listRedisRequest.getIamProjectId());
        }
        if (!StringUtils.isNullOrEmpty(listRedisRequest.getProtocol())) {
            request.addParameter("Protocol", listRedisRequest.getProtocol());
        }

        request.addParameter("Offset",
                listRedisRequest.getOffset() == null ? "0" : listRedisRequest.getOffset().toString());
        request.addParameter("Limit",
                listRedisRequest.getLimit() == null ? "10" : listRedisRequest.getLimit().toString());

        return request;
    }
}

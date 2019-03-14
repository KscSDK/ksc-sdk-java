package com.ksc.memcached.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.memcached.client.KscMemcachedClient;
import com.ksc.memcached.model.instance.CreateMemcachedRequest;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CreateMemcachedMarshaller implements Marshaller<Request<CreateMemcachedRequest>, CreateMemcachedRequest> {

    @Override
    public Request<CreateMemcachedRequest> marshall(CreateMemcachedRequest createMemcachedRequest) {
        if (createMemcachedRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateMemcachedRequest> request = new DefaultRequest<>(createMemcachedRequest, KscMemcachedClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "CreateCacheCluster");
        request.addParameter("Version", "2018-06-27");

        for (Field field : createMemcachedRequest.getClass().getDeclaredFields()) {
            try {
                String name = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                Method getMethod = createMemcachedRequest.getClass().getMethod("get" + name);
                Object value = getMethod.invoke(createMemcachedRequest);
                if (value != null) {
                    request.addParameter(name, value.toString());
                }
            } catch (Exception e) {

            }
        }

        return request;
    }
}

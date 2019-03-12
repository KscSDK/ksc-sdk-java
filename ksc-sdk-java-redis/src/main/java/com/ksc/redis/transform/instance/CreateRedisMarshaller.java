package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.CreateRedisRequest;
import com.ksc.transform.Marshaller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CreateRedisMarshaller implements Marshaller<Request<CreateRedisRequest>, CreateRedisRequest> {

    @Override
    public Request<CreateRedisRequest> marshall(CreateRedisRequest createRedisRequest) {
        if (createRedisRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRedisRequest> request = new DefaultRequest<>(createRedisRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.POST);
        request.addParameter("Action", "CreateCacheCluster");
        request.addParameter("Version", "2016-07-01");

        for (Field field : createRedisRequest.getClass().getDeclaredFields()) {
            try {
                String name = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                Method getMethod = createRedisRequest.getClass().getMethod("get" + name);
                Object value = getMethod.invoke(createRedisRequest);
                if (value != null) {
                    request.addParameter(name, value.toString());
                }
            } catch (Exception e) {

            }
        }

        return request;
    }
}

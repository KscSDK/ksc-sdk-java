package com.ksc.memcached.transform.instance;

import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.memcached.model.instance.CreateMemcachedResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateMemcachedUnmarshaller implements Unmarshaller<MemcachedResponse<CreateMemcachedResponse>, JsonUnmarshallerContext> {

    @Override
    public MemcachedResponse<CreateMemcachedResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return MemcachedResponseConversion.invoke(context.getJsonParser(), CreateMemcachedResponse.class);
    }
}

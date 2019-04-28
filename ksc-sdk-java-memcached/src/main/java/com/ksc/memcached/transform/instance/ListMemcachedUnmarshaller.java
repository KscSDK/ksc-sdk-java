package com.ksc.memcached.transform.instance;

import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.memcached.model.instance.ListMemcachedResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListMemcachedUnmarshaller implements Unmarshaller<MemcachedResponse<ListMemcachedResponse>, JsonUnmarshallerContext> {

    @Override
    public MemcachedResponse<ListMemcachedResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return MemcachedResponseConversion.invoke(context.getJsonParser(), ListMemcachedResponse.class);
    }
}

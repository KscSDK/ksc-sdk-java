package com.ksc.memcached.transform.instance;

import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class RenameMemcachedUnmarshaller implements Unmarshaller<MemcachedResponse, JsonUnmarshallerContext> {

    @Override
    public MemcachedResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        return MemcachedResponseConversion.invoke(context.getJsonParser(), null);
    }
}

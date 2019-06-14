package com.ksc.memcached.transform.security;

import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class SetMemcachedSecurityRulesUnmarshaller implements Unmarshaller<MemcachedResponse, JsonUnmarshallerContext> {

    @Override
    public MemcachedResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        return MemcachedResponseConversion.invoke(context.getJsonParser(), null);
    }
}

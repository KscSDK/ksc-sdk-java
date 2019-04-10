package com.ksc.memcached.transform.security;

import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.memcached.model.security.ListMemcachedSecurityRulesResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListMemcachedSecurityRulesUnmarshaller implements Unmarshaller<MemcachedResponse<ListMemcachedSecurityRulesResponse[]>, JsonUnmarshallerContext> {

    @Override
    public MemcachedResponse<ListMemcachedSecurityRulesResponse[]> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return MemcachedResponseConversion.invoke(context.getJsonParser(), ListMemcachedSecurityRulesResponse[].class);
    }
}

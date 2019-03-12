package com.ksc.memcached.transform.instance;

import com.ksc.memcached.model.MemcachedResponse;
import com.ksc.memcached.model.MemcachedResponseConversion;
import com.ksc.memcached.model.instance.DescribeMemcachedResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeMemcachedUnmarshaller implements Unmarshaller<MemcachedResponse<DescribeMemcachedResponse>, JsonUnmarshallerContext> {

    @Override
    public MemcachedResponse<DescribeMemcachedResponse> unmarshall(JsonUnmarshallerContext context) throws Exception {
        return MemcachedResponseConversion.invoke(context.getJsonParser(), DescribeMemcachedResponse.class);
    }
}

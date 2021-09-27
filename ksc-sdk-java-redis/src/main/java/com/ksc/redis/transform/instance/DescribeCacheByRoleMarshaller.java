package com.ksc.redis.transform.instance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.instance.DescribeRedisResponse;
import com.ksc.redis.model.instance.ListRedisRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/***
 * @ClassName: DescribeCacheByRoleMarshaller
 * @Description:TODO 缓存服务详情(指定节点类型)
 * @version : V1.0
 */
public class DescribeCacheByRoleMarshaller implements Marshaller<Request<ListRedisRequest>, ListRedisRequest> {


    @Override
    public Request<ListRedisRequest> marshall(ListRedisRequest in)  {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListRedisRequest> request = new DefaultRequest<ListRedisRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeCacheByRole");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",in.getCacheId());
        if (!StringUtils.isNullOrEmpty(in.getProxy())) {
            request.addParameter("Proxy", in.getProxy());
        }
        return request;
    }
}

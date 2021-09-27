package com.ksc.redis.transform.cache;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.cache.DescribeHotKeysRequest;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/***
 * @ClassName: DescribeHotKeysMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeHotKeysMarshaller implements Marshaller<Request<DescribeHotKeysRequest>, DescribeHotKeysRequest> {

    @Override
    public Request<DescribeHotKeysRequest> marshall(DescribeHotKeysRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<DescribeHotKeysRequest> request = new DefaultRequest<DescribeHotKeysRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.GET);
        request.addParameter("Action", "DescribeHotKeys");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId",in.getCacheId());
        request.addParameter("Limit",in.getLimit().toString());
        request.addParameter("Offset",in.getOffset().toString());
        if (!StringUtils.isNullOrEmpty(in.getSortKey())) {
            request.addParameter("SortKey", in.getSortKey());
        }
        if (!StringUtils.isNullOrEmpty(in.getSortDir())) {
            request.addParameter("SortDir", in.getSortKey());
        }
        return request;
    }
}

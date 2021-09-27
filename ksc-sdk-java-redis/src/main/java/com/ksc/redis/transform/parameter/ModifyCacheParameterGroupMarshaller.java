package com.ksc.redis.transform.parameter;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.parameter.DescribeCacheParameterGroupsRequest;
import com.ksc.redis.model.parameter.ModifyCacheParameterGroupRequest;
import com.ksc.transform.Marshaller;

import java.util.List;

/***
 * @ClassName: ModifyCacheParameterGroupMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class ModifyCacheParameterGroupMarshaller implements Marshaller<Request<ModifyCacheParameterGroupRequest>, ModifyCacheParameterGroupRequest> {

    @Override
    public Request<ModifyCacheParameterGroupRequest> marshall(ModifyCacheParameterGroupRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ModifyCacheParameterGroupRequest> request = new DefaultRequest<ModifyCacheParameterGroupRequest>(in, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "ModifyCacheParameterGroup");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("paramVersion",in.getParamVersion());
        request.addParameter("cacheParameterGroupId",in.getCacheParameterGroupId());
        List<String> names = in.getParameterName();
        List<String> values = in.getParameterValue();
        if (names != null && names.size() > 0 && values != null && values.size() > 0) {
            for (int i = 0, j = names.size(); i < j; i++) {
                request.addParameter("Parameters.ParameterName." + (i + 1), names.get(i));
                request.addParameter("Parameters.ParameterValue." + (i + 1), values.size() > i ? values.get(i) : "");
            }
        }
        return request;
    }
}

package com.ksc.redis.transform.parameter;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.redis.client.KscRedisClient;
import com.ksc.redis.model.parameter.SetRedisParametersRequest;
import com.ksc.transform.Marshaller;

import java.util.List;

public class SetRedisParametersMarshaller implements Marshaller<Request<SetRedisParametersRequest>, SetRedisParametersRequest> {

    @Override
    public Request<SetRedisParametersRequest> marshall(SetRedisParametersRequest setRedisParametersRequest) {
        if (setRedisParametersRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetRedisParametersRequest> request = new DefaultRequest<SetRedisParametersRequest>(setRedisParametersRequest, KscRedisClient.DEFAULT_SIGNING_NAME);
        request.setHttpMethod(HttpMethodName.PUT);
        request.addParameter("Action", "SetCacheParameters");
        request.addParameter("Version", "2016-07-01");
        request.addParameter("CacheId", setRedisParametersRequest.getCacheId());
        request.addParameter("ResetAllParameters", setRedisParametersRequest.getResetAllParameters() ==
                null ? "false" : setRedisParametersRequest.getResetAllParameters().toString());
        List<String> names = setRedisParametersRequest.getParameterName();
        List<String> values = setRedisParametersRequest.getParameterValue();
        if (names != null && names.size() > 0 && values != null && values.size() > 0) {
            for (int i = 0, j = names.size(); i < j; i++) {
                request.addParameter("Parameters.ParameterName." + (i + 1), names.get(i));
                request.addParameter("Parameters.ParameterValue." + (i + 1), values.size() > i ? values.get(i) : "");
            }
        }

        return request;
    }
}

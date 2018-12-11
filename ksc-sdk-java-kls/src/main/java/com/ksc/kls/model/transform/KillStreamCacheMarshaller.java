package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.KillStreamCacheRequest;
import com.ksc.kls.model.KillStreamCacheResult;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

/**
 * Created by yangfan on 2017/5/19.
 */
public class KillStreamCacheMarshaller implements Marshaller<Request<KillStreamCacheRequest>, KillStreamCacheRequest> {

    private static KillStreamCacheMarshaller instance;

    public static KillStreamCacheMarshaller getInstance() {
        if (instance == null)
            instance = new KillStreamCacheMarshaller();
        return instance;
    }

    @Override
    public Request<KillStreamCacheRequest> marshall(KillStreamCacheRequest killStreamCacheRequest) {
        if (killStreamCacheRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<KillStreamCacheRequest> request = new DefaultRequest<KillStreamCacheRequest>(killStreamCacheRequest, "kls");

        request.addParameter("Action", "KillStreamCache");
        String version=killStreamCacheRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        byte[] content = killStreamCacheRequest.getData().getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

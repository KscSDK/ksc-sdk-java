package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ForbidStreamRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ForbidStreamMarshaller  implements Marshaller<Request<ForbidStreamRequest>, ForbidStreamRequest> {
    private static ForbidStreamMarshaller instance;

    public static ForbidStreamMarshaller getInstance() {
        if (instance == null)
            instance = new ForbidStreamMarshaller();
        return instance;
    }


    @Override
    public Request<ForbidStreamRequest> marshall(ForbidStreamRequest forbidStreamRequest) {
        if (forbidStreamRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ForbidStreamRequest> request = new DefaultRequest<ForbidStreamRequest>(forbidStreamRequest, "kls");

        request.addParameter("Action", "ForbidStream");
        String version=forbidStreamRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        byte[] content = forbidStreamRequest.getData().getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));


        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

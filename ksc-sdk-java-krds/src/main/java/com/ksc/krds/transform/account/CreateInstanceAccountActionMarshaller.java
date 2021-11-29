package com.ksc.krds.transform.account;

import com.google.gson.Gson;
import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.account.CreateInstanceAccountActionRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

public class CreateInstanceAccountActionMarshaller implements Marshaller<Request<CreateInstanceAccountActionRequest>, CreateInstanceAccountActionRequest> {

    @Override
    public Request<CreateInstanceAccountActionRequest> marshall(CreateInstanceAccountActionRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<CreateInstanceAccountActionRequest> request = new DefaultRequest<CreateInstanceAccountActionRequest>(in, "krds");
        request.addParameter("Action", "CreateInstanceAccountAction");
        String version = in.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.addHeader("Accept", "application/json");

        byte[] content = new Gson().toJson(in).getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

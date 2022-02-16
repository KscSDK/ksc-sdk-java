package com.ksc.krds.transform.krdsInstance;

import com.google.gson.Gson;
import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.RestoreToCurInstanceRequest;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;


public class RestoreToCurInstanceMarshaller implements Marshaller<Request<RestoreToCurInstanceRequest>, RestoreToCurInstanceRequest> {

    public  Request<RestoreToCurInstanceRequest> marshall(RestoreToCurInstanceRequest baseRequest){
        if (baseRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<RestoreToCurInstanceRequest> request = new DefaultRequest<RestoreToCurInstanceRequest>(baseRequest, "krds");
        request.addParameter("Action", ActionEnum.RESTORE_TO_CUR_INSTANCE.val());
        String version = baseRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.addHeader("Accept", "application/json");

        byte[] content = new Gson().toJson(baseRequest).getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

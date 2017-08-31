package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CreateRecordRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CreateRecordRequestMarshaller implements Marshaller<Request<CreateRecordRequest>, CreateRecordRequest> {

    private static CreateRecordRequestMarshaller instance;

    public static CreateRecordRequestMarshaller getInstance() {
        if (instance == null)
            instance = new CreateRecordRequestMarshaller();
        return instance;
    }

    public Request<CreateRecordRequest> marshall(CreateRecordRequest createRecordRequest){
        if (createRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateRecordRequest> request = new DefaultRequest<CreateRecordRequest>(createRecordRequest, "kls");

        request.addParameter("Action", "CreateRecordTask");
        String version=createRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        byte[] content = createRecordRequest.getData().getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);

        return request;
    }
}

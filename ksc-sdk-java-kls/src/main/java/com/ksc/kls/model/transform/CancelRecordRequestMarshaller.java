package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CancelRecordRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

/**
 * Created by yangfan on 2017/4/26.
 */
public class CancelRecordRequestMarshaller implements Marshaller<Request<CancelRecordRequest>, CancelRecordRequest> {
    private static CancelRecordRequestMarshaller instance;

    public static CancelRecordRequestMarshaller getInstance() {
        if (instance == null)
            instance = new CancelRecordRequestMarshaller();
        return instance;
    }
    @Override
    public Request<CancelRecordRequest> marshall(CancelRecordRequest cancelRecordRequest) {
        if (cancelRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<CancelRecordRequest> request = new DefaultRequest<CancelRecordRequest>(cancelRecordRequest, "kls");

        request.addParameter("Action", "CancelRecordTask");
        String version=cancelRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        byte[] content = cancelRecordRequest.getData().getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

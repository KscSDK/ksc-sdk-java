package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.StartStreamRecordRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

/**
 * Created by yangfan on 2017/4/27.
 */
public class StartStreamRecordMarshaller implements Marshaller<Request<StartStreamRecordRequest>, StartStreamRecordRequest> {

    private static StartStreamRecordMarshaller instance;

    public static StartStreamRecordMarshaller getInstance() {
        if (instance == null)
            instance = new StartStreamRecordMarshaller();
        return instance;
    }

    @Override
    public Request<StartStreamRecordRequest> marshall(StartStreamRecordRequest startStreamRecordRequest) {
        if (startStreamRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<StartStreamRecordRequest> request = new DefaultRequest<StartStreamRecordRequest>(
                startStreamRecordRequest, "live");

        request.addParameter("Action", "StartStreamRecord");
        String version=startStreamRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        byte[] content = startStreamRecordRequest.getData().getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));
        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

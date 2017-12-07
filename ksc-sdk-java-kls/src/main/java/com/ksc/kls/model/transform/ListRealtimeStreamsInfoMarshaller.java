package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListRealtimeStreamsInfoRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;

public class ListRealtimeStreamsInfoMarshaller implements Marshaller<Request<ListRealtimeStreamsInfoRequest>, ListRealtimeStreamsInfoRequest> {
    private static ListRealtimeStreamsInfoMarshaller instance;

    public static ListRealtimeStreamsInfoMarshaller getInstance() {
        if (instance == null)
            instance = new ListRealtimeStreamsInfoMarshaller();
        return instance;
    }

    @Override
    public Request<ListRealtimeStreamsInfoRequest> marshall(ListRealtimeStreamsInfoRequest listRealtimeStreamsInfoRequest) {
        if (listRealtimeStreamsInfoRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<ListRealtimeStreamsInfoRequest> request = new DefaultRequest<ListRealtimeStreamsInfoRequest>(listRealtimeStreamsInfoRequest, "kls");

        request.addParameter("Action", "ListRealtimeStreamsInfo");
        String version=listRealtimeStreamsInfoRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        byte[] content = listRealtimeStreamsInfoRequest.getData().getBytes();
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Content-Length", Integer.toString(content.length));

        request.setContent(new ByteArrayInputStream(content));

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

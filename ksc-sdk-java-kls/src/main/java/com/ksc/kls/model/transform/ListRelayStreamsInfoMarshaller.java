package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListRelayStreamsInfoRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ListRelayStreamsInfoMarshaller  implements Marshaller<Request<ListRelayStreamsInfoRequest>, ListRelayStreamsInfoRequest> {
    private static ListRelayStreamsInfoMarshaller instance;

    public static ListRelayStreamsInfoMarshaller getInstance() {
        if (instance == null)
            instance = new ListRelayStreamsInfoMarshaller();
        return instance;
    }

    @Override
    public Request<ListRelayStreamsInfoRequest> marshall(ListRelayStreamsInfoRequest listRelayStreamsInfoRequest) {
        if (listRelayStreamsInfoRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ListRelayStreamsInfoRequest> request = new DefaultRequest<ListRelayStreamsInfoRequest>(listRelayStreamsInfoRequest, "kls");

        request.addParameter("Action", "listRelayStreamsInfo");
        String version=listRelayStreamsInfoRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        request.addParameter("uniquename",listRelayStreamsInfoRequest.getUniquename());
        request.addParameter("app",listRelayStreamsInfoRequest.getApp());
        if (listRelayStreamsInfoRequest.getLimit() != 0) {
            request.addParameter("limit", StringUtils.fromInteger(listRelayStreamsInfoRequest.getLimit()));
        }
        if (listRelayStreamsInfoRequest.getMarker() != 0) {
            request.addParameter("marker", StringUtils.fromInteger(listRelayStreamsInfoRequest.getMarker()));
        }

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

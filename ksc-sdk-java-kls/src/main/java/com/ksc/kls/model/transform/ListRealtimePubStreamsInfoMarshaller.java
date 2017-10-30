package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListRealtimePubStreamsInfoRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/5/22.
 */
public class ListRealtimePubStreamsInfoMarshaller implements Marshaller<Request<ListRealtimePubStreamsInfoRequest>, ListRealtimePubStreamsInfoRequest> {

    private static ListRealtimePubStreamsInfoMarshaller instance;

    public static ListRealtimePubStreamsInfoMarshaller getInstance() {
        if (instance == null)
            instance = new ListRealtimePubStreamsInfoMarshaller();
        return instance;
    }


    @Override
    public Request<ListRealtimePubStreamsInfoRequest> marshall(ListRealtimePubStreamsInfoRequest listRealtimePubStreamsInfoRequest) {
        if (listRealtimePubStreamsInfoRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<ListRealtimePubStreamsInfoRequest> request = new DefaultRequest<ListRealtimePubStreamsInfoRequest>(listRealtimePubStreamsInfoRequest, "kls");

        request.addParameter("Action", "ListRealtimePubStreamsInfo");
        String version=listRealtimePubStreamsInfoRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("UniqueName", listRealtimePubStreamsInfoRequest.getUniqueName());
        request.addParameter("App", listRealtimePubStreamsInfoRequest.getApp());
        request.addParameter("Pubdomain", listRealtimePubStreamsInfoRequest.getPubdomain());

        if (listRealtimePubStreamsInfoRequest.getStream() != null) {
            request.addParameter("Stream",listRealtimePubStreamsInfoRequest.getStream());
        }
        if (listRealtimePubStreamsInfoRequest.getOrderTime() != 0) {
            request.addParameter("OrderTime", StringUtils.fromInteger(listRealtimePubStreamsInfoRequest.getOrderTime()));
        }
        if (listRealtimePubStreamsInfoRequest.getMarker() != 0) {
            request.addParameter("Marker", StringUtils.fromInteger(listRealtimePubStreamsInfoRequest.getMarker()));
        }
        if (listRealtimePubStreamsInfoRequest.getLimit() != 0) {
            request.addParameter("Limit", StringUtils.fromInteger(listRealtimePubStreamsInfoRequest.getLimit()));
        }

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}

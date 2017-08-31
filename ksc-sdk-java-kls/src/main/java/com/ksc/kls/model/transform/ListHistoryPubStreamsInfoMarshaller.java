package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListHistoryPubStreamsErrInfoRequest;
import com.ksc.kls.model.ListHistoryPubStreamsInfoRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListHistoryPubStreamsInfoMarshaller implements Marshaller<Request<ListHistoryPubStreamsInfoRequest>, ListHistoryPubStreamsInfoRequest> {

    private static ListHistoryPubStreamsInfoMarshaller instance;

    public static ListHistoryPubStreamsInfoMarshaller getInstance() {
        if (instance == null)
            instance = new ListHistoryPubStreamsInfoMarshaller();
        return instance;
    }

    @Override
    public Request<ListHistoryPubStreamsInfoRequest> marshall(ListHistoryPubStreamsInfoRequest listHistoryPubStreamsInfoRequest) {
        if (listHistoryPubStreamsInfoRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<ListHistoryPubStreamsInfoRequest> request = new DefaultRequest<ListHistoryPubStreamsInfoRequest>(listHistoryPubStreamsInfoRequest, "kls");

        request.addParameter("Action", "ListHistoryPubStreamsInfo");
        String version=listHistoryPubStreamsInfoRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("UniqueName", listHistoryPubStreamsInfoRequest.getUniqueName());
        request.addParameter("App", listHistoryPubStreamsInfoRequest.getApp());
        request.addParameter("Pubdomain", listHistoryPubStreamsInfoRequest.getPubdomain());


        if (listHistoryPubStreamsInfoRequest.getStream() != null) {
            request.addParameter("Stream",listHistoryPubStreamsInfoRequest.getStream());
        }
        if (listHistoryPubStreamsInfoRequest.getOrderTime() != 0) {
            request.addParameter("OrderTime", StringUtils.fromInteger(listHistoryPubStreamsInfoRequest.getOrderTime()));
        }
        if (listHistoryPubStreamsInfoRequest.getMarker() != 0) {
            request.addParameter("Marker", StringUtils.fromInteger(listHistoryPubStreamsInfoRequest.getMarker()));
        }
        if (listHistoryPubStreamsInfoRequest.getLimit() != 0) {
            request.addParameter("Limit", StringUtils.fromInteger(listHistoryPubStreamsInfoRequest.getLimit()));
        }
        if (listHistoryPubStreamsInfoRequest.getStartUnixTime() != 0) {
            request.addParameter("StartUnixTime", StringUtils.fromInteger(listHistoryPubStreamsInfoRequest.getStartUnixTime()));
        }
        if (listHistoryPubStreamsInfoRequest.getEndUnixTime() != 0) {
            request.addParameter("EndUnixTime", StringUtils.fromInteger(listHistoryPubStreamsInfoRequest.getEndUnixTime()));
        }

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}

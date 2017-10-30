package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CancelRecordRequest;
import com.ksc.kls.model.ListHistoryPubStreamsErrInfoRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/5/22.
 */
public class ListHistoryPubStreamsErrInfoMarshaller implements Marshaller<Request<ListHistoryPubStreamsErrInfoRequest>, ListHistoryPubStreamsErrInfoRequest> {

    private static ListHistoryPubStreamsErrInfoMarshaller instance;

    public static ListHistoryPubStreamsErrInfoMarshaller getInstance() {
        if (instance == null)
            instance = new ListHistoryPubStreamsErrInfoMarshaller();
        return instance;
    }

    @Override
    public Request<ListHistoryPubStreamsErrInfoRequest> marshall(ListHistoryPubStreamsErrInfoRequest listHistoryPubStreamsErrInfoRequest) {
        if (listHistoryPubStreamsErrInfoRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<ListHistoryPubStreamsErrInfoRequest> request = new DefaultRequest<ListHistoryPubStreamsErrInfoRequest>(listHistoryPubStreamsErrInfoRequest, "kls");

        request.addParameter("Action", "ListHistoryPubStreamsErrInfo");
        String version=listHistoryPubStreamsErrInfoRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("UniqueName", listHistoryPubStreamsErrInfoRequest.getUniqueName());
        request.addParameter("App", listHistoryPubStreamsErrInfoRequest.getApp());
        request.addParameter("Pubdomain", listHistoryPubStreamsErrInfoRequest.getPubdomain());

        if (listHistoryPubStreamsErrInfoRequest.getStream() != null) {
            request.addParameter("Stream",listHistoryPubStreamsErrInfoRequest.getStream());
        }
        if (listHistoryPubStreamsErrInfoRequest.getOrderTime() != 0) {
            request.addParameter("OrderTime", StringUtils.fromInteger(listHistoryPubStreamsErrInfoRequest.getOrderTime()));
        }
        if (listHistoryPubStreamsErrInfoRequest.getMarker() != 0) {
            request.addParameter("Marker", StringUtils.fromInteger(listHistoryPubStreamsErrInfoRequest.getMarker()));
        }
        if (listHistoryPubStreamsErrInfoRequest.getLimit() != 0) {
            request.addParameter("Limit", StringUtils.fromInteger(listHistoryPubStreamsErrInfoRequest.getLimit()));
        }
        if (listHistoryPubStreamsErrInfoRequest.getStartUnixTime() != 0) {
            request.addParameter("StartUnixTime", StringUtils.fromInteger(listHistoryPubStreamsErrInfoRequest.getStartUnixTime()));
        }
        if (listHistoryPubStreamsErrInfoRequest.getEndUnixTime() != 0) {
            request.addParameter("EndUnixTime", StringUtils.fromInteger(listHistoryPubStreamsErrInfoRequest.getEndUnixTime()));
        }

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}

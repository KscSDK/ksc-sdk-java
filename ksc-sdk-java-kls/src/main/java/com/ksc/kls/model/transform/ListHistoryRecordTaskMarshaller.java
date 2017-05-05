package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListHistoryRecordTasksRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/4/27.
 */
public class ListHistoryRecordTaskMarshaller implements Marshaller<Request<ListHistoryRecordTasksRequest>, ListHistoryRecordTasksRequest> {

    private static ListHistoryRecordTaskMarshaller instance;

    public static ListHistoryRecordTaskMarshaller getInstance() {
        if (instance == null)
            instance = new ListHistoryRecordTaskMarshaller();
        return instance;
    }

    @Override
    public Request<ListHistoryRecordTasksRequest> marshall(ListHistoryRecordTasksRequest listHistoryRecordTasksRequest) throws Exception {
        if (listHistoryRecordTasksRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListHistoryRecordTasksRequest> request = new DefaultRequest<ListHistoryRecordTasksRequest>(listHistoryRecordTasksRequest, "kls");

        request.addParameter("Action", "ListHistoryRecord");
        String version=listHistoryRecordTasksRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("UniqueName", listHistoryRecordTasksRequest.getUniqueName());
        request.addParameter("App", listHistoryRecordTasksRequest.getApp());
        request.addParameter("Pubdomain", listHistoryRecordTasksRequest.getPubdomain());
        request.addParameter("RecType", StringUtils.fromInteger(listHistoryRecordTasksRequest.getRecType()));
        request.addParameter("Limit",   StringUtils.fromInteger(listHistoryRecordTasksRequest.getLimit()));
        request.addParameter("Marker", StringUtils.fromInteger(listHistoryRecordTasksRequest.getMarker()));
        request.addParameter("OrderTime", StringUtils.fromInteger(listHistoryRecordTasksRequest.getOrderTime()));
        request.addParameter("StartUnixTime", StringUtils.fromInteger(listHistoryRecordTasksRequest.getStartUnixTime()));
        request.addParameter("EndUnixTime", StringUtils.fromInteger(listHistoryRecordTasksRequest.getEndUnixTime()));

        if(listHistoryRecordTasksRequest.getStream() != null ){
            request.addParameter("Stream", listHistoryRecordTasksRequest.getStream());
        }
        request.setHttpMethod(HttpMethodName.GET);

        return request;
    }
}

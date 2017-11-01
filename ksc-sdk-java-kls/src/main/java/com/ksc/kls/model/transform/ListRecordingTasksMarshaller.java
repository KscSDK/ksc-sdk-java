package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListRecordingTasksRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/5/2.
 */
public class ListRecordingTasksMarshaller implements Marshaller<Request<ListRecordingTasksRequest>, ListRecordingTasksRequest> {
    private static ListRecordingTasksMarshaller instance;

    public static ListRecordingTasksMarshaller getInstance() {
        if (instance == null)
            instance = new ListRecordingTasksMarshaller();
        return instance;
    }

    @Override
    public Request<ListRecordingTasksRequest> marshall(ListRecordingTasksRequest listRecordingTasksRequest) {
        if (listRecordingTasksRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<ListRecordingTasksRequest> request = new DefaultRequest<ListRecordingTasksRequest>(listRecordingTasksRequest, "kls");

        request.addParameter("Action", "ListRecordingTasks");
        String version=listRecordingTasksRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        request.addParameter("UniqueName",listRecordingTasksRequest.getUniqueName());
        request.addParameter("App",listRecordingTasksRequest.getApp());
        request.addParameter("Pubdomain",listRecordingTasksRequest.getPubdomain());

        request.addParameter("RecType", StringUtils.fromInteger(listRecordingTasksRequest.getRecType()));
        request.addParameter("Limit", StringUtils.fromInteger(listRecordingTasksRequest.getLimit()));
        request.addParameter("Marker", StringUtils.fromInteger(listRecordingTasksRequest.getMarker()));
        request.addParameter("OrderTime", StringUtils.fromInteger(listRecordingTasksRequest.getOrderTime()));
        request.addParameter("RecStatusType", StringUtils.fromInteger(listRecordingTasksRequest.getRecStatusType()));

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}

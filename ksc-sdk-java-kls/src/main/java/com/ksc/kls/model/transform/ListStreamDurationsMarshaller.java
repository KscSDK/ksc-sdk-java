package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListStreamDurationsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/5/4.
 */
public class ListStreamDurationsMarshaller implements Marshaller<Request<ListStreamDurationsRequest>, ListStreamDurationsRequest> {
    private static ListStreamDurationsMarshaller instance;

    public static ListStreamDurationsMarshaller getInstance() {
        if (instance == null)
            instance = new ListStreamDurationsMarshaller();
        return instance;
    }

    @Override
    public Request<ListStreamDurationsRequest> marshall(ListStreamDurationsRequest listStreamDurationsRequest) {
        if (listStreamDurationsRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<ListStreamDurationsRequest> request = new DefaultRequest<ListStreamDurationsRequest>(listStreamDurationsRequest, "kls");

        request.addParameter("Action", "ListStreamDurations");
        String version=listStreamDurationsRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("UniqueName", listStreamDurationsRequest.getUniqueName());
        request.addParameter("App", listStreamDurationsRequest.getApp());
        request.addParameter("Pubdomain", listStreamDurationsRequest.getPubdomain());
        request.addParameter("StartUnixTime", StringUtils.fromInteger(listStreamDurationsRequest.getStartUnixTime()));
        request.addParameter("EndUnixTime", StringUtils.fromInteger(listStreamDurationsRequest.getEndUnixTime()));

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}

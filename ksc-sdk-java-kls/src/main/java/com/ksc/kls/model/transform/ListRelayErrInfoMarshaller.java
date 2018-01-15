package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ListRelayErrInfoRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ListRelayErrInfoMarshaller implements Marshaller<Request<ListRelayErrInfoRequest>, ListRelayErrInfoRequest> {
    private static ListRelayErrInfoMarshaller instance;

    public static ListRelayErrInfoMarshaller getInstance() {
        if (instance == null)
            instance = new ListRelayErrInfoMarshaller();
        return instance;
    }

    @Override
    public Request<ListRelayErrInfoRequest> marshall(ListRelayErrInfoRequest listRelayErrInfoRequest) {
        if (listRelayErrInfoRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ListRelayErrInfoRequest> request = new DefaultRequest<ListRelayErrInfoRequest>(listRelayErrInfoRequest, "kls");

        request.addParameter("Action", "listRelayErrInfo");
        String version=listRelayErrInfoRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2016-09-25";
        }
        request.addParameter("Version", version);

        request.addParameter("uniquename",listRelayErrInfoRequest.getUniquename());
        request.addParameter("app",listRelayErrInfoRequest.getApp());
        if (listRelayErrInfoRequest.getLimit() != 0) {
            request.addParameter("limit", StringUtils.fromInteger(listRelayErrInfoRequest.getLimit()));
        }
        if (listRelayErrInfoRequest.getMarker() != 0) {
            request.addParameter("marker", StringUtils.fromInteger(listRelayErrInfoRequest.getMarker()));
        }
        if (listRelayErrInfoRequest.getStarttime() != 0) {
            request.addParameter("starttime", StringUtils.fromInteger(listRelayErrInfoRequest.getStarttime()));
        }
        if (listRelayErrInfoRequest.getDuration() != 0) {
            request.addParameter("duration", StringUtils.fromInteger(listRelayErrInfoRequest.getDuration()));
        }
        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}

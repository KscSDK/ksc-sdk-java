package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CheckBlacklistRequest;
import com.ksc.transform.Marshaller;

/**
 * Created by yangfan on 2017/7/26.
 */
public class CheckBlacklistMarshaller implements Marshaller<Request<CheckBlacklistRequest>, CheckBlacklistRequest> {
    private static CheckBlacklistMarshaller instance;

    public static CheckBlacklistMarshaller getInstance() {
        if (instance == null)
            instance = new CheckBlacklistMarshaller();
        return instance;
    }

    @Override
    public Request<CheckBlacklistRequest> marshall(CheckBlacklistRequest checkBlacklistRequest)  {
        if (checkBlacklistRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<CheckBlacklistRequest> request = new DefaultRequest<CheckBlacklistRequest>(checkBlacklistRequest, "kls");

        request.addParameter("Action", "CheckBlacklist");
        String version=checkBlacklistRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        request.addParameter("UniqueName",checkBlacklistRequest.getUniqueName());
        request.addParameter("App",checkBlacklistRequest.getApp());
        request.addParameter("Pubdomain",checkBlacklistRequest.getPubdomain());
        request.addParameter("Stream",checkBlacklistRequest.getStream());

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

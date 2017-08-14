package com.ksc.kls;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.GetBlacklistRequest;
import com.ksc.transform.Marshaller;

/**
 * Created by yangfan on 2017/7/26.
 */
public class GetBlacklistMarshaller implements Marshaller<Request<GetBlacklistRequest>, GetBlacklistRequest> {
    private static GetBlacklistMarshaller instance;

    public static GetBlacklistMarshaller getInstance() {
        if (instance == null)
            instance = new GetBlacklistMarshaller();
        return instance;
    }
    @Override
    public Request<GetBlacklistRequest> marshall(GetBlacklistRequest getBlacklistRequest) {
        if (getBlacklistRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<GetBlacklistRequest> request = new DefaultRequest<GetBlacklistRequest>(getBlacklistRequest, "kls");

        request.addParameter("Action", "GetBlacklist");
        String version=getBlacklistRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        request.addParameter("UniqueName",getBlacklistRequest.getUniqueName());
        request.addParameter("App",getBlacklistRequest.getApp());
        request.addParameter("Pubdomain",getBlacklistRequest.getPubdomain());

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}

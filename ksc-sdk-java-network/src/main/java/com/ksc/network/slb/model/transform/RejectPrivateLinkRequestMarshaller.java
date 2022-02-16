package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.RejectPrivateLinkRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class RejectPrivateLinkRequestMarshaller implements
        Marshaller<Request<RejectPrivateLinkRequest>, RejectPrivateLinkRequest> {

    @Override
    public Request<RejectPrivateLinkRequest> marshall(RejectPrivateLinkRequest rejectPrivateLinkRequest) {
        if (rejectPrivateLinkRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RejectPrivateLinkRequest> request = new DefaultRequest<RejectPrivateLinkRequest>(
                rejectPrivateLinkRequest, "slb");
        request.addParameter("Action", "RejectPrivateLink");
        String version = rejectPrivateLinkRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(rejectPrivateLinkRequest.getPrivateLinkId())) {
            request.addParameter("PrivateLinkId", rejectPrivateLinkRequest.getPrivateLinkId());
        }

        return request;
    }
}

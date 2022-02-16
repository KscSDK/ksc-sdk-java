package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.AcceptPrivateLinkRequest;
import com.ksc.network.slb.model.DeletePrivateLinkRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class AcceptPrivateLinkRequestMarshaller implements
        Marshaller<Request<AcceptPrivateLinkRequest>, AcceptPrivateLinkRequest> {

    @Override
    public Request<AcceptPrivateLinkRequest> marshall(AcceptPrivateLinkRequest acceptPrivateLinkRequest) {
        if (acceptPrivateLinkRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<AcceptPrivateLinkRequest> request = new DefaultRequest<AcceptPrivateLinkRequest>(
                acceptPrivateLinkRequest, "slb");
        request.addParameter("Action", "AcceptPrivateLink");
        String version = acceptPrivateLinkRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(acceptPrivateLinkRequest.getPrivateLinkId())) {
            request.addParameter("PrivateLinkId", acceptPrivateLinkRequest.getPrivateLinkId());
        }

        return request;
    }
}

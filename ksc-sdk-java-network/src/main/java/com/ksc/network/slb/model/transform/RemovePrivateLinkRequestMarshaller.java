package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeletePrivateLinkRequest;
import com.ksc.network.slb.model.RemovePrivateLinkRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class RemovePrivateLinkRequestMarshaller implements
        Marshaller<Request<RemovePrivateLinkRequest>, RemovePrivateLinkRequest> {

    @Override
    public Request<RemovePrivateLinkRequest> marshall(RemovePrivateLinkRequest removePrivateLinkRequest) {
        if (removePrivateLinkRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemovePrivateLinkRequest> request = new DefaultRequest<RemovePrivateLinkRequest>(
                removePrivateLinkRequest, "slb");
        request.addParameter("Action", "RemovePrivateLink");
        String version = removePrivateLinkRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(removePrivateLinkRequest.getPrivateLinkId())) {
            request.addParameter("PrivateLinkId", removePrivateLinkRequest.getPrivateLinkId());
        }

        return request;
    }
}

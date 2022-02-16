package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeletePrivateLinkRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class DeletePrivateLinkRequestMarshaller implements
        Marshaller<Request<DeletePrivateLinkRequest>, DeletePrivateLinkRequest> {

    @Override
    public Request<DeletePrivateLinkRequest> marshall(DeletePrivateLinkRequest deletePrivateLinkRequest) {
        if (deletePrivateLinkRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeletePrivateLinkRequest> request = new DefaultRequest<DeletePrivateLinkRequest>(
                deletePrivateLinkRequest, "slb");
        request.addParameter("Action", "DeletePrivateLink");
        String version = deletePrivateLinkRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deletePrivateLinkRequest.getPrivateLinkId())) {
            request.addParameter("PrivateLinkId", deletePrivateLinkRequest.getPrivateLinkId());
        }

        return request;
    }
}

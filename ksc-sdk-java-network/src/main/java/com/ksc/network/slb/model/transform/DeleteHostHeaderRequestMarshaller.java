package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteHostHeaderRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteHostHeaderRequestMarshaller implements
        Marshaller<Request<DeleteHostHeaderRequest>, DeleteHostHeaderRequest> {

    @Override
    public Request<DeleteHostHeaderRequest> marshall(DeleteHostHeaderRequest DeleteHostHeaderRequest) {
        if (DeleteHostHeaderRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteHostHeaderRequest> request = new DefaultRequest<DeleteHostHeaderRequest>(
                DeleteHostHeaderRequest, "slb");
        request.addParameter("Action", "DeleteHostHeader");
        String version = DeleteHostHeaderRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(DeleteHostHeaderRequest.getHostHeaderId())) {
            request.addParameter("HostHeaderId", DeleteHostHeaderRequest.getHostHeaderId());
        }

        return request;
    }
}
package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreatePrivateLinkServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreatePrivateLinkServerRequestMarshaller implements
        Marshaller<Request<CreatePrivateLinkServerRequest>, CreatePrivateLinkServerRequest> {

    @Override
    public Request<CreatePrivateLinkServerRequest> marshall(CreatePrivateLinkServerRequest createPrivateLinkServerRequest) {
        if (createPrivateLinkServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePrivateLinkServerRequest> request = new DefaultRequest<CreatePrivateLinkServerRequest>(
                createPrivateLinkServerRequest, "slb");
        request.addParameter("Action", "CreatePrivateLinkServer");
        String version = createPrivateLinkServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createPrivateLinkServerRequest.getPrivateLinkServerName())) {
            request.addParameter("PrivateLinkServerName", createPrivateLinkServerRequest.getPrivateLinkServerName());
        }
        if (!StringUtils.isNullOrEmpty(createPrivateLinkServerRequest.getListenerId())) {
            request.addParameter("ListenerId", createPrivateLinkServerRequest.getListenerId());
        }
        if (!StringUtils.isNullOrEmpty(createPrivateLinkServerRequest.getDescription())) {
            request.addParameter("Description", createPrivateLinkServerRequest.getDescription());
        }
        if (!StringUtils.isNullOrEmpty(createPrivateLinkServerRequest.getProjectId())) {
            request.addParameter("ProjectId", createPrivateLinkServerRequest.getProjectId());
        }
        return request;
    }
}

package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeletePrivateLinkServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author: hueason
 * @date: 2021/6/7 16:09
 * @description:
 */
public class DeletePrivateLinkServerRequestMarshaller implements
        Marshaller<Request<DeletePrivateLinkServerRequest>, DeletePrivateLinkServerRequest> {

    @Override
    public Request<DeletePrivateLinkServerRequest> marshall(DeletePrivateLinkServerRequest deletePrivateLinkServerRequest) {
        if (deletePrivateLinkServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeletePrivateLinkServerRequest> request = new DefaultRequest<DeletePrivateLinkServerRequest>(
                deletePrivateLinkServerRequest, "slb");
        request.addParameter("Action", "DeletePrivateLinkServer");
        String version = deletePrivateLinkServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deletePrivateLinkServerRequest.getPrivateLinkServerId())) {
            request.addParameter("PrivateLinkServerId", deletePrivateLinkServerRequest.getPrivateLinkServerId());
        }

        return request;
    }
}

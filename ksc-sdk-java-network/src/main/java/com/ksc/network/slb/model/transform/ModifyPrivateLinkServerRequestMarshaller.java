package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyPrivateLinkServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author: hueason
 * @date: 2021/6/7 17:33
 * @description:
 */
public class ModifyPrivateLinkServerRequestMarshaller implements
        Marshaller<Request<ModifyPrivateLinkServerRequest>, ModifyPrivateLinkServerRequest> {

    @Override
    public Request<ModifyPrivateLinkServerRequest> marshall(ModifyPrivateLinkServerRequest modifyPrivateLinkServerRequest) {
        if (modifyPrivateLinkServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyPrivateLinkServerRequest> request = new DefaultRequest<ModifyPrivateLinkServerRequest>(
                modifyPrivateLinkServerRequest, "slb");
        request.addParameter("Action", "ModifyPrivateLinkServer");
        String version = modifyPrivateLinkServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyPrivateLinkServerRequest.getPrivateLinkServerId())) {
            request.addParameter("PrivateLinkServerId", modifyPrivateLinkServerRequest.getPrivateLinkServerId());
        }
        if (!StringUtils.isNullOrEmpty(modifyPrivateLinkServerRequest.getPrivateLinkServerName())) {
            request.addParameter("PrivateLinkServerName", modifyPrivateLinkServerRequest.getPrivateLinkServerName());
        }
        if (!StringUtils.isNullOrEmpty(modifyPrivateLinkServerRequest.getDescription())) {
            request.addParameter("Description", modifyPrivateLinkServerRequest.getDescription());
        }
        return request;
    }
}

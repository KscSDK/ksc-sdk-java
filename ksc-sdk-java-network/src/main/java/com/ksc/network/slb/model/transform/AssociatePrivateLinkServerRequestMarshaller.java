package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.AssociatePrivateLinkServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author: hueason
 * @date: 2021/6/7 17:43
 * @description:
 */
public class AssociatePrivateLinkServerRequestMarshaller implements
        Marshaller<Request<AssociatePrivateLinkServerRequest>, AssociatePrivateLinkServerRequest> {

    @Override
    public Request<AssociatePrivateLinkServerRequest> marshall(AssociatePrivateLinkServerRequest associatePrivateLinkServerRequest) {
        if (associatePrivateLinkServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociatePrivateLinkServerRequest> request = new DefaultRequest<AssociatePrivateLinkServerRequest>(
                associatePrivateLinkServerRequest, "slb");
        request.addParameter("Action", "AssociatePrivateLinkServer");
        String version = associatePrivateLinkServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(associatePrivateLinkServerRequest.getPrivateLinkServerId())) {
            request.addParameter("PrivateLinkServerId", associatePrivateLinkServerRequest.getPrivateLinkServerId());
        }
        if (!StringUtils.isNullOrEmpty(associatePrivateLinkServerRequest.getLoadBalancerId())) {
            request.addParameter("LoadBalancerId", associatePrivateLinkServerRequest.getLoadBalancerId());
        }
        if (!StringUtils.isNullOrEmpty(associatePrivateLinkServerRequest.getListenerPort())) {
            request.addParameter("ListenerPort", associatePrivateLinkServerRequest.getListenerPort());
        }
        if (!StringUtils.isNullOrEmpty(associatePrivateLinkServerRequest.getProjectId())) {
            request.addParameter("ProjectId", associatePrivateLinkServerRequest.getProjectId());
        }
        return request;
    }
}

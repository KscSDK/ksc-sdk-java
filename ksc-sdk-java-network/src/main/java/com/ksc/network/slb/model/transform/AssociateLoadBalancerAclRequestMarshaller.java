package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.AssociateLoadBalancerAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class AssociateLoadBalancerAclRequestMarshaller implements
        Marshaller<Request<AssociateLoadBalancerAclRequest>, AssociateLoadBalancerAclRequest> {

    @Override
    public Request<AssociateLoadBalancerAclRequest> marshall(AssociateLoadBalancerAclRequest associateLoadBalancerAclRequest) {
        if (associateLoadBalancerAclRequest == null) {
        throw new KscClientException("Invalid argument passed to marshall(...)");
    }

    Request<AssociateLoadBalancerAclRequest> request = new DefaultRequest<AssociateLoadBalancerAclRequest>(
            associateLoadBalancerAclRequest, "slb");
        request.addParameter("Action", "AssociateLoadBalancerAcl");
        String version = associateLoadBalancerAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            if (!StringUtils.isNullOrEmpty(associateLoadBalancerAclRequest.getListenerId())) {
                request.addParameter("ListenerId", associateLoadBalancerAclRequest.getListenerId());
            }
            if (!StringUtils.isNullOrEmpty(associateLoadBalancerAclRequest.getLoadBalancerAclId())) {
                request.addParameter("LoadBalancerAclId", associateLoadBalancerAclRequest.getLoadBalancerAclId());
            }

        return request;
    }
}
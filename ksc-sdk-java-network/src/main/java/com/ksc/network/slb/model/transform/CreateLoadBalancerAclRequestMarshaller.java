package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateLoadBalancerAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateLoadBalancerAclRequestMarshaller implements
        Marshaller<Request<CreateLoadBalancerAclRequest>, CreateLoadBalancerAclRequest> {

    @Override
    public Request<CreateLoadBalancerAclRequest> marshall(CreateLoadBalancerAclRequest createLoadBalancerAclRequest) {
        if (createLoadBalancerAclRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerAclRequest> request = new DefaultRequest<CreateLoadBalancerAclRequest>(
                createLoadBalancerAclRequest, "slb");
        request.addParameter("Action", "CreateLoadBalancerAcl");
        String version = createLoadBalancerAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createLoadBalancerAclRequest.getIpVersion())) {
            request.addParameter("IpVersion", createLoadBalancerAclRequest.getIpVersion());
        }
        if (!StringUtils.isNullOrEmpty(createLoadBalancerAclRequest.getLoadBalancerAclName())) {
            request.addParameter("LoadBalancerAclName", createLoadBalancerAclRequest.getLoadBalancerAclName());
        }

        return request;
    }
}
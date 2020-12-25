package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteLoadBalancerAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteLoadBalancerAclRequestMarshaller implements
        Marshaller<Request<DeleteLoadBalancerAclRequest>, DeleteLoadBalancerAclRequest> {

    @Override
    public Request<DeleteLoadBalancerAclRequest> marshall(DeleteLoadBalancerAclRequest deleteLoadBalancerAclRequest) {
        if (deleteLoadBalancerAclRequest == null) {
        throw new KscClientException("Invalid argument passed to marshall(...)");
    }

    Request<DeleteLoadBalancerAclRequest> request = new DefaultRequest<DeleteLoadBalancerAclRequest>(
            deleteLoadBalancerAclRequest, "slb");
        request.addParameter("Action", "DeleteLoadBalancerAcl");
        String version = deleteLoadBalancerAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            if (!StringUtils.isNullOrEmpty(deleteLoadBalancerAclRequest.getLoadBalancerAclId())) {
                request.addParameter("LoadBalancerAclId", deleteLoadBalancerAclRequest.getLoadBalancerAclId());
            }

        return request;
    }
}
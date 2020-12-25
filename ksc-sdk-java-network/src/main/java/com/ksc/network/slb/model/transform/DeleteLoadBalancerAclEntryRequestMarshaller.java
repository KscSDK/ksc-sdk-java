package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteLoadBalancerAclEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteLoadBalancerAclEntryRequestMarshaller implements
        Marshaller<Request<DeleteLoadBalancerAclEntryRequest>, DeleteLoadBalancerAclEntryRequest> {

    @Override
    public Request<DeleteLoadBalancerAclEntryRequest> marshall(DeleteLoadBalancerAclEntryRequest deleteLoadBalancerAclEntryRequest) {
        if (deleteLoadBalancerAclEntryRequest == null) {
        throw new KscClientException("Invalid argument passed to marshall(...)");
    }

    Request<DeleteLoadBalancerAclEntryRequest> request = new DefaultRequest<DeleteLoadBalancerAclEntryRequest>(
            deleteLoadBalancerAclEntryRequest, "slb");
        request.addParameter("Action", "DeleteLoadBalancerAclEntry");
        String version = deleteLoadBalancerAclEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            if (!StringUtils.isNullOrEmpty(deleteLoadBalancerAclEntryRequest.getLoadBalancerAclId())) {
                request.addParameter("LoadBalancerAclId", deleteLoadBalancerAclEntryRequest.getLoadBalancerAclId());
            }
            if (!StringUtils.isNullOrEmpty(deleteLoadBalancerAclEntryRequest.getLoadBalancerAclEntryId())) {
                request.addParameter("LoadBalancerAclEntryId", deleteLoadBalancerAclEntryRequest.getLoadBalancerAclEntryId());
            }

        return request;
    }
}
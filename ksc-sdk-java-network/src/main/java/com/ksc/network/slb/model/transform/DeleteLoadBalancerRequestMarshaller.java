package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteLoadBalancerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteLoadBalancerRequest Marshaller
 */

public class DeleteLoadBalancerRequestMarshaller implements
        Marshaller<Request<DeleteLoadBalancerRequest>, DeleteLoadBalancerRequest> {

    public Request<DeleteLoadBalancerRequest> marshall(
    		DeleteLoadBalancerRequest deleteLoadBalancerRequest) {

        if (deleteLoadBalancerRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteLoadBalancerRequest> request = new DefaultRequest<DeleteLoadBalancerRequest>(
        		deleteLoadBalancerRequest, "slb");
        request.addParameter("Action", "DeleteLoadBalancer");
        String version = deleteLoadBalancerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteLoadBalancerRequest) deleteLoadBalancerRequest).getLoadBalancerId())) {
            request.addParameter("LoadBalancerId", ((DeleteLoadBalancerRequest) deleteLoadBalancerRequest).getLoadBalancerId());
        }

        return request;
    }

}

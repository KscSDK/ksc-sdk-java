package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteListenersRequest;
import com.ksc.network.slb.model.DeleteLoadBalancerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DeleteListenersRequestMarshaller implements
        Marshaller<Request<DeleteListenersRequest>, DeleteListenersRequest> {

    public Request<DeleteListenersRequest> marshall(
    		DeleteListenersRequest deleteListenersRequest) {

        if (deleteListenersRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteListenersRequest> request = new DefaultRequest<DeleteListenersRequest>(
        		deleteListenersRequest, "slb");
        request.addParameter("Action", "DeleteListeners");
        String version = deleteListenersRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteListenersRequest) deleteListenersRequest).getListenerId())) {
            request.addParameter("ListenerId", ((DeleteListenersRequest) deleteListenersRequest).getListenerId());
        }

        return request;
    }

}

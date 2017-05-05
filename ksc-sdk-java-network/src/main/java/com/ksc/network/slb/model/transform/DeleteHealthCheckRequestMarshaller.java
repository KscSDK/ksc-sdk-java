package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteHealthCheckRequest;
import com.ksc.network.slb.model.DeleteListenersRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DeleteHealthCheckRequestMarshaller implements
        Marshaller<Request<DeleteHealthCheckRequest>, DeleteHealthCheckRequest> {

    public Request<DeleteHealthCheckRequest> marshall(
    		DeleteHealthCheckRequest deleteHealthCheckRequest) {

        if (deleteHealthCheckRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteHealthCheckRequest> request = new DefaultRequest<DeleteHealthCheckRequest>(
        		deleteHealthCheckRequest, "slb");
        request.addParameter("Action", "DeleteHealthCheck");
        String version = deleteHealthCheckRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteHealthCheckRequest) deleteHealthCheckRequest).getHealthCheckId())) {
            request.addParameter("HealthCheckId", ((DeleteHealthCheckRequest) deleteHealthCheckRequest).getHealthCheckId());
        }

        return request;
    }

}

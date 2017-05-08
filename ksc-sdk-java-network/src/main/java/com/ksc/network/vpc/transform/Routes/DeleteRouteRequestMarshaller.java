package com.ksc.network.vpc.transform.Routes;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Route.DeleteRouteRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteRouteRequest Marshaller
 */

public class DeleteRouteRequestMarshaller implements
        Marshaller<Request<DeleteRouteRequest>, DeleteRouteRequest> {

    public Request<DeleteRouteRequest> marshall(
    		DeleteRouteRequest deleteRouteRequest) {

        if (deleteRouteRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteRouteRequest> request = new DefaultRequest<DeleteRouteRequest>(
        		deleteRouteRequest, "vpc");
        request.addParameter("Action", "DeleteRoute");
        String version = deleteRouteRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteRouteRequest) deleteRouteRequest).getRouteId())) {
            request.addParameter("RouteId", ((DeleteRouteRequest) deleteRouteRequest).getRouteId());
        }

        return request;
    }

}

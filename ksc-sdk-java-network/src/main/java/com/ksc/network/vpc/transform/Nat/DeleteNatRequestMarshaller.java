package com.ksc.network.vpc.transform.Nat;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.DeleteNatRequest;
import com.ksc.network.vpc.model.Route.DeleteRouteRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DeleteNatRequestMarshaller implements
        Marshaller<Request<DeleteNatRequest>, DeleteNatRequest> {

    public Request<DeleteNatRequest> marshall(
    		DeleteNatRequest deleteNatRequest) {

        if (deleteNatRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteNatRequest> request = new DefaultRequest<DeleteNatRequest>(
        		deleteNatRequest, "vpc");
        request.addParameter("Action", "DeleteNat");
        String version = deleteNatRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteNatRequest) deleteNatRequest).getNatId())) {
            request.addParameter("NatId", ((DeleteNatRequest) deleteNatRequest).getNatId());
        }

        return request;
    }

}

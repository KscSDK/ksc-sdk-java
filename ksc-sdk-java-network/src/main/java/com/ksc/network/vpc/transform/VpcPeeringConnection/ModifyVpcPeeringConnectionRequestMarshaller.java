package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.VpcPeeringConnection.ModifyVpcPeeringConnectionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifyVpcPeeringConnectionRequest Marshaller
 */

public class ModifyVpcPeeringConnectionRequestMarshaller implements
        Marshaller<Request<ModifyVpcPeeringConnectionRequest>, ModifyVpcPeeringConnectionRequest> {

    public Request<ModifyVpcPeeringConnectionRequest> marshall(
    		ModifyVpcPeeringConnectionRequest modifyVpcPeeringConnectionRequest) {

        if (modifyVpcPeeringConnectionRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpcPeeringConnectionRequest> request = new DefaultRequest<ModifyVpcPeeringConnectionRequest>(
        		modifyVpcPeeringConnectionRequest, "vpc");
        request.addParameter("Action", "ModifyVpcPeeringConnection");
        String version = modifyVpcPeeringConnectionRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyVpcPeeringConnectionRequest.getVpcPeeringConnectionId())) {
            request.addParameter("VpcPeeringConnectionId", modifyVpcPeeringConnectionRequest.getVpcPeeringConnectionId());
        }

        if (!StringUtils.isNullOrEmpty(modifyVpcPeeringConnectionRequest.getPeeringName())) {
            request.addParameter("PeeringName", modifyVpcPeeringConnectionRequest.getPeeringName());
        }

        return request;
    }

}

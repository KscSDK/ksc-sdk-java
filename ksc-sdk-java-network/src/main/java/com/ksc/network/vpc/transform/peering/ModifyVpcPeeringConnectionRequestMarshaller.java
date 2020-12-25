package com.ksc.network.vpc.transform.peering;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.peering.ModifyVpcPeeringConnectionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyVpcPeeringConnectionRequestMarshaller implements
        Marshaller<Request<ModifyVpcPeeringConnectionRequest>, ModifyVpcPeeringConnectionRequest> {

    @Override
    public Request<ModifyVpcPeeringConnectionRequest> marshall(ModifyVpcPeeringConnectionRequest modifyVpcPeeringConnectionRequest) {
        if (modifyVpcPeeringConnectionRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
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
        if (modifyVpcPeeringConnectionRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", String.valueOf(modifyVpcPeeringConnectionRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(modifyVpcPeeringConnectionRequest.getPeeringName())) {
            request.addParameter("PeeringName", modifyVpcPeeringConnectionRequest.getPeeringName());
        }

        return request;
    }
}
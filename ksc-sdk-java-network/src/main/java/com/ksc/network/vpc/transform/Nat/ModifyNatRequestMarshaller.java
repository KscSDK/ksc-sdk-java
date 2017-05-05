package com.ksc.network.vpc.transform.Nat;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.ModifyNatRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifySecurityGroupRequest Marshaller
 */

public class ModifyNatRequestMarshaller implements
        Marshaller<Request<ModifyNatRequest>, ModifyNatRequest> {

    public Request<ModifyNatRequest> marshall(
    		ModifyNatRequest modifyNatRequest) {

        if (modifyNatRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyNatRequest> request = new DefaultRequest<ModifyNatRequest>(
        		modifyNatRequest, "vpc");
        request.addParameter("Action", "ModifyNat");
        String version = modifyNatRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyNatRequest.getNatId())) {
            request.addParameter("NatId", modifyNatRequest.getNatId());
        }

        if (modifyNatRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", StringUtils
                    .fromInteger(modifyNatRequest.getBandWidth()));
        }

        if (!StringUtils.isNullOrEmpty(modifyNatRequest.getNatName())) {
            request.addParameter("NatName", modifyNatRequest.getNatName());
        }

        return request;
    }

}

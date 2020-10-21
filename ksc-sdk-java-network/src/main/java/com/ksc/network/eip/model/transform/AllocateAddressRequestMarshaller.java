package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * AllocateAddressRequest Marshaller
 */

public class AllocateAddressRequestMarshaller implements
        Marshaller<Request<AllocateAddressRequest>, AllocateAddressRequest> {

    public Request<AllocateAddressRequest> marshall(
    		AllocateAddressRequest allocateAddressRequest) {

        if (allocateAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AllocateAddressRequest> request = new DefaultRequest<AllocateAddressRequest>(
        		allocateAddressRequest, "eip");
        request.addParameter("Action", "AllocateAddress");
        String version = allocateAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(allocateAddressRequest.getLineId())) {
            request.addParameter("LineId", allocateAddressRequest.getLineId());
        }

        if (allocateAddressRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", StringUtils
                    .fromInteger(allocateAddressRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(allocateAddressRequest.getChargeType())) {
            request.addParameter("ChargeType", allocateAddressRequest.getChargeType());
        }
        if (allocateAddressRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", StringUtils
                    .fromInteger(allocateAddressRequest.getPurchaseTime()));
        }
        if (!StringUtils.isNullOrEmpty(allocateAddressRequest.getProjectId())) {
            request.addParameter("ProjectId", allocateAddressRequest.getProjectId());
        }
        
        return request;
    }

}

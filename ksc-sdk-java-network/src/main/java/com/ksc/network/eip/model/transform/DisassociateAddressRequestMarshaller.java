package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.DisassociateAddressRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DisassociateAddressRequest Marshaller
 */

public class DisassociateAddressRequestMarshaller implements
        Marshaller<Request<DisassociateAddressRequest>, DisassociateAddressRequest> {

    public Request<DisassociateAddressRequest> marshall(
    		DisassociateAddressRequest disassociateAddressRequest) {

        if (disassociateAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DisassociateAddressRequest> request = new DefaultRequest<DisassociateAddressRequest>(
        		disassociateAddressRequest, "eip");
        request.addParameter("Action", "DisassociateAddress");
        String version = disassociateAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(disassociateAddressRequest.getAllocationId())) {
            request.addParameter("AllocationId", disassociateAddressRequest.getAllocationId());
        }
        
        return request;
    }

}

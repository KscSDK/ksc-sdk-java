package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
<<<<<<< HEAD
import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.network.eip.model.DisassociateAddressRequest;
import com.ksc.network.eip.model.ReleaseAddressRequest;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
=======
import com.ksc.network.eip.model.DisassociateAddressRequest;
>>>>>>> v4.0.0
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
<<<<<<< HEAD
 * CreateSecurityGroupRequest Marshaller
=======
 * DisassociateAddressRequest Marshaller
>>>>>>> v4.0.0
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

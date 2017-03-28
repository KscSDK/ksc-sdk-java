package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.network.eip.model.AssociateAddressRequest;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateSecurityGroupRequest Marshaller
 */

public class AssociateAddressRequestMarshaller implements
        Marshaller<Request<AssociateAddressRequest>, AssociateAddressRequest> {

    public Request<AssociateAddressRequest> marshall(
    		AssociateAddressRequest associateAddressRequest) {

        if (associateAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssociateAddressRequest> request = new DefaultRequest<AssociateAddressRequest>(
        		associateAddressRequest, "eip");
        request.addParameter("Action", "AssociateAddress");
        String version = associateAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(associateAddressRequest.getAllocationId())) {
            request.addParameter("AllocationId", associateAddressRequest.getAllocationId());
        }

        if (!StringUtils.isNullOrEmpty(associateAddressRequest.getInstanceType())) {
            request.addParameter("InstanceType", associateAddressRequest.getInstanceType());
        }
        
        if (!StringUtils.isNullOrEmpty(associateAddressRequest.getInstanceId())) {
            request.addParameter("InstanceId", associateAddressRequest.getInstanceId());
        }
        
        if (!StringUtils.isNullOrEmpty(associateAddressRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", associateAddressRequest.getNetworkInterfaceId());
        }
 
        return request;
    }

}

package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.network.eip.model.ReleaseAddressRequest;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateSecurityGroupRequest Marshaller
 */

public class ReleaseAddressRequestMarshaller implements
        Marshaller<Request<ReleaseAddressRequest>, ReleaseAddressRequest> {

    public Request<ReleaseAddressRequest> marshall(
    		ReleaseAddressRequest releaseAddressRequest) {

        if (releaseAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ReleaseAddressRequest> request = new DefaultRequest<ReleaseAddressRequest>(
        		releaseAddressRequest, "eip");
        request.addParameter("Action", "ReleaseAddress");
        String version = releaseAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(releaseAddressRequest.getAllocationId())) {
            request.addParameter("AllocationId", releaseAddressRequest.getAllocationId());
        }
        
        return request;
    }

}

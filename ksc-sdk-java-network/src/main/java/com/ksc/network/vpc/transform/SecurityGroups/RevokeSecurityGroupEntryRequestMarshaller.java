package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * RevokeSecurityGroupEntryRequest Marshaller
 */

public class RevokeSecurityGroupEntryRequestMarshaller implements
        Marshaller<Request<RevokeSecurityGroupEntryRequest>, RevokeSecurityGroupEntryRequest> {

    public Request<RevokeSecurityGroupEntryRequest> marshall(
    		RevokeSecurityGroupEntryRequest revokeSecurityGroupEntryRequest) {

        if (revokeSecurityGroupEntryRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RevokeSecurityGroupEntryRequest> request = new DefaultRequest<RevokeSecurityGroupEntryRequest>(
        		revokeSecurityGroupEntryRequest, "vpc");
        request.addParameter("Action", "RevokeSecurityGroupEntry");
        String version = revokeSecurityGroupEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(revokeSecurityGroupEntryRequest.getSecurityGroupId())) {
            request.addParameter("SecurityGroupId", revokeSecurityGroupEntryRequest.getSecurityGroupId());
        }
        if (!StringUtils.isNullOrEmpty(revokeSecurityGroupEntryRequest.getSecurityGroupEntryId())) {
            request.addParameter("SecurityGroupEntryId", revokeSecurityGroupEntryRequest.getSecurityGroupEntryId());
        }
        
        return request;
    }

}

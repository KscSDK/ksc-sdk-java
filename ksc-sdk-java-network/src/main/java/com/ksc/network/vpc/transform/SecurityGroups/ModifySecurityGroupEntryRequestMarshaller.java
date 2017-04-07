package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifySecurityGroupRequest Marshaller
 */

public class ModifySecurityGroupEntryRequestMarshaller implements
        Marshaller<Request<ModifySecurityGroupEntryRequest>, ModifySecurityGroupEntryRequest> {

    public Request<ModifySecurityGroupEntryRequest> marshall(
    		ModifySecurityGroupEntryRequest modifySecurityGroupEntryRequest) {

        if (modifySecurityGroupEntryRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifySecurityGroupEntryRequest> request = new DefaultRequest<ModifySecurityGroupEntryRequest>(
        		modifySecurityGroupEntryRequest, "vpc");
        request.addParameter("Action", "ModifySecurityGroupEntry");
        String version = modifySecurityGroupEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifySecurityGroupEntryRequest.getSecurityGroupEntryId())) {
            request.addParameter("SecurityGroupEntryId", modifySecurityGroupEntryRequest.getSecurityGroupEntryId());
        }

        if (!StringUtils.isNullOrEmpty(modifySecurityGroupEntryRequest.getDescription())) {
            request.addParameter("Description", modifySecurityGroupEntryRequest.getDescription());
        }

        return request;
    }

}

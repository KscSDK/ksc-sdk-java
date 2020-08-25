package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.ModifyAddressRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyAddressRequestMarshaller implements
        Marshaller<Request<ModifyAddressRequest>, ModifyAddressRequest> {
    @Override
    public Request<ModifyAddressRequest> marshall(ModifyAddressRequest modifyAddressRequest) {
        if (modifyAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyAddressRequest> request = new DefaultRequest<ModifyAddressRequest>(
                modifyAddressRequest, "eip");
        request.addParameter("Action", "ModifyAddress");
        String version = modifyAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (modifyAddressRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", StringUtils
                    .fromInteger(modifyAddressRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(modifyAddressRequest.getAllocationId())) {
            request.addParameter("AllocationId", modifyAddressRequest.getAllocationId());
        }

        return request;
    }
}

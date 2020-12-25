package com.ksc.network.bws.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.bws.model.AssociateBandWidthShareRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class AssociateBandWidthShareRequestMarshaller implements
        Marshaller<Request<AssociateBandWidthShareRequest>, AssociateBandWidthShareRequest> {

    @Override
    public Request<AssociateBandWidthShareRequest> marshall(AssociateBandWidthShareRequest associateBandWidthShareRequest) {
        if (associateBandWidthShareRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateBandWidthShareRequest> request = new DefaultRequest<AssociateBandWidthShareRequest>(
                associateBandWidthShareRequest, "bws");
        request.addParameter("Action", "AssociateBandWidthShare");
        String version = associateBandWidthShareRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(associateBandWidthShareRequest.getBandWidthShareId())) {
            request.addParameter("BandWidthShareId", associateBandWidthShareRequest.getBandWidthShareId());
        }
        if (!StringUtils.isNullOrEmpty(associateBandWidthShareRequest.getAllocationId())) {
            request.addParameter("AllocationId", associateBandWidthShareRequest.getAllocationId());
        }

        return request;
    }
}
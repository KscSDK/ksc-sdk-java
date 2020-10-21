package com.ksc.network.bws.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.bws.model.DisassociateBandWidthShareRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DisassociateBandWidthShareRequestMarshaller implements
        Marshaller<Request<DisassociateBandWidthShareRequest>, DisassociateBandWidthShareRequest> {

    @Override
    public Request<DisassociateBandWidthShareRequest> marshall(DisassociateBandWidthShareRequest disassociateBandWidthShareRequest) {
        if (disassociateBandWidthShareRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateBandWidthShareRequest> request = new DefaultRequest<DisassociateBandWidthShareRequest>(
                disassociateBandWidthShareRequest, "bws");
        request.addParameter("Action", "DisassociateBandWidthShare");
        String version = disassociateBandWidthShareRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(disassociateBandWidthShareRequest.getBandWidthShareId())) {
            request.addParameter("BandWidthShareId", disassociateBandWidthShareRequest.getBandWidthShareId());
        }
        if (!StringUtils.isNullOrEmpty(disassociateBandWidthShareRequest.getAllocationId())) {
            request.addParameter("AllocationId", disassociateBandWidthShareRequest.getAllocationId());
        }
        if (disassociateBandWidthShareRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", String.valueOf(disassociateBandWidthShareRequest.getBandWidth()));
        }

        return request;
    }
}
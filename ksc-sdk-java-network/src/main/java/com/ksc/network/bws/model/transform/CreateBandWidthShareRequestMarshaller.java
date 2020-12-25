package com.ksc.network.bws.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.bws.model.CreateBandWidthShareRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateBandWidthShareRequestMarshaller implements
        Marshaller<Request<CreateBandWidthShareRequest>, CreateBandWidthShareRequest> {

    @Override
    public Request<CreateBandWidthShareRequest> marshall(CreateBandWidthShareRequest createBandWidthShareRequest) {
        if (createBandWidthShareRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateBandWidthShareRequest> request = new DefaultRequest<CreateBandWidthShareRequest>(
                createBandWidthShareRequest, "bws");
        request.addParameter("Action", "CreateBandWidthShare");
        String version = createBandWidthShareRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createBandWidthShareRequest.getLineId())) {
            request.addParameter("LineId", createBandWidthShareRequest.getLineId());
        }
        if (!StringUtils.isNullOrEmpty(createBandWidthShareRequest.getBandWidthShareName())) {
            request.addParameter("BandWidthShareName", createBandWidthShareRequest.getBandWidthShareName());
        }
        if (createBandWidthShareRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", String.valueOf(createBandWidthShareRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(createBandWidthShareRequest.getProjectId())) {
            request.addParameter("ProjectId", createBandWidthShareRequest.getProjectId());
        }
        if (!StringUtils.isNullOrEmpty(createBandWidthShareRequest.getChargeType())) {
            request.addParameter("ChargeType", createBandWidthShareRequest.getChargeType());
        }

        return request;
    }
}
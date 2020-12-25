package com.ksc.network.bws.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.bws.model.ModifyBandWidthShareRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyBandWidthShareRequestMarshaller implements
        Marshaller<Request<ModifyBandWidthShareRequest>, ModifyBandWidthShareRequest> {

    @Override
    public Request<ModifyBandWidthShareRequest> marshall(ModifyBandWidthShareRequest modifyBandWidthShareRequest) {
        if (modifyBandWidthShareRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyBandWidthShareRequest> request = new DefaultRequest<ModifyBandWidthShareRequest>(
                modifyBandWidthShareRequest, "bws");
        request.addParameter("Action", "ModifyBandWidthShare");
        String version = modifyBandWidthShareRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyBandWidthShareRequest.getBandWidthShareId())) {
            request.addParameter("BandWidthShareId", modifyBandWidthShareRequest.getBandWidthShareId());
        }
        if (modifyBandWidthShareRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", String.valueOf(modifyBandWidthShareRequest.getBandWidth()));
        }

        return request;
    }
}
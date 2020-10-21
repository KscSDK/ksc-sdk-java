package com.ksc.network.bws.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.bws.model.DeleteBandWidthShareRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteBandWidthShareRequestMarshaller implements
        Marshaller<Request<DeleteBandWidthShareRequest>, DeleteBandWidthShareRequest> {

    @Override
    public Request<DeleteBandWidthShareRequest> marshall(DeleteBandWidthShareRequest deleteBandWidthShareRequest) {
        if (deleteBandWidthShareRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteBandWidthShareRequest> request = new DefaultRequest<DeleteBandWidthShareRequest>(
                deleteBandWidthShareRequest, "bws");
        request.addParameter("Action", "DeleteBandWidthShare");
        String version = deleteBandWidthShareRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteBandWidthShareRequest.getBandWidthShareId())) {
            request.addParameter("BandWidthShareId", deleteBandWidthShareRequest.getBandWidthShareId());
        }

        return request;
    }
}
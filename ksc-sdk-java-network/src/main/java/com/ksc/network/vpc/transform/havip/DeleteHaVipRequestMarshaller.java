package com.ksc.network.vpc.transform.havip;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.havip.DeleteHaVipRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateHaVipRequest Marshaller
 */

public class DeleteHaVipRequestMarshaller implements
        Marshaller<Request<DeleteHaVipRequest>, DeleteHaVipRequest> {

    @Override
    public Request<DeleteHaVipRequest> marshall(
            DeleteHaVipRequest deleteHaVipRequest) {

        if (deleteHaVipRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteHaVipRequest> request = new DefaultRequest<DeleteHaVipRequest>(
                deleteHaVipRequest, "vpc");
        request.addParameter("Action", "DeleteHaVip");
        String version = deleteHaVipRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteHaVipRequest.getHaVipId())) {
            request.addParameter("HaVipId", deleteHaVipRequest.getHaVipId());
        }

        return request;
    }

}

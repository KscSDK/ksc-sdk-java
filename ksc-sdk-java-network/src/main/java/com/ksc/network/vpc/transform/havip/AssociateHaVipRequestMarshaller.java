package com.ksc.network.vpc.transform.havip;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.havip.AssociateHaVipRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * AssociateHaVipRequest Marshaller
 */

public class AssociateHaVipRequestMarshaller implements
        Marshaller<Request<AssociateHaVipRequest>, AssociateHaVipRequest> {

    @Override
    public Request<AssociateHaVipRequest> marshall(
            AssociateHaVipRequest associateHaVipRequest) {

        if (associateHaVipRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssociateHaVipRequest> request = new DefaultRequest<AssociateHaVipRequest>(
                associateHaVipRequest, "vpc");
        request.addParameter("Action", "AssociateHaVip");
        String version = associateHaVipRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(associateHaVipRequest.getHaVipId())) {
            request.addParameter("HaVipId", associateHaVipRequest.getHaVipId());
        }
        if (!StringUtils.isNullOrEmpty(associateHaVipRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", associateHaVipRequest.getNetworkInterfaceId());
        }

        return request;
    }

}

package com.ksc.network.vpc.transform.havip;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.havip.UnAssociateHaVipRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * UnAssociateHaVipRequest Marshaller
 */

public class UnAssociateHaVipRequestMarshaller implements
        Marshaller<Request<UnAssociateHaVipRequest>, UnAssociateHaVipRequest> {

    @Override
    public Request<UnAssociateHaVipRequest> marshall(
            UnAssociateHaVipRequest unAssociateHaVipRequest) {

        if (unAssociateHaVipRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UnAssociateHaVipRequest> request = new DefaultRequest<UnAssociateHaVipRequest>(
                unAssociateHaVipRequest, "vpc");
        request.addParameter("Action", "UnAssociateHaVip");
        String version = unAssociateHaVipRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(unAssociateHaVipRequest.getHaVipId())) {
            request.addParameter("HaVipId", unAssociateHaVipRequest.getHaVipId());
        }
        if (!StringUtils.isNullOrEmpty(unAssociateHaVipRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", unAssociateHaVipRequest.getNetworkInterfaceId());
        }

        return request;
    }

}

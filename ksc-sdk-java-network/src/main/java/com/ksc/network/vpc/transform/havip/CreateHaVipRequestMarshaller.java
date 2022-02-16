package com.ksc.network.vpc.transform.havip;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.havip.CreateHaVipRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateHaVipRequest Marshaller
 */

public class CreateHaVipRequestMarshaller implements
        Marshaller<Request<CreateHaVipRequest>, CreateHaVipRequest> {

    @Override
    public Request<CreateHaVipRequest> marshall(
            CreateHaVipRequest createHaVipRequest) {

        if (createHaVipRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateHaVipRequest> request = new DefaultRequest<CreateHaVipRequest>(
                createHaVipRequest, "vpc");
        request.addParameter("Action", "CreateHaVip");
        String version = createHaVipRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createHaVipRequest.getSubnetId())) {
            request.addParameter("SubnetId", createHaVipRequest.getSubnetId());
        }

        if (!StringUtils.isNullOrEmpty(createHaVipRequest.getIpAddress())) {
            request.addParameter("IpAddress", createHaVipRequest.getIpAddress());
        }

        return request;
    }

}

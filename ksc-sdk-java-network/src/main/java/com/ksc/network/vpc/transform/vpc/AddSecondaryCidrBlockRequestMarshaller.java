package com.ksc.network.vpc.transform.vpc;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpc.AddSecondaryCidrBlockRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateHaVipRequest Marshaller
 */
public class AddSecondaryCidrBlockRequestMarshaller implements
        Marshaller<Request<AddSecondaryCidrBlockRequest>, AddSecondaryCidrBlockRequest> {

    @Override
    public Request<AddSecondaryCidrBlockRequest> marshall(
            AddSecondaryCidrBlockRequest addSecondaryCidrBlockRequest) {

        if (addSecondaryCidrBlockRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AddSecondaryCidrBlockRequest> request = new DefaultRequest<AddSecondaryCidrBlockRequest>(
                addSecondaryCidrBlockRequest, "vpc");
        request.addParameter("Action", "AddSecondaryCidrBlock");
        String version = addSecondaryCidrBlockRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(addSecondaryCidrBlockRequest.getVpcId())) {
            request.addParameter("VpcId", addSecondaryCidrBlockRequest.getVpcId());
        }

        if (!StringUtils.isNullOrEmpty(addSecondaryCidrBlockRequest.getCidrBlock())) {
            request.addParameter("CidrBlock", addSecondaryCidrBlockRequest.getCidrBlock());
        }

        return request;
    }

}

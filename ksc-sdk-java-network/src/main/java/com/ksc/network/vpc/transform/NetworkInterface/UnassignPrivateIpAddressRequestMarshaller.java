package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkInterface.UnassignPrivateIpAddressRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * UnassignPrivateIpAddressRequest Marshaller
 */

public class UnassignPrivateIpAddressRequestMarshaller implements
        Marshaller<Request<UnassignPrivateIpAddressRequest>, UnassignPrivateIpAddressRequest> {

    @Override
    public Request<UnassignPrivateIpAddressRequest> marshall(
            UnassignPrivateIpAddressRequest unassignPrivateIpAddressRequest) {

        if (unassignPrivateIpAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UnassignPrivateIpAddressRequest> request = new DefaultRequest<UnassignPrivateIpAddressRequest>(
                unassignPrivateIpAddressRequest, "vpc");
        request.addParameter("Action", "UnassignPrivateIpAddress");
        String version = unassignPrivateIpAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty((unassignPrivateIpAddressRequest.getNetworkInterfaceId()))) {
            request.addParameter("NetworkInterfaceId", (unassignPrivateIpAddressRequest.getNetworkInterfaceId()));
        }
        com.ksc.internal.SdkInternalList<String> privateIpAddressList = unassignPrivateIpAddressRequest.getPrivateIpAddressList();
        if (privateIpAddressList != null && (!privateIpAddressList.isEmpty() || !privateIpAddressList.isAutoConstruct())) {
            int index = 1;

            for (String value : privateIpAddressList) {
                if (value != null) {
                    request.addParameter("PrivateIpAddress." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }

        return request;
    }

}

package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkInterface.AssignPrivateIpAddressRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * AssignPrivateIpAddressRequest Marshaller
 */
public class AssignPrivateIpAddressRequestMarshaller implements
        Marshaller<Request<AssignPrivateIpAddressRequest>, AssignPrivateIpAddressRequest> {

    @Override
    public Request<AssignPrivateIpAddressRequest> marshall(
            AssignPrivateIpAddressRequest assignPrivateIpAddressRequest) {

        if (assignPrivateIpAddressRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssignPrivateIpAddressRequest> request = new DefaultRequest<AssignPrivateIpAddressRequest>(
                assignPrivateIpAddressRequest, "vpc");
        request.addParameter("Action", "AssignPrivateIpAddress");
        String version = assignPrivateIpAddressRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(assignPrivateIpAddressRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", assignPrivateIpAddressRequest.getNetworkInterfaceId());
        }

        if (assignPrivateIpAddressRequest.getSecondaryPrivateIpAddressCount() != null) {
            request.addParameter("SecondaryPrivateIpAddressCount", StringUtils.fromInteger(assignPrivateIpAddressRequest.getSecondaryPrivateIpAddressCount()));
        }
        com.ksc.internal.SdkInternalList<String> privateIpAddressList = assignPrivateIpAddressRequest.getPrivateIpAddressList();
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
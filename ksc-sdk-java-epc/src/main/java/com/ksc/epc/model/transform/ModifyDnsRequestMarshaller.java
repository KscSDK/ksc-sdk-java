package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyDnsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyDnsRequestMarshaller implements
        Marshaller<Request<ModifyDnsRequest>, ModifyDnsRequest> {

    @Override
    public Request<ModifyDnsRequest> marshall(ModifyDnsRequest modifyDnsRequest) {
        if (modifyDnsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDnsRequest> request = new DefaultRequest<ModifyDnsRequest>(
                modifyDnsRequest, "epc");
        request.addParameter("Action", "ModifyDns");
        String version = modifyDnsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyDnsRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", modifyDnsRequest.getNetworkInterfaceId());
        }
        if (!StringUtils.isNullOrEmpty(modifyDnsRequest.getDNS1())) {
            request.addParameter("DNS1", modifyDnsRequest.getDNS1());
        }
        if (!StringUtils.isNullOrEmpty(modifyDnsRequest.getDNS2())) {
            request.addParameter("DNS2", modifyDnsRequest.getDNS2());
        }
        if (!StringUtils.isNullOrEmpty(modifyDnsRequest.getHostId())) {
            request.addParameter("HostId", modifyDnsRequest.getHostId());
        }

        return request;
    }
}
package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.ModifyCustomerGatewayRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyCustomerGatewayRequestMarshaller implements
        Marshaller<Request<ModifyCustomerGatewayRequest>, ModifyCustomerGatewayRequest> {

    @Override
    public Request<ModifyCustomerGatewayRequest> marshall(ModifyCustomerGatewayRequest modifyCustomerGatewayRequest) {
        if (modifyCustomerGatewayRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyCustomerGatewayRequest> request = new DefaultRequest<ModifyCustomerGatewayRequest>(
                modifyCustomerGatewayRequest, "vpc");
        request.addParameter("Action", "ModifyCustomerGateway");
        String version = modifyCustomerGatewayRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyCustomerGatewayRequest.getCustomerGatewayId())) {
            request.addParameter("CustomerGatewayId", modifyCustomerGatewayRequest.getCustomerGatewayId());
        }
        if (!StringUtils.isNullOrEmpty(modifyCustomerGatewayRequest.getCustomerGatewayAddress())) {
            request.addParameter("CustomerGatewayAddress", modifyCustomerGatewayRequest.getCustomerGatewayAddress());
        }
        if (!StringUtils.isNullOrEmpty(modifyCustomerGatewayRequest.getHaCustomerGatewayAddress())) {
            request.addParameter("HaCustomerGatewayAddress", modifyCustomerGatewayRequest.getHaCustomerGatewayAddress());
        }
        if (!StringUtils.isNullOrEmpty(modifyCustomerGatewayRequest.getCustomerGatewayName())) {
            request.addParameter("CustomerGatewayName", modifyCustomerGatewayRequest.getCustomerGatewayName());
        }

        return request;
    }
}
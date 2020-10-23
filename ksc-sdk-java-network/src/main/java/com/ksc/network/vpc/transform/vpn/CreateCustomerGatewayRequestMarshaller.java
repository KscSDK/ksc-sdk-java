package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.CreateCustomerGatewayRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateCustomerGatewayRequestMarshaller implements
        Marshaller<Request<CreateCustomerGatewayRequest>, CreateCustomerGatewayRequest> {

    @Override
    public Request<CreateCustomerGatewayRequest> marshall(CreateCustomerGatewayRequest createCustomerGatewayRequest) {
        if (createCustomerGatewayRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateCustomerGatewayRequest> request = new DefaultRequest<CreateCustomerGatewayRequest>(
                createCustomerGatewayRequest, "vpc");
        request.addParameter("Action", "CreateCustomerGateway");
        String version = createCustomerGatewayRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createCustomerGatewayRequest.getCustomerGatewayAddress())) {
            request.addParameter("CustomerGatewayAddress", createCustomerGatewayRequest.getCustomerGatewayAddress());
        }
        if (!StringUtils.isNullOrEmpty(createCustomerGatewayRequest.getHaCustomerGatewayAddress())) {
            request.addParameter("HaCustomerGatewayAddress", createCustomerGatewayRequest.getHaCustomerGatewayAddress());
        }
        if (!StringUtils.isNullOrEmpty(createCustomerGatewayRequest.getCustomerGatewayName())) {
            request.addParameter("CustomerGatewayName", createCustomerGatewayRequest.getCustomerGatewayName());
        }

        return request;
    }
}
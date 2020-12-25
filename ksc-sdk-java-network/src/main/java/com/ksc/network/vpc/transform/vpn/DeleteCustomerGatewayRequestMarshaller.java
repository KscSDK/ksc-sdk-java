package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.DeleteCustomerGatewayRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteCustomerGatewayRequestMarshaller implements
        Marshaller<Request<DeleteCustomerGatewayRequest>, DeleteCustomerGatewayRequest> {

    @Override
    public Request<DeleteCustomerGatewayRequest> marshall(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest) {
        if (deleteCustomerGatewayRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteCustomerGatewayRequest> request = new DefaultRequest<DeleteCustomerGatewayRequest>(
                deleteCustomerGatewayRequest, "vpc");
        request.addParameter("Action", "DeleteCustomerGateway");
        String version = deleteCustomerGatewayRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteCustomerGatewayRequest.getCustomerGatewayId())) {
            request.addParameter("CustomerGatewayId", deleteCustomerGatewayRequest.getCustomerGatewayId());
        }

        return request;
    }
}
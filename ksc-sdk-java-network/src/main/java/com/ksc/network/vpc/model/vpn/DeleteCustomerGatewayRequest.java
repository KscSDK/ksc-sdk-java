package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.DeleteCustomerGatewayRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteCustomerGateway.
 * </p>
 */
@Data
public class DeleteCustomerGatewayRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteCustomerGatewayRequest> {

    /**
     * 客户网关的ID
     */
    private String customerGatewayId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteCustomerGatewayRequest that = (DeleteCustomerGatewayRequest) o;
        if (customerGatewayId != null ? !customerGatewayId.equals(that.customerGatewayId) : that.customerGatewayId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (customerGatewayId != null ? customerGatewayId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteCustomerGatewayRequest> getDryRunRequest() {
        Request<DeleteCustomerGatewayRequest> request = new DeleteCustomerGatewayRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteCustomerGatewayRequest clone() {
        return (DeleteCustomerGatewayRequest) super.clone();
    }
}


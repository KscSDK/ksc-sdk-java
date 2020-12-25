package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.CreateCustomerGatewayRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateCustomerGateway.
 * </p>
 */
@Data
public class CreateCustomerGatewayRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateCustomerGatewayRequest> {

    /**
     * 客户网关的公网IP
     */
    private String customerGatewayAddress;
    /**
     * HA模式客户网关的公网IP
     */
    private String haCustomerGatewayAddress;
    /**
     * 客户网关的名称
     */
    private String customerGatewayName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateCustomerGatewayRequest that = (CreateCustomerGatewayRequest) o;
        if (customerGatewayAddress != null ? !customerGatewayAddress.equals(that.customerGatewayAddress) : that.customerGatewayAddress != null)
            return false;
        if (haCustomerGatewayAddress != null ? !haCustomerGatewayAddress.equals(that.haCustomerGatewayAddress) : that.haCustomerGatewayAddress != null)
            return false;
        if (customerGatewayName != null ? !customerGatewayName.equals(that.customerGatewayName) : that.customerGatewayName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (customerGatewayAddress != null ? customerGatewayAddress.hashCode() : 0);
        result = 31 * result + (haCustomerGatewayAddress != null ? haCustomerGatewayAddress.hashCode() : 0);
        result = 31 * result + (customerGatewayName != null ? customerGatewayName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateCustomerGatewayRequest> getDryRunRequest() {
        Request<CreateCustomerGatewayRequest> request = new CreateCustomerGatewayRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateCustomerGatewayRequest clone() {
        return (CreateCustomerGatewayRequest) super.clone();
    }
}


package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.ModifyCustomerGatewayRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyCustomerGateway.
 * </p>
 */
@Data
public class ModifyCustomerGatewayRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyCustomerGatewayRequest> {

    /**
     * 客户网关的ID
     */
    private String customerGatewayId;
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

        ModifyCustomerGatewayRequest that = (ModifyCustomerGatewayRequest) o;
        if (customerGatewayId != null ? !customerGatewayId.equals(that.customerGatewayId) : that.customerGatewayId != null)
            return false;
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
        result = 31 * result + (customerGatewayId != null ? customerGatewayId.hashCode() : 0);
        result = 31 * result + (customerGatewayAddress != null ? customerGatewayAddress.hashCode() : 0);
        result = 31 * result + (haCustomerGatewayAddress != null ? haCustomerGatewayAddress.hashCode() : 0);
        result = 31 * result + (customerGatewayName != null ? customerGatewayName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyCustomerGatewayRequest> getDryRunRequest() {
        Request<ModifyCustomerGatewayRequest> request = new ModifyCustomerGatewayRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyCustomerGatewayRequest clone() {
        return (ModifyCustomerGatewayRequest) super.clone();
    }
}


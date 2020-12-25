package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.CreateVpnGatewayRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateVpnGateway.
 * </p>
 */
@Data
public class CreateVpnGatewayRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateVpnGatewayRequest> {

    /**
     * Vpc的ID
     */
    private String vpcId;
    /**
     * VPN网关的名称
     */
    private String vpnGatewayName;
    /**
     * 购买时长，只有包年包月时不可缺省
     */
    private Integer purchaseTime;
    /**
     * VPN网关的带宽
     */
    private Integer bandWidth;
    /**
     * VPN网关的计费方式，同机房的对端连接此参数缺省
     */
    private String chargeType;
    /**
     * 项目的ID
     */
    private String projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateVpnGatewayRequest that = (CreateVpnGatewayRequest) o;
        if (vpcId != null ? !vpcId.equals(that.vpcId) : that.vpcId != null)
            return false;
        if (vpnGatewayName != null ? !vpnGatewayName.equals(that.vpnGatewayName) : that.vpnGatewayName != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (bandWidth != null ? !bandWidth.equals(that.bandWidth) : that.bandWidth != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vpcId != null ? vpcId.hashCode() : 0);
        result = 31 * result + (vpnGatewayName != null ? vpnGatewayName.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (bandWidth != null ? bandWidth.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateVpnGatewayRequest> getDryRunRequest() {
        Request<CreateVpnGatewayRequest> request = new CreateVpnGatewayRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateVpnGatewayRequest clone() {
        return (CreateVpnGatewayRequest) super.clone();
    }
}


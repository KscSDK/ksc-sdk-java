package com.ksc.network.vpc.model.vpn;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeVpnGateways.
 * </p>
 */
@Data
public class DescribeVpnGatewaysResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<VpnGateway> VpnGatewaySet;
    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeVpnGatewaysResult that = (DescribeVpnGatewaysResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (VpnGatewaySet != null ? !VpnGatewaySet.equals(that.VpnGatewaySet) : that.VpnGatewaySet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (VpnGatewaySet != null ? VpnGatewaySet.hashCode() : 0);
        return result;
    }

    public void addVpnGatewaySet(VpnGateway... vpnGateways) {
		if (this.VpnGatewaySet == null) {
			this.VpnGatewaySet = new SdkInternalList<VpnGateway>();
		}
		for (VpnGateway vpnGateway : vpnGateways) {
			this.VpnGatewaySet.add(vpnGateway);
		}
	}


    @Override
    public DescribeVpnGatewaysResult clone() {
        try {
            return (DescribeVpnGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

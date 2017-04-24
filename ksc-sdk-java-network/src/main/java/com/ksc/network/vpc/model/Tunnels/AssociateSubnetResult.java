
package com.ksc.network.vpc.model.Tunnels;

import java.io.Serializable;

import com.ksc.network.vpc.model.Nat.ModifyNatResult;
import com.ksc.network.vpc.model.Nat.NatIp;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DeleteSubnet.
 * </p>
 */
@ToString
public class AssociateSubnetResult implements Serializable, Cloneable {

	
	private String RequestId;

	private String TunnelId;

	private com.ksc.internal.SdkInternalList<AssociateSubnet> AssociateSubnetSet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public String getTunnelId() {
		return TunnelId;
	}

	public void setTunnelId(String tunnelId) {
		TunnelId = tunnelId;
	}

    public java.util.List<AssociateSubnet> getAssociateSubnetSet() {
        if (AssociateSubnetSet == null) {
            AssociateSubnetSet = new com.ksc.internal.SdkInternalList<AssociateSubnet>();
        }
        return AssociateSubnetSet;
    }


    public void setAssociateSubnetSet(java.util.Collection<AssociateSubnet> associateSubnet) {
        if (associateSubnet == null) {
            this.AssociateSubnetSet = null;
            return;
        }

        this.AssociateSubnetSet = new com.ksc.internal.SdkInternalList<AssociateSubnet>(associateSubnet);
    }

    public AssociateSubnetResult withAssociateSubnetSet(AssociateSubnet... associateSubnet) {
        if (this.AssociateSubnetSet == null) {
            setAssociateSubnetSet(new com.ksc.internal.SdkInternalList<AssociateSubnet>(associateSubnet.length));
        }
        for (AssociateSubnet ele : associateSubnet) {
            this.AssociateSubnetSet.add(ele);
        }
        return this;
    }

    public AssociateSubnetResult withAssociateSubnetSet(java.util.Collection<AssociateSubnet> associateSubnet) {
        setAssociateSubnetSet(associateSubnet);
        return this;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AssociateSubnetResult that = (AssociateSubnetResult) o;

		if (!RequestId.equals(that.RequestId)) return false;
		if (!TunnelId.equals(that.TunnelId)) return false;
		return AssociateSubnetSet.equals(that.AssociateSubnetSet);
	}

	@Override
	public int hashCode() {
		int result = RequestId.hashCode();
		result = 31 * result + TunnelId.hashCode();
		result = 31 * result + AssociateSubnetSet.hashCode();
		return result;
	}

	@Override
    public AssociateSubnetResult clone() {
        try {
            return (AssociateSubnetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}
	
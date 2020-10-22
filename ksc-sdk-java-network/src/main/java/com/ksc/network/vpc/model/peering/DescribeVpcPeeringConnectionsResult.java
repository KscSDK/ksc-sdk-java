package com.ksc.network.vpc.model.peering;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeVpcPeeringConnections.
 * </p>
 */
@Data
public class DescribeVpcPeeringConnectionsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<VpcPeeringConnection> VpcPeeringConnectionSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeVpcPeeringConnectionsResult that = (DescribeVpcPeeringConnectionsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (VpcPeeringConnectionSet != null ? !VpcPeeringConnectionSet.equals(that.VpcPeeringConnectionSet) : that.VpcPeeringConnectionSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (VpcPeeringConnectionSet != null ? VpcPeeringConnectionSet.hashCode() : 0);
        return result;
    }

    public void addVpcPeeringConnectionSet(VpcPeeringConnection... vpcPeeringConnections) {
		if (this.VpcPeeringConnectionSet == null) {
			this.VpcPeeringConnectionSet = new SdkInternalList<VpcPeeringConnection>();
		}
		for (VpcPeeringConnection vpcPeeringConnection : vpcPeeringConnections) {
			this.VpcPeeringConnectionSet.add(vpcPeeringConnection);
		}
	}


    @Override
    public DescribeVpcPeeringConnectionsResult clone() {
        try {
            return (DescribeVpcPeeringConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

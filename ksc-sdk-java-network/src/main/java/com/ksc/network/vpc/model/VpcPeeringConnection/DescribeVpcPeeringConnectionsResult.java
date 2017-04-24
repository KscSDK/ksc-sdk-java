package com.ksc.network.vpc.model.VpcPeeringConnection;

import com.ksc.network.vpc.model.Nat.Nat;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeSecurityGroups.
 * </p>
 */
@ToString
public class DescribeVpcPeeringConnectionsResult {
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more SecurityGroups.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<VpcPeeringConnection> VpcPeeringConnectionSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

    public java.util.List<VpcPeeringConnection> getVpcPeeringConnectionSet() {
        if (VpcPeeringConnectionSet == null) {
            VpcPeeringConnectionSet = new com.ksc.internal.SdkInternalList<VpcPeeringConnection>();
        }
        return VpcPeeringConnectionSet;
    }



    public void setVpcPeeringConnectionSet(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        if (vpcPeeringConnections == null) {
            this.VpcPeeringConnectionSet = null;
            return;
        }

        this.VpcPeeringConnectionSet = new com.ksc.internal.SdkInternalList<VpcPeeringConnection>(vpcPeeringConnections);
    }

    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(VpcPeeringConnection... vpcPeeringConnections) {
        if (this.VpcPeeringConnectionSet == null) {
            setVpcPeeringConnectionSet(new com.ksc.internal.SdkInternalList<VpcPeeringConnection>(vpcPeeringConnections.length));
        }
        for (VpcPeeringConnection ele : vpcPeeringConnections) {
            this.VpcPeeringConnectionSet.add(ele);
        }
        return this;
    }


    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        setVpcPeeringConnectionSet(vpcPeeringConnections);
        return this;
    }


}
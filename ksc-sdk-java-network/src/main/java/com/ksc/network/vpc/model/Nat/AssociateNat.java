package com.ksc.network.vpc.model.Nat;

import lombok.ToString;

@ToString
public class AssociateNat {
	private String SubnetId;

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String subnetId) {
        SubnetId = subnetId;
    }
}

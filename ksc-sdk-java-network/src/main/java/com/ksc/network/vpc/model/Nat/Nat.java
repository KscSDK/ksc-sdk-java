package com.ksc.network.vpc.model.Nat;

import com.ksc.internal.SdkInternalList;
import com.ksc.network.vpc.model.NetworkAcl.NetworkAclEntry;

import lombok.ToString;

@ToString
public class Nat {
	private String CreateTime;
	
	private String VpcId;
	
	private String NatId;
	
	private String NatName;

	private String NatMode;

    private String NatType;

    private com.ksc.internal.SdkInternalList<NatIp> NatIpSet;

    private Integer NatIpNumber;

    private Integer BandWidth;

    private com.ksc.internal.SdkInternalList<AssociateNat> AssociateNatSet;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getNatId() {
        return NatId;
    }

    public void setNatId(String natId) {
        NatId = natId;
    }

    public String getNatName() {
        return NatName;
    }

    public void setNatName(String natName) {
        NatName = natName;
    }

    public String getNatMode() {
        return NatMode;
    }

    public void setNatMode(String natMode) {
        NatMode = natMode;
    }

    public String getNatType() {
        return NatType;
    }

    public void setNatType(String natType) {
        NatType = natType;
    }

    public SdkInternalList<NatIp> getNatIpSet() {
        return NatIpSet;
    }

    public void setNatIpSet(SdkInternalList<NatIp> natIpSet) {
        NatIpSet = natIpSet;
    }

    public Integer getNatIpNumber() {
        return NatIpNumber;
    }

    public void setNatIpNumber(Integer natIpNumber) {
        NatIpNumber = natIpNumber;
    }

    public Integer getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        BandWidth = bandWidth;
    }

    public SdkInternalList<AssociateNat> getAssociateNatSet() {
        return AssociateNatSet;
    }

    public void setAssociateNatSet(SdkInternalList<AssociateNat> associateNatSet) {
        AssociateNatSet = associateNatSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nat nat = (Nat) o;

        if (!CreateTime.equals(nat.CreateTime)) return false;
        if (!VpcId.equals(nat.VpcId)) return false;
        if (!NatId.equals(nat.NatId)) return false;
        if (!NatName.equals(nat.NatName)) return false;
        if (!NatMode.equals(nat.NatMode)) return false;
        if (!NatType.equals(nat.NatType)) return false;
        if (!NatIpSet.equals(nat.NatIpSet)) return false;
        if (!NatIpNumber.equals(nat.NatIpNumber)) return false;
        if (!BandWidth.equals(nat.BandWidth)) return false;
        return AssociateNatSet.equals(nat.AssociateNatSet);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + NatId.hashCode();
        result = 31 * result + NatName.hashCode();
        result = 31 * result + NatMode.hashCode();
        result = 31 * result + NatType.hashCode();
        result = 31 * result + NatIpSet.hashCode();
        result = 31 * result + NatIpNumber.hashCode();
        result = 31 * result + BandWidth.hashCode();
        result = 31 * result + AssociateNatSet.hashCode();
        return result;
    }

    public void addNatIpSet(NatIp... nats) {
		if (NatIpSet == null) {
            NatIpSet = new com.ksc.internal.SdkInternalList<NatIp>();
		}
		for (NatIp nat : nats) {
            NatIpSet.add(nat);
		}
	}

    public void addAssociateNatSet(AssociateNat... nats) {
        if (AssociateNatSet == null) {
            AssociateNatSet = new com.ksc.internal.SdkInternalList<AssociateNat>();
        }
        for (AssociateNat nat : nats) {
            AssociateNatSet.add(nat);
        }
    }

}

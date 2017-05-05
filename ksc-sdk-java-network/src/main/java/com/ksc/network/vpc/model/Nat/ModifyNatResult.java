package com.ksc.network.vpc.model.Nat;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of CreateSubnet.
 * </p>
 */
@ToString
public class ModifyNatResult implements Serializable, Cloneable {


    private String CreateTime;

    private String VpcId;

    private Integer BandWidth;

    private Integer NatIpNumber;

    private String NatMode;

    private String NatName;

    private com.ksc.internal.SdkInternalList<NatIp> NatIpSet;

    private String RequestId;

    private String NatType;

    private String NatId;

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

    public Integer getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        BandWidth = bandWidth;
    }

    public Integer getNatIpNumber() {
        return NatIpNumber;
    }

    public void setNatIpNumber(Integer natIpNumber) {
        NatIpNumber = natIpNumber;
    }

    public String getNatMode() {
        return NatMode;
    }

    public void setNatMode(String natMode) {
        NatMode = natMode;
    }

    public String getNatName() {
        return NatName;
    }

    public void setNatName(String natName) {
        NatName = natName;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getNatType() {
        return NatType;
    }

    public void setNatType(String natType) {
        NatType = natType;
    }

    public String getNatId() {
        return NatId;
    }

    public void setNatId(String natId) {
        NatId = natId;
    }

    public java.util.List<NatIp> getNatIpSet() {
        if (NatIpSet == null) {
            NatIpSet = new com.ksc.internal.SdkInternalList<NatIp>();
        }
        return NatIpSet;
    }


    public void setNatIpSet(java.util.Collection<NatIp> natIp) {
        if (natIp == null) {
            this.NatIpSet = null;
            return;
        }

        this.NatIpSet = new com.ksc.internal.SdkInternalList<NatIp>(natIp);
    }

    public ModifyNatResult withNatIpSet(NatIp... natIp) {
        if (this.NatIpSet == null) {
            setNatIpSet(new com.ksc.internal.SdkInternalList<NatIp>(natIp.length));
        }
        for (NatIp ele : natIp) {
            this.NatIpSet.add(ele);
        }
        return this;
    }

    public ModifyNatResult withNatIpSet(java.util.Collection<NatIp> natIp) {
        setNatIpSet(natIp);
        return this;
    }

    public java.util.List<AssociateNat> getAssociateNatSet() {
        if (AssociateNatSet == null) {
            AssociateNatSet = new com.ksc.internal.SdkInternalList<AssociateNat>();
        }
        return AssociateNatSet;
    }


    public void setAssociateNatSet(java.util.Collection<AssociateNat> associateNat) {
        if (associateNat == null) {
            this.AssociateNatSet = null;
            return;
        }

        this.AssociateNatSet = new com.ksc.internal.SdkInternalList<AssociateNat>(associateNat);
    }

    public ModifyNatResult withAssociateNatSet(AssociateNat... associateNat) {
        if (this.AssociateNatSet == null) {
            setAssociateNatSet(new com.ksc.internal.SdkInternalList<AssociateNat>(associateNat.length));
        }
        for (AssociateNat ele : associateNat) {
            this.AssociateNatSet.add(ele);
        }
        return this;
    }

    public ModifyNatResult withAssociateNatSet(java.util.Collection<AssociateNat> associateNat) {
        setAssociateNatSet(associateNat);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyNatResult that = (ModifyNatResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (!BandWidth.equals(that.BandWidth)) return false;
        if (!NatIpNumber.equals(that.NatIpNumber)) return false;
        if (!NatMode.equals(that.NatMode)) return false;
        if (!NatName.equals(that.NatName)) return false;
        if (!NatIpSet.equals(that.NatIpSet)) return false;
        if (!RequestId.equals(that.RequestId)) return false;
        if (!NatType.equals(that.NatType)) return false;
        if (!NatId.equals(that.NatId)) return false;
        return AssociateNatSet.equals(that.AssociateNatSet);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + BandWidth.hashCode();
        result = 31 * result + NatIpNumber.hashCode();
        result = 31 * result + NatMode.hashCode();
        result = 31 * result + NatName.hashCode();
        result = 31 * result + NatIpSet.hashCode();
        result = 31 * result + RequestId.hashCode();
        result = 31 * result + NatType.hashCode();
        result = 31 * result + NatId.hashCode();
        result = 31 * result + AssociateNatSet.hashCode();
        return result;

    }

    @Override
    public ModifyNatResult clone() {
        try {
            return (ModifyNatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }	
}
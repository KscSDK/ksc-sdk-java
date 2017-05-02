package com.ksc.network.vpc.model.Nat;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateSubnet.
 * </p>
 */
@ToString
public class CreateNatResult implements Serializable, Cloneable {


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

    private String RequestId;

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

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
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

    public CreateNatResult withNatIpSet(NatIp... natIp) {
        if (this.NatIpSet == null) {
            setNatIpSet(new com.ksc.internal.SdkInternalList<NatIp>(natIp.length));
        }
        for (NatIp ele : natIp) {
            this.NatIpSet.add(ele);
        }
        return this;
    }

    public CreateNatResult withNatIpSet(java.util.Collection<NatIp> natIp) {
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

    public CreateNatResult withAssociateNatSet(AssociateNat... associateNat) {
        if (this.AssociateNatSet == null) {
            setAssociateNatSet(new com.ksc.internal.SdkInternalList<AssociateNat>(associateNat.length));
        }
        for (AssociateNat ele : associateNat) {
            this.AssociateNatSet.add(ele);
        }
        return this;
    }

    public CreateNatResult withAssociateNatSet(java.util.Collection<AssociateNat> associateNat) {
        setAssociateNatSet(associateNat);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateNatResult that = (CreateNatResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (NatId != null ? !NatId.equals(that.NatId) : that.NatId != null) return false;
        if (!NatName.equals(that.NatName)) return false;
        if (!NatMode.equals(that.NatMode)) return false;
        if (!NatType.equals(that.NatType)) return false;
        if (!NatIpSet.equals(that.NatIpSet)) return false;
        if (!NatIpNumber.equals(that.NatIpNumber)) return false;
        if (!BandWidth.equals(that.BandWidth)) return false;
        if (!AssociateNatSet.equals(that.AssociateNatSet)) return false;
        return RequestId.equals(that.RequestId);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + (NatId != null ? NatId.hashCode() : 0);
        result = 31 * result + NatName.hashCode();
        result = 31 * result + NatMode.hashCode();
        result = 31 * result + NatType.hashCode();
        result = 31 * result + NatIpSet.hashCode();
        result = 31 * result + NatIpNumber.hashCode();
        result = 31 * result + BandWidth.hashCode();
        result = 31 * result + AssociateNatSet.hashCode();
        result = 31 * result + RequestId.hashCode();
        return result;
    }

    @Override
    public CreateNatResult clone() {
        try {
            return (CreateNatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }	
}
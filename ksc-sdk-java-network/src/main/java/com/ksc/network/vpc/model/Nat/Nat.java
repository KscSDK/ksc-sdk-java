package com.ksc.network.vpc.model.Nat;

import com.ksc.internal.SdkInternalList;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Nat {
    /**
     * VPC创建时间
     */
    private String CreateTime;

    /**
     * Vpc的ID
     */
    private String VpcId;

    /**
     * Nat的ID
     */
    private String NatId;

    /**
     * Nat的名称
     */
    private String NatName;

    /**
     * Nat的作用范围，VPC(Vpc)是指NAT对整个VPC有效，子网(subnet)是指NAT对关联的子网有效
     */
    private String NatMode;

    /**
     * Nat的类型
     */
    private String NatType;

    /**
     * Nat的IP
     */
    private com.ksc.internal.SdkInternalList<NatIp> NatIpSet;

    /**
     * Nat的IP数量
     */
    private Integer NatIpNumber;

    /**
     * Nat的带宽
     */
    private Integer BandWidth;

    /**
     * Nat关联的子网信息
     */
    private SdkInternalList<AssociateNat> AssociateNatSet;
    /**
     * 项目的ID
     */
    private String ProjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Nat nat = (Nat) o;

        if (CreateTime != null ? !CreateTime.equals(nat.CreateTime) : nat.CreateTime != null) return false;
        if (VpcId != null ? !VpcId.equals(nat.VpcId) : nat.VpcId != null) return false;
        if (NatId != null ? !NatId.equals(nat.NatId) : nat.NatId != null) return false;
        if (NatName != null ? !NatName.equals(nat.NatName) : nat.NatName != null) return false;
        if (NatMode != null ? !NatMode.equals(nat.NatMode) : nat.NatMode != null) return false;
        if (NatType != null ? !NatType.equals(nat.NatType) : nat.NatType != null) return false;
        if (NatIpSet != null ? !NatIpSet.equals(nat.NatIpSet) : nat.NatIpSet != null) return false;
        if (NatIpNumber != null ? !NatIpNumber.equals(nat.NatIpNumber) : nat.NatIpNumber != null) return false;
        if (BandWidth != null ? !BandWidth.equals(nat.BandWidth) : nat.BandWidth != null) return false;
        if (AssociateNatSet != null ? !AssociateNatSet.equals(nat.AssociateNatSet) : nat.AssociateNatSet != null)
            return false;
        return ProjectId != null ? ProjectId.equals(nat.ProjectId) : nat.ProjectId == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (CreateTime != null ? CreateTime.hashCode() : 0);
        result = 31 * result + (VpcId != null ? VpcId.hashCode() : 0);
        result = 31 * result + (NatId != null ? NatId.hashCode() : 0);
        result = 31 * result + (NatName != null ? NatName.hashCode() : 0);
        result = 31 * result + (NatMode != null ? NatMode.hashCode() : 0);
        result = 31 * result + (NatType != null ? NatType.hashCode() : 0);
        result = 31 * result + (NatIpSet != null ? NatIpSet.hashCode() : 0);
        result = 31 * result + (NatIpNumber != null ? NatIpNumber.hashCode() : 0);
        result = 31 * result + (BandWidth != null ? BandWidth.hashCode() : 0);
        result = 31 * result + (AssociateNatSet != null ? AssociateNatSet.hashCode() : 0);
        result = 31 * result + (ProjectId != null ? ProjectId.hashCode() : 0);
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

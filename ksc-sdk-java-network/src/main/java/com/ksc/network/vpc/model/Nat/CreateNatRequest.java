package com.ksc.network.vpc.model.Nat;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.CreateNatRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateNat.
 * </p>
 */
public class CreateNatRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateNatRequest> {

    /**
     * Vpc的ID
     */
    private String VpcId;
    /**
     * Nat的名称
     */
    private String NatName;
    /**
     * Nat的映射范围
     */
    private String NatMode;
    /**
     * Nat的类型，public类型产生订单，private不产生订单
     */
    private String NatType;
    /**
     * Nat的IP数量
     */
    private Integer NatIpNumber;
    /**
     * Nat的带宽
     */
    private Integer BandWidth;
    /**
     * NAT的计费类型，NAT类型为public时不可缺省，NAT类型为private时可缺省，包年包月Monthly，按日月结Daily，按峰值月结Peak
     */
    private String ChargeType;
    /**
     * 包年包月类型NAT的购买时长，只有NAT类型为public并且计费类型为包年包月时不可缺省。单位：月。
     */
    private Integer PurchaseTime;

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
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

    public String getChargeType() {
        return ChargeType;
    }

    public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public Integer getPurchaseTime() {
        return PurchaseTime;
    }

    public void setPurchaseTime(Integer purchaseTime) {
        PurchaseTime = purchaseTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateNatRequest that = (CreateNatRequest) o;

        if (!VpcId.equals(that.VpcId)) return false;
        if (!NatName.equals(that.NatName)) return false;
        if (!NatMode.equals(that.NatMode)) return false;
        if (!NatType.equals(that.NatType)) return false;
        if (!NatIpNumber.equals(that.NatIpNumber)) return false;
        if (!BandWidth.equals(that.BandWidth)) return false;
        if (!ChargeType.equals(that.ChargeType)) return false;
        return PurchaseTime.equals(that.PurchaseTime);
    }

    @Override
    public int hashCode() {
        int result = VpcId.hashCode();
        result = 31 * result + NatName.hashCode();
        result = 31 * result + NatMode.hashCode();
        result = 31 * result + NatType.hashCode();
        result = 31 * result + NatIpNumber.hashCode();
        result = 31 * result + BandWidth.hashCode();
        result = 31 * result + ChargeType.hashCode();
        result = 31 * result + PurchaseTime.hashCode();
        return result;
    }

    @Override
    public CreateNatRequest clone() {
        return (CreateNatRequest) super.clone();
    }

    @Override
    public Request<CreateNatRequest> getDryRunRequest() {
        Request<CreateNatRequest> request = new CreateNatRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}
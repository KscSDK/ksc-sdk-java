package com.ksc.network.vpc.model.Nat;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.Nat.CreateNatRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateNat.
 * </p>
 */
@Data
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
    /**
     * 项目的ID
     */
    private String projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateNatRequest that = (CreateNatRequest) o;

        if (VpcId != null ? !VpcId.equals(that.VpcId) : that.VpcId != null) return false;
        if (NatName != null ? !NatName.equals(that.NatName) : that.NatName != null) return false;
        if (NatMode != null ? !NatMode.equals(that.NatMode) : that.NatMode != null) return false;
        if (NatType != null ? !NatType.equals(that.NatType) : that.NatType != null) return false;
        if (NatIpNumber != null ? !NatIpNumber.equals(that.NatIpNumber) : that.NatIpNumber != null) return false;
        if (BandWidth != null ? !BandWidth.equals(that.BandWidth) : that.BandWidth != null) return false;
        if (ChargeType != null ? !ChargeType.equals(that.ChargeType) : that.ChargeType != null) return false;
        if (PurchaseTime != null ? !PurchaseTime.equals(that.PurchaseTime) : that.PurchaseTime != null) return false;
        return projectId != null ? projectId.equals(that.projectId) : that.projectId == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (VpcId != null ? VpcId.hashCode() : 0);
        result = 31 * result + (NatName != null ? NatName.hashCode() : 0);
        result = 31 * result + (NatMode != null ? NatMode.hashCode() : 0);
        result = 31 * result + (NatType != null ? NatType.hashCode() : 0);
        result = 31 * result + (NatIpNumber != null ? NatIpNumber.hashCode() : 0);
        result = 31 * result + (BandWidth != null ? BandWidth.hashCode() : 0);
        result = 31 * result + (ChargeType != null ? ChargeType.hashCode() : 0);
        result = 31 * result + (PurchaseTime != null ? PurchaseTime.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
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
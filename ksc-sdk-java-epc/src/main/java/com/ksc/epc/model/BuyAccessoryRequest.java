package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.BuyAccessoryRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for BuyAccessory.
 * </p>
 */
@Data
public class BuyAccessoryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<BuyAccessoryRequest> {

    /**
     * 配件类型
     */
    private String accessoryType;
    /**
     * 配件规格
     */
    private String accessorySuit;
    /**
     * 配件名称
     */
    private String accessoryName;
    /**
     * 计费类型
     */
    private String chargeType;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 购买时长
     */
    private Integer purchaseTime;
    /**
     * 项目ID
     */
    private String projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BuyAccessoryRequest that = (BuyAccessoryRequest) o;
        if (accessoryType != null ? !accessoryType.equals(that.accessoryType) : that.accessoryType != null)
            return false;
        if (accessorySuit != null ? !accessorySuit.equals(that.accessorySuit) : that.accessorySuit != null)
            return false;
        if (accessoryName != null ? !accessoryName.equals(that.accessoryName) : that.accessoryName != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (accessoryType != null ? accessoryType.hashCode() : 0);
        result = 31 * result + (accessorySuit != null ? accessorySuit.hashCode() : 0);
        result = 31 * result + (accessoryName != null ? accessoryName.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<BuyAccessoryRequest> getDryRunRequest() {
        Request<BuyAccessoryRequest> request = new BuyAccessoryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public BuyAccessoryRequest clone() {
        return (BuyAccessoryRequest) super.clone();
    }
}


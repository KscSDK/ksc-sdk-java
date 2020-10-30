package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateCabinetRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateCabinet.
 * </p>
 */
@Data
public class CreateCabinetRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateCabinetRequest> {

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
     * 机柜类型
     */
    private String cabinetType;
    /**
     * 项目ID
     */
    private String projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateCabinetRequest that = (CreateCabinetRequest) o;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (cabinetType != null ? !cabinetType.equals(that.cabinetType) : that.cabinetType != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (cabinetType != null ? cabinetType.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateCabinetRequest> getDryRunRequest() {
        Request<CreateCabinetRequest> request = new CreateCabinetRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateCabinetRequest clone() {
        return (CreateCabinetRequest) super.clone();
    }
}


package com.ksc.network.bws.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.bws.model.transform.CreateBandWidthShareRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateBandWidthShare.
 * </p>
 */
@Data
public class CreateBandWidthShareRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateBandWidthShareRequest> {

    /**
     * 共享带宽的链路类型的ID
     */
    private String lineId;
    /**
     * 共享带宽的名称
     */
    private String bandWidthShareName;
    /**
     * 共享带宽的带宽
     */
    private Integer bandWidth;
    /**
     * 项目的ID
     */
    private String projectId;
    /**
     * 共享带宽的计费类型
     */
    private String chargeType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateBandWidthShareRequest that = (CreateBandWidthShareRequest) o;
        if (lineId != null ? !lineId.equals(that.lineId) : that.lineId != null)
            return false;
        if (bandWidthShareName != null ? !bandWidthShareName.equals(that.bandWidthShareName) : that.bandWidthShareName != null)
            return false;
        if (bandWidth != null ? !bandWidth.equals(that.bandWidth) : that.bandWidth != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lineId != null ? lineId.hashCode() : 0);
        result = 31 * result + (bandWidthShareName != null ? bandWidthShareName.hashCode() : 0);
        result = 31 * result + (bandWidth != null ? bandWidth.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateBandWidthShareRequest> getDryRunRequest() {
        Request<CreateBandWidthShareRequest> request = new CreateBandWidthShareRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateBandWidthShareRequest clone() {
        return (CreateBandWidthShareRequest) super.clone();
    }
}


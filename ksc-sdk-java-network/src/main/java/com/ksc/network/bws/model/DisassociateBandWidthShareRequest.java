package com.ksc.network.bws.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.bws.model.transform.DisassociateBandWidthShareRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DisassociateBandWidthShare.
 * </p>
 */
@Data
public class DisassociateBandWidthShareRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DisassociateBandWidthShareRequest> {

    /**
     * 共享带宽的ID
     */
    private String bandWidthShareId;
    /**
     * 弹性IP的ID
     */
    private String allocationId;
    /**
     * 弹性IP的带宽
     */
    private Integer bandWidth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DisassociateBandWidthShareRequest that = (DisassociateBandWidthShareRequest) o;
        if (bandWidthShareId != null ? !bandWidthShareId.equals(that.bandWidthShareId) : that.bandWidthShareId != null)
            return false;
        if (allocationId != null ? !allocationId.equals(that.allocationId) : that.allocationId != null)
            return false;
        if (bandWidth != null ? !bandWidth.equals(that.bandWidth) : that.bandWidth != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bandWidthShareId != null ? bandWidthShareId.hashCode() : 0);
        result = 31 * result + (allocationId != null ? allocationId.hashCode() : 0);
        result = 31 * result + (bandWidth != null ? bandWidth.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DisassociateBandWidthShareRequest> getDryRunRequest() {
        Request<DisassociateBandWidthShareRequest> request = new DisassociateBandWidthShareRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DisassociateBandWidthShareRequest clone() {
        return (DisassociateBandWidthShareRequest) super.clone();
    }
}


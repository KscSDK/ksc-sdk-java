package com.ksc.network.bws.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.bws.model.transform.AssociateBandWidthShareRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for AssociateBandWidthShare.
 * </p>
 */
@Data
public class AssociateBandWidthShareRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AssociateBandWidthShareRequest> {

    /**
     * 共享带宽的ID
     */
    private String bandWidthShareId;
    /**
     * 弹性IP的ID
     */
    private String allocationId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AssociateBandWidthShareRequest that = (AssociateBandWidthShareRequest) o;
        if (bandWidthShareId != null ? !bandWidthShareId.equals(that.bandWidthShareId) : that.bandWidthShareId != null)
            return false;
        if (allocationId != null ? !allocationId.equals(that.allocationId) : that.allocationId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bandWidthShareId != null ? bandWidthShareId.hashCode() : 0);
        result = 31 * result + (allocationId != null ? allocationId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<AssociateBandWidthShareRequest> getDryRunRequest() {
        Request<AssociateBandWidthShareRequest> request = new AssociateBandWidthShareRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public AssociateBandWidthShareRequest clone() {
        return (AssociateBandWidthShareRequest) super.clone();
    }
}


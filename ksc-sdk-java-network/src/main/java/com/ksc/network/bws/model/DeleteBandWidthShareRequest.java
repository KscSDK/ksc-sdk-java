package com.ksc.network.bws.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.bws.model.transform.DeleteBandWidthShareRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteBandWidthShare.
 * </p>
 */
@Data
public class DeleteBandWidthShareRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteBandWidthShareRequest> {

    /**
     * 共享带宽的ID
     */
    private String bandWidthShareId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteBandWidthShareRequest that = (DeleteBandWidthShareRequest) o;
        if (bandWidthShareId != null ? !bandWidthShareId.equals(that.bandWidthShareId) : that.bandWidthShareId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bandWidthShareId != null ? bandWidthShareId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteBandWidthShareRequest> getDryRunRequest() {
        Request<DeleteBandWidthShareRequest> request = new DeleteBandWidthShareRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteBandWidthShareRequest clone() {
        return (DeleteBandWidthShareRequest) super.clone();
    }
}


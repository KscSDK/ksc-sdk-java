package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DeleteAccessoryRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteAccessory.
 * </p>
 */
@Data
public class DeleteAccessoryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteAccessoryRequest> {

    /**
     * 实例ID
     */
    private String accessoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteAccessoryRequest that = (DeleteAccessoryRequest) o;
        if (accessoryId != null ? !accessoryId.equals(that.accessoryId) : that.accessoryId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (accessoryId != null ? accessoryId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteAccessoryRequest> getDryRunRequest() {
        Request<DeleteAccessoryRequest> request = new DeleteAccessoryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteAccessoryRequest clone() {
        return (DeleteAccessoryRequest) super.clone();
    }
}


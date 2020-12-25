package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteHostHeaderRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteHostHeader.
 * </p>
 */
@Data
public class DeleteHostHeaderRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteHostHeaderRequest> {

    /**
     * 域名的ID
     */
    private String HostHeaderId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteHostHeaderRequest that = (DeleteHostHeaderRequest) o;

        if (HostHeaderId != null ? !HostHeaderId.equals(that.HostHeaderId) : that.HostHeaderId != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (HostHeaderId != null ? HostHeaderId.hashCode() : 0);
        return result;
    }

    @Override
    public Request<DeleteHostHeaderRequest> getDryRunRequest() {
        Request<DeleteHostHeaderRequest> request = new DeleteHostHeaderRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteHostHeaderRequest clone() {
        return (DeleteHostHeaderRequest) super.clone();
    }
}


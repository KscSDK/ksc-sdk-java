package com.ksc.network.dns.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.dns.model.transform.DeleteHostedZoneRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteHostedZone.
 * </p>
 */
@Data
public class DeleteHostedZoneRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteHostedZoneRequest> {

    /**
     * 域名的ID
     */
    private String hostedZoneId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteHostedZoneRequest that = (DeleteHostedZoneRequest) o;
        if (hostedZoneId != null ? !hostedZoneId.equals(that.hostedZoneId) : that.hostedZoneId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostedZoneId != null ? hostedZoneId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteHostedZoneRequest> getDryRunRequest() {
        Request<DeleteHostedZoneRequest> request = new DeleteHostedZoneRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteHostedZoneRequest clone() {
        return (DeleteHostedZoneRequest) super.clone();
    }
}


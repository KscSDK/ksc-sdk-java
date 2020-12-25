package com.ksc.network.dns.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.dns.model.transform.CreateHostedZoneRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateHostedZone.
 * </p>
 */
@Data
public class CreateHostedZoneRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateHostedZoneRequest> {

    /**
     * 域名的名称
     */
    private String hostedZoneName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateHostedZoneRequest that = (CreateHostedZoneRequest) o;
        if (hostedZoneName != null ? !hostedZoneName.equals(that.hostedZoneName) : that.hostedZoneName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostedZoneName != null ? hostedZoneName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<CreateHostedZoneRequest> getDryRunRequest() {
        Request<CreateHostedZoneRequest> request = new CreateHostedZoneRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateHostedZoneRequest clone() {
        return (CreateHostedZoneRequest) super.clone();
    }
}


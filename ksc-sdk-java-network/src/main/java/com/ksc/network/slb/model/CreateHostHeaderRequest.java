package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.CreateHostHeaderRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateHostHeader.
 * </p>
 */
@Data
public class CreateHostHeaderRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateHostHeaderRequest> {

    private String ListenerId;
    private String HostHeader;
    private String CertificateId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateHostHeaderRequest that = (CreateHostHeaderRequest) o;

        if (ListenerId != null ? !ListenerId.equals(that.ListenerId) : that.ListenerId != null) return false;
        if (HostHeader != null ? !HostHeader.equals(that.HostHeader) : that.HostHeader != null) return false;
        if (CertificateId != null ? !CertificateId.equals(that.CertificateId) : that.CertificateId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (ListenerId != null ? ListenerId.hashCode() : 0);
        result = 31 * result + (HostHeader != null ? HostHeader.hashCode() : 0);
        result = 31 * result + (CertificateId != null ? CertificateId.hashCode() : 0);
        return result;
    }

    @Override
    public Request<CreateHostHeaderRequest> getDryRunRequest() {
        Request<CreateHostHeaderRequest> request = new CreateHostHeaderRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateHostHeaderRequest clone() {
        return (CreateHostHeaderRequest) super.clone();
    }
}


package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.ModifyHostHeaderRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyHostHeader.
 * </p>
 */
@Data
public class ModifyHostHeaderRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyHostHeaderRequest> {

    /**
     * 域名的ID
     */
    private String HostHeaderId;
    /**
     * 证书ID
     */
    private String CertificateId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyHostHeaderRequest that = (ModifyHostHeaderRequest) o;

        if (HostHeaderId != null ? !HostHeaderId.equals(that.HostHeaderId) : that.HostHeaderId != null) return false;
        if (CertificateId != null ? !CertificateId.equals(that.CertificateId) : that.CertificateId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (HostHeaderId != null ? HostHeaderId.hashCode() : 0);
        result = 31 * result + (CertificateId != null ? CertificateId.hashCode() : 0);
        return result;
    }

    @Override
    public Request<ModifyHostHeaderRequest> getDryRunRequest() {
        Request<ModifyHostHeaderRequest> request = new ModifyHostHeaderRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyHostHeaderRequest clone() {
        return (ModifyHostHeaderRequest) super.clone();
    }
}


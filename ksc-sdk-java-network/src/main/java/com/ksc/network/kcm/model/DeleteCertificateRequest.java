package com.ksc.network.kcm.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Data;

import java.io.Serializable;

@Data
public class DeleteCertificateRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteCertificateRequest> {
    /**
     * 证书ID
     */
    private String CertificateId;

    @Override
    public Request<DeleteCertificateRequest> getDryRunRequest() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteCertificateRequest that = (DeleteCertificateRequest) o;

        return CertificateId != null ? CertificateId.equals(that.CertificateId) : that.CertificateId == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (CertificateId != null ? CertificateId.hashCode() : 0);
        return result;
    }
}

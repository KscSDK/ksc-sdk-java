package com.ksc.network.kcm.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import lombok.Data;

import java.io.Serializable;

@Data
public class ModifyCertificateRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyCertificateRequest> {

    /**
     * 证书ID
     */
    private String CertificateId;

    /**
     * 证书名称
     */
    private String CertificateName;

    @Override
    public Request<ModifyCertificateRequest> getDryRunRequest() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyCertificateRequest that = (ModifyCertificateRequest) o;

        if (CertificateId != null ? !CertificateId.equals(that.CertificateId) : that.CertificateId != null)
            return false;
        return CertificateName != null ? CertificateName.equals(that.CertificateName) : that.CertificateName == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (CertificateId != null ? CertificateId.hashCode() : 0);
        result = 31 * result + (CertificateName != null ? CertificateName.hashCode() : 0);
        return result;
    }
}

package com.ksc.network.kcm.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.kcm.model.transform.CreateCertificateRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateCertificate.
 * </p>
 */
@Data
public class CreateCertificateRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateCertificateRequest> {
    /**
     * 证书的名称
     */
    private String CertificateName;
    /**
     * 证书的私钥
     */
    private String PrivateKey;
    /**
     * 证书的公钥
     */
    private String PublicKey;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateCertificateRequest that = (CreateCertificateRequest) o;

        if (CertificateName != null ? !CertificateName.equals(that.CertificateName) : that.CertificateName != null)
            return false;
        if (PrivateKey != null ? !PrivateKey.equals(that.PrivateKey) : that.PrivateKey != null) return false;
        return PublicKey != null ? PublicKey.equals(that.PublicKey) : that.PublicKey == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (CertificateName != null ? CertificateName.hashCode() : 0);
        result = 31 * result + (PrivateKey != null ? PrivateKey.hashCode() : 0);
        result = 31 * result + (PublicKey != null ? PublicKey.hashCode() : 0);
        return result;
    }

    @Override
    public Request<CreateCertificateRequest> getDryRunRequest() {
        Request<CreateCertificateRequest> request = new CreateCertificateRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateCertificateRequest clone() {
        return (CreateCertificateRequest) super.clone();
    }
}


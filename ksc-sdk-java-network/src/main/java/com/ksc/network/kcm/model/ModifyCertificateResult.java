package com.ksc.network.kcm.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ModifyCertificateResult implements Serializable, Cloneable {

    private String RequestId;

    private String CreateTime;

    private String CertificateName;

    private String CertificateId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyCertificateResult that = (ModifyCertificateResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CreateTime != null ? !CreateTime.equals(that.CreateTime) : that.CreateTime != null) return false;
        if (CertificateName != null ? !CertificateName.equals(that.CertificateName) : that.CertificateName != null)
            return false;
        return CertificateId != null ? CertificateId.equals(that.CertificateId) : that.CertificateId == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CreateTime != null ? CreateTime.hashCode() : 0);
        result = 31 * result + (CertificateName != null ? CertificateName.hashCode() : 0);
        result = 31 * result + (CertificateId != null ? CertificateId.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyCertificateResult clone() {
        try {
            return (ModifyCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

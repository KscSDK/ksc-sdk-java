package com.ksc.network.kcm.model;

import com.ksc.internal.SdkInternalList;
import lombok.Data;

import java.io.Serializable;

@Data
public class DescribeCertificatesResult implements Serializable, Cloneable {

    private static final long serialVersionUID = -1152397641363296840L;

    private String RequestId;

    /**
     * <p>
     * 证书信息
     * </p>
     */
    private SdkInternalList<Certificate> CertificateSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeCertificatesResult that = (DescribeCertificatesResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        return CertificateSet != null ? CertificateSet.equals(that.CertificateSet) : that.CertificateSet == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CertificateSet != null ? CertificateSet.hashCode() : 0);
        return result;
    }

    @Override
    public DescribeCertificatesResult clone() {
        try {
            return (DescribeCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    public void addCertificateSet(Certificate... certificates) {
        if (this.CertificateSet == null) {
            this.CertificateSet = new SdkInternalList<Certificate>();
        }
        for (Certificate certificate : certificates) {
            this.CertificateSet.add(certificate);
        }
    }
}

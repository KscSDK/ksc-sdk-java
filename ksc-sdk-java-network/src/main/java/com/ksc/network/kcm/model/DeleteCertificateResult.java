package com.ksc.network.kcm.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeleteCertificateResult implements Serializable, Cloneable {

    /**
     * 请求ID
     */
    private String RequestId;

    /**
     * 操作是否成功
     */
    private Boolean Return;

    @Override
    public DeleteCertificateResult clone() {
        try {
            return (DeleteCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteCertificateResult that = (DeleteCertificateResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        return Return != null ? Return.equals(that.Return) : that.Return == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Return != null ? Return.hashCode() : 0);
        return result;
    }
}

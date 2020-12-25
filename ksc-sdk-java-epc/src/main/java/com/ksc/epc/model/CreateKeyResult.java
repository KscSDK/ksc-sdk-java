package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateKey.
 * </p>
 */
@Data
public class CreateKeyResult implements Serializable, Cloneable {

    private String RequestId;
    private String PrivateKey;
    private Key Key;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateKeyResult that = (CreateKeyResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (PrivateKey != null ? !PrivateKey.equals(that.PrivateKey) : that.PrivateKey != null) return false;
        if (Key != null ? !Key.equals(that.Key) : that.Key != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (PrivateKey != null ? PrivateKey.hashCode() : 0);
        result = 31 * result + (Key != null ? Key.hashCode() : 0);
        return result;
    }


    @Override
    public CreateKeyResult clone() {
        try {
            return (CreateKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ImportKey.
 * </p>
 */
@Data
public class ImportKeyResult implements Serializable, Cloneable {

    private String RequestId;
    private Key Key;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ImportKeyResult that = (ImportKeyResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Key != null ? !Key.equals(that.Key) : that.Key != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Key != null ? Key.hashCode() : 0);
        return result;
    }


    @Override
    public ImportKeyResult clone() {
        try {
            return (ImportKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

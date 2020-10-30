package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateEpc.
 * </p>
 */
@Data
public class CreateEpcResult implements Serializable, Cloneable {

    private String RequestId;
    private Host Host;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateEpcResult that = (CreateEpcResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Host != null ? !Host.equals(that.Host) : that.Host != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Host != null ? Host.hashCode() : 0);
        return result;
    }


    @Override
    public CreateEpcResult clone() {
        try {
            return (CreateEpcResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

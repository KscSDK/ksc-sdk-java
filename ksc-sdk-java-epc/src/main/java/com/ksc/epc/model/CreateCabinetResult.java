package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateCabinet.
 * </p>
 */
@Data
public class CreateCabinetResult implements Serializable, Cloneable {

    private String RequestId;
    private String CabinetId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateCabinetResult that = (CreateCabinetResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CabinetId != null ? !CabinetId.equals(that.CabinetId) : that.CabinetId != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CabinetId != null ? CabinetId.hashCode() : 0);
        return result;
    }


    @Override
    public CreateCabinetResult clone() {
        try {
            return (CreateCabinetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

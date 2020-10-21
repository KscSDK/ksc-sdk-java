package com.ksc.network.bws.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DeleteBandWidthShare.
 * </p>
 */
@Data
public class DeleteBandWidthShareResult implements Serializable, Cloneable {

    private String RequestId;
    private String Return;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteBandWidthShareResult that = (DeleteBandWidthShareResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Return != null ? !Return.equals(that.Return) : that.Return != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Return != null ? Return.hashCode() : 0);
        return result;
    }


    @Override
    public DeleteBandWidthShareResult clone() {
        try {
            return (DeleteBandWidthShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

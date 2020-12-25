package com.ksc.network.bws.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateBandWidthShare.
 * </p>
 */
@Data
public class CreateBandWidthShareResult implements Serializable, Cloneable {

    private String RequestId;
    private String BandWidthShareId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateBandWidthShareResult that = (CreateBandWidthShareResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BandWidthShareId != null ? !BandWidthShareId.equals(that.BandWidthShareId) : that.BandWidthShareId != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BandWidthShareId != null ? BandWidthShareId.hashCode() : 0);
        return result;
    }


    @Override
    public CreateBandWidthShareResult clone() {
        try {
            return (CreateBandWidthShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

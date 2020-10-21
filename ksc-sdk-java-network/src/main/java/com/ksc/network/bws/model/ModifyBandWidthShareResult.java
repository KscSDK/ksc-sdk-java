package com.ksc.network.bws.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyBandWidthShare.
 * </p>
 */
@Data
public class ModifyBandWidthShareResult implements Serializable, Cloneable {

    private String RequestId;
    private BandWidthShare BandWidthShare;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyBandWidthShareResult that = (ModifyBandWidthShareResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BandWidthShare != null ? !BandWidthShare.equals(that.BandWidthShare) : that.BandWidthShare != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BandWidthShare != null ? BandWidthShare.hashCode() : 0);
        return result;
    }


    @Override
    public ModifyBandWidthShareResult clone() {
        try {
            return (ModifyBandWidthShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

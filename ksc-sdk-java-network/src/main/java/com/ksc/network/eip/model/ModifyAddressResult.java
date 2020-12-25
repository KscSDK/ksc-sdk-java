package com.ksc.network.eip.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyAddress.
 * </p>
 */
@Data
public class ModifyAddressResult implements Serializable, Cloneable {

    private String RequestId;

    private String AllocationId;

    private String PublicIp;

    private Integer BandWidth;

    private String LineId;

    private String CreateTime;

    @Override
    public ModifyAddressResult clone() {
        try {
            return (ModifyAddressResult) super.clone();
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

        ModifyAddressResult that = (ModifyAddressResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (AllocationId != null ? !AllocationId.equals(that.AllocationId) : that.AllocationId != null) return false;
        if (PublicIp != null ? !PublicIp.equals(that.PublicIp) : that.PublicIp != null) return false;
        if (BandWidth != null ? !BandWidth.equals(that.BandWidth) : that.BandWidth != null) return false;
        if (LineId != null ? !LineId.equals(that.LineId) : that.LineId != null) return false;
        return CreateTime != null ? CreateTime.equals(that.CreateTime) : that.CreateTime == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (AllocationId != null ? AllocationId.hashCode() : 0);
        result = 31 * result + (PublicIp != null ? PublicIp.hashCode() : 0);
        result = 31 * result + (BandWidth != null ? BandWidth.hashCode() : 0);
        result = 31 * result + (LineId != null ? LineId.hashCode() : 0);
        result = 31 * result + (CreateTime != null ? CreateTime.hashCode() : 0);
        return result;
    }
}

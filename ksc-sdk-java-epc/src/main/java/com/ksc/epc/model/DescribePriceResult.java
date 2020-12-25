package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribePrice.
 * </p>
 */
@Data
public class DescribePriceResult implements Serializable, Cloneable {

    private String RequestId;
    private PriceInfo PriceInfo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribePriceResult that = (DescribePriceResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (PriceInfo != null ? !PriceInfo.equals(that.PriceInfo) : that.PriceInfo != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (PriceInfo != null ? PriceInfo.hashCode() : 0);
        return result;
    }


    @Override
    public DescribePriceResult clone() {
        try {
            return (DescribePriceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

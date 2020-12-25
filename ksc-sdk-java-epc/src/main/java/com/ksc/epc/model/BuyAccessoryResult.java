package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of BuyAccessory.
 * </p>
 */
@Data
public class BuyAccessoryResult implements Serializable, Cloneable {

    private String RequestId;
    private Accessory Accessory;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BuyAccessoryResult that = (BuyAccessoryResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Accessory != null ? !Accessory.equals(that.Accessory) : that.Accessory != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Accessory != null ? Accessory.hashCode() : 0);
        return result;
    }


    @Override
    public BuyAccessoryResult clone() {
        try {
            return (BuyAccessoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

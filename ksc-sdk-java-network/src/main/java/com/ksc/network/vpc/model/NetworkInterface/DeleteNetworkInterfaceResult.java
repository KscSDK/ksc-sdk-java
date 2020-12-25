package com.ksc.network.vpc.model.NetworkInterface;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DeleteNetworkInterface.
 * </p>
 */
@Data
public class DeleteNetworkInterfaceResult implements Serializable, Cloneable {

    private String RequestId;
    private String Return;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteNetworkInterfaceResult that = (DeleteNetworkInterfaceResult) o;
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
    public DeleteNetworkInterfaceResult clone() {
        try {
            return (DeleteNetworkInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

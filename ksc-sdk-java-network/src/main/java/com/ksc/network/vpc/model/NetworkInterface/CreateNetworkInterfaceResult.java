package com.ksc.network.vpc.model.NetworkInterface;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateNetworkInterface.
 * </p>
 */
@Data
public class CreateNetworkInterfaceResult implements Serializable, Cloneable {

    private String RequestId;
    private String NetworkInterfaceId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateNetworkInterfaceResult that = (CreateNetworkInterfaceResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (NetworkInterfaceId != null ? !NetworkInterfaceId.equals(that.NetworkInterfaceId) : that.NetworkInterfaceId != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (NetworkInterfaceId != null ? NetworkInterfaceId.hashCode() : 0);
        return result;
    }


    @Override
    public CreateNetworkInterfaceResult clone() {
        try {
            return (CreateNetworkInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateRemoteManagement.
 * </p>
 */
@Data
public class CreateRemoteManagementResult implements Serializable, Cloneable {

    private String RequestId;
    private RemoteManagement RemoteManagement;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateRemoteManagementResult that = (CreateRemoteManagementResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (RemoteManagement != null ? !RemoteManagement.equals(that.RemoteManagement) : that.RemoteManagement != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (RemoteManagement != null ? RemoteManagement.hashCode() : 0);
        return result;
    }


    @Override
    public CreateRemoteManagementResult clone() {
        try {
            return (CreateRemoteManagementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of RegisterBackendServer.
 * </p>
 */
@Data
public class RegisterBackendServerResult implements Serializable, Cloneable {

    private String RequestId;
    private BackendServer BackendServer;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RegisterBackendServerResult that = (RegisterBackendServerResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BackendServer != null ? !BackendServer.equals(that.BackendServer) : that.BackendServer != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BackendServer != null ? BackendServer.hashCode() : 0);
        return result;
    }


    @Override
    public RegisterBackendServerResult clone() {
        try {
            return (RegisterBackendServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

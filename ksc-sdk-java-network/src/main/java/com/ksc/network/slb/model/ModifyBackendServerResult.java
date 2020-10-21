package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyBackendServer.
 * </p>
 */
@Data
public class ModifyBackendServerResult implements Serializable, Cloneable {

    private String RequestId;
    private BackendServer BackendServer;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyBackendServerResult that = (ModifyBackendServerResult) o;
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
    public ModifyBackendServerResult clone() {
        try {
            return (ModifyBackendServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

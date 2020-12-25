package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateBackendServerGroup.
 * </p>
 */
@Data
public class CreateBackendServerGroupResult implements Serializable, Cloneable {

    private String RequestId;
    private BackendServerGroup BackendServerGroup;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateBackendServerGroupResult that = (CreateBackendServerGroupResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BackendServerGroup != null ? !BackendServerGroup.equals(that.BackendServerGroup) : that.BackendServerGroup != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BackendServerGroup != null ? BackendServerGroup.hashCode() : 0);
        return result;
    }


    @Override
    public CreateBackendServerGroupResult clone() {
        try {
            return (CreateBackendServerGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

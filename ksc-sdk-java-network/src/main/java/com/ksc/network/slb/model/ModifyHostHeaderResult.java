package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyHostHeader.
 * </p>
 */
@Data
public class ModifyHostHeaderResult implements Serializable, Cloneable {

    private String RequestId;
    private HostHeader HostHeader;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyHostHeaderResult that = (ModifyHostHeaderResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (HostHeader != null ? !HostHeader.equals(that.HostHeader) : that.HostHeader != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (HostHeader != null ? HostHeader.hashCode() : 0);
        return result;
    }

    @Override
    public ModifyHostHeaderResult clone() {
        try {
            return (ModifyHostHeaderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

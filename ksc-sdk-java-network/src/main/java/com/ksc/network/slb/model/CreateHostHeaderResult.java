package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateHostHeader.
 * </p>
 */
@Data
public class CreateHostHeaderResult implements Serializable, Cloneable {

    private String RequestId;

    private HostHeader HostHeader;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateHostHeaderResult that = (CreateHostHeaderResult) o;

        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        return HostHeader != null ? HostHeader.equals(that.HostHeader) : that.HostHeader == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (HostHeader != null ? HostHeader.hashCode() : 0);
        return result;
    }

    @Override
    public CreateHostHeaderResult clone() {
        try {
            return (CreateHostHeaderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}

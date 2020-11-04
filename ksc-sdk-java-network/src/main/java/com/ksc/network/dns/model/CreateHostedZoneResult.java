package com.ksc.network.dns.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateHostedZone.
 * </p>
 */
@Data
public class CreateHostedZoneResult implements Serializable, Cloneable {

    private String RequestId;
    private HostedZone HostedZone;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateHostedZoneResult that = (CreateHostedZoneResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (HostedZone != null ? !HostedZone.equals(that.HostedZone) : that.HostedZone != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (HostedZone != null ? HostedZone.hashCode() : 0);
        return result;
    }


    @Override
    public CreateHostedZoneResult clone() {
        try {
            return (CreateHostedZoneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

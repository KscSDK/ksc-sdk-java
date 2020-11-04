package com.ksc.network.dns.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeHostedZones.
 * </p>
 */
@Data
public class DescribeHostedZonesResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<HostedZone> HostedZoneSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeHostedZonesResult that = (DescribeHostedZonesResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (HostedZoneSet != null ? !HostedZoneSet.equals(that.HostedZoneSet) : that.HostedZoneSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (HostedZoneSet != null ? HostedZoneSet.hashCode() : 0);
        return result;
    }

    public void addHostedZoneSet(HostedZone... hostedZones) {
		if (this.HostedZoneSet == null) {
			this.HostedZoneSet = new SdkInternalList<HostedZone>();
		}
		for (HostedZone hostedZone : hostedZones) {
			this.HostedZoneSet.add(hostedZone);
		}
	}


    @Override
    public DescribeHostedZonesResult clone() {
        try {
            return (DescribeHostedZonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

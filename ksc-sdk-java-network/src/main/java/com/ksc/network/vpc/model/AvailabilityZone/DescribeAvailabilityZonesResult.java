package com.ksc.network.vpc.model.AvailabilityZone;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeAvailabilityZones.
 * </p>
 */
@ToString
public class DescribeAvailabilityZonesResult implements Serializable, Cloneable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4342231836921805816L;
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more VPCs.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<AvailabilityZone> AvailabilityZoneInfo;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

	/**
     * <p>
     * Information about one or more VPCs.
     * </p>
     * 
     * @return Information about one or more VPCs.
     */
    public java.util.List< AvailabilityZone> getAvailabilityZoneInfo() {
        if (AvailabilityZoneInfo == null) {
        	AvailabilityZoneInfo = new com.ksc.internal.SdkInternalList<AvailabilityZone>();
        }
        return AvailabilityZoneInfo;
    }

    public void setAvailabilityZoneInfo(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.AvailabilityZoneInfo = null;
            return;
        }

        this.AvailabilityZoneInfo = new com.ksc.internal.SdkInternalList<AvailabilityZone>(availabilityZones);
    }

    public DescribeAvailabilityZonesResult withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.AvailabilityZoneInfo == null) {
            setAvailabilityZoneInfo(new com.ksc.internal.SdkInternalList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.AvailabilityZoneInfo.add(ele);
        }
        return this;
    }

    public DescribeAvailabilityZonesResult withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZoneInfo(availabilityZones);
        return this;
    }



    @Override
    public DescribeAvailabilityZonesResult clone() {
        try {
            return (DescribeAvailabilityZonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((AvailabilityZoneInfo == null) ? 0 : AvailabilityZoneInfo
						.hashCode());
		result = prime * result
				+ ((RequestId == null) ? 0 : RequestId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DescribeAvailabilityZonesResult other = (DescribeAvailabilityZonesResult) obj;
		if (AvailabilityZoneInfo == null) {
			if (other.AvailabilityZoneInfo != null)
				return false;
		} else if (!AvailabilityZoneInfo.equals(other.AvailabilityZoneInfo))
			return false;
		if (RequestId == null) {
			if (other.RequestId != null)
				return false;
		} else if (!RequestId.equals(other.RequestId))
			return false;
		return true;
	}
}
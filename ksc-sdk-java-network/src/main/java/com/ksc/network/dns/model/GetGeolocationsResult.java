package com.ksc.network.dns.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of GetGeolocations.
 * </p>
 */
@Data
public class GetGeolocationsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<GeoLocation> GeoLocations;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GetGeolocationsResult that = (GetGeolocationsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (GeoLocations != null ? !GeoLocations.equals(that.GeoLocations) : that.GeoLocations != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (GeoLocations != null ? GeoLocations.hashCode() : 0);
        return result;
    }

    public void addGeoLocations(GeoLocation... geoLocations) {
		if (this.GeoLocations == null) {
			this.GeoLocations = new SdkInternalList<GeoLocation>();
		}
		for (GeoLocation geoLocation : geoLocations) {
			this.GeoLocations.add(geoLocation);
		}
	}


    @Override
    public GetGeolocationsResult clone() {
        try {
            return (GetGeolocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}

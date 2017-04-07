package com.ksc.network.vpc.model.AvailabilityZone;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class AvailabilityZone {

	private String ZoneName;

	private String ZoneState;

	private String RegionName;

    public String getZoneName() {
        return ZoneName;
    }

    public void setZoneName(String zoneName) {
        ZoneName = zoneName;
    }

    public String getZoneState() {
        return ZoneState;
    }

    public void setZoneState(String zoneState) {
        ZoneState = zoneState;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String regionName) {
        RegionName = regionName;
    }
}

package com.ksc.network.vpc.model.AvailabilityZone;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class AvailabilityZone {

	private String AvailabilityZoneName;


    public String getAvailabilityZoneName() {
        return AvailabilityZoneName;
    }

    public void setAvailabilityZoneName(String availabilityZoneName) {AvailabilityZoneName = availabilityZoneName;
    }


}

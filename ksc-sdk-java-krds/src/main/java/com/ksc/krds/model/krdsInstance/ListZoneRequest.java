package com.ksc.krds.model.krdsInstance;

public class ListZoneRequest extends BaseRequest<ListZoneRequest>{

    private String AvailabilityZone;

    public String getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        AvailabilityZone = availabilityZone;
    }
}

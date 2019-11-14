package com.ksc.redis.model.instance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DescribeAvailabilityZonesResponse {
    @JsonProperty(value = "AvailabilityZoneSet")
    private List<Az> availabilityZoneSet;
    @JsonProperty(value = "RequestId")
    private String requestId;

    public List<Az> getAvailabilityZoneSet() {
        return availabilityZoneSet;
    }

    public void setAvailabilityZoneSet(List<Az> availabilityZoneSet) {
        this.availabilityZoneSet = availabilityZoneSet;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Az {
        @JsonProperty(value = "Region")
        private String region;
        @JsonProperty(value = "AvailabilityZone")
        private String availabilityZone;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getAvailabilityZone() {
            return availabilityZone;
        }

        public void setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
        }
    }
}

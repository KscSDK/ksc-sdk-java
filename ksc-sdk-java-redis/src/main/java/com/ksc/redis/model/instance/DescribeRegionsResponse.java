package com.ksc.redis.model.instance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DescribeRegionsResponse {
    @JsonProperty(value = "RegionSet")
    private List<Region> regionSet;
    @JsonProperty(value = "RequestId")
    private String requestId;

    public List<Region> getRegionSet() {
        return regionSet;
    }

    public void setRegionSet(List<Region> regionSet) {
        this.regionSet = regionSet;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Region {
        @JsonProperty(value = "RegionName")
        private String regionName;
        @JsonProperty(value = "Region")
        private String region;

        public String getRegionName() {
            return regionName;
        }

        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}

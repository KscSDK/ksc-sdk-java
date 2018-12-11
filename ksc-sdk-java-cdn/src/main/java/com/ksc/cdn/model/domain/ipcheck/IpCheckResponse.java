package com.ksc.cdn.model.domain.ipcheck;

public class IpCheckResponse {

    private String CdnIp;

    private String Isp;

    private String Region;

    private String Province;

    private String City;

    public String getCdnIp() {
        return CdnIp;
    }

    public void setCdnIp(String cdnIp) {
        CdnIp = cdnIp;
    }

    public String getIsp() {
        return Isp;
    }

    public void setIsp(String isp) {
        Isp = isp;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}

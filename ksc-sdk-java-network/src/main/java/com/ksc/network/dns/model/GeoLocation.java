package com.ksc.network.dns.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class GeoLocation {

    /**
     * 线路的英文名称
     */
    private String geoLocationEnglishName;
    /**
     * 线路的中文名称
     */
    private String geoLocationChineseName;
    /**
     * 域名记录的线路ID
     */
    private String geoLocationId;
    /**
     * 
     */
    private String lineClass;
    /**
     * 
     */
    private String parentLineClass;


}

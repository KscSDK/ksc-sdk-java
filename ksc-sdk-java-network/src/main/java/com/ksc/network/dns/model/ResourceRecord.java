package com.ksc.network.dns.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class ResourceRecord {

    /**
     * 域名记录的创建时间
     */
    private String createTime;
    /**
     * 域名的ID
     */
    private String hostedZoneId;
    /**
     * 域名记录的ID
     */
    private String resourceRecordId;
    /**
     * 域名记录更新时间
     */
    private String updateTime;
    /**
     * 域名记录
     */
    private String resourceRecordName;
    /**
     * 域名记录的类型
     */
    private String resourceRecordType;
    /**
     * 域名记录的线路ID
     */
    private String geoLocationId;
    /**
     * TTL(Time-To-Live/生存时间)，是一个域名解析记录在DNS服务器中的存留时间
     */
    private Integer tTL;
    /**
     * 域名记录的记录值1如果是A、AX，则需要是合法的ip地址；2如果是TXT，则为字符串，长度不能超过255； 3如果是AAAA，则需要为一个ipv6的地址；4如果是CNAME、或者MX、NS，则需要符合域名规则
     */
    private String value;
    /**
     * 域名记录的权重1type为AX、MX时，record里必须含有weight字段；2其他类型域名记录里必须不能含有weight字段。3MX记录的weight值为1 ~ 50，AX记录的weight值为1 ~ 100。
     */
    private String weight;
    /**
     * 域名记录的状态
     */
    private String status;


}

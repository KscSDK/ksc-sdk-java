package com.ksc.network.dns;

import com.ksc.network.dns.model.*;

public interface KSCDNS {

    /**
     * 创建域名
     */
    public CreateHostedZoneResult createHostedZone(CreateHostedZoneRequest createHostedZoneRequest);
    /**
     * 删除域名
     */
    public DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest deleteHostedZoneRequest);
    /**
     * 获取域名
     */
    public DescribeHostedZonesResult describeHostedZones(DescribeHostedZonesRequest describeHostedZonesRequest);

}

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

    /**
     * 创建域名记录
     */
    public CreateResourceRecordResult createResourceRecord(CreateResourceRecordRequest createResourceRecordRequest);
    /**
     * 删除域名记录
     */
    public DeleteResourceRecordResult deleteResourceRecord(DeleteResourceRecordRequest deleteResourceRecordRequest);
    /**
     * 获取域名记录
     */
    public DescribeResourceRecordsResult describeResourceRecords(DescribeResourceRecordsRequest describeResourceRecordsRequest);
    /**
     * 修改域名记录
     */
    public ModifyResourceRecordResult modifyResourceRecord(ModifyResourceRecordRequest modifyResourceRecordRequest);
    /**
     * 描述线路信息
     */
    public GetGeolocationsResult getGeolocations(GetGeolocationsRequest getGeolocationsRequest);
}

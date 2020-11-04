package com.ksc.network.dns;

import com.ksc.network.bws.KSCBWSClient;
import com.ksc.network.dns.model.*;
import com.ksc.regions.InMemoryRegionImpl;
import com.ksc.regions.Region;
import org.apache.log4j.Logger;
import org.junit.Test;

public class KSCDNSClientTest {

    private static final Logger log = Logger.getLogger(KSCBWSClient.class);

    @Test
    public void createHostedZone(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateHostedZoneRequest request = new CreateHostedZoneRequest();
        request.setHostedZoneName("ruoshu.com");
        CreateHostedZoneResult result = client.createHostedZone(request);
        log.info(result);
    }

    @Test
    public void deleteHostedZone(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteHostedZoneRequest request = new DeleteHostedZoneRequest();
        request.setHostedZoneId("14d01e19-84ef-4a15-ad1d-1b7050d6c3d9");
        DeleteHostedZoneResult result = client.deleteHostedZone(request);
        log.info(result);
    }

    @Test
    public void describeHostedZones(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeHostedZonesRequest request = new DescribeHostedZonesRequest();
        //request.setHostedZoneId("8c4c82ef-f530-4401-a870-9a57ab72f8ab");
        DescribeHostedZonesResult result = client.describeHostedZones(request);
        log.info(result);
    }

    @Test
    public void createResourceRecord(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        CreateResourceRecordRequest request = new CreateResourceRecordRequest();
        request.setHostedZoneId("8c4c82ef-f530-4401-a870-9a57ab72f8ab");
        request.setResourceRecordName("ruoshu");
        request.setResourceRecordType("A");
        request.setValue("7.7.7.7");
        request.setWeight("10");
        request.setTTL(300);
        request.setGeoLocationId("1d21cbfc-820e-11e5-8bb1-08002781609e");
        CreateResourceRecordResult result = client.createResourceRecord(request);
        log.info(result);
    }

    @Test
    public void deleteResourceRecord(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DeleteResourceRecordRequest request = new DeleteResourceRecordRequest();
        request.setHostedZoneId("8c4c82ef-f530-4401-a870-9a57ab72f8ab");
        request.setResourceRecordId("b4503a67-871d-41c0-82d5-ec43cb285623");
        DeleteResourceRecordResult result = client.deleteResourceRecord(request);
        log.info(result);
    }

    @Test
    public void describeResourceRecords(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        DescribeResourceRecordsRequest request = new DescribeResourceRecordsRequest();
        request.setHostedZoneId("8c4c82ef-f530-4401-a870-9a57ab72f8ab");
        DescribeResourceRecordsResult result = client.describeResourceRecords(request);
        log.info(result);
    }

    @Test
    public void modifyResourceRecord(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ModifyResourceRecordRequest request = new ModifyResourceRecordRequest();
        request.setHostedZoneId("8c4c82ef-f530-4401-a870-9a57ab72f8ab");
        request.setResourceRecordId("861d66b9-b765-4f3a-a47a-14ce07791660");
        request.setResourceRecordName("ruoruo");
        request.setResourceRecordType("A");
        request.setValue("7.7.7.7");
        request.setWeight("10");
        request.setTTL(300);
        request.setGeoLocationId("1d21cbfc-820e-11e5-8bb1-08002781609e");
        ModifyResourceRecordResult result = client.modifyResourceRecord(request);
        log.info(result);
    }

    /*@Test
    public void resourceRecordChangeType(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        ResourceRecordChangeTypeRequest request = new ResourceRecordChangeTypeRequest();
        request.setHostedZoneId("8c4c82ef-f530-4401-a870-9a57ab72f8ab");
        request.setResourceRecordName("ruoruo");
        request.setResourceRecordType("AX");
        request.setGeoLocationId("1d21cbfc-820e-11e5-8bb1-08002781609e");
        request.setResourceRecordTargetType("AX");
        ResourceRecordChangeTypeResult result = client.resourceRecordChangeType(request);
        log.info(result);
    }*/

    @Test
    public void getGeolocations(){
        KSCDNSClient client = new KSCDNSClient();
        client.setEndpoint("http://dns.inner.api.ksyun.com");
        client.setServiceNameIntern("dns");
        Region region = new Region(new InMemoryRegionImpl("cn-shanghai-3", null));
        client.setRegion(region);
        GetGeolocationsRequest request = new GetGeolocationsRequest();
        GetGeolocationsResult result = client.getGeolocations(request);
        log.info(result);
    }
}

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
}
